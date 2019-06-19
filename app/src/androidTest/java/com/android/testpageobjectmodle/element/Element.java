package com.android.testpageobjectmodle.element;

import android.support.test.espresso.UiController;
import android.support.test.espresso.ViewAction;
import android.support.test.espresso.action.ViewActions;
import android.view.View;
import android.widget.TextView;

import com.android.testpageobjectmodle.common.TestUtil;

import org.hamcrest.Matcher;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.matcher.ViewMatchers.isAssignableFrom;
import static android.support.test.espresso.matcher.ViewMatchers.isCompletelyDisplayed;
import static org.hamcrest.CoreMatchers.anyOf;

public class Element {

    Matcher<View> mViewMatcher;

    public Element(Matcher<View> viewMatcher) {
        mViewMatcher = viewMatcher;
    }

    public void click() {
        onView(mViewMatcher).perform(ViewActions.click());
    }

    public boolean isVisible() {
        return TestUtil.match(mViewMatcher, isCompletelyDisplayed());
    }

    public String getText() {
        final String[] stringHolder = {""};
        onView(mViewMatcher).perform(new ViewAction() {
            @Override
            public Matcher<View> getConstraints() {
                return isAssignableFrom(TextView.class);
            }

            @Override
            public String getDescription() {
                return "getting text from the given View";
            }

            @Override
            public void perform(UiController uiController, View view) {
                uiController.loopMainThreadUntilIdle();
                if (view instanceof TextView) {
                    TextView fontEditText = (TextView) view;
                    stringHolder[0] = fontEditText.getText().toString();
                }
            }
        });
        return stringHolder[0];
    }
}
