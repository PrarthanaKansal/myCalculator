package com.example.prarthana.app_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private double value1 = Double.NaN;
    private double value2;

    private char action;

    TextView digit1;
    TextView digit2;
    TextView digit3;
    TextView digit4;
    TextView digit5;
    TextView digit6;
    TextView digit7;
    TextView digit8;
    TextView digit9;
    TextView zero;

    TextView info;
    TextView result;

    TextView equal;
    TextView C;
    TextView DEL;
    TextView Sub;
    TextView Add;
    TextView Dec;
    TextView Divide;
    TextView Multiply;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        info=findViewById(R.id.info);
        result=findViewById(R.id.result);

        digit1=findViewById(R.id.digit1);
        digit2=findViewById(R.id.digit2);
        digit3=findViewById(R.id.digit3);
        digit4=findViewById(R.id.digit4);
        digit5=findViewById(R.id.digit5);
        digit6=findViewById(R.id.digit6);
        digit7=findViewById(R.id.digit7);
        digit8=findViewById(R.id.digit8);
        digit9=findViewById(R.id.digit9);
        zero=findViewById(R.id.zero);

        Divide=findViewById(R.id.Divide);
        C=findViewById(R.id.C);
        Multiply=findViewById(R.id.Multiply);
        Sub=findViewById(R.id.Sub);
        equal=findViewById(R.id.equal);
        Add=findViewById(R.id.Add);
        Dec=findViewById(R.id.dec);
        DEL=findViewById(R.id.DEL);


        DEL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a= info.getText().length();
                info.setText(info.getText().subSequence(0,a-1).toString());
            }
        });

        digit1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!Double.isNaN(value1)){
                    result.setText(result.getText().toString()+"1");
                }
                else{
                    info.setText(info.getText().toString()+"1");
                }

            }
        });

        digit2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!Double.isNaN(value1)){
                    result.setText(result.getText().toString()+"2");
                }
                else{
                    info.setText(info.getText().toString()+"2");
                }
            }
        });

        digit3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!Double.isNaN(value1)){
                    result.setText(result.getText().toString()+"3");
                }
                else{
                    info.setText(info.getText().toString()+"3");
                }
            }
        });
        digit4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!Double.isNaN(value1)){
                    result.setText(result.getText().toString()+"4");
                }
                else{
                    info.setText(info.getText().toString()+"4");
                }
            }
        });

        digit5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!Double.isNaN(value1)){
                    result.setText(result.getText().toString()+"5");
                }
                else{
                    info.setText(info.getText().toString()+"5");
                }
            }
        });

        digit6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!Double.isNaN(value1)){
                    result.setText(result.getText().toString()+"6");
                }
                else{
                    info.setText(info.getText().toString()+"6");
                }
            }
        });

        digit7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!Double.isNaN(value1)){
                    result.setText(result.getText().toString()+"7");
                }
                else{
                    info.setText(info.getText().toString()+"7");
                }
            }
        });
        digit8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!Double.isNaN(value1)){
                    result.setText(result.getText().toString()+"8");
                }
                else{
                    info.setText(info.getText().toString()+"8");
                }
            }
        });
        digit9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!Double.isNaN(value1)){
                    result.setText(result.getText().toString()+"9");
                }
                else{
                    info.setText(info.getText().toString()+"9");
                }
            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!Double.isNaN(value1)){
                    result.setText(result.getText().toString()+"0");
                }
                else{
                    info.setText(info.getText().toString()+"0");
                }
            }
        });


        C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText("");
                value1=Double.NaN;
                value2=Double.NaN;
                result.setText(null);
            }
        });
        Divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate();
                action='/';
                info.setText(info.getText().toString()+"/");
                //result.setText(null);
            }
        });

        Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                calculate();
                action='+';
                info.setText(value1+"+");
               // result.setText(null);
            }
        });
        Sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                calculate();
                action='-';
                info.setText(info.getText().toString()+"-");
                //result.setText(null);
            }
        });
        Multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                calculate();
                action='*';
                info.setText(info.getText().toString()+"*");
                //result.setText(null);
            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                calculate();
                action='=';
                //result.setText("");
                //result.setText(null);
                value2=Double.NaN;
                //action='=';
                //


            }
        });
        Dec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!Double.isNaN(value1)){
                    result.setText(result.getText().toString()+".");
                }
                else{
                    info.setText(info.getText().toString()+".");
                }
            }
        });


    }
    private void calculate(){
        if(!Double.isNaN(value1)){
           value2=Double.parseDouble(result.getText().toString());
            if(action=='+'){
                value1=this.value1+this.value2;
                info.setText(Double.toString(value1));
                result.setText("");
            }
            if(action=='-'){
                value1=this.value1-this.value2;
                info.setText(Double.toString(value1));
                result.setText("");
            }
            if(action=='*'){
                value1=this.value1*this.value2;
                info.setText(Double.toString(value1));
                result.setText("");
            }
            if(action=='/'){
                value1=this.value1/this.value2;
                info.setText(Double.toString(value1));
                result.setText("");
            }
            if(action=='='){
                return;
            }

        }
        else{
            try {
                int a= info.getText().toString().length();
                value1 = Double.parseDouble(info.getText().toString().substring(0,a));
            }
            catch (Exception e){}
        }
    }
}
