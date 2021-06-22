package com.example.android1;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private LinearLayout b_1,b_2,b_3;
    private Button btn;
    public String start = "Start";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b_1=findViewById(R.id.dumb_1);
        b_2=findViewById(R.id.dumb_2);
        b_3=findViewById(R.id.dumb_3);
        btn=findViewById(R.id.Button);
    }

    public void OnClickStart(View view){
        
    }

}