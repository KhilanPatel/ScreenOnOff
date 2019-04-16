package com.example.demo.SRC;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.example.demo.R;

public class ScreenOnOff extends Activity {
    // Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_on_off);
        //   context=this.context;
        // Start AEScreenOnOffService Service

        Intent i0 = new Intent(this, AEScreenOnOffService.class);
        startService(i0);

    }

}
