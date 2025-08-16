package Model;

import Util.Region;
import Util.Status;

import java.time.LocalDate;

public class Investor {
    private int I_id;
    private String Name;
    private String Portfolio_id;
    private Region region;
    private  String occup;
    private Status status;
    private LocalDate date;
    private long Networth;

    public Investor(int I_id, String Name, String Portfolio_id, Region region , String occup, Status status , LocalDate date , long Nethworth){
        this.I_id=I_id;
        this.Name = Name;
        this.Portfolio_id =Portfolio_id;
        this.region = region;
        this.occup = occup;
        this.status = status;
        this.date = date;
        this.Networth = Nethworth ;
    }

    public int getI_id() {
        return I_id;
    }
    public void setI_id(int i_id) {
        I_id = i_id;
    }

    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public String getPortfolio_id() {
        return Portfolio_id;
    }
    public void setPortfolio_id(String portfolio_id) {
        Portfolio_id = portfolio_id;
    }
    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }
    public String getOccup() {
        return occup;
    }

    public void setOccup(String occup) {
        this.occup = occup;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
    public long getNetworth() {
        return Networth;
    }
    public void setNetworth(long networth) {
        Networth = networth;
    }
}
