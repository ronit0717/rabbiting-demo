package io.qkr.rabbitingdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

public class QkrDemoSender {
    private static final Logger log = LoggerFactory.getLogger(QkrDemoSender.class);

    private final RabbitTemplate rabbitTemplate;

    public QkrDemoSender(final RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    @Scheduled(fixedDelay = 1000L)
    public void sendPracticalTip() {
        QkrDemoMessage tip = new QkrDemoMessage("Test Message RONTEST");
        rabbitTemplate.convertAndSend(RabbitingDemoApplication.EXCHANGE_NAME, RabbitingDemoApplication.ROUTING_KEY, tip);
        log.info("Demo Msg sent");
    }
}
