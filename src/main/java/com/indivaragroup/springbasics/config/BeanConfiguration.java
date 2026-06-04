package com.indivaragroup.springbasics.config;

import com.indivaragroup.springbasics.dto.HelloDTO;
import com.indivaragroup.springbasics.dto.WorldDTO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class BeanConfiguration {
  @Bean
  @Primary // first run
  public HelloDTO helloDTO(){
    return new HelloDTO();
  }
  @Bean
  public HelloDTO helloDTO1(){
    return new HelloDTO();
  }
  @Bean
  public WorldDTO worldDTO() {
    return new WorldDTO();
  }
}
