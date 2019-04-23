package com.york.rabbitmq.rabbitmq.Send;

import com.york.rabbitmq.rabbitmq.vo.User;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author chenyq
 * @create 2019-04-19
 */
@Component
public class HelloSend {

    @Autowired
    private AmqpTemplate amqpTemplate;


    public void sendDirect(){

//        amqpTemplate.convertAndSend("queue","hello rabbit");
        User user=new User();
        user.setId(123);
        user.setName("小明");
        user.setPwd("789456123");
        amqpTemplate.convertAndSend("direct",user);

    }

    public void sendDirectPlus(){
        for (int i = 0; i < 100; i++) {
            amqpTemplate.convertAndSend("directPlus","发送---->"+i);
        }
    }

    public void sendTopic(){
        amqpTemplate.convertAndSend("exchange","topic.messages","hello raaaaaa");
    }


    public  void sendFanoutExchange(){
        amqpTemplate.convertAndSend("fanoutExchange","","xixi,ooooaaaa");
    }



}
