package com.hendisantika.service;

import com.hendisantika.model.Message;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

import static com.hendisantika.config.RabbitMqConfig.QUEUE_NAME;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-rabbitmq-demo1
 * User: powercommerce
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 01/02/22
 * Time: 10.44
 * To change this template use File | Settings | File Templates.
 */
@Slf4j
@Service
public class Consumer {

    @RabbitListener(queues = {QUEUE_NAME})
    public void consume(Message message) {
        log.info("Received message [{}]", message);
    }
}
