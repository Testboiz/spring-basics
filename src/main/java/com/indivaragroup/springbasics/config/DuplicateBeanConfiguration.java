package com.indivaragroup.springbasics.config;

import com.indivaragroup.springbasics.dto.HelloDTO;
import com.indivaragroup.springbasics.dto.WorldDTO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DuplicateBeanConfiguration {
  @Bean(name = "disabled1")
  public HelloDTO helloDTO(){
    return new HelloDTO();
  }
    @Bean(name = "disabled2")
  public HelloDTO helloDTO1(){
    return new HelloDTO();
  }
    @Bean(name = "disabled3")
  public WorldDTO worldDTO(){
    return new WorldDTO();
  }
}
