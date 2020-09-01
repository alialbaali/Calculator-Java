package com.example.calculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.DecimalFormat;

import myapps.calculator.R;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = (TextView) findViewById(R.id.text);
        textView.setCursorVisible(true);
        //    getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.Grennish)));

//        Button darkModeButton = (Button) findViewById(R.id.ItemDarkMode);
//        darkModeButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                enableDarkMode();
//            }
//        });
    }


    public void onClickDel(View v) {
        TextView textView = findViewById(R.id.text);
        StringBuilder x = new StringBuilder();
        for (int i = 0; i < textView.getText().length() - 1; i++) {
            x.append(textView.getText().charAt(i));
        }
        textView.setText(x);
        miniText();
    }

    public void miniText() {
        TextView textView = findViewById(R.id.text);
        if (textView.getText().length() >= 8 && textView.getText().length() < 15) {
            textView.setTextSize(50);
        } else if (textView.getText().length() >= 15) {
            textView.setTextSize(25);
        } else if (textView.getText().length() < 8) {
            textView.setTextSize(70);
        }
    }

    public void onClick1(View v) {
        TextView textView = findViewById(R.id.text);
        Button button1 = findViewById(R.id.button38);
        textView.setText(textView.getText().toString() + button1.getText().toString());
        miniText();
    }

    public void onClick2(View v) {
        Button button2 = findViewById(R.id.button37);
        button2.setText("2");
        TextView textView = findViewById(R.id.text);
        textView.setText(textView.getText().toString() + button2.getText().toString());
        miniText();

    }

    public void onClick3(View v) {
        Button button3 = findViewById(R.id.button36);
        button3.setText("3");
        TextView textView = findViewById(R.id.text);
        textView.setText(textView.getText().toString() + button3.getText().toString());
        miniText();
    }

    public void onClick4(View v) {
        Button button4 = findViewById(R.id.button34);
        button4.setText("4");
        TextView textView = findViewById(R.id.text);
        textView.setText(textView.getText().toString() + button4.getText().toString());
        miniText();

    }

    public void onClick5(View v) {
        Button button5 = findViewById(R.id.button33);
        button5.setText("5");
        TextView textView = findViewById(R.id.text);
        textView.setText(textView.getText().toString() + button5.getText().toString());
        miniText();

    }

    public void onClick6(View v) {
        Button button6 = findViewById(R.id.button32);
        button6.setText("6");
        TextView textView = findViewById(R.id.text);
        textView.setText(textView.getText().toString() + button6.getText().toString());
        miniText();

    }

    public void onClick7(View v) {
        Button button7 = findViewById(R.id.button30);
        button7.setText("7");
        TextView textView = findViewById(R.id.text);
        textView.setText(textView.getText().toString() + button7.getText().toString());
        miniText();

    }

    public void onClick8(View v) {
        Button button8 = findViewById(R.id.button29);
        button8.setText("8");
        TextView textView = findViewById(R.id.text);
        textView.setText(textView.getText().toString() + button8.getText().toString());
        miniText();

    }

    public void onClick9(View v) {
        Button button9 = findViewById(R.id.button28);
        button9.setText("9");
        TextView textView = findViewById(R.id.text);
        textView.setText(textView.getText().toString() + button9.getText().toString());
        miniText();
    }

    public void onClickx(View v) {
        Button buttonx = findViewById(R.id.button27);
        buttonx.setText("x");
        TextView textView = findViewById(R.id.text);
        if (textView.getText().toString().isEmpty()) {
            miniText();
        } else if (textView.getText().charAt(textView.getText().length() - 1) == '+' || textView.getText().charAt(textView.getText().length() - 1) == '-' || textView.getText().charAt(textView.getText().length() - 1) == 'x' || textView.getText().charAt(textView.getText().length() - 1) == '/' || textView.getText().charAt(textView.getText().length() - 1) == '.') {
            if (textView.getText().toString().indexOf("-") != 0) {
                textView.setText(textView.getText().toString().substring(0, textView.getText().length() - 1) + "x");
            }
        } else {
            textView.setText(textView.getText().toString() + buttonx.getText().toString());
            miniText();
        }
    }

    public void onClickDot(View v) {
        Button buttonDot = findViewById(R.id.button25);
        buttonDot.setText(".");
        TextView textView = findViewById(R.id.text);
        if (textView.getText().toString().isEmpty()) {
            textView.setText(textView.getText().toString() + buttonDot.getText().toString());
            miniText();
        } else if (textView.getText().toString().contains("+") || textView.getText().toString().contains("-") || textView.getText().toString().contains("x") || textView.getText().toString().contains("/")) {
            int index = 0;
            if (textView.getText().toString().contains("+")) {
                index = textView.getText().toString().indexOf('+');
            } else if (textView.getText().toString().contains("-")) {
                index = textView.getText().toString().indexOf("-");
            } else if (textView.getText().toString().contains("x")) {
                index = textView.getText().toString().indexOf("x");
            } else if (textView.getText().toString().contains("/")) {
                index = textView.getText().toString().indexOf("/");
            }
            if (textView.getText().toString().substring(0, index).contains(".")) {
                miniText();
            } else if (textView.getText().toString().substring(index + 1, textView.getText().length() - 1).contains(".")) {
                miniText();
            } else {
                textView.setText(textView.getText().toString() + buttonDot.getText().toString());
                miniText();
            }
        } else if (textView.getText().toString().contains(".")) {

        } else if (textView.getText().charAt(textView.getText().length() - 1) == '.') {

        } else {
            textView.setText(textView.getText().toString() + buttonDot.getText().toString());
            miniText();
        }
    }

    public void onClick0(View v) {
        Button button0 = findViewById(R.id.button24);
        button0.setText("0");
        TextView textView = findViewById(R.id.text);
        textView.setText(textView.getText().toString() + button0.getText().toString());
        miniText();

    }

    public void onClickC(View v) {
        TextView textView = (TextView) findViewById(R.id.text);
        textView.setText("");
    }

    public void onClickEqual(View v) {
        Button buttonEqual = findViewById(R.id.button23);
        TextView textView = findViewById(R.id.text);
        String text = textView.getText().toString();
        DecimalFormat decimalFormat = new DecimalFormat("#.##########");
        int index;
        String firstPhrase;
        String lastPhrase;
        double result;
        String resultString = "";
        if (text.charAt(text.length() - 1) == '+' || text.charAt(text.length() - 1) == '-' || text.charAt(text.length() - 1) == 'x' || text.charAt(text.length() - 1) == '/') {

        } else {
            for (int i = 0; i < text.length(); i++) {
                if (text.charAt(i) == '+') {
                    index = text.indexOf("+");
                    firstPhrase = text.substring(0, index);
                    lastPhrase = text.substring(index + 1);
                    result = Double.parseDouble(firstPhrase) + Double.parseDouble(lastPhrase);
                    resultString = decimalFormat.format(result) + "";
                    textView.setText(resultString);
                } else if (text.charAt(i) == '-') {
                    index = text.indexOf("-");
                    firstPhrase = text.substring(0, index);
                    lastPhrase = text.substring(index + 1);
                    result = Double.parseDouble(firstPhrase) - Double.parseDouble(lastPhrase);
                    resultString = decimalFormat.format(result) + "";
                    textView.setText(resultString);
                } else if (text.charAt(i) == 'x') {
                    index = text.indexOf("x");
                    firstPhrase = text.substring(0, index);
                    lastPhrase = text.substring(index + 1);
                    result = Double.parseDouble(firstPhrase) * Double.parseDouble(lastPhrase);
                    resultString = decimalFormat.format(result) + "";
                    textView.setText(resultString);
                } else if (text.charAt(i) == '/') {
                    index = text.indexOf("/");
                    firstPhrase = text.substring(0, index);
                    lastPhrase = text.substring(index + 1);
                    result = Double.parseDouble(firstPhrase) / Double.parseDouble(lastPhrase);
                    resultString = decimalFormat.format(result) + "";
                    textView.setText(resultString);
                }
                miniText();
            }
        }
    }
//        if (textView.getText().toString().contains("+") || textView.getText().toString().contains("-") || textView.getText().toString().contains("x") || textView.getText().toString().contains("/")) {
//                int index = 0;
//            if (textView.getText().charAt(index) == '+') {
//                index = textView.getText().toString().indexOf("+");
//                String string = textView.getText().subSequence(0, index).toString();
//                String string2 = textView.getText().subSequence(index + 1, textView.getText().length() -1).toString();
//                int x = Integer.parseInt(string);
//                int y = Integer.parseInt(string2);
//                String result = x + y + "";
//                textView.setText(result);
//            } else if (textView.getText().charAt(index) == '-') {
//                index = textView.getText().toString().indexOf("-");
//                String string = textView.getText().subSequence(0, index).toString();
//                String string2 = textView.getText().subSequence(index + 1, textView.getText().length() -1).toString();
//                int x = Integer.parseInt(string);
//                int y = Integer.parseInt(string2);
//                String result = x - y + "";
//                textView.setText(result);
//            } else if (textView.getText().charAt(index) == 'x') {
//                index = textView.getText().toString().indexOf("x");
//                String string = textView.getText().subSequence(0, index).toString();
//                String string2 = textView.getText().subSequence(index + 1, textView.getText().length() -1).toString();
//                int x = Integer.parseInt(string);
//                int y = Integer.parseInt(string2);
//                String result = x * y + "";
//                textView.setText(result);
//            } else if (textView.getText().charAt(index) == '/') {
//                index = textView.getText().toString().indexOf("/");
//                String string = textView.getText().subSequence(0, index).toString();
//                String string2 = textView.getText().subSequence(index + 1, textView.getText().length() -1).toString();
//                int x = Integer.parseInt(string);
//                int y = Integer.parseInt(string2);
//                String result = x / y + "";
//                textView.setText(result);
//            }
//        }
    //}

    public void equal(String Fphrase, String Lphrase, int index) {


//            TextView textView = findViewById(R.id.text);
//            String text = textView.getText().toString();
//            String result;
//            int f = Findex;
//            int L = Lindex;
//            int index = 0;
//            if (text.contains("+")){
//                index = text.indexOf("+"); // 3
//                f = 0;
//                Lindex = index; // 3
//            if (text.substring(Lindex + 1, text.length() - 1).contains("+")){
//                Findex = Lindex;
//                Lindex = text.indexOf("+");
//                equal(Findex, Lindex);
//            } else {
//                result = "" + Integer.parseInt(text.substring(Findex, Lindex) + Integer.parseInt(text.substring(index+1,text.length() - 1)));
//                miniText();
//            }
//            }
    }

    public void onClickDiv(View v) {
        Button buttonDiv = findViewById(R.id.button26);
        buttonDiv.setText("/");
        TextView textView = findViewById(R.id.text);
        if (textView.getText().toString().isEmpty()) {
            miniText();
        } else if (textView.getText().charAt(textView.getText().length() - 1) == '+' || textView.getText().charAt(textView.getText().length() - 1) == '-' || textView.getText().charAt(textView.getText().length() - 1) == 'x' || textView.getText().charAt(textView.getText().length() - 1) == '/' || textView.getText().charAt(textView.getText().length() - 1) == '.') {
            if (textView.getText().toString().indexOf("-") != 0) {
                textView.setText(textView.getText().toString().substring(0, textView.getText().length() - 1) + "/");
            }
        } else {
            textView.setText(textView.getText().toString() + buttonDiv.getText().toString());
            miniText();
        }
    }

    public void onClickSub(View v) {
        Button buttonSub = findViewById(R.id.button31);
        buttonSub.setText("-");
        TextView textView = findViewById(R.id.text);
        if (textView.getText().toString().isEmpty()) {
            textView.setText(textView.getText().toString() + buttonSub.getText().toString());
            miniText();
        } else if (textView.getText().charAt(textView.getText().length() - 1) == '+' || textView.getText().charAt(textView.getText().length() - 1) == '-' || textView.getText().charAt(textView.getText().length() - 1) == 'x' || textView.getText().charAt(textView.getText().length() - 1) == '/' || textView.getText().charAt(textView.getText().length() - 1) == '.') {
            textView.setText(textView.getText().toString().substring(0, textView.getText().length() - 1) + buttonSub.getText().toString());
        } else {
            textView.setText(textView.getText().toString() + buttonSub.getText().toString());
            miniText();
        }
    }

    public void onClickPlus(View v) {
        Button buttonPlus = findViewById(R.id.button35);
        buttonPlus.setText("+");
        TextView textView = findViewById(R.id.text);
        if (textView.getText().toString().isEmpty()) {
            miniText();
        } else if (textView.getText().charAt(textView.getText().length() - 1) == '+' || textView.getText().charAt(textView.getText().length() - 1) == '-' || textView.getText().charAt(textView.getText().length() - 1) == 'x' || textView.getText().charAt(textView.getText().length() - 1) == '/' || textView.getText().charAt(textView.getText().length() - 1) == '.') {
            if (textView.getText().toString().indexOf("-") != 0) {
                textView.setText(textView.getText().toString().substring(0, textView.getText().length() - 1) + buttonPlus.getText().toString());
            }
        } else {
            textView.setText(textView.getText().toString() + buttonPlus.getText().toString());
            miniText();
        }
    }
}

