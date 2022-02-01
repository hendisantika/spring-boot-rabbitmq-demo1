package com.hendisantika.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.UUID;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-rabbitmq-demo1
 * User: powercommerce
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 01/02/22
 * Time: 10.42
 * To change this template use File | Settings | File Templates.
 */
@Data
@NoArgsConstructor
public class Message implements Serializable {
    private String id = UUID.randomUUID().toString();
    private String msg;
}
