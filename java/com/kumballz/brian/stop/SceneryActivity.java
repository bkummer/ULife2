package com.kumballz.brian.stop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SceneryActivity extends CategoryActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Override
    protected void setUpContent() {
        setContentView(R.layout.activity_scenery);
    }
}
