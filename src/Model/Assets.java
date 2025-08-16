package Model;

import Util.Asset_type;
import Util.OnwerShipStat;

import java.time.LocalDate;

public class Assets {

    private int Asset_id;
    private String Portfolio_id;
    private Asset_type asset;
    private OnwerShipStat own;
    private long Quantity;

    private LocalDate date_of_buy;
    private LocalDate date_of_sell;
    private long Net_assetprice;

    public Assets(int asset_id, String Portfolio_id, OnwerShipStat own,long Quantity, Asset_type asset, LocalDate date_of_buy, LocalDate date_of_sell, long net_asset) {
        this.Asset_id = asset_id;
        this.Portfolio_id = Portfolio_id;
        this.asset = asset;
        this.own = own;
        this.Quantity = Quantity ;
        this.date_of_buy = date_of_buy;
        this.date_of_sell = date_of_sell;
        this.Net_assetprice = net_asset;
    }

    public int getAsset_id() {
        return Asset_id;
    }

    public void setAsset_id(int asset_id) {
        Asset_id = asset_id;
    }

    public String getPortfolio_id() {
        return Portfolio_id;
    }

    public void setPortfolio_id(String portfolio_id) {
        Portfolio_id = portfolio_id;
    }

    public Asset_type getAsset() {
        return asset;
    }

    public void setAsset(Asset_type asset) {
        this.asset = asset;
    }

    public LocalDate getDate_of_buy() {
        return date_of_buy;
    }

    public void setDate_of_buy(LocalDate date_of_buy) {
        this.date_of_buy = date_of_buy;
    }

    public LocalDate getDate_of_sell() {
        return date_of_sell;
    }

    public void setDate_of_sell(LocalDate date_of_sell) {
        this.date_of_sell = date_of_sell;
    }

    public long getNet_assetprice() {
        return Net_assetprice;
    }

    public void setNet_assetprice(long net_assetprice) {
        Net_assetprice = net_assetprice;
    }

    public OnwerShipStat getOwn() {
        return own;
    }

    public void setOwn(OnwerShipStat own) {
        this.own = own;
    }

    public long getQuantity() {
        return Quantity;
    }

    public void setQuantity(long quantity) {
        Quantity = quantity;

    }
}