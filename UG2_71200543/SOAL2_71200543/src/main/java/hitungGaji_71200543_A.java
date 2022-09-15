import java.util.Scanner;

public class hitungGaji_71200543_A {
    public static void main(String[] args) {
            int Total = 300000;
            Scanner inp = new Scanner(System.in);
            System.out.print("Banyak Karyawan: ");
            int jmlLoop = inp.nextInt();
            for (int i = 1; i <= jmlLoop; i++) {
                System.out.print("Masukkan jumlah jam kerja: ");
                int totJamKerja = inp.nextInt();
                if (totJamKerja == 8) {
                    System.out.println("Total: Rp." + Total);
                    System.out.println("-------------------------------");
                } else if (totJamKerja < 8) {
                    int krg_jamkerja = totJamKerja - 8;
                    int Potongan = krg_jamkerja * -15000;
                    int total = Total - Potongan;
                    System.out.println("Kekurangan Jam: " + krg_jamkerja * -1);
                    System.out.println("Potongan: " + Potongan);
                    System.out.println("Total: Rp." + total);
                    System.out.println("-------------------------------");
                } else {
                    System.out.println("Invalid Input");
                }

}}}