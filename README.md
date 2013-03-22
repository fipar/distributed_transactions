This is the repository for the PLMCE 2013 Distributed Transactions talk

http://www.percona.com/live/mysql-conference-2013/sessions/distributed-transactions-primer-mysql

== ABSTRACT ==

Distributed transaction support is one of the most interesting, yet
underutilized, aspects of MySQL. This session will begin with a
discussion of the nature of distributed transactions as well as their
failure points and cover some common roll-your-own solutions. We'll
finish by implementing a distributed money-transfer system using MySQL
XA. Attendees of this talk will be able to identify areas within their
application where distributed transactions make sense as well as being
able to implement a proper distributed transaction processing system
using MySQL.

== FILES ==

=== mysql-connector-jar ===

This works if you create local db's with those
dumps, create a mysql user banker/banker, and put this into a project
with mysql-connector-jar.  Not very interesting yet, but I can pretty
this up and surround it in a wrapper.   This is an amalgamation of
examples Randy found on the web...

=== xasource1.sql

=== xasource2.sql

