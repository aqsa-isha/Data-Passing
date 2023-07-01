package com.example.passingdata;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
public class MainActivity extends AppCompatActivity {
    Button button;
    RadioGroup sectionRadioGroup;
    EditText name;
    EditText rollno;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.b1);
        name = (EditText) findViewById(R.id.et1);
        rollno = (EditText) findViewById(R.id.et2);
        sectionRadioGroup = (RadioGroup) findViewById(R.id.rg);
        button.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Show.class);
             //Create a bundle object
                Bundle b = new Bundle();
            //Inserts a String value into the mapping of this Bundle
                b.putString("name", name.getText().toString());
                b.putString("rollno", rollno.getText().toString());
                int id = sectionRadioGroup.getCheckedRadioButtonId();
                RadioButton radioButton = (RadioButton) findViewById(id);
                b.putString("section", radioButton.getText().toString());
            //Add the bundle to the intent.
                intent.putExtras(b);
            //start the DisplayActivity
                startActivity(intent);
            }
        });
    }
}
