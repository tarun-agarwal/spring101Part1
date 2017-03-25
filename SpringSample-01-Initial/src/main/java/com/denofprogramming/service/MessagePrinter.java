package com.denofprogramming.service;

import org.springframework.beans.factory.annotation.Autowired;

public class MessagePrinter {
   	
    private MessageOfTheDayService service;

    public void printMessage() {
        System.out.println(service.getMessage());
    }
    @Autowired
	public void setService(MessageOfTheDayService service) {
		this.service = service;
	}
	


}
