package admob.sample.android.app_controller;

import android.app.Application;

import com.google.android.gms.ads.MobileAds;

import admob.sample.android.R;

public class AppController extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        MobileAds.initialize(this, getString(R.string.app_id_ad_mob));
    }
}