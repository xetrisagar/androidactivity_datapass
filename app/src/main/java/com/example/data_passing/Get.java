package com.example.data_passing;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Get extends AppCompatActivity {
TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_get);

        txt=findViewById(R.id.txt);
         Intent i=getIntent();
       String name=  i.getStringExtra("name");
        String gender= i.getStringExtra("gender");
         String game=i.getStringExtra("game");
       String course=  i.getStringExtra("course");

         txt.setText("your name is: "+name+"\n\n"+"you are: "+gender+"\n\n"+"you like playing: "+game+"\n\n"+"you are enrolled in course: "+course+"\n\n\n\n"+"HAPPY DAY!!!!!");



    }
}