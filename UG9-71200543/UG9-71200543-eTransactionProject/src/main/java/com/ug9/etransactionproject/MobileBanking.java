package com.ug9.etransactionproject;

public class MobileBanking extends DigitalPayment{
    private boolean checkFee;
    private long feeAntarBank;
    private String noRekening;

    public MobileBanking(String pemilik, long saldo, String noRekening) {
        super(pemilik, saldo);
        this.noRekening = noRekening;
        feeAntarBank = 6000;
    }

    public String getNoRekening() {
        return noRekening;
    }

    public boolean isCheckFee() {
        return checkFee;
    }

    public void setCheckFee(boolean checkFee) {
        this.checkFee = checkFee;
    }

    @Override
    public void transfer(DigitalPayment dp, long nominal) {
        if (nominal<0){
            System.out.println("Nominal yang Anda input tidak valid!");
        }else{

            if (super.getSaldo()>0){
                if (super.getSaldo()>=nominal){
                    if (this.isCheckFee()){
                        super.setSaldo(super.getSaldo()-(feeAntarBank+nominal));
                        dp.setSaldo(dp.getSaldo()+nominal);
                    }else{
                        super.setSaldo(super.getSaldo()-nominal);
                        dp.setSaldo(dp.getSaldo()+nominal);
                    }
                    super.printBuktiTransfer(dp,nominal);
                    this.checkFee=false;

                }else{
                    System.out.println("Transfer gagal! saldo anda tidak mencukupi.");
                }
            }else{
                System.out.println("Transfer gagal saldo 0");
            }

        }
    }
}
