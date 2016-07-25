package com.rta.demoapp.test.stream

import com.rta.demoapp.dto.Cat;
import com.rta.demoapp.dto.Dog;
import com.rta.demoapp.stream.CattodogProcessor

import org.springframework.messaging.Message
import com.fasterxml.jackson.databind.ObjectMapper
import spock.lang.Specification

class CattodogProcessorSpec extends Specification {

    CattodogProcessor cattodogProcessor;

    def setup() {
        this.cattodogProcessor         = new CattodogProcessor();
        this.cattodogProcessor.mapper  = new ObjectMapper();
    }

    def "simple test to make sure that the right object is returned"() {

        setup:
        Cat cat = [];

        when:
        Message message = this.cattodogProcessor.handle(cat);

        then:
        message != null
        message.getPayload() != null
    }
}
