package Model;

import Util.Type_Transc;

import java.time.LocalDate;

public class Transaction {
 private int I_id;
 private int B_id;
 private int Asset_id;
 private Type_Transc type ;
 private LocalDate Date_of_tranc;
 private  long Amount ;


public Transaction(int id , int bid , int asset_id ,Type_Transc type , LocalDate DOT,long amount ){
    this.I_id = I_id;
    this.B_id = bid;
    this.Asset_id = asset_id;
    this.type = type;
    this.Date_of_tranc = DOT;
    this.Amount = amount;
}

    public int getI_id() {
        return I_id;
    }

    public void setI_id(int i_id) {
        I_id = i_id;
    }

    public int getB_id() {
        return B_id;
    }

    public void setB_id(int b_id) {
        B_id = b_id;
    }

    public int getAsset_id() {
        return Asset_id;
    }

    public void setAsset_id(int asset_id) {
        Asset_id = asset_id;
    }

    public Type_Transc getType() {
        return type;
    }

    public void setType(Type_Transc type) {
        this.type = type;
    }

    public LocalDate getDate_of_tranc() {
        return Date_of_tranc;
    }

    public void setDate_of_tranc(LocalDate date_of_tranc) {
        Date_of_tranc = date_of_tranc;
    }

    public long getAmount() {
        return Amount;
    }

    public void setAmount(long amount) {
        Amount = amount;
    }
    @Override
    public String toString(){
    return "|Investor ID :"+this.I_id +
            " |Broker ID :"+this.B_id +
            " | Asset Id : "+this.Asset_id +
            "| Transation Type :"+this.type +
            "| Date :"+this.Date_of_tranc +
            "AMount :"+this.Amount + "|";


    }

}
