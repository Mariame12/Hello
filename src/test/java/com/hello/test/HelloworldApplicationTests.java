package com.hello.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.hello.test.service.BusinessServices;

@SpringBootTest
class HelloworldApplicationTests {
	 @Autowired
	    private BusinessServices bs;
	@Test
	void contextLoads() {
	}

    @Test
    public void testGetHelloWorld() {

        String expected = "Hello World!";

        String result = bs.getHelloworld().getValue();

        assertEquals(expected, result);
    }

}
