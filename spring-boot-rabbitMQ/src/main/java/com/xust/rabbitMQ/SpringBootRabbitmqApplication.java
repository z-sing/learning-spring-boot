package com.xust.rabbitMQ;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 自动配置
 * 1、RabbitAutoConfiguration
 * 2、有自动配置了连接工厂ConnectionFactory
 * 3、RabbitProperies封装了RabbitMQ的配置
 * 4、RabbitTemplate:给RabbitMQ发送和接受消息
 * 5、AmqpAdmin:RabbitMQ系统管理功能组件
 *      AmqpAdmin可以创建删除：Queue、Exchange、Binding
 * 6、@EnableRabbit  + @RabbitListener(queues = "xust.news")监听消息队列的内容
 */
@EnableRabbit       //开启基于注解的RabbitMQ模式
@SpringBootApplication
public class SpringBootRabbitmqApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootRabbitmqApplication.class, args);
    }

}
