package com.indivaragroup.springbasics.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JDTConfiguration {
  @Bean
  public String getInitialConfiguration(){
    return "JDT17 - Configuration";
  }
}
