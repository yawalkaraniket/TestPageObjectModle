package com.android.testpageobjectmodle;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;

public class DialogUtil {

    public static Dialog okDialog(Activity activity, String titleText, String descriptionText) {
        View view = activity.getLayoutInflater().inflate(R.layout.dialog_ok, null);

        TextView description = view.findViewById(R.id.custom_dialog_text);
        TextView header = view.findViewById(R.id.custom_dialog_header);
        View yes = view.findViewById(R.id.custom_dialog_ok);


        header.setText(titleText);
        description.setText(descriptionText);

        final android.app.Dialog dialog = new android.app.Dialog(activity, R.style.dialog_style);
        dialog.setContentView(view);
        try {
            dialog.show();
        } catch (Exception e) {
            dialog.dismiss();
            e.printStackTrace();
        }
        yes.setOnClickListener(v -> {
            dialog.dismiss();
        });

        dialog.setOnKeyListener(new Dialog.OnKeyListener() {
            @Override
            public boolean onKey(DialogInterface arg0, int keyCode, KeyEvent event) {
                if (keyCode == KeyEvent.KEYCODE_BACK && event.getAction() == KeyEvent.ACTION_UP) {
                    yes.callOnClick();
                    return true;
                }
                return false;
            }
        });

        return dialog;
    }
}
