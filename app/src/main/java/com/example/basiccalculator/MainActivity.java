package com.example.basiccalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText input;
    Button btnAdd, btnSub, btnMul, btnDiv, btnEquel, btnSqroot,btnClear;
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btndot,btnsin,btncos,btntan;
    Button btnsqr, btnsin_inverse, btncos_inverse, btntan_inverse;
    Float num1 = 0.0f;
    Float num2 = 0.0f;
    Float result = 0.0f;
    Double rootResult;
    String sign;
    Boolean empty = true;
    TextView txtView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input = findViewById(R.id.input);
        btnAdd = findViewById(R.id.btnAdd);
        btnSub = findViewById(R.id.btnSub);
        btnMul = findViewById(R.id.btnMul);
        btnDiv = findViewById(R.id.btnDiv);
        btnEquel = findViewById(R.id.btnEquel);
        btnSqroot = findViewById(R.id.btnSqroot);
        btnClear = findViewById(R.id.btnClear);
        txtView = findViewById(R.id.txtView);

        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btndot = findViewById(R.id.btndot);
        btnsin = findViewById(R.id.btnsin);
        btncos = findViewById(R.id.btncos);
        btntan = findViewById(R.id.btntan);

        btnsqr = findViewById(R.id.btnsqr);
        btnsin_inverse = findViewById(R.id.btnsin_inverse);
        btncos_inverse = findViewById(R.id.btncos_inverse);
        btntan_inverse = findViewById(R.id.btntan_inverse);

        btn1.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                input.setText(input.getText() + "1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                input.setText(input.getText() + "2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                input.setText(input.getText() + "3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                input.setText(input.getText() + "4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                input.setText(input.getText() + "5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                input.setText(input.getText() + "6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                input.setText(input.getText() + "7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                input.setText(input.getText() + "8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                input.setText(input.getText() + "9");
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                input.setText(input.getText() + "0");
            }
        });
        btndot.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                input.setText(input.getText() + ".");
            }
        });
        btnsin.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                try {
                    num1 = Float.parseFloat(input.getText().toString());
                    rootResult = Math.sin(num1);
                    input.setText(rootResult.toString());
                }catch (Exception e){
                    Toast.makeText(getApplicationContext(), "Insert a number", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btncos.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                try {
                    num1 = Float.parseFloat(input.getText().toString());
                    rootResult = Math.cos(num1);
                    input.setText(rootResult.toString());
                }catch (Exception e){
                    Toast.makeText(getApplicationContext(), "Insert a number", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btntan.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                try {
                    num1 = Float.parseFloat(input.getText().toString());
                    rootResult = Math.tan(num1);
                    input.setText(rootResult.toString());
                }catch (Exception e){
                    Toast.makeText(getApplicationContext(), "Insert a number", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnsqr.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                try {
                    num1 = Float.parseFloat(input.getText().toString());
                    double val = num1;
                    rootResult = val * val;
                    input.setText(rootResult.toString());
                }catch (Exception e){
                    Toast.makeText(getApplicationContext(), "Insert a number", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnsin_inverse.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                try {
                    num1 = Float.parseFloat(input.getText().toString());
                    rootResult = Math.asin(num1);
                    input.setText(rootResult.toString());
                }catch (Exception e){
                    Toast.makeText(getApplicationContext(), "Insert a number", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btncos_inverse.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                try {
                    num1 = Float.parseFloat(input.getText().toString());
                    rootResult = Math.acos(num1);
                    input.setText(rootResult.toString());
                }catch (Exception e){
                    Toast.makeText(getApplicationContext(), "Insert a number", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btntan_inverse.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                try {
                    num1 = Float.parseFloat(input.getText().toString());
                    rootResult = Math.atan(num1);
                    input.setText(rootResult.toString());
                }catch (Exception e){
                    Toast.makeText(getApplicationContext(), "Insert a number", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if (num1 != 0){
                    num1 += Float.parseFloat(input.getText().toString());
                    input.setText("");
                    txtView.setText(num1.toString());
                    empty = false;
                }else{
                    try {
                        num1 = Float.parseFloat(input.getText().toString());
                    }catch (Exception e){
                        num1 = 0.0f;
                    }finally {
                        input.setText("");
                        sign = "+";
                        empty = false;
                    }

                }
            }
        });
        btnSub.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if (num1 != 0){
                    num1 -= Float.parseFloat(input.getText().toString());
                    input.setText("");
                    txtView.setText(num1.toString());
                    empty = false;
                }else {
                    try {
                        num1 = Float.parseFloat(input.getText().toString());
                    }catch (Exception e){
                        num1 = 0.0f;
                    }finally {
                        input.setText("");
                        sign = "-";
                        empty = false;
                    }
                }
            }
        });
        btnMul.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if (num1 != 0){
                    num1 *= Float.parseFloat(input.getText().toString());
                    input.setText("");
                    txtView.setText(num1.toString());
                    empty = false;
                }else {
                    try {
                        num1 = Float.parseFloat(input.getText().toString());
                    }catch (Exception e){
                        num1 = 0.0f;
                    }finally {
                        input.setText("");
                        sign = "*";
                        empty = false;
                    }
                }
            }
        });
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if (num1 != 0){
                    num1 /= Float.parseFloat(input.getText().toString());
                    input.setText("");
                    txtView.setText(num1.toString());
                    empty = false;
                }else {
                    try {
                        num1 = Float.parseFloat(input.getText().toString());
                    }catch (Exception e){
                        num1 = 0.0f;
                    }finally {
                        input.setText("");
                        sign = "/";
                        empty = false;
                    }
                }
            }
        });
        btnSqroot.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                try {
                    num1 = Float.parseFloat(input.getText().toString());
                    rootResult = Math.sqrt(num1);
                    input.setText(rootResult.toString());
                    variableReset();
                    empty = false;
                }catch (Exception e){
                    float txtNum = 0.0f;
                    txtNum = Float.parseFloat(txtView.getText().toString());
                    rootResult = Math.sqrt(txtNum);
                    input.setText(rootResult.toString());
                    txtView.setText("");
                    variableReset();
                }
            }
        });
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText("");
                variableReset();
                txtView.setText("");
                empty = false;
            }
        });
        btnEquel.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if (empty){
                    input.setText(result.toString());
                }else {
                    try {
                        num2 = Float.parseFloat(input.getText().toString());
                    }catch (Exception e){
                        input.setText(num1.toString());
                    }finally {
                        switch (sign){
                            case "+":
                                result = num1 + num2;
                                variableReset();
                                break;
                            case "-":
                                result = num1 - num2;
                                variableReset();
                                break;
                            case "*":
                                result = num1 * num2;
                                variableReset();
                                break;
                            case "/":
                                result = num1 / num2;
                                variableReset();
                                break;
                            default:
                                result = num1;
                                variableReset();
                        }
                        txtView.setText("");
                        input.setText(result.toString());
                    }
                }

            }
        });
    }
    public void variableReset(){
        num1 = 0.0f;
        num2 = 0.0f;
    }
}