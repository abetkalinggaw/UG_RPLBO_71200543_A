package com.ug6.soal1;

import java.util.ArrayList;

public class VendingMachines {
    private String code;
    private int capacity;
    private int usedCapacity;
    private ArrayList<Goods> goods;
    private ArrayList<Double> acceptanceBalance;
    private double consumerMoney;


    public VendingMachines() {

    }

    public VendingMachines(int code, int capacity){
        this.code = String.valueOf(code);
        this.capacity = capacity;
    }

    public VendingMachines(int code, int capacity, Goods goods, double acceptanceBalance){
        this.code = String.valueOf(code);
        this.capacity = capacity;

    }

    public void proceedOrder(String goodsCode, int orderQuantity){


    }

    public void takeMoney(double money){
        this.consumerMoney = money;
    }

    private void giveGoods(double goodsPrice, String goodsName){

    }

    public double withdrawMoney(){
        return 0;
    }

    public void inputGoods(Goods good) {

    }

}
