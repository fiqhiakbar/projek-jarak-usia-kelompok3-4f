/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jarakusia;

/**
 *
 * @author fiqhi
 */
   import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;
public class Jarakusia {
    public static void main(String[] args) {
        try ( // Membaca input tanggal lahir dari pengguna
                Scanner scanner = new Scanner(System.in)) {
            System.out.print("Masukkan tanggal lahir orang pertama (yyyy-mm-dd): ");
            String tanggalLahir1Str = scanner.nextLine();
            LocalDate tanggalLahir1 = LocalDate.parse(tanggalLahir1Str);
            
            System.out.print("Masukkan tanggal lahir orang kedua (yyyy-mm-dd): ");
            String tanggalLahir2Str = scanner.nextLine();
            LocalDate tanggalLahir2;
            tanggalLahir2 = LocalDate.parse(tanggalLahir2Str);
            
            // Menghitung selisih usia menggunakan class Period
            Period selisihUsia = Period.between(tanggalLahir1, tanggalLahir2);
            
            // Menampilkan selisih usia dalam tahun, bulan, dan hari
            System.out.println("Selisih usia: " + selisihUsia.getYears() + " tahun, " +
                    selisihUsia.getMonths() + " bulan, " +
                    selisihUsia.getDays() + " hari");
        }
    }
}