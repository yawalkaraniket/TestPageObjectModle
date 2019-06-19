package com.android.testpageobjectmodle.screen;

import com.android.testpageobjectmodle.page.MainPage;
import com.android.testpageobjectmodle.page.SignInPage;
import com.android.testpageobjectmodle.page.SuccessDialog;

import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

public class SingInScreen {

    /*
    ID: SingInScreen: 01
    Name: testVerifyPasswordResetSuccessfulDialogShouldBeVisibleAfterTappingOnResetPasswordButton.
    Steps:
    1. Tap on the 'Sign-In' button.
    2. Tap on the 'Reset Password' button.
    3. Verify 'Reset Password' success dialog should visible.
    */
    @Test
    public void testVerifyPasswordResetSuccessfulDialogShouldBeVisibleAfterTappingOnResetPasswordButton() {
        MainPage mainPage = new MainPage();

        // Tap on the 'Sign-In' button.
        SignInPage signInPage = mainPage.openSignInScreen();

        // Tap on the 'Reset Password' button.
        SuccessDialog successDialog = signInPage.openResetPasswordSuccessDialog();

        // Verify 'Reset Password' success dialog should visible.
        assertEquals("'Reset Password' success dialog should be visible",
                "Reset Password", successDialog.dialogHeader().getText());
    }
}
