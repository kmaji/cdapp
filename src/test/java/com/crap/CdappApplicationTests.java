package com.crap;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = CdappApplication.class)
public class CdappApplicationTests {

	@Test
	public void contextLoads() {
		Hello hello = new Hello("Test");

		assertEquals("Test", hello.message);
	}
}
