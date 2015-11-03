package pl.sigmapoint.utils;

import android.content.Context;
import android.telephony.TelephonyManager;

public class PhoneUtil {

    /**
     * Get device ID
     *
     * @param context application context
     * @return String with device ID
     */
    public static String getDeviceId(Context context) {
        return android.provider.Settings.Secure.getString(context.getContentResolver(), android.provider.Settings.Secure.ANDROID_ID);
    }

    /**
     * Get own phone number
     *
     * @param context application context
     * @return String with phone number
     */
    public static String getMsisdn(Context context) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(Context.TELEPHONY_SERVICE);
            return telephonyManager.getLine1Number();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}