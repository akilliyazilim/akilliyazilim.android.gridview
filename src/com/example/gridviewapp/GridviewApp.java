package com.example.gridviewapp;

import android.app.Activity;
import android.os.Bundle;
import android.speech.tts.TextToSpeech.OnInitListener;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;
import android.widget.Toast;

public class GridviewApp extends Activity implements OnInitListener {
 
    public static final String[] OS = {"Windows","Apple","Android","Symbian","BlackBerry"};
 
    GridView gridView;
 
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gridview_app);
 
        GridView gridview =(GridView) findViewById(R.id.gridView1);
 
        gridview.setAdapter(new ImageAdapter(this, OS));
 
        gridview.setOnItemClickListener(new OnItemClickListener() {
 
            public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
                    long arg3) {
                // TODO Auto-generated method stub
 
                Toast.makeText(getApplicationContext(),
                         OS[arg2],Toast.LENGTH_SHORT).show();
 
            }
        });
 
    }
 
    public void onInit(int status) {
        // TODO Auto-generated method stub
 
    }
}
