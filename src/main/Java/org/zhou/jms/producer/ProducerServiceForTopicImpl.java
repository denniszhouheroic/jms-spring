package org.zhou.jms.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;

import org.springframework.jms.core.MessageCreator;
import javax.annotation.Resource;
import javax.jms.*;

/**
 * Created by Dennis_zhou on 2017/7/20.
 */
public class ProducerServiceForTopicImpl implements ProducerServiceForTopic {

    @Autowired
    JmsTemplate jmsTemplate;
    @Resource(name = "topicDestination")
    Destination destination;
    public void sendMessage(final String message) {
        jmsTemplate.send(destination, new MessageCreator() {
            public Message createMessage(Session session) throws JMSException {
                TextMessage textMessage = session.createTextMessage(message);
                return textMessage;
            }
        });
        System.out.println("发送消息:" + message);
    }
}
