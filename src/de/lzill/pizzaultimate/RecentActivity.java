package de.lzill.pizzaultimate;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

public class RecentActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_recent, menu);
        return true;
    }
}