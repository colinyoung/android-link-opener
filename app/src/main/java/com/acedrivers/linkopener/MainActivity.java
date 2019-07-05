package com.acedrivers.linkopener;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    final String URL_TO_OPEN = "https://dashboard.wageup.com/loginKIR";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onResume() {
        super.onResume();

        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(URL_TO_OPEN));
        startActivity(browserIntent);
    }
}
