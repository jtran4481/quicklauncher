package com.example.quadratic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView equationView = (TextView) findViewById(R.id.textView);

        //add 2 more buttons using math.function

        Button calBtn = (Button) findViewById(R.id.calBtn);
        calBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*
                EditText firstNumEditText = (EditText) findViewById(R.id.firstNumEditText);
                EditText secondNum = (EditText) findViewById(R.id.secondNum); */
                double[] point1 = getPoint1();
                double[] point2 = getPoint2();
                double[] point3 = getPoint3();
                double aNum = point1[0]*(point3[1] - point2[1]) + point2[0]*(point1[1] - point3[1]) + point3[0]*(point2[1] - point1[1]);
                double aDen = (point1[0] - point2[0])*(point1[0] - point3[0])*(point2[0] - point3[0]);
                double a = aNum/aDen;

                double b1 = (point2[1] - point1[1]) / (point2[0] - point1[0]);
                double b2 = a*(point1[0] + point2[0]);
                double b = b1 - b2;

                double c = point1[1] - (a*Math.pow(point1[0], 2)) - (b*point1[0]);
                String equation = (a + "x^2" + " + " + b + "x + " +c);

                equationView.setText(equation);

            }
        });


    }

    private double[] getPoint1() {
        EditText x1 = (EditText) findViewById(R.id.x1Input);
        EditText y1 = (EditText) findViewById(R.id.y1Input);


        double[] point1 = {Double.parseDouble(x1.getText().toString()), Double.parseDouble(y1.getText().toString())};
        return point1;
    }
    private double[] getPoint2() {

        EditText x2 = (EditText) findViewById(R.id.x2Input);
        EditText y2= (EditText) findViewById(R.id.y2Input);

        double[] point2 = { Double.parseDouble(x2.getText().toString()), Double.parseDouble(y2.getText().toString()) };
        return point2;
    }

    private double[] getPoint3() {

        EditText x3 = (EditText) findViewById(R.id.x3Input);
        EditText y3= (EditText) findViewById(R.id.y3Input);

        double[] point2 = { Double.parseDouble(x3.getText().toString()), Double.parseDouble(y3.getText().toString()) };
        return point2;
    }
}
