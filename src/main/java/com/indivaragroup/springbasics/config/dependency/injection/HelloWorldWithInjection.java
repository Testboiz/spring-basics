package com.indivaragroup.springbasics.config.dependency.injection;

import com.indivaragroup.springbasics.config.dependency.injection.dto.HelloInjection;
import com.indivaragroup.springbasics.config.dependency.injection.dto.WorldInjection;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldWithInjection {
  @Bean
  public HelloInjection hello(){
    return new HelloInjection();
  }

  @Bean
  public WorldInjection world(){
    return new WorldInjection();
  }

  public  HelloWorldInjection helloWorldInjection(HelloInjection helloInjection, WorldInjection worldInjection){
    return new HelloWorldInjection(helloInjection, worldInjection);
  }
}
