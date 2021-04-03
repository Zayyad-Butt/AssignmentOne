package com.example.kidsalphabetapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;

public class Alphabets extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabets);

        String[] alphabets=new String[26];
        char c='A';
        for(int i =0;i<26;i++)
        {
            alphabets[i]=Character.toString(c);
            c++;
            //Log.d("Character",alphabets[i]);
        }
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,alphabets);
        GridView gridView=findViewById(R.id.gridView);
        gridView.setAdapter(arrayAdapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?>adapterView, View v, int i, long l) {
                Intent intent=new Intent(Alphabets.this,ImageAndAudio.class);
                intent.putExtra("name",alphabets[i]);
                startActivity(intent);
            }
        });

    }
}