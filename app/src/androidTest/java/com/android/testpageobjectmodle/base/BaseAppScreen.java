package com.android.testpageobjectmodle.base;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import com.android.testpageobjectmodle.MainActivity;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class BaseAppScreen {

    @Rule
    public ActivityTestRule mainActivityActivityTestRule =
            new ActivityTestRule(MainActivity.class);

    @BeforeClass
    public static void beforeClass() {

    }

    @Before
    public void beforeTest() {

    }

    @After
    public void afterTest() {

    }

    @AfterClass
    public void afterClass() {

    }
}
