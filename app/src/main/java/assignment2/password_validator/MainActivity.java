package assignment2.password_validator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    public static final String MESSAGE = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = getIntent();
    }


    public void sendMessage(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        EditText editText = (EditText) findViewById(R.id.editText2);
        String message = editText.getText().toString();

        final TextView textView = (TextView) findViewById(R.id.helloText);
        if (validate(message))
            textView.setText("The password is valid!");
        else
            textView.setText("The password is not valid!");
    }

    public static boolean validate(String p) {
        boolean result1;
        boolean result2;
        boolean result3;
        boolean result4;
        boolean result5;

        //test if password matches the word 'password' disregarding case
        if (p.equalsIgnoreCase("password"))
            result1 = false;
        else
            result1 = true;

        //test if password is at least 8 characters long
        if (p.length() < 8)
            result2 = false;
        else
            result2 = true;

        //test if password contains at least one number
        result3 = false;
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j < p.length(); j++) {
                if (p.charAt(j) == i+48)
                    result3 = true;
            }
        }

        //test if password contains a special character from ASCII character set (33-47)
        result4 = false;
        for (int i = 33; i <= 47; i++) {
            for (int j = 0; j < p.length(); j++) {
                if (p.charAt(j) == i)
                    result4 = true;
            }
        }

        //test if password contains at least one lower case and one upper case character
        boolean check1 = false;
        boolean check2 = false;

        for (int i = 65; i <= 90; i++) {
            for(int j = 0; j < p.length(); j++) {
                if (p.charAt(j) == i)
                    check1 = true;
            }
        }

        for (int i = 97; i <= 122; i++) {
            for(int j = 0; j < p.length(); j++) {
                if (p.charAt(j) == i)
                    check2 = true;
            }
        }

        if (check1 && check2)
            result5 = true;
        else
            result5 = false;

        //return true if results of all tests are true. Return false if otherwise
        if (result1 && result2 && result3 && result4 && result5)
            return true;
        else
            return false;
    }
}  //end of class MainActivity
