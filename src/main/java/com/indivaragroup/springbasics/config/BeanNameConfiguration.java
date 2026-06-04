package com.indivaragroup.springbasics.config;

import com.indivaragroup.springbasics.dto.HelloDTO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanNameConfiguration {
  @Bean(name = "fooBean")
  public HelloDTO world() {
    return new HelloDTO();
  }
  @Bean(name = "barBean")
  public HelloDTO world2() {
    return new HelloDTO();
  }
}
