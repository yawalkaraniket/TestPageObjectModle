package com.android.testpageobjectmodle.page;

import com.android.testpageobjectmodle.R;
import com.android.testpageobjectmodle.element.Element;

import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static junit.framework.TestCase.assertTrue;

public class SignInPage {

    public SignInPage() {
        assertTrue("Sign-In screen should be visible", new Element(withId(R.id.sign_in_container)).isVisible());
    }

    private Element resetPasswordButton() {
        return new Element(withId(R.id.btn_reset_password));
    }

    private Element signInButton() {
        return new Element(withId(R.id.btn_submit));
    }

    public SuccessDialog openResetPasswordSuccessDialog() {
        resetPasswordButton().click();

        return new SuccessDialog();
    }

    public SuccessDialog openSignInSuccessDialog() {
        signInButton().click();

        return new SuccessDialog();
    }


}
