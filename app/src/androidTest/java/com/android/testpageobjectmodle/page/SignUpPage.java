package com.android.testpageobjectmodle.page;

import com.android.testpageobjectmodle.R;
import com.android.testpageobjectmodle.element.Element;

import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static junit.framework.TestCase.assertTrue;

public class SignUpPage {

    public SignUpPage() {
        assertTrue("SignUp Screen should be visible",
                new Element(withId(R.id.sign_up_container)).isVisible());
    }

    private Element submitButton() {
        return new Element(withId(R.id.btn_submit));
    }

    public SuccessDialog openSuccessDialog() {
        submitButton().click();

        return new SuccessDialog();
    }
}
