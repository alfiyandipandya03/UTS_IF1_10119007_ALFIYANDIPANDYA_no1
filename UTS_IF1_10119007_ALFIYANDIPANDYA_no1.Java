import java.time.Year;
import java.util.Scanner;
/*
NAMA  : Alfiyandi Pandya Khalfani
KELAS : IF 1
NIM   : 10119007
*/
public class UTS_IF1_10119007_ALFIYANDIPANDYA_no1 {
    public static void main(String[] args) {
        Age a = new Age(Year.now().getValue());
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Masukkan Tahun Lahir Anda : ");
        a.setYearBirth(scan.nextInt());
        int umur = a.hitungUmur();
        System.out.println();
        
        System.out.println("====Hasil Perhitungan Umur====");
        System.out.println("Tahun lahir anda : "+a.getYearBirth());
        System.out.println("Hari ini tahun : "+a.getYearNow());
        System.out.println("Umur kamu sampai hari ini adalah "+umur+" tahun");
        System.out.println("Tandanya Kamu ".concat(a.tandanyaKamu(umur)));
    }

}
