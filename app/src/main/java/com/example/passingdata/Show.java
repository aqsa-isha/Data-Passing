package com.example.passingdata;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
public class Show extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);
        Bundle b = getIntent().getExtras();
        TextView name = (TextView) findViewById(R.id.tv6);
        TextView rollno = (TextView) findViewById(R.id.tv7);
        TextView section = (TextView) findViewById(R.id.tv8);
        name.setText(b.getCharSequence("name"));
        rollno.setText(b.getCharSequence("rollno"));
        section.setText(b.getCharSequence("section"));
    }
}