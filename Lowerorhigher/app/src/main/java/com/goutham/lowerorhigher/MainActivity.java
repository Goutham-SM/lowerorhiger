package com.goutham.lowerorhigher;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
   long a;
    Random random = new Random();
    public long convert(EditText txt)
    {
        return  Long.parseLong(txt.getText().toString());


    }

    public void makeToast(String string)
    {
        Toast.makeText(MainActivity.this,string,Toast.LENGTH_SHORT).show();
    }
    public void clickFunc(View v)
    {
        EditText myText = (EditText) findViewById(R.id.editText);
        if(myText.length()<=12)
        {
        if(100000< convert(myText))
        makeToast("Error!! Type less than 1000");
        else if(a>convert(myText))
            makeToast("Lower!!");
        else if(a<convert(myText))
            makeToast("Higher!!");
        else if(a==convert(myText))
        { makeToast("You guessed the correct number!!,Try Guessing again!!");
            a = random.nextInt(100000)+1;}}
        else
            makeToast("Enter only 12 digits!!");

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        a =random.nextInt(1000)+1;
    }
}
