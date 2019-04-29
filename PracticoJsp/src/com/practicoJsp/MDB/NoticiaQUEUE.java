package com.practicoJsp.MDB;

import javax.annotation.Resource;
import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

import org.jboss.ejb3.annotation.ResourceAdapter;
import org.jboss.logging.Logger;

/**
 * Message-Driven Bean implementation class for: NoticiaQUEUE
 */
/*
@MessageDriven(name = "NoticiaQueue", activationConfig = {
		@ActivationConfigProperty(propertyName = "destinationLookup", propertyValue = "queue/NoticiaQueue"),
		@ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue"),
		@ActivationConfigProperty(propertyName = "acknowledgeMode", propertyValue = "Auto-acknowledge") })
@ResourceAdapter("activemq-ra.rar")*/		
public class NoticiaQUEUE implements MessageListener {

	public static final Logger logger = Logger.getLogger(NoticiaQUEUE.class);
	/**
	 * Default constructor.
	 */
/*
	@Resource(mappedName = "java:/activemq/ConnectionFactory")
	private ConnectionFactory connectionFactory;
	private Connection connection;

	public NoticiaQUEUE() {
		// TODO Auto-generated constructor stub
	}

	public void init() throws JMSException {
		connection = connectionFactory.createConnection();
		connection.start();
	}*/

	/**
	 * @see MessageListener#onMessage(Message)
	 */
	public void onMessage(Message message) {
		// TODO Auto-generated method stub
		/*TextMessage msg = null;
		try {
			if (message instanceof TextMessage) {
				msg = (TextMessage) message;
				logger.info("Received Message from queue: " + msg.getText());
			} else {
				logger.warn("Message of wrong type: " + message.getClass().getName());
			}
		} catch (JMSException e) {
			throw new RuntimeException(e);
		}*/

	}

}
