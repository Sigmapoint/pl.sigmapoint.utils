package pl.sigmapoint.utils;

import android.util.Log;

/**
 * Logger class.
 * Before use set log tag using setLogTag method.
 */
public class L {

    private static boolean LOG_IS_ON = true;
    private static String LOG_TAG = "CUSTOM_TAG";
    private static final String NULL_TO_LOG = "NULL TO LOG";

    /**
     * Debug log message
     *
     * @param object is convert to string
     */
    public static void d(Object object) {
        if (LOG_IS_ON) {
            if (object != null) {
                Log.d(LOG_TAG, object.toString());
            } else {
                Log.d(LOG_TAG, NULL_TO_LOG);
            }
        }
    }

    /**
     * Warning log message
     *
     * @param object is convert to string
     */
    public static void w(Object object) {
        if (LOG_IS_ON) {
            if (object != null) {
                Log.w(LOG_TAG, object.toString());
            } else {
                Log.w(LOG_TAG, NULL_TO_LOG);
            }
        }
    }

    /**
     * Error log message
     *
     * @param object is convert to string
     */
    public static void e(Object object) {
        if (LOG_IS_ON) {
            if (object != null) {
                Log.e(LOG_TAG, object.toString());
            } else {
                Log.e(LOG_TAG, NULL_TO_LOG);
            }
        }
    }

    /**
     * Set logging on/off.
     *
     * @param isOn true if logging is on.
     */
    public static void setLogIsOn(boolean isOn) {
        LOG_IS_ON = isOn;
    }

    /**
     * Set log tag.
     *
     * @param logTag
     */
    public static void setLogTag(String logTag) {
        LOG_TAG = logTag;
    }

}
