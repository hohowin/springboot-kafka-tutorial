# springboot-kafka-tutorial

Youtube: [Spring Boot + Apache Kafka Tutorial](https://youtu.be/U17DtHLOsTU)

## Try it out

1. Start Kafka and Zookeeper


```bash
docker-compose up -d
```

2. Run `net.javaguides.springboot.SpringbootKafkaTutorialApplication`

3. Try this link: http://localhost:8080/api/v1/kafka/publish?message=helloworld


## To run console command

1. logon kafka container and go to `/opt/bitnami/kafka/bin`

2. To produce:

```bash
./kafka-console-consumer.sh --topic javaguides --from-beginning --bootstrap-server localhost:9092
```

3. To consume:

```bash
./kafka-console-consumer.sh --topic javaguides --from-beginning --bootstrap-server localhost:9092
```