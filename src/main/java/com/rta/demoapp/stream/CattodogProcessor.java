package com.rta.demoapp.stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;
import com.fasterxml.jackson.databind.ObjectMapper;

import com.rta.demoapp.dto.Cat;
import com.rta.demoapp.dto.Dog;

@EnableBinding(CattodogMetadata.class)
public class CattodogProcessor {

	@Autowired
    ObjectMapper mapper;

	@StreamListener("catin")
  	@SendTo("dogin")
  	public Message<?> handle(Cat cat) {

  		Dog dog = new Dog();

  		try {
	  		return MessageBuilder.withPayload(
	                    mapper.writeValueAsString(dog)
	            )
	            .setHeader("contentType", "application/json")
	            .build();
	    } catch (Exception e) { throw new RuntimeException(e);}
  	}
}