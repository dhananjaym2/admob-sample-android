package admob.sample.android;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

//    private AdView bannerAd_activity_main_bottom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        bannerAd_activity_main_bottom = findViewById(R.id.bannerAd_activity_main_bottom);
    }

    @Override
    protected void onResume() {
        super.onResume();
//        AdRequest adRequest = new AdRequest.Builder().build();
//        bannerAd_activity_main_bottom.loadAd(adRequest);

    }
}