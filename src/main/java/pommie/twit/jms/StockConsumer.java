/**
 * 
 */
package pommie.twit.jms;

import javax.jms.ConnectionFactory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.listener.SimpleMessageListenerContainer;
import org.springframework.jms.listener.adapter.MessageListenerAdapter;

/**
 * 
 * @author limey-git
 *
 */
@Configuration
public class StockConsumer {

	@Bean
	public SimpleMessageListenerContainer jmsListener( ConnectionFactory connectionFactory ) { 
		SimpleMessageListenerContainer container = new SimpleMessageListenerContainer( ); container.setConnectionFactory( connectionFactory );
		Object listener = new Object( ) {
			@SuppressWarnings( "unused" )
			public void handleMessage( String message ) {
				System.out.println("Received " + message );
			}
		};
		MessageListenerAdapter adapter = new MessageListenerAdapter( listener );
		container.setMessageListener( adapter );container.setDestinationName( "rabbit-trader-channel" );
		return container;
	}
}
