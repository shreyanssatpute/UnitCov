package com.example.unitconv;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView textView;
    private EditText editText;
    private EditText editText2;
    private TextView textView4;
    private Button button3 ;

    private TextView textView7;
    private Button button4;
    private EditText editText3;

    private EditText editText4;
    private TextView textView12;
    private Button button5;







    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        textView = findViewById((R.id.textView));
        editText = findViewById(R.id.editText);

        button3 = findViewById(R.id.button3);
        textView4 = findViewById((R.id.textView4));
        editText2 = findViewById(R.id.editText2);

        button4 = findViewById(R.id.button4);
        textView7 = findViewById((R.id.textView7));
        editText3 = findViewById(R.id.editText3);

        button5 = findViewById(R.id.button5);
        textView12 = findViewById((R.id.textView12));
        editText4 = findViewById(R.id.editText4);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Converting ↺", Toast.LENGTH_SHORT).show();
                String s = editText.getText().toString();
                int kg = Integer.parseInt(s);

                float pound = (float) (2.205*kg);
                textView.setText(pound + " lb");

            }


        });
        button3.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(MainActivity.this, "Converting ↺", Toast.LENGTH_SHORT).show();
                String s = editText2.getText().toString();
                int cm = Integer.parseInt(s);
                float inch = (float) (cm / 2.54);
                textView4.setText( inch + " In");

            }

        }));

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(MainActivity.this, "Converting ↺", Toast.LENGTH_SHORT).show();
                String v = editText3.getText().toString();
                int c = Integer.parseInt(v);
                float f = (float) ((c * 9/5) + 32 );
                textView7.setText(f +" ֯ F");

            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(MainActivity.this, "Converting ↺", Toast.LENGTH_SHORT).show();
                String v = editText4.getText().toString();
                int km = Integer.parseInt(v);
                float ms = (float) ( km/3.6 );
                textView12.setText(ms +" ֯Mp/s");

            }
        });




    }
}