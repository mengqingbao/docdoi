package com.docdoi.listener;

import org.jivesoftware.smack.Chat;
import org.jivesoftware.smack.MessageListener;
import org.jivesoftware.smack.packet.Message;

public class InChatManagerListener implements MessageListener {

	@Override
	public void processMessage(Chat arg0, Message message) {
		System.out.println("processMessage -----¼àÌý-----");
		System.out
        .println(message.getFrom() + ":" + message.getBody());
	}

}
