# spring-kafka-JSON-ingest
This is a sample application to ingest data into a Kafka topic using Spring(Boot, Web, Kafka).
Here is a blog with more details and it's usage in ingesting JSON data into Apache Geode: https://medium.com/@huynhja/ingest-store-and-search-json-data-with-apache-kafka-and-apache-geode-fc6d0d2f9d9f

To run this sample application
./gradlew bootRun or java -jar restful-webservice-0.0.1-SNAPSHOT.jar

To hit the endpoint: 
curl localhost:8080/ingest/github/{topicName}

Uses localhost:9092 as the kafka broker location and will auto create a topic if it's not already created
