package com.example.g4currencyconverter;

import android.os.strictmode.WebViewMethodCalledOnWrongThreadViolation;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView display;
    private EditText EnterAmount;
    private Button DollartoKsh;
    private Button KshtoDollars;
    private Button eurotoksh;
    private Button kshtoeuro;
    private Button dollartoeuro;
    private Button EurotoDollar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
   public void DollarToKshMethod(View view){
        EditText EnterAmount=(EditText)findViewById(R.id.et_enter_amount_id);
        TextView display=(TextView)findViewById(R.id.tv_display_id);
         Double enterAmount= Double.parseDouble(EnterAmount.getText().toString());
 Double ResultenterAmount= enterAmount*100;
 display.setText(ResultenterAmount+"");



   }

   public void KshToDollarMethod(View view){
       EditText EnterAmount=(EditText)findViewById(R.id.et_enter_amount_id);
       TextView display=(TextView)findViewById(R.id.tv_display_id);
       Double enterAmount= Double.parseDouble(EnterAmount.getText().toString());
       Double ResultenterAmount= enterAmount/100;
       display.setText(ResultenterAmount+"");



   }
   public void dollarToeuroMethod (View view){
       EditText EnterAmount=(EditText)findViewById(R.id.et_enter_amount_id);
       TextView display=(TextView)findViewById(R.id.tv_display_id);
       Double enterAmount= Double.parseDouble(EnterAmount.getText().toString());
       Double ResultenterAmount= enterAmount*0.888516;
       display.setText(ResultenterAmount+"");

    }

    public void euroToKshMethod (View view){
        EditText EnterAmount=(EditText)findViewById(R.id.et_enter_amount_id);
        TextView display=(TextView)findViewById(R.id.tv_display_id);
        Double enterAmount= Double.parseDouble(EnterAmount.getText().toString());
        Double ResultenterAmount= enterAmount*115.821;
        display.setText(ResultenterAmount+"");

    }
    public void KshToEuroMethod (View view){
        EditText EnterAmount=(EditText)findViewById(R.id.et_enter_amount_id);
        TextView display=(TextView)findViewById(R.id.tv_display_id);
        Double enterAmount= Double.parseDouble(EnterAmount.getText().toString());
        Double ResultenterAmount= enterAmount/0.00863404;
        display.setText(ResultenterAmount+"");
    }

public void dollarToEuroMethod (View view){
    EditText EnterAmount=(EditText)findViewById(R.id.et_enter_amount_id);
    TextView display=(TextView)findViewById(R.id.tv_display_id);
    Double enterAmount= Double.parseDouble(EnterAmount.getText().toString());
    Double ResultenterAmount= enterAmount/0.888342;
    display.setText(ResultenterAmount+"");



}

}




