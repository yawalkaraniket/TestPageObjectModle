package com.android.testpageobjectmodle.common;

import android.view.View;

import org.hamcrest.Matcher;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;

public class TestUtil {
    /**
     * Convenience method to match the given view with the given condition.
     * @param view Matcher for the view which is to be verified.
     * @param condition Matcher for the condition against which the view is verified.
     */
    public static boolean match(final Matcher<View> view, final Matcher<View> condition) {
        final boolean[] matches = {true};

        onView(view).withFailureHandler((error, viewMatcher) -> matches[0] = false).check(matches(condition));

        return matches[0];
    }
}
