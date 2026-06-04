package com.indivaragroup.springbasics.exam.interfaces.impl;

import com.indivaragroup.springbasics.exam.interfaces.Sales;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class SalesMobil implements Sales {
  private String nama;
  private String wilayah;
  public String getTipeKendaraan(){
    return "Motor";
  }}
