package com.samyun.jsmtest.broker;

import java.net.URI;

import org.apache.activemq.broker.BrokerFactory;
import org.apache.activemq.broker.BrokerService;

public class InnerBroker {
	
	public static void main(String[] args) throws Exception {
		//方式1
		/*BrokerService broker = new BrokerService();
		broker.setUseJmx(true);
		broker.addConnector("tcp://localhost:61616");
		broker.start();*/
        //方式2
		String Uri = "properties:broker.properties";
		BrokerService broker1 = BrokerFactory.createBroker(new URI(Uri));
		broker1.addConnector("tcp://localhost:61616");
		broker1.start();
	}

}
