package org.zhou.jms.consumer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Dennis_zhou on 2017/7/20.
 */
public class AppConsumer {
    public static void main(String[] args) {
        ApplicationContext context =new ClassPathXmlApplicationContext("consumer.xml");
    }
}
