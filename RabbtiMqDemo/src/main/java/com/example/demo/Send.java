package com.example.demo;


import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.nio.charset.StandardCharsets;

public class Send {

    private final static String QUEUE_NAME = "hello";

    public static void main(String[] argv) throws Exception {
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("localhost");
        try (Connection connection = factory.newConnection();
             Channel channel = connection.createChannel()) {
            channel.queueDeclare(QUEUE_NAME, false, false, false, null);
            String message = "Hello World!";
            channel.basicPublish("", QUEUE_NAME, null, message.getBytes(StandardCharsets.UTF_8));
            System.out.println(" [x] Sent '" + message + "'");
        }
    }

//		2.Create an instance of the client ConnectionFactory:
//		ConnectionFactory factory = new ConnectionFactory();
//		3. Set the ConnectionFactory options establishing connection:
//		factory.setHost(rabbitMQhostname);
//		4. Connect to the RabbitMQ broker:
//		Connection connection = factory.newConnection();
//		5. Create a channel from the freshly created connection:
//		Channel channel = connection.createChannel();
//		6. As soon as we are done with RabbitMQ, release the channel and the connection:
//		channel.close();
//		connection.close();
 

}