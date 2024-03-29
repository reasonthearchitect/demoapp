package com.rta.demoapp.jbehave;

import org.springframework.context.annotation.ImportResource;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@ContextConfiguration(classes = AcceptanceTestsConfiguration.class)
@ActiveProfiles("dev")
@DirtiesContext
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface AcceptanceTest {
}