package com.rta.demoapp.stream;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.stereotype.Component;

@Component
public interface CattodogMetadata {
	
		@Input("catin")
    	SubscribableChannel read();
	 
		@Output("dogin")
    	MessageChannel post();
}