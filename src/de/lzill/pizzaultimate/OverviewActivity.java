package de.lzill.pizzaultimate;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TextView;

public class OverviewActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_overview);

        Intent intent = getIntent();
        //Bundle extras = getIntent().getExtras();

        final TextView textview1 = (TextView) findViewById(R.id.textView);
        final TextView textview2 = (TextView) findViewById(R.id.textView2);
        final TextView textview3 = (TextView) findViewById(R.id.textView3);
        final TextView textview4 = (TextView) findViewById(R.id.textView4);

        textview1.setText(intent.getStringExtra("username"));
        textview2.setText(intent.getStringExtra("meal"));
        textview3.setText(intent.getStringExtra("size"));
        textview4.setText(intent.getStringExtra("price"));

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_overview, menu);
        return true;
    }
}