package com.android.testpageobjectmodle.page;

import com.android.testpageobjectmodle.R;
import com.android.testpageobjectmodle.element.Element;

import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static junit.framework.TestCase.assertTrue;

public class MainPage {

    public MainPage() {
        assertTrue("Main Screen should be visible",
                new Element(withId(R.id.main_screen_container)).isVisible());
    }

    private Element signInButton() {
        return new Element(withId(R.id.btn_sign_in));
    }

    private Element signUpButton() {
        return new Element(withId(R.id.btn_sign_up));
    }

    public SignInPage openSignInScreen() {
        signInButton().click();

        return new SignInPage();
    }

    public SignUpPage openSignUpScreen() {
        signUpButton().click();

        return new SignUpPage();
    }
}
