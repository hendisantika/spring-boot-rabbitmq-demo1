package com.hendisantika.service;

import com.hendisantika.model.Message;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

import static com.hendisantika.config.RabbitMqConfig.EXCHANGE_NAME;
import static com.hendisantika.config.RabbitMqConfig.QUEUE_NAME;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-rabbitmq-demo1
 * User: powercommerce
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 01/02/22
 * Time: 10.43
 * To change this template use File | Settings | File Templates.
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class Producer {
    private final RabbitTemplate rabbitTemplate;

    @Scheduled(fixedDelay = 5000)
    public void sendMessage() {
        Message msg = new Message();
        msg.setMsg("Message from " + LocalDateTime.now());
        rabbitTemplate.convertAndSend(EXCHANGE_NAME, QUEUE_NAME, msg);
        log.info("Message with id [{}] send to [{}] exchange with routing key [{}]", msg.getId(), EXCHANGE_NAME, QUEUE_NAME);
    }
}
