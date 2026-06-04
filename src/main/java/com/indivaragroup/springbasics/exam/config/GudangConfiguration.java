package com.indivaragroup.springbasics.exam.config;

import com.indivaragroup.springbasics.exam.dto.Gudang;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GudangConfiguration {
  private static Gudang gudang;

  private GudangConfiguration(){
    // should not be initialized
  }
  @Bean
  public static Gudang gudangUtama(){
    if (gudang == null){
      gudang = new Gudang("Gudang Utama", 1000);
    }
    return gudang;
  }
}
