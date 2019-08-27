package io.qkr.rabbitingdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.messaging.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class QkrDemoListener {
    private static final Logger log = LoggerFactory.getLogger(QkrDemoListener.class);

    @RabbitListener(queues = RabbitingDemoApplication.DEFAULT_PARSING_QUEUE)
    public void consumeDefaultMessage(final Message message) {
        log.info("Received message, => : {}", message.toString());
    }
}
