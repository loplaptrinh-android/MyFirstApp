package com.tiendung.admin.myfirstapp;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;


public class SecondActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //khai bao intent va lay chuoi tu activity thu nhat
        Intent intent = getIntent();
        String myname = intent.getStringExtra(FirstActivity.NAME);
        Toast.makeText(this,myname,Toast.LENGTH_SHORT).show();
        // khai bao mot TextView de hien thi chuoi name
        TextView textview = new TextView(this);
        textview.setTextSize(30);
        textview.setText("Ten ban la "+myname);
        if (textview==null){
            Toast.makeText(this,"khong co textview",Toast.LENGTH_SHORT).show();
        }
        //hien thi textview
        setContentView(textview);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_second, menu);
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
