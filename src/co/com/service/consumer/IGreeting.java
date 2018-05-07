package co.com.service.consumer;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(name = "IGreeting", targetNamespace = "http://consumer.service.com.co/")
public interface IGreeting {
	
	@WebMethod(operationName = "greetingWithName", action = "urn:GreetingWithName")
	String greetingWithName(String name);

}
