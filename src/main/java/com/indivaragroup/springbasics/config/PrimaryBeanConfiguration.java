package com.indivaragroup.springbasics.config;

import com.indivaragroup.springbasics.dto.WorldDTO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

public class PrimaryBeanConfiguration {
  @Bean
  @Primary // prefer just one and ONE here, alternative use @Order(N)
  public WorldDTO world() {
    return new WorldDTO();
  }
  @Bean
  public WorldDTO world2() {
    return new WorldDTO();
  }
}
