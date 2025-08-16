package Util;


import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionMyDB {
    static Connection Con = null ;

    static public Connection Connect(){
        try {
            Con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/myassetmanagement","postgres","Mrcheeks@07");

        }catch (Exception e){
         e.printStackTrace();
        }
        if (Con != null){
            System.out.println("Connection build successfully");
          return  Con;
        }
        return null ;

    }

    public static void main(String[] args) {
        Connect();

    }

}
