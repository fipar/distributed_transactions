package xademo;

import java.util.ArrayList;

public class Sample {
  public static void main(String[] args) throws Exception {
    try {
      int numberOfDatabases = Integer.parseInt(args[0]);
      int numberOfUsers = Integer.parseInt(args[1]);
      int numberOfTransactions = Integer.parseInt(args[2]);

      Setup setup = new Setup(numberOfDatabases, numberOfUsers);
      setup.createDatabases();
      setup.seedDatabases();

      // Generate a sample set of transactions.
      ArrayList<Transaction>sampleTransactions = new ArrayList<Transaction>();
      for (int i=0; i<numberOfTransactions; i++) {
        sampleTransactions.add(setup.randomTransaction());
      }
      // time how long it takes to process those in the single DB using transactions.
      long singleStartTime = System.currentTimeMillis();
      SingleDatabaseExample single = new SingleDatabaseExample(sampleTransactions, setup.getDataSource());
      int singleTransactionCount = single.performTransactions();
      System.out.println("Performed "+singleTransactionCount+" transactions in the single database model");
      long singleEndTime = System.currentTimeMillis();
      final long singleTestDuration = singleEndTime - singleStartTime;
      System.out.println("The single DB case took "+ singleTestDuration +" milliseconds");
      System.out.println("Now performing multiple DB case");
      long multiStartTime = System.currentTimeMillis();
      MultiDatabaseExample multi = new MultiDatabaseExample(sampleTransactions, setup);
      int multiTransactionCount = multi.performTransactions();
      long multiFinishTime = System.currentTimeMillis();
      System.out.println("Performed "+multiTransactionCount+" operations in the multi DB model");
      final long multiTestDuration = multiFinishTime - multiStartTime;
      System.out.println("Elapsed time: "+ multiTestDuration +" milliseconds");
      String nicelyFormattedOutput = String.format("%d%c%d%c%d%c%d%c%d%c%d%c%d",
          numberOfDatabases, '\t', numberOfUsers, '\t', numberOfTransactions, '\t', singleTransactionCount,
          '\t', singleTestDuration, '\t', multiTransactionCount, '\t', multiTestDuration);
      System.out.println(nicelyFormattedOutput);
      setup.cleanDatabases();
     } catch (Exception e) {
      System.err.println("Exception: " + e);
      e.printStackTrace();
    }
  }
}
