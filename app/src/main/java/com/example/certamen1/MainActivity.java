package com.example.certamen1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    private TextView tv1;
    private TextView tv2;
    private TextView tv3;
    private TextView tv4;
    private TextView tv5;;
    private Button btn_suma;
    private Button btn_resta;
    private Button btn_c;
    private Button btn_multiplicacion;
    private Button btn_division;
    private Button btn_par;
    private Button btn_primo;
    private Button btn_random;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1 = (TextView) findViewById(R.id.txt_num1);
        tv2 = (TextView) findViewById(R.id.txt_simbolo);
        tv3 = (TextView) findViewById(R.id.txt_num2);
        tv4 = (TextView) findViewById(R.id.txt_resultado);
        tv5 = (TextView) findViewById(R.id.txt_parprimo);
        btn_random = (Button) findViewById(R.id.btn_random);
        btn_suma = (Button) findViewById(R.id.btn_suma);
        btn_resta = (Button) findViewById(R.id.btn_resta);
        btn_multiplicacion = (Button) findViewById(R.id.btn_multiplicacion);
        btn_division = (Button) findViewById(R.id.btn_division);
        btn_c = (Button) findViewById(R.id.btn_c);

        btn_random.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random s = new Random();

            }
        });
        btn_suma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String resultado = String.valueOf(sumar(Integer.parseInt(tv1.getText().toString()),Integer.parseInt(tv2.getText().toString())));
                tv1.setText("0");
                tv2.setText("?");
                tv3.setText("0");
                tv4.setText(resultado);
            }
        });
        btn_resta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String resultado = String.valueOf(resta(Integer.parseInt(tv1.getText().toString()),Integer.parseInt(tv2.getText().toString())));
                tv1.setText("0");
                tv2.setText("?");
                tv3.setText("0");
                tv4.setText(resultado);
            }
        });
        btn_resta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String resultado = String.valueOf(multiplicacion(Integer.parseInt(tv1.getText().toString()),Integer.parseInt(tv2.getText().toString())));
                tv1.setText("0");
                tv2.setText("?");
                tv3.setText("0");
                tv4.setText(resultado);
            }
        });
        btn_division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String resultado = String.valueOf(division(Float.parseFloat(tv1.getText().toString()),Float.parseFloat(tv2.getText().toString())));
                tv1.setText("0");
                tv2.setText("?");
                tv3.setText("0");
                tv4.setText(resultado);
            }
        });
    }
    public int random(){
        return 0;
    }

    public int sumar(int a, int b){
        int suma = a + b;
        return suma;
    }
    public int resta(int a, int b){
        int resta = a - b;

        return resta;

    }
    public int multiplicacion(int a, int b){
        int multiplicacion = a*b;
        return multiplicacion;
    }
    public float division(float a, float b){
        float division = a/b;
        if(b == 0){
            return -1;
        }
        return division;
    }
    public String Par1(int a){
        if(a%2==0){
            return "ES PAR";
        }
        else return "NO ES PAR";
    }
    public String Par2(float a){
        if(a%2==0){
            return "ES PAR";
        }
        else return "NO ES PAR";
    }
    public String Primo1(int a){
        if(a%a==0 && a%1==0){
            return "ES PRIMO";
        }
        else return "NO ES PRIMO";
    }
    Public String Primo2(float a){
        if(a%a==0 && a%1==0){
            return "ES PRIMO";
        }
        else return "NO ES PRIMO";
    }


}

