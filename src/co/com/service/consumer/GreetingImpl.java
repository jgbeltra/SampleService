package co.com.service.consumer;

import javax.jws.WebService;

@WebService(targetNamespace = "http://consumer.service.com.co/", endpointInterface = "co.com.service.consumer.IGreeting", portName = "GreetingImplPort", serviceName = "GreetingImplService")
public class GreetingImpl implements IGreeting {

	@Override
	public String greetingWithName(String name) {
		return "Hello Mrs "+name+" Welcome to Sample Service";
	}

}
