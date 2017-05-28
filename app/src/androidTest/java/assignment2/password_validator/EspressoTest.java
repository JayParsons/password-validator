package assignment2.password_validator;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class EspressoTest {

    private String textToFind;

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<>(
            MainActivity.class);

    @Before
    public void initString()
    {
        textToFind = "";
    }

    @Test
    public void testClick()
    {
        //Finds the Validate button in my UI
        //After that we want to perform a click on it, however,
        //because the output varies based on the input of the
        //input text field, I wasn't sure how to get the second
        //part of this test to work, hence it is commented out.

        onView(withId(R.id.helloText));
        //onView(withId(R.id.helloText)).perform(click());


    }


}
