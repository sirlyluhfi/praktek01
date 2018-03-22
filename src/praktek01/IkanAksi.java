/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktek01;

/**
 *
 * @author Lenovo
 */
public class IkanAksi {
    public static void main(String[] args) {
       Ikan gabus = new Ikan();
       Ikan hiu = new Ikan();
       Ikan kerapu = new Ikan();
       
       gabus.nama="ikan gabus";
       gabus.bentuk="lonjong dan panjang";
       gabus.warna="hitam putih atau putih pucat";
       gabus.banyak_sisik="50++";
       gabus.jumlah_sirip="5+";
       gabus.habitat="air tawar seperti sungai";
       
       
      gabus.CaraBerkembangBiak();
      
        hiu.nama="ikan hiu";
        hiu.bentuk="panjang dan besar";
        hiu.warna="putih atau biru";
        hiu.banyak_sisik="tidak ada";
        hiu.jumlah_sirip="5+";
        hiu.habitat="air asin";
        
      hiu.CaraBerkembangBiak();
      
        kerapu.nama="ikan kerapu";
        kerapu.bentuk="pedek bersisik keras";
        kerapu.warna="hitam bentol merah dll";
        kerapu.banyak_sisik="50++";
        kerapu.jumlah_sirip="5++";
        kerapu.habitat="air asin atau air tawar/payau";
      
     kerapu.CaraBerkembangBiak();
    }
    
      
}
