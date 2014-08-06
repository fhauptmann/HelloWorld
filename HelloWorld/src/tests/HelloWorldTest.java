package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.netzlink.hello.HelloWorld;

public class HelloWorldTest extends HelloWorld {

	@Test
	public void testGetName() {
		HelloWorld hello = new HelloWorld();
		hello.setName("myName");
		assertEquals("myName", hello.getName());
	}

	@Test
	public void testSetName() {
		HelloWorld hello = new HelloWorld();
		hello.setName("asdf");
		assertEquals("myName", hello.getName());
	}

	@Test
	public void testSayHello() {
		HelloWorld hello = new HelloWorld();
		hello.setName("myName");
		String out = hello.sayHello();
		assertEquals("Hello myName!", out);
	}

}
