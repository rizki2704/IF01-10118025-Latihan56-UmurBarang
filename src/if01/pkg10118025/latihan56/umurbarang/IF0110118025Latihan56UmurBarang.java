/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if01.pkg10118025.latihan56.umurbarang;

/**
 * Nama     : Rizki Restu Illahi
 * NIM      : 10118025
 * Kelas    : IF-01
 */
public class IF0110118025Latihan56UmurBarang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         BarangAntik rd;

        rd = new Radio(234);
        ((Radio) rd).setName("Radio AM");

        System.out.printf("Nama barang Antik\t\t: %s%n", ((Radio) rd).getName());
        ((Radio) rd).tampilUmur();
    }
    
}
