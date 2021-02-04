# spring-boot-data-cassandra-embedded

https://www.guru99.com/cassandra-architecture.html
Cassandra stores data on different nodes with a peer to peer distributed fashion architecture.

All the nodes exchange information with each other using Gossip protocol. Gossip is a protocol in Cassandra by which nodes can communicate with each other.

###SimpleStrategy

SimpleStrategy is used when you have just one data center. SimpleStrategy places the first replica on the node selected by the partitioner. After that, remaining replicas are placed in clockwise direction in the Node ring.

Here is the pictorial representation of the SimpleStrategy.

Cassandra Architecture & Replication Factor Strategy Tutorial

###NetworkTopologyStrategy

NetworkTopologyStrategy is used when you have more than two data centers.
