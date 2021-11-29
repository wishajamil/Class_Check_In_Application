package com.example.attend_in;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import org.w3c.dom.Text;

public class TeacherKey extends AppCompatActivity {
    private Button checkattend;
    EditText teacherKey;
    String value = "1586";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher_key);
        teacherKey = (EditText) findViewById(R.id.editTextKey);
        checkattend =(Button) findViewById(R.id.checkattend);


        checkattend.setOnClickListener(new View.OnClickListener() {
            String pass = "a1a2a3";
           String teachKey = teacherKey.getText().toString();

                @Override
                public void onClick(View view) {
                    if(teacherKey.getText().toString().equalsIgnoreCase("a1a2a3")) {
                        openTeacherView();
                    }
                    else{
                        teacherKey.setError("Incorrect Key");
                    }
                }
        });
    }
    public void openTeacherView(){
        Intent intent = new Intent(this, TeacherView.class);
        startActivity(intent);
    }
}