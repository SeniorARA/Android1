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
    private boolean start_stop=false;
    private int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b_1=findViewById(R.id.dumb_1);
        b_2=findViewById(R.id.dumb_2);
        b_3=findViewById(R.id.dumb_3);
        btn=findViewById(R.id.btn_1);
    }

    public void OnClickStart(View view){
    if (!start_stop){
        start_stop=true;
        btn.setText("Stop");
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (start_stop){
                    counter++;
                    switch (counter){
                        case 1:
                            b_1.setBackgroundColor(getResources().getColor(R.color.red));
                            b_2.setBackgroundColor(getResources().getColor(R.color.grey));
                            b_3.setBackgroundColor(getResources().getColor(R.color.grey));
                            break;
                        case 2:
                            b_1.setBackgroundColor(getResources().getColor(R.color.grey));
                            b_2.setBackgroundColor(getResources().getColor(R.color.yellow));
                            b_3.setBackgroundColor(getResources().getColor(R.color.grey));
                            break;
                        case 3:
                            b_1.setBackgroundColor(getResources().getColor(R.color.grey));
                            b_2.setBackgroundColor(getResources().getColor(R.color.grey));
                            b_3.setBackgroundColor(getResources().getColor(R.color.green));
                            counter=0;
                            break;
                    }
                    try {
                        Thread.sleep(3000);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }

            }
        }).start();






        }else {
        start_stop=false;
        btn.setText("Start");
    }
    }
    }

