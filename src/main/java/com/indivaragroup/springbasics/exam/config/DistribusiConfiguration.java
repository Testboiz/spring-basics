package com.indivaragroup.springbasics.exam.config;

import com.indivaragroup.springbasics.exam.DistribusiService;
import com.indivaragroup.springbasics.exam.dto.Gudang;
import com.indivaragroup.springbasics.exam.interfaces.impl.SalesMobil;
import com.indivaragroup.springbasics.exam.interfaces.impl.SalesMotor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DistribusiConfiguration {

  @Bean
  public DistribusiService getDistribusiService(@Qualifier("gudangUtama") Gudang gudang,
                                                @Qualifier("motor1") SalesMotor salesMotor1,
                                                @Qualifier("motor2") SalesMotor salesMotor2,
                                                @Qualifier("motor3") SalesMotor salesMotor3,
                                                @Qualifier("mobil1") SalesMobil salesMobil1,
                                                @Qualifier("mobil2") SalesMobil salesMobil2) {
    return new DistribusiService(gudang, salesMotor1, salesMotor2, salesMotor3, salesMobil1, salesMobil2);
  }
}
