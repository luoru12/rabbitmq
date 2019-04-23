package com.york.rabbitmq.rabbitmq.receive;

import com.york.rabbitmq.rabbitmq.vo.User;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author chenyq
 * @create 2019-04-19
 */
@Component
public class HelloReceive {

    @RabbitListener(queues="direct")
    public void process0(User user){
        System.out.println("receive:"+user.toString());
    }

    @RabbitListener(queues="directPlus")
    public void process1(String Str){
        System.out.println("receive-1:"+Str);
    }

    @RabbitListener(queues="directPlus")
    public void process2(String Str){
        System.out.println("receive-2:"+Str);
    }

    @RabbitListener(queues = "topic.message")
    public void process3(String str){
        System.out.println("receive:"+str);
    }

    @RabbitListener(queues = "topic.messages")
    public void process4(String str) {
        System.out.println("messages:"+str);
    }

    @RabbitListener(queues="fanout.A")
    public void processA(String str1) {
        System.out.println("ReceiveA:"+str1);
    }
    @RabbitListener(queues="fanout.B")
    public void processB(String str) {
        System.out.println("ReceiveB:"+str);
    }
    @RabbitListener(queues="fanout.C")
    public void processC(String str) {
        System.out.println("ReceiveC:"+str);
    }


}
