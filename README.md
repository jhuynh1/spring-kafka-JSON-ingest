# spring-kafka-JSON-ingest
Sample application to ingest data into a Kafka topic using Spring(Boot, Web, Kafka)


./gradlew bootRun

open web browser to localhost:8080/ingest/github/{topicName}
Uses localhost:9092 as the kafka broker location
Will auto create a topic if needed
