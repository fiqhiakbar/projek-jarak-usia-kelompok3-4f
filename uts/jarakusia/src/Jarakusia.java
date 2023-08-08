import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.time.Period;
import java.util.Scanner;

public class Jarakusia {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Membaca input tanggal lahir dari pengguna untuk orang pertama
            System.out.print("Masukkan tanggal lahir orang pertama (yyyy-mm-dd): ");
            String tanggalLahir1Str = scanner.nextLine();
            LocalDate tanggalLahir1 = LocalDate.parse(tanggalLahir1Str);

            // Membaca input tanggal lahir dari pengguna untuk orang kedua
            System.out.print("Masukkan tanggal lahir orang kedua (yyyy-mm-dd): ");
            String tanggalLahir2Str = scanner.nextLine();
            LocalDate tanggalLahir2 = LocalDate.parse(tanggalLahir2Str);

            // Menghitung selisih usia menggunakan class Period
            Period selisihUsia = Period.between(tanggalLahir1, tanggalLahir2);

            // Menampilkan selisih usia dalam tahun, bulan, dan hari
            System.out.println("Selisih usia: " + selisihUsia.getYears() + " tahun, " +
                    selisihUsia.getMonths() + " bulan, " +
                    selisihUsia.getDays() + " hari");
        } catch (DateTimeParseException e) {
            System.out.println("Format tanggal salah. Harap masukkan tanggal dengan format yyyy-mm-dd.");
        }
    }
}
