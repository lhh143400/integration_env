package com.lhh.springboot.modules.rabbitmq;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * 消息消费者
 *
 * @author lhh
 * @Date 2019/12/15 1:23
 */
@Component
public class RabbitConsumer {

    @RabbitListener(queues = "lhh.queue")
    public void handler1(String msg){
        System.out.println(msg);
    }
}