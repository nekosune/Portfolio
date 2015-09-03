package com.nekokittygames.portfolio;

import android.content.ComponentName;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Portfolio extends AppCompatActivity {

    Button movieButton;
    Button alexandriaButton;
    Button footballButton;
    Button buildButton;
    Button xyzButton;
    Button capstoneButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_portfolio);
        movieButton=(Button)this.findViewById(R.id.movieButton);
        alexandriaButton=(Button)this.findViewById(R.id.alexandriaButton);
        footballButton=(Button)this.findViewById(R.id.footballButton);
        buildButton=(Button)this.findViewById(R.id.buildButton);
        xyzButton=(Button)this.findViewById(R.id.xyzButton);
        capstoneButton=(Button)this.findViewById(R.id.capstoneButton);


        movieButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("android.intent.action.MAIN");
                intent.setComponent(ComponentName.unflattenFromString("com.nekokittygames.movieapp/com.nekokittygames.movieapp.MainScreen"));
                intent.addCategory("android.intent.category.LAUNCHER");
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);

            }
        });
        alexandriaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Portfolio.this, "This button will launch the alexandria app", Toast.LENGTH_SHORT).show();
            }
        });
        footballButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Portfolio.this, "This button will launch the football app", Toast.LENGTH_SHORT).show();
            }
        });
        buildButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Portfolio.this, "This button will launch the Buld it Better app", Toast.LENGTH_SHORT).show();
            }
        });
        xyzButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Portfolio.this, "This button will launch the XYZReader app", Toast.LENGTH_SHORT).show();
            }
        });
        capstoneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Portfolio.this, "This button will launch the capstone app", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_portfolio, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
