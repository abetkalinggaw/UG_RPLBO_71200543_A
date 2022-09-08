public class TabunganKonvensional {
    private String pemilik;
    private double saldo = 200000;

    String getPemilik() {
        return pemilik;
    }

    public void getSaldo() {System.out.println(saldo);}

    public void penarikan(double jumlah) {
        if (saldo>=jumlah) {
                saldo = saldo - jumlah;
                System.out.println("-------- Tabungan Konvensional --------");
                System.out.println("Penarikan Rp."+ jumlah);
            }
    }

    public void penyetoran(double jumlah) {
            saldo = saldo + jumlah;
            System.out.println("-------- Tabungan Konvensional --------");
            System.out.println("Penyetoran Rp." + jumlah);
        }
    }

