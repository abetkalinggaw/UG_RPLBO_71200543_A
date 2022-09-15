public class TabunganBerjangka {
    private String pemilik;
    private double saldo = 1000000;

    String getPemilik() {
        return pemilik;
    }

    public void getSaldo() {
        System.out.println(saldo);
    }

    public void penarikan(double jumlah) {
            System.out.println("-------- Tabungan Berjangka --------");
            System.out.println("Belum Jatuh Tempo");
        }

    public void penyetoran(double jumlah) {
        if (jumlah > 0) {
            this.saldo += jumlah;
            System.out.println("------- Tabungan Berjangka --------");
            System.out.println("Penyetoran Rp." + jumlah);
        }
    }
}




