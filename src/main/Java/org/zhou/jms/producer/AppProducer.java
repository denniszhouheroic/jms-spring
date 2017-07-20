package org.zhou.jms.producer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Dennis_zhou on 2017/7/20.
 */
public class AppProducer {
    public static void main(String[] args) {
        /**
         * ApplicationContext context = new ClassPathXmlApplicationContext("producer.xml");
         * V 1.0 Spring提供的连接在运行后并不会帮助我们将连接关闭，没有close()方法；这里更改为
         * 了ClassPathXmlApplicationContext类型。
         */
        //queue Test
        /*ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("producer.xml");
        ProducerService service = context.getBean(ProducerService.class);
        for( int i = 0; i < 100; i++) {
            service.sendMessage("test" + i);
        }
        context.close();*/
       //topic Test
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("producer.xml");
        ProducerServiceForTopic service = context.getBean(ProducerServiceForTopic.class);
        for( int i = 0; i < 100; i++) {
            service.sendMessage("test" + i);
        }
        context.close();
    }
}
