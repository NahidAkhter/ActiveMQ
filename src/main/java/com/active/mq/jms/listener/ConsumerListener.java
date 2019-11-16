package com.active.mq.jms.listener;

import javax.jms.Message;
import javax.jms.MessageListener;

import org.springframework.stereotype.Component;

@Component
public class ConsumerListener implements MessageListener{

	@Override
	public void onMessage(Message message) {
		System.out.println("In onMessage()");
	}


}
