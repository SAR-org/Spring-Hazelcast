# Spring-Hazelcast
Spring application with Hazel cast

Following are the starter dependencies
1. Web
2. JPA
3. MySQl connector

Hazelcast added using maven dependency

    <dependency>
	<groupId>com.hazelcast</groupId>
	<artifactId>hazelcast-all</artifactId>
	<version>4.0.2</version>
    </dependency>
    
An Employee dataset was used to test the performance improvement after integrating hazelcast.
First time it hits the database, observed by enabling show-sql and print statement added to the service method
Second time onward, it didn't hit database, it fetches from cache and a drastic performance improvement was observed.
