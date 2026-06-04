package com.indivaragroup.springbasics.config;

import com.indivaragroup.springbasics.dto.HelloDTO;
import com.indivaragroup.springbasics.dto.WorldDTO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Primary;

@Configuration
public class DependsOnConfiguration {
  @Bean
  @DependsOn("bar")
  @Primary
  public HelloDTO foo(){
    return new HelloDTO();
  }
  @Bean
  public WorldDTO bar(){
    return new WorldDTO();
  }
}
