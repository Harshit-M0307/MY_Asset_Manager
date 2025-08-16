package View;

import Controller.Asset_Controller;
import Controller.Investor_Controller;
import Util.ConnectionMyDB;

import java.sql.Connection;

public class Runner {

    public static void main(String[] args) {
        System.out.println("Welcome to asset management ");
        Connection Con = ConnectionMyDB.Connect();

        Investor_Controller sc = new Investor_Controller(Con);
//        sc.CreateInvestor(Con);
//        sc.UpdateInvestor();
        Asset_Controller asset = new Asset_Controller(Con);
        asset.CreateAssetTable(Con);
        asset.Inset_Asset( "5hPfzJy0x3" ,423,"Equity");



    }
}
