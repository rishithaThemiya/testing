package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnAdd, btnMul, btnSub, btnDev, btnEqual, btnDel, btnDot;
    TextView tvInput, tvOutput;


   // float ValueOne = 0, ValueTwo = 0;

   //boolean Addition, Subtract, Multiplication, Division;
    ArrayList<String> number = new ArrayList<String>();
    String store;
    String data = "";


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculater);

        btn0 = findViewById(R.id.b0);
        btn1 = findViewById(R.id.b1);
        btn2 = findViewById(R.id.b2);
        btn3 = findViewById(R.id.b3);
        btn4 = findViewById(R.id.b4);
        btn5 = findViewById(R.id.b5);
        btn6 = findViewById(R.id.b6);
        btn7 = findViewById(R.id.b7);
        btn8 = findViewById(R.id.b8);
        btn9 = findViewById(R.id.b9);

        btnAdd = findViewById(R.id.add);
        btnMul = findViewById(R.id.mul);
        btnDev = findViewById(R.id.dev);
        btnSub = findViewById(R.id.sub);
        btnEqual = findViewById(R.id.equal);
        btnDel = findViewById(R.id.DEL);
        btnDot = findViewById(R.id.bDot);

        tvInput = findViewById(R.id.input);
        tvOutput = findViewById(R.id.output);


        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                store= tvInput.getText().toString();
                tvInput.setText(store+"0");
                data+="0";
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                store= tvInput.getText().toString();
                tvInput.setText(store+"1");
                data+="1";
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                store= tvInput.getText().toString();
                tvInput.setText(store+"2");
                data+="2";
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                store= tvInput.getText().toString();
                tvInput.setText(store+"3");
                data+="3";
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                store= tvInput.getText().toString();
                tvInput.setText(store+"4");
                data+="4";
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                store= tvInput.getText().toString();
                tvInput.setText(store+"5");
                data+="5";
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                store= tvInput.getText().toString();
                tvInput.setText(store+"6");
                data+="6";
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                store= tvInput.getText().toString();
                tvInput.setText(store+"7");
                data+="7";
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                store= tvInput.getText().toString();
                tvInput.setText(store+"8");
                data+="8";
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                store= tvInput.getText().toString();
                tvInput.setText(store+"9");
                data+="9";
            }
        });

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                store= tvInput.getText().toString();
                tvInput.setText(store+"+");
                if (data.length() != 0){
                    if (data.charAt(data.length()-1) == '.'){
                        data += "0";
                        number.add(data);
                        number.add("+");
                        data="";
                    }
                    else {
                        number.add(data);
                        number.add("+");
                        data="";
                    }
                }



//                if (tvInput == null) {
//                    tvInput.setText("");
//                } else {
//                    ValueOne = Float.parseFloat(tvInput.getText() + "");
//                    Addition = true;
//                    tvInput.setText("+");
//                }
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                store= tvInput.getText().toString();
                tvInput.setText(store+"-");
                if (data.length() != 0){
                    if (data.charAt(data.length()-1)=='.'){
                        data += "0";
                        number.add(data);
                        number.add("-");
                        data="";
                    }
                    else {
                        number.add(data);
                        number.add("-");
                        data="";
                    }
                }

//                ValueOne = Float.parseFloat(tvInput.getText() + "");
//                Subtract = true;
//                tvInput.setText("-");
            }
        });

        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                store= tvInput.getText().toString();
                tvInput.setText(store+"*");
                if(data.length()!=0){
                    if(data.charAt(data.length()-1)=='.'){
                        data=data+"0";
                        number.add(data);
                        number.add("*");

                    }
                }

//                ValueOne = Float.parseFloat(tvInput.getText() + "");
//                Multiplication = true;
//                tvInput.setText("*");
            }
        });

        btnDev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                store= tvInput.getText().toString();
                tvInput.setText(store+"/");
                if(data.length()!=0){
                    if(data.charAt(data.length()-1)=='.'){
                        data = data+"0";
                        number.add(data);
                        number.add("/");
                        data="";
                    }else {
                        number.add(data);
                        number.add("/");
                        data="";

                    }
                }

//                ValueOne = Float.parseFloat(tvInput.getText() + "");
//                Division = true;
//                tvInput.setText("/");
            }
        });

        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (data.length() != 0){
                    if (data.charAt(data.length()-1) == '.'){
                        data += "0";

                        number.add(data);
                        data="";
                    }
                    else {
                        number.add(data);
                        data="";
                    }
                }
                if (number.isEmpty()){
                    tvOutput.setText(data);
                    data="";
                }
                else if((number.get(number.size()-1).equals("+") || number.get(number.size()-1).equals("-")||number.get(number.size()-1).equals("*") || number.get(number.size()-1).equals("/") )){
                    number.remove(number.size()-1);
                    if(number.contains("+") || number.contains("-") || number.contains("*") || number.contains("÷")){
                        tvInput.setText("");
                        tvOutput.setText(String.format("%f",Answer(number)));
                        number.clear();
                    }
                    else {
                        tvInput.setText("");
                        tvOutput.setText(String.format("%f",Double.parseDouble(number.get(0))));
                        number.clear();
                    }
                }
                else {
                    tvInput.setText("");
                    tvOutput.setText(String.format("%f",Answer(number)));
                    number.clear();
                }




                //ValueTwo = Float.parseFloat(tvInput.getText() + "");

//                if (Addition == true) {
//                    tvOutput.setText(ValueOne + ValueTwo + "");
//                    Addition = false;
//                }
//
//                if (Subtract == true) {
//                    tvOutput.setText(ValueOne - ValueTwo + "");
//                    Subtract = false;
//                }
//
//                if (Multiplication == true) {
//                    tvOutput.setText(ValueOne * ValueTwo + "");
//                    Multiplication = false;
//                }
//
//                if (Division == true) {
//                    tvOutput.setText(ValueOne / ValueTwo + "");
//                    Division = false;
//                }
//                ValueOne = Float.parseFloat(tvOutput.getText() + "");
        }
    });

        btnDel.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            tvInput.setText("");
            tvOutput.setText(null);
        }
    });

        btnDot.setOnClickListener(new View.OnClickListener() {
        @Override
            public void onClick(View v) {
                store= tvInput.getText().toString();
                tvInput.setText(store+".");
                data=data+".";
            }
        });

    }
    public Double Answer(ArrayList<String> number){
        Double value = Double.parseDouble(MainActivity.this.number.get(0));
        for (int x = 0; x< MainActivity.this.number.size(); x++){
            switch (MainActivity.this.number.get(x)){
                case "+":value += Double.parseDouble(MainActivity.this.number.get(x+1));
                    break;

                case "-":value -= Double.parseDouble(MainActivity.this.number.get(x+1));
                    break;

                case "/":value /= Double.parseDouble(MainActivity.this.number.get(x+1));
                    break;

                case "*":value *= Double.parseDouble(MainActivity.this.number.get(x+1));
                    break;
            }
        }
        MainActivity.this.number.clear();
        return value;

    }

}