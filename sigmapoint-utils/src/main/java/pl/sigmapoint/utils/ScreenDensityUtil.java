package pl.sigmapoint.utils;

import android.content.Context;
import android.graphics.Point;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;

public class ScreenDensityUtil {

    /**
     * @param context application context
     * @return display size in pixels
     */
    private static Point getScreenPoint(Context context) {
        WindowManager wm = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
        Display display = wm.getDefaultDisplay();
        Point point = new Point();
        display.getSize(point);
        return point;
    }

    /**
     * @param context application context
     * @return display metrics
     */
    private static DisplayMetrics getMetrics(Context context) {
        DisplayMetrics metrics = new DisplayMetrics();
        WindowManager wm = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
        Display display = wm.getDefaultDisplay();
        display.getMetrics(metrics);
        return metrics;
    }

    /**
     * @param context application context
     * @return screen density
     */
    public static double getDensity(Context context) {
        return getMetrics(context).density;
    }

    /**
     * Convert density points to pixels
     *
     * @param context application context
     * @param dp      density points
     * @return dp in pixels
     */
    public static int getPixels(Context context, int dp) {
        return (int) (dp * getDensity(context));
    }

    /**
     * Convert pixels to density points
     *
     * @param context application context
     * @param f       pixels
     * @return pixels in dp
     */
    public static int getDP(Context context, float f) {
        return (int) (f / getDensity(context));
    }

    public static int getScreenWidth(Context context) {
        return getScreenPoint(context).x;
    }

    public static int getScreenHeight(Context context) {
        return getScreenPoint(context).y;
    }

}
