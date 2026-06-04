package com.indivaragroup.springbasics.exam;

import com.indivaragroup.springbasics.exam.dto.Gudang;
import com.indivaragroup.springbasics.exam.interfaces.Sales;
import com.indivaragroup.springbasics.exam.interfaces.impl.SalesMobil;
import com.indivaragroup.springbasics.exam.interfaces.impl.SalesMotor;

import java.util.List;

public class DistribusiService {
  public final Gudang gudang;
  public final SalesMotor salesMotor1;
  public final SalesMotor salesMotor2;
  public final SalesMotor salesMotor3;
  public final SalesMobil salesMobil1;
  public final SalesMobil salesMobil2;

  public DistribusiService(Gudang gudang,
                            SalesMotor salesMotor1,
                            SalesMotor salesMotor2,
                            SalesMotor salesMotor3,
                            SalesMobil salesMobil1,
                            SalesMobil salesMobil2){
    this.gudang = gudang;
    this.salesMotor1 = salesMotor1;
    this.salesMotor2 = salesMotor2;
    this.salesMotor3 = salesMotor3;
    this.salesMobil1 = salesMobil1;
    this.salesMobil2 = salesMobil2;
  }

  public void distribusiBarang(){
    List<Sales> salesList = List.of(salesMotor1, salesMotor2, salesMotor3, salesMobil1, salesMobil2);
    for (Sales sale : salesList){
      System.out.println("[DISTRIBUSI] Sales: " + sale.getNama() +
        " | Wilayah : " + sale.getWilayah() + " | Kendaraan: " + sale.getTipeKendaraan() +
        " | Gudang: " + gudang.getNamaGudang() + " (stok: " + gudang.getStockBarang() + ")" );

    }
  }

  public void distribusiBarangDenganPengurangan(){
    List<Sales> salesList = List.of(salesMotor1, salesMotor2, salesMotor3, salesMobil1, salesMobil2);
    for (Sales sale : salesList){
      System.out.println("[DISTRIBUSI] Sales: " + sale.getNama() +
        " | Wilayah : " + sale.getWilayah() + " | Kendaraan: " + sale.getTipeKendaraan() +
        " | Gudang: " + gudang.getNamaGudang() + " (stok: " + gudang.getStockBarang() + ")" );
      gudang.setStockBarang(gudang.getStockBarang() - 50 );

    }
  }

}
