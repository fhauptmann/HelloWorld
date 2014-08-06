package com.netzlink.hello;

public class HelloWorld {
	
	

	public static void main(String[] args) {
		HelloWorld hello = new HelloWorld();
		if (args.length > 0) {
			hello.setName(args[0]);
		}
		hello.sayHello();

	}
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String sayHello() {
		String out;
		if (this.name == null) {
			out = "Hello World!";
		}
		else {
			out = "Hello " + this.getName() + "!"; 
		}
		System.out.println(out);
		return out;
	}

}
