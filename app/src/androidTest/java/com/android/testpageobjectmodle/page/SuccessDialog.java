package com.android.testpageobjectmodle.page;

import com.android.testpageobjectmodle.R;
import com.android.testpageobjectmodle.element.Element;

import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static junit.framework.TestCase.assertTrue;

public class SuccessDialog {

    public SuccessDialog() {
        assertTrue("Success dialog should be visible",
                new Element(withId(R.id.custom_dialog_header)).isVisible());
    }

    public Element okButton() {
        return new Element(withId(R.id.custom_dialog_ok));
    }

    public Element dialogHeader() {
        return new Element(withId(R.id.custom_dialog_header));
    }

    public Element dialogDescription() {
        return new Element(withId(R.id.custom_dialog_text));
    }
}
