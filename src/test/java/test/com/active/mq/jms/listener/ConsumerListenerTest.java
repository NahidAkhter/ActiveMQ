package test.com.active.mq.jms.listener;

import static org.junit.Assert.assertNull;

import javax.jms.TextMessage;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.active.mq.jms.listener.ConsumerListener;

class ConsumerListenerTest {
	private TextMessage message;

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testOnMessage() {
		new ConsumerListener().onMessage(message);
		assertNull(message);
	}

}
