package edu.usna.mobileos.servicesexample;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;


public class MainActivity extends ActionBarActivity implements View.OnClickListener {

    Button startButton, stopButton;
    TextView textArea;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startButton = (Button) findViewById(R.id.startButton);
        stopButton = (Button) findViewById(R.id.stopButton);
        textArea = (TextView) findViewById(R.id.textArea);

        startButton.setOnClickListener(this);
        stopButton.setOnClickListener(this);



    }


    @Override
    public void onClick(View v){

        if(v == startButton){



        } else if (v == stopButton){



        }

    }

    public void showRandomText(){
        Random r = new Random();
        r.nextInt();
        textArea.setText(String.valueOf(r));
    }

}
