package com.jhuster.eweightscale;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class StartActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.v("StartActivity","a");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
    }
}
