#!/bin/bash

for noOfDatabases in 2 5 10; do
    for noOfUsers in 5 50 100 500; do
        for noOfTransactions in 2 10 50 100 500; do 
            for concurrency in 1 2 10 25 50 100 150; do
                echo "starting test with parameters $noOfDatabases $noOfUsers $noOfTransactions $concurrency 5"
                java -XX:-PrintGC -Xss128k -jar target/DistributedTxn-1.0-SNAPSHOT.jar $noOfDatabases $noOfUsers $noOfTransactions $concurrency 5 2>error.log
            done
        done
    done
done