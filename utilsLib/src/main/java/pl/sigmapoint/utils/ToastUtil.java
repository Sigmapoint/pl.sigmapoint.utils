package pl.sigmapoint.utils;

import android.content.Context;
import android.widget.Toast;

public class ToastUtil {

    private static int GRAVITY = Integer.MIN_VALUE;
    private static int LENGTH = Toast.LENGTH_SHORT;

    public static void display(Context context, String text) {
        final Toast toast = Toast.makeText(context, text, LENGTH);
        if (GRAVITY != Integer.MIN_VALUE)
            toast.setGravity(GRAVITY, 0, 0);
        toast.show();
    }

    public static void display(Context context, int textResource) {
        display(context, context.getString(textResource));
    }

    public static void setLength(int length) {
        ToastUtil.LENGTH = length;
    }
}
