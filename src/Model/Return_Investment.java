package Model;

import Util.Type_Transc;

public class Return_Investment {
    private int I_id ;
    private int Portfolio_id ;
    private Type_Transc type ;
    private float tax_rate ;
    private float Brokerage ;
    private long net_return ;

    public  Return_Investment(int id , int pid ,Type_Transc type , float tax ,float brokerage ,long net_return){
        this.I_id = id;
        this.Portfolio_id = pid;
        this.type  = type;
        this.tax_rate = tax;
        this.Brokerage = brokerage;
        this.net_return = net_return;
    }

    public int getI_id() {
        return I_id;
    }

    public void setI_id(int i_id) {
        I_id = i_id;
    }

    public int getPortfolio_id() {
        return Portfolio_id;
    }

    public void setPortfolio_id(int portfolio_id) {
        Portfolio_id = portfolio_id;
    }

    public Type_Transc getType() {
        return type;
    }

    public void setType(Type_Transc type) {
        this.type = type;
    }

    public float getTax_rate() {
        return tax_rate;
    }

    public void setTax_rate(float tax_rate) {
        this.tax_rate = tax_rate;
    }

    public float getBrokerage() {
        return Brokerage;
    }

    public void setBrokerage(float brokerage) {
        Brokerage = brokerage;
    }

    public long getNet_return() {
        return net_return;
    }

    public void setNet_return(long net_return) {
        this.net_return = net_return;
    }
}
