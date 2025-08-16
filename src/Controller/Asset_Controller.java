package Controller;

import Util.Asset_type;
import Util.OnwerShipStat;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.Scanner;

public class Asset_Controller {
    Scanner Sc_txt = new Scanner(System.in);
    Scanner Sc_int = new Scanner(System.in);
    Connection Con = null ;

    public Asset_Controller(Connection Con){
        this.Con = Con;
    }

    public void CreateAssetTable(Connection Con){
    try{
        String sql ="CREATE TABLE IF NOT EXISTS Asset (" +
                "Id SERIAL, " +
                "Pid VARCHAR(10), " +
                "AssetType VARCHAR(255), " +
                "Own_status VARCHAR(255), " +
                "Share_quantity INT, " +
                "Date_of_buy DATE, " +
                "Date_of_sell DATE, " +
                " ShareWorth BIGINT" +
                ");";

        Statement st = Con.createStatement();
         st.execute(sql);
        System.out.println("******ASSET Table  Created Successfully ******");


    }catch(SQLException e){
        throw  new RuntimeException(e);
    }
    }


    public void Inset_Asset(String Pid ,int Shares ,String asset){

        System.out.println("Enter the Amount ");
        Long Amt = Sc_int.nextLong();
        System.out.println("Enter the Ownership status");
        String own = Sc_txt.nextLine().toUpperCase();
        OnwerShipStat ow = null;
        switch(own){
            case "OWNED":
                ow= OnwerShipStat.OWNED;
                break;
            case "DISPOSED":
                ow = OnwerShipStat.DISPOSED;
                break ;
        }
        System.out.println("Enter Date of Buy");
        String Sd  = Sc_txt.nextLine();
        LocalDate Ld = LocalDate.parse(Sd);
//        System.out.println("Enter the Date of Dispose");
//        String Dis = Sc_txt.nextLine();
//        LocalDate Lc = LocalDate.parse(Dis);

        Asset_type ass  = null ;
        switch (asset.toUpperCase()) {
            case "EQUITY":
                ass = Asset_type.EQUITY;
                break;
            case "BOND":
                ass = Asset_type.BOND;
                break;
            case "ETF":
                 ass = Asset_type.ETF;
                break;
            case "REAL_ESTATE":
                 ass = Asset_type.REAL_ESTATE;
                break;
            case "COMMODITY":
                ass =Asset_type.COMMODITY;
                break;
            case "CRYPTOCURRENCY":
                ass = Asset_type.CRYPTOCURRENCY;
                break;
            case "CASH":
                 ass = Asset_type.CASH;
                break;
            case "DERIVATIVE":
                ass = Asset_type.DERIVATIVE;
                break;
            case "PRIVATE_EQUITY":
                ass = Asset_type.PRIVATE_EQUITY;
                break;
            case "VENTURE_CAPITAL":
                ass = Asset_type.VENTURE_CAPITAL;
                break;
            case "OTHER":
                ass = Asset_type.OTHER;
                break;
            default:
                System.out.println("Unknown asset type: " + asset);
        }

        try{
            PreparedStatement Pd = Con.prepareStatement(
                    "INSERT INTO Asset (" +
                            "Pid, " +
                            "AssetType, " +
                             "Share_quantity ,"+
                            "own_Status, " +
                            "ShareWorth, " +
                            "Date_of_buy" +
                            ") VALUES (?, ?, ?, ?, ?,?)"
            );


            Pd.setString(1,Pid);
            Pd.setString(2,asset);
            Pd.setInt(3,Shares);
            Pd.setString(4,own);
            Pd.setLong(5,Amt);
            Pd.setDate(6,java.sql.Date.valueOf(Ld));
//            Pd.setDate(6,java.sql.Date.valueOf(Lc));

            if(Pd.executeUpdate()>0){
                System.out.println("*****Invest record Added Successfully ******");

            }else{
                System.out.println("****** Invalid Response *******");
            }


        }catch (SQLException e){
            throw  new RuntimeException(e);
        }




    }


}
