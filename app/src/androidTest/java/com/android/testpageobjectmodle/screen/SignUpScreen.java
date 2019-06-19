package com.android.testpageobjectmodle.screen;

import com.android.testpageobjectmodle.page.MainPage;
import com.android.testpageobjectmodle.page.SignUpPage;
import com.android.testpageobjectmodle.page.SuccessDialog;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class SignUpScreen {

    /*
      ID: SingUpScreen: 01
      Name: testVerifySignUpSuccessfulDialogShouldBeVisibleAfterTappingOnSubmitButton.
      Steps:
      1. Tap on the 'Sign-Up' button.
      2. Tap on the 'Submit' button.
      3. Verify 'Sign-Up' success dialog should visible.
     */
    @Test
    public void testVerifySignUpSuccessfulDialogShouldBeVisibleAfterTappingOnSubmitButton() {
        MainPage mainPage = new MainPage();

        // Tap on the 'Sign-In' button.
        SignUpPage signUpPage = mainPage.openSignUpScreen();

        // Tap on the 'Reset Password' button.
        SuccessDialog successDialog = signUpPage.openSuccessDialog();

        // Verify 'Reset Password' success dialog should visible.
        assertEquals("'Sign-Up' success dialog should be visible",
                "Sign-Up Success", successDialog.dialogHeader().getText());
    }
}
