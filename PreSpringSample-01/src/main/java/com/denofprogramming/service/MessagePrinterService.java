package com.denofprogramming.service;


public class MessagePrinterService {
   
    //private final BasicMessageOfTheDayImpl service = new BasicMessageOfTheDayImpl();
    private final DynamicMessageOfTheDayImpl service2 = new DynamicMessageOfTheDayImpl();
    
    public MessagePrinterService(){    	
    }
    
    public void printMessage() {
        System.out.println(service2.getMessage());
    }
	
}
