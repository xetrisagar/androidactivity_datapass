package com.example.data_passing;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Form extends AppCompatActivity {

    EditText name;
    RadioButton male,female;
    CheckBox football,volleyball,cricket;
    Spinner courses;

    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_form);

        name=findViewById(R.id.name);
        male=findViewById(R.id.male);
        female=findViewById(R.id.female);
        football=findViewById(R.id.football);
        volleyball=findViewById(R.id.volleyball);
        cricket=findViewById(R.id.cricket);
        courses=findViewById(R.id.courses);
       btn=findViewById(R.id.btn_click);


    btn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            String n=name.getText().toString();

            String gender="";
            if(male.isChecked())
            {
                gender= male.getText().toString();
            }
            if(female.isChecked())
            {
                gender=female.getText().toString();
            }


            String game="";
            if(football.isChecked())
            {
                game+=football.getText().toString()+" ";
            }
            if(volleyball.isChecked())
            {
                game+=volleyball.getText().toString()+" ";
            }
            if(cricket.isChecked())
            {
                game+=cricket.getText().toString()+" ";
            }


            String course=courses.getSelectedItem().toString();

            Intent in=new Intent(Form.this,Get.class);//(from where, where)
            in.putExtra("name",n);
            in.putExtra("gender",gender);
            in.putExtra("game",game);
            in.putExtra("course",course);
            startActivity(in);
        }
    });




    }
}