package com.lhh.springboot.config.rabbitmq;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * @author lhh
 * @Date 2019/12/15 1:09
 */
@Configuration
public class RabbitConfig {
    public final static String  DIRECT_NAME="lhh.direct";

    @Bean
    Queue queue(){
        return new Queue("hell.word");
    }


    @Bean
    DirectExchange directExchange(){
        //durable重启后是否依然有效，autoDelete 长期未用时是否删除
        return new DirectExchange(DIRECT_NAME,true,false);
    }
    @Bean
    Binding binding(){
        return BindingBuilder.bind(queue()).to(directExchange()).with("direct");
    }
}
