package com.ug9.etransactionproject;

public class BNImo extends MobileBanking {
    public BNImo(String pemilik, long saldo, String noRekening) {
        super(pemilik, saldo, noRekening);
    }

    @Override
    public void transfer(DigitalPayment dp, long nominal) {
        if (dp instanceof BRImo){
            super.setCheckFee(true);
        }
        super.transfer(dp, nominal);
    }
}
