package Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.random.*;

import java.util.Scanner;
import Util.Region;
import Util.Status;

public class Investor_Controller
    {

        Scanner Sc = new Scanner(System.in);
        Scanner INt = new Scanner(System.in);
        Connection Con = null ;
  public   Investor_Controller(Connection Con){

        this.Con = Con ;

    }

    private String GeneratePID(){
      final String Alphanumeric = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyz";
      StringBuilder sd = new StringBuilder();
      for(int i = 0 ; i <10 ;i++){
          int  temp = (int)(Math.random()*Alphanumeric.length());
          sd.append(Alphanumeric.charAt(temp));
      }
      return sd.toString();
    }


        public void UpdateInvestor(){
        System.out.println("ENter the Investors Name");
        String Name = Sc.nextLine();
        String Pid = GeneratePID();
        System.out.println("Enter your Region ");
        String region = Sc.nextLine();
        region = region.toUpperCase();
        Region rg = null;

        switch (region) {
            case "BERKLEY":
                rg = Region.Berkley;
                break;
            case " BOMBAY":
                rg = Region.Bombay;
                break;
            case " EASTCOST":
                rg = Region.EastCost;
                break;
            case " LONDON":
                rg = Region.London;
                break;

            case " NEWYORK":
                rg = Region.New_york;
                break;

            case " WESTCOST":
                rg = Region.WestCost;
                break;
        }

        System.out.println("Enter your Occupation");
        String occ = Sc.nextLine();
        System.out.println("Enter your Net Worth ");
        Long NW = INt.nextLong();
        System.out.println("Enter the date of Joining ");
        String Sd = Sc.nextLine();
        LocalDate date = LocalDate.parse(Sd);
            System.out.println("Enter your Current Status");
        String stat = Sc.nextLine().toUpperCase();
            Status st = null;
         switch (stat){
             case "ACTIVE":
                 st=Status.Active;
                 break;
             case "EXITED":
                 st = Status.Exited;
                 break;
             case "INACTIVE":
                 st = Status.InActive;
                 break;
             case "SUSPENDED":
                 st = Status.Suspended;
                 break;
         }


        try{
            PreparedStatement pd = Con.prepareStatement("insert into Investor (Port_folio_id ,name ,region,occup,NetWorth,date_of_joining,Status)values(?,?,?,?,?,?,?)");
            pd.setString(1,Pid);
            pd.setString(2,Name);
            pd.setString(3,region);
            pd.setString(4,occ);
            pd.setLong(5,NW);
            pd.setDate(6,java.sql.Date.valueOf(date));
            pd.setString(7,stat);
            if(pd.executeUpdate()>0){

                System.out.println("********* Record Created Successfully ********");

            }else{
                System.out.println("******Unable to create New Record **********");
            }

        }catch (SQLException e){
            throw new RuntimeException(e);
        }



    }

        public void CreateInvestor(Connection con) {
        try {
            String sql = "CREATE TABLE IF NOT EXISTS Investor (" +
                    "id SERIAL PRIMARY KEY, " +
                    "Port_folio_id VARCHAR(10),"+
                    "name VARCHAR(100), " +
                    "region VARCHAR(100), " +
                    "occup VARCHAR(100), " +
                    "NetWorth BIGINT, " +
                    "date_of_joining DATE," +
                    " Status varchar"+
                    ")";

            try (Statement stmt = con.createStatement()) {
                stmt.execute(sql);
                System.out.println(" Investor table created successfully (or already exists).");
            }

        } catch (SQLException e) {
            System.out.println(" Error creating Investor table: " + e.getMessage());
        }
    }


    }


