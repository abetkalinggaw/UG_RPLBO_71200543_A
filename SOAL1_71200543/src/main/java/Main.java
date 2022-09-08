import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        TabunganKonvensional K_71200543 = new TabunganKonvensional();
        TabunganBerjangka I_71200543 = new TabunganBerjangka();

        Scanner inp = new Scanner (System.in);
        System.out.println("Pilihan : ");
        System.out.println("1. Penyetoran");
        System.out.println("2. Penarikan");
        System.out.println("3. Lihat Saldo");
        System.out.println("Masukan Pilihan: ");
        int pilihan = inp.nextInt();

        if (pilihan == 1) {
            K_71200543.penyetoran(200000.0);
            I_71200543.penyetoran(1000000.0);
        } else if (pilihan == 2) {
            K_71200543.penarikan( 50000.0);
            I_71200543.penarikan(50000.0);
        } else if (pilihan == 3) {
            System.out.println("Saldo K_71200543 :"); K_71200543.getSaldo();

            System.out.println("Saldo I_71200543 :"); I_71200543.getSaldo();
        } else {
            System.out.println("Maaf Inputan Anda Tidak Valid");
        }
    }}
