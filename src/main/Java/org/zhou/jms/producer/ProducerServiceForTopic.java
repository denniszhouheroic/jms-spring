package org.zhou.jms.producer;

/**
 * Created by Dennis_zhou on 2017/7/20.
 */
public interface ProducerServiceForTopic {

    void sendMessage(String message);
}
