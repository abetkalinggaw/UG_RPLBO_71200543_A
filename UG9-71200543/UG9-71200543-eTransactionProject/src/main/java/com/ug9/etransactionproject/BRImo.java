package com.ug9.etransactionproject;

public class BRImo extends MobileBanking {
    public BRImo(String pemilik, long saldo, String noRekening) {
        super(pemilik, saldo, noRekening);
    }

    @Override
    public void transfer(DigitalPayment dp, long nominal) {
        if (dp instanceof BRImo) {
            super.setCheckFee(true);
        }
        super.transfer(dp, nominal);
    }
}