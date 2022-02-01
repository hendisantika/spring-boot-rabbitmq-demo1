# spring-boot-rabbitmq-demo1

### Things todo list

1. Clone this repository: `git remote add origin https://github.com/hendisantika/spring-boot-rabbitmq-demo1.git`
2. Navigate to the folder: `cd spring-boot-rabbitmq-demo1`
3. Run RabbitMQ Container: `docker run -d --name rabbitmq -p 15672:15672 -p 5672:5672 rabbitmq:3.9.13-management`
4. Run the application: `mvn clean spring-boot:run`
5. Check the spring boot console & RabbitMQ Admin Management Console