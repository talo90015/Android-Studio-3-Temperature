package com.example.android_num3_thermometer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button)findViewById(R.id.btn1);
        button.setOnClickListener(tmpteans);

        Button button1 = (Button)findViewById(R.id.btn2);
        button1.setOnClickListener(tmpteans2);
    }
    private View.OnClickListener tmpteans = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            DecimalFormat nf = new DecimalFormat("0.00");//小數後兩位
            EditText tmpc = (EditText)findViewById(R.id.editV1);
            //華氏
            double c = Double.parseDouble(tmpc.getText().toString());

            double f = (c * 9 / 5) + 32;

            TextView trans_Ans = (TextView)findViewById(R.id.textV3);
            trans_Ans.setText(""
                    + nf.format(f));
        }
    };
    private View.OnClickListener tmpteans2 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            DecimalFormat nf = new DecimalFormat("0.00");//小數後兩位
            EditText tmpf = (EditText)findViewById(R.id.editV1);
            //攝氏
            double f = Double.parseDouble(tmpf.getText().toString());

            double c = (f - 32) * 5 / 9;

            TextView trans_Ans = (TextView)findViewById(R.id.textV3);
            trans_Ans.setText(""
                    + nf.format(c));

        }
    };
}