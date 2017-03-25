package com.denofprogramming;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.denofprogramming.service.BasicMessageOfTheDayImpl;
import com.denofprogramming.service.MessagePrinter;

public class Client {

	public static void main(final String[] args) {

				
		// configuration part
		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/spring/application.xml")) {
			context.registerShutdownHook();
			
			  MessagePrinter printer = context.getBean("messagePrinter",MessagePrinter.class);
			 
			  printer.printMessage();

			/*final BasicMessageOfTheDayImpl concreteService = context.getBean("basicMessageOfDay",
					BasicMessageOfTheDayImpl.class);
			concreteService.setMessage("Message from the Den!!");
			System.out.println(concreteService.getMessage());

			final BasicMessageOfTheDayImpl concreteService2 = context.getBean("basicMessageOfDay",
					BasicMessageOfTheDayImpl.class);
			System.out.println(concreteService2.getMessage());

			// doing something part...
*/			 //printer.printMessage(); 

		} catch (final Exception ex) {
			ex.printStackTrace();
		}
				
		// doing something part...
		
	}
}
