package com.indivaragroup.springbasics.exam.config;

import com.indivaragroup.springbasics.exam.interfaces.impl.SalesMobil;
import com.indivaragroup.springbasics.exam.interfaces.impl.SalesMotor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SalesConfiguration {
  @Bean
  @Qualifier("motor1")
  public SalesMotor motor1(){
    return new SalesMotor("Andi", "Zona A");
  }
  @Bean
  @Qualifier("motor2")
  public SalesMotor motor2(){
    return new SalesMotor("Budi", "Zona B");
  }
  @Bean
  @Qualifier("motor3")
  public SalesMotor motor3(){
    return new SalesMotor("Cici", "Zona C");
  }
  @Bean
  @Qualifier("mobil1")
  public SalesMobil mobil1(){
    return new SalesMobil("Dedi", "Zona D");
  }
  @Bean
  @Qualifier("mobil2")
  public SalesMobil mobil2(){
    return new SalesMobil("Eka", "Zona E");
  }
}
