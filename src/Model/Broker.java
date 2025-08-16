package Model;

import Util.Asset_type;
import Util.Region;

public class Broker {
    private int B_id;
    private Region region ;
    private Asset_type asset ;
    private float Commission_rate ;

    public Broker(int B_id , Region region , Asset_type asset , float CR){
        this.B_id = B_id;
        this.region = region;
        this.asset = asset;
        this.Commission_rate = CR;

    }

    public int getB_id() {
        return B_id;
    }

    public void setB_id(int b_id) {
        B_id = b_id;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

    public Asset_type getAsset() {
        return asset;
    }

    public void setAsset(Asset_type asset) {
        this.asset = asset;
    }

    public float getCommission_rate() {
        return Commission_rate;
    }

    public void setCommission_rate(float commission_rate) {
        Commission_rate = commission_rate;
    }
}
