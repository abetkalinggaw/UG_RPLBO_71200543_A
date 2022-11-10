package com.ug9.etransactionproject;

public class Dana extends MobileWallet {
    private long ovoFeeTransferBank;

    public Dana(String username, long saldo, String noHp) {
        super(username, saldo, noHp);
        ovoFeeTransferBank=2000;
    }

    @Override
    public void transfer(DigitalPayment dp, long nominal) {
        super.setFeeTransferBank(ovoFeeTransferBank);
        if (dp instanceof Ovo){
            System.out.println("Transfer gagal, akun OVO tidak valid");
        }else{
            super.transfer(dp, nominal);
        }
    }
}
