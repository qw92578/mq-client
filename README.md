## 交换机的主要作用是接收相应的消息并且绑定到指定的队列.交换机有四种类型,分别为Direct,topic,headers,Fanout.


## 采用Direct 


配置监听器去监听绑定到的消息队列,当消息队列有消息的时候,予以接收
    @Component
    public class HelloReceive {
    
        @RabbitListener(queues="queue")    //监听器监听指定的Queue
        public void processC(String str) {
            System.out.println("Receive:"+str);
        }
    }