package assignment2.password_validator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String password = "testString";
        validate(password);
    }

    public static boolean validate(String p) {
        boolean result1;
        boolean result2;

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

        //return true if result1 and result2 are both true. Return false if otherwise
        if (result1 && result2)
            return true;
        else
            return false;
    }
}  //end of class MainActivity
