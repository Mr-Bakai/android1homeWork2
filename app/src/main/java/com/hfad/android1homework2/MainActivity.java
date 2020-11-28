package com.hfad.android1homework2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText etText1;
    private EditText etText2;
    private EditText etText3;
    private Button btn;
    private TextView textView;
    private int result;
    final static String RESULT_KEY = "result";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etText1 =  findViewById(R.id.n1);
        etText2 =  findViewById(R.id.n2);
        etText3 =  findViewById(R.id.n3);
        btn =  findViewById(R.id.btn);
        textView =  findViewById(R.id.textView);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate();
            }
        });

//        if(savedInstanceState != null){
//            result = savedInstanceState.getInt(RESULT_KEY);
//            textView.setText(String.valueOf(result));
//        }

    }

    public void calculate(){

        int n1 = Integer.parseInt(etText1.getText().toString());
        int n2 = Integer.parseInt(etText2.getText().toString());
        int n3 = Integer.parseInt(etText3.getText().toString());

        result = (n1 + n2 + n3)/2;
        textView.setText(String.valueOf(result));
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(RESULT_KEY, result);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        result = savedInstanceState.getInt(RESULT_KEY);
        textView.setText(String.valueOf(result));
    }
}