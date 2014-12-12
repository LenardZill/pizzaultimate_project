package de.lzill.pizzaultimate;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.*;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText edit_name = (EditText) findViewById(R.id.edit_name);
        final EditText edit_meal = (EditText) findViewById(R.id.edit_meal);
        final EditText edit_price = (EditText) findViewById(R.id.edit_price);

        final Spinner spinner_size = (Spinner) findViewById(R.id.spinner_size);

        final Button button_send = (Button) findViewById(R.id.button_send);
        final Button button_reset = (Button) findViewById(R.id.button_reset);


        button_send.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                CharSequence text = "Bestellung übertragen!";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(getApplicationContext(), text, duration);
                toast.show();

                Intent intent = new Intent(MainActivity.this, OverviewActivity.class);
                intent.putExtra("username", edit_name.getText().toString());
                intent.putExtra("meal", edit_meal.getText().toString());
                intent.putExtra("size", spinner_size.getSelectedItem().toString());
                intent.putExtra("price", edit_price.getText().toString());
                startActivity(intent);
            }
        });

        button_reset.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                CharSequence text = "Bestellung zurückgesetzt!";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(getApplicationContext(), text, duration);
                toast.show();

                Intent intent = new Intent(MainActivity.this, RecentActivity.class);
                startActivity(intent);
            }
        });

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.array_size, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_size.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
}