package com.infotech.app.servre;

import org.springframework.stereotype.Service;

@Service
public class MessageServiceProvider {

	public String message(){
		return "Hello World!!";
	}
}
