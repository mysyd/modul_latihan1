import java.util.Scanner;

public class konversi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int hari;
        int tahun,sisa1,bulan,sisa2;

        System.out.println("Masukkan Jumlah Hari : ");
        hari = input.nextInt();

        tahun = hari/365;
        sisa1 = hari%365;
        bulan = sisa1/30;
        sisa2 = sisa1%30;

        hasil(hari, tahun, bulan, sisa2);

    }
    private static void hasil(int hari, int tahun, int bulan, int sisa2) {
        System.out.println(hari + "hari : " + tahun + "tahun");
        System.out.println(bulan + "bulan dan " + sisa2 + "hari");
    }
}
