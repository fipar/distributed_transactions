#!/bin/bash

levels="5 50 100 500"

for noOfDatabases in $levels; do
    for noOfUsers in $levels; do
	for noOfTransactions in $levels; do 
	    for concurrency in $levels; do
		java -jar target/DistributedTxn-1.0-SNAPSHOT.jar $noOfDatabases $noOfUsers $noOfTransactions $concurrency 100 2>/dev/null
	    done
	done
    done
done

