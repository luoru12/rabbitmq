package com.york.rabbitmq.rabbitmq.Send;

import com.york.rabbitmq.rabbitmq.RabbitmqApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * @author chenyq
 * @create 2019-04-19
 */
@SpringBootTest(classes = RabbitmqApplication.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class HelloSendTest {

    @Autowired
    private HelloSend helloSend;

    @Test
    public void sendDirect() {
        helloSend.sendDirect();
    }

    @Test
    public void sendDirectPlus() {
        helloSend.sendDirectPlus();
    }

    @Test
    public void sendTopic() {
        helloSend.sendTopic();
    }

    @Test
    public void sendFanoutExchange() {
        helloSend.sendFanoutExchange();
    }
}