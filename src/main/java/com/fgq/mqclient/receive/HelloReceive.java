package com.fgq.mqclient.receive;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @Package: com.fgq.mqclient.receive
 * @ClassName: HelloReceive
 * @Author: fgq
 * @Description: 消息接收者
 * @Date: 2019/11/9 10:13
 */
@Component
public class HelloReceive {

    @RabbitListener(queues="test-queue")    //监听器监听指定的Queue
    public void processC(String str) {
        System.err.println("Receive-message:"+str);
    }
}
