This is the repository for the PLMCE 2013 Distributed Transactions talk

http://www.percona.com/live/mysql-conference-2013/sessions/distributed-transactions-primer-mysql

ABSTRACT
========

Distributed transaction support is one of the most interesting, yet
underutilized, aspects of MySQL. This session will begin with a
discussion of the nature of distributed transactions as well as their
failure points and cover some common roll-your-own solutions. We'll
finish by implementing a distributed money-transfer system using MySQL
XA. Attendees of this talk will be able to identify areas within their
application where distributed transactions make sense as well as being
able to implement a proper distributed transaction processing system
using MySQL.

FILES
=====

mysql-connector-jar
-------------------

This works if you create local db's with those
dumps, create a mysql user banker/banker, and put this into a project
with mysql-connector-jar.  Not very interesting yet, but I can pretty
this up and surround it in a wrapper.   This is an amalgamation of
examples Randy found on the web...

xasource[1|2].sql
-----------------

These are mysqldump files of that create two databases that can be
used with mysql-connector-jar to demonstrate distributed transactions.

PRESENTATION OUTLINE
====================

* What are distributed transactions?
* Use cases for distributed transactions
* X/Open DTP
* Sample money transfer transaction
  - How to do it wrong?
  - How to do it right?
  - Anatomy of the transaction
  - Failure Scenarios
* Distributed Transaction Performance
* MySQL XA Gotchas
* Questions


ADDITIONAL REFERENCES
=====================

* http://dev.mysql.com/doc/refman/5.6/en/xa.html
* http://dev.mysql.com/doc/refman/5.6/en/xa-restrictions.html
* http://dev.mysql.com/doc/refman/5.6/en/xa-states.html
* http://mysqlha.blogspot.com/2008/07/do-you-really-want-to-use-xa-with-mysql.html
* https://access.redhat.com/knowledge/docs/en-US/JBoss_Enterprise_Application_Platform/6/html/Administration_and_Configuration_Guide/Example_MySQL_XA_Datasource1.html
* http://www.atomikos.com/Documentation/ConfiguringMySQL


