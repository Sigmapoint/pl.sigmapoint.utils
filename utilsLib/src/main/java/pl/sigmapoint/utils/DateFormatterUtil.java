package pl.sigmapoint.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class DateFormatterUtil {

    private static final DateFormat HH_MM = new SimpleDateFormat("HH:mm", Locale.getDefault());
    private static final DateFormat HH_MM_SS = new SimpleDateFormat("HH:mm:ss", Locale.getDefault());
    private static final DateFormat HH_MM_YYYY_MM_DD = new SimpleDateFormat("HH:mm yyyy-MM-dd", Locale.getDefault());
    private static final DateFormat DDMMYYYY_HH_MM = new SimpleDateFormat("dd.MM.yyyy HH:mm", Locale.getDefault());
    private static final DateFormat YYYY_MM_DD = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
    private static final DateFormat YYYY_MM_DD_HH_MM_SS = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());
    private static final DateFormat DD_MM_YYYY = new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault());
    private static final DateFormat DDMMYYY = new SimpleDateFormat("dd.MM.yyyy", Locale.getDefault());
    private static final DateFormat MMYYYY = new SimpleDateFormat("MM.yyyy", Locale.getDefault());
    private static final DateFormat MMMMYYYY = new SimpleDateFormat("MMMM yyyy", Locale.getDefault());

    /**
     * @param date
     * @return HH:mm date format
     */
    public static String formatHHMM(Date date) {
        return pl.sigmapoint.utils.DateFormatterUtil.HH_MM.format(date);
    }

    /**
     * @param date
     * @return HH:mm :ss date format
     */
    public static String formatHHMMSS(Date date) {
        return pl.sigmapoint.utils.DateFormatterUtil.HH_MM_SS.format(date);
    }

    /**
     * @param date
     * @return HH:mm yyyy-MM-dd date format
     */
    public static String formatTimeAndDate(Date date) {
        if (date != null) {
            return pl.sigmapoint.utils.DateFormatterUtil.HH_MM_YYYY_MM_DD.format(date);
        }

        return "";
    }

    /**
     * @param date
     * @return dd.MM.yyyy HH:mm date format
     */
    public static String formatTimeAndDateDot(Date date) {
        if (date != null) {
            return pl.sigmapoint.utils.DateFormatterUtil.DDMMYYYY_HH_MM.format(date);
        }

        return "";
    }

    /**
     * @param date
     * @return dd/MM/yyyy date format
     */
    public static String formatDateDD_MM_YYYY(Date date) {
        if (date != null) {
            return pl.sigmapoint.utils.DateFormatterUtil.DD_MM_YYYY.format(date);
        }

        return "";
    }

    /**
     * @param date
     * @return yyyy-MM-dd HH:mm:ss date format
     */
    public static String formatDateYYYY_MM_DD_HH_MM_SS(Date date) {
        if (date != null) {
            return pl.sigmapoint.utils.DateFormatterUtil.YYYY_MM_DD_HH_MM_SS.format(date);
        }
        return "";
    }

    /**
     * @param date
     * @return yyyy-MM-dd date format
     */
    public static String formatDate(Date date) {
        if (date != null) {
            return pl.sigmapoint.utils.DateFormatterUtil.YYYY_MM_DD.format(date);
        }

        return "";
    }

    /**
     * @param date
     * @return dd.MM.yyyy date format
     */
    public static String formatDateDot(Date date) {
        if (date != null) {
            return pl.sigmapoint.utils.DateFormatterUtil.DDMMYYY.format(date);
        }
        return "";
    }

    /**
     * @param date
     * @return MM.yyyy date format
     */
    public static String formatMonthDot(Date date) {
        if (date != null) {
            return pl.sigmapoint.utils.DateFormatterUtil.MMYYYY.format(date);
        }
        return "";
    }

    /**
     * @param date
     * @return MM.yyyy UTC date format
     */
    public static String formatUTCHHMM(Date date) {
        if (date != null) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm");
            TimeZone timeZone = TimeZone.getTimeZone("UTC");
            simpleDateFormat.setTimeZone(timeZone);
            return simpleDateFormat.format(date);
        }
        return "";
    }

    /**
     * @param date
     * @return HH'h 'mm'm UTC date format
     */
    public static String formatUTCHHhMMm(Date date) {
        if (date != null) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH'h 'mm'm'");
            TimeZone timeZone = TimeZone.getTimeZone("UTC");
            simpleDateFormat.setTimeZone(timeZone);
            return simpleDateFormat.format(date);
        }
        return "";
    }

    /**
     * @param date
     * @return HH:mm:ss UTC date format
     */
    public static String formatUTCHHMMSS(Date date) {
        if (date != null) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");
            TimeZone timeZone = TimeZone.getTimeZone("UTC");
            simpleDateFormat.setTimeZone(timeZone);
            return simpleDateFormat.format(date);
        }
        return "";
    }

    /**
     * @param date
     * @return yyyy-MM-dd'T'HH:mm:ss.SSS'Z' UTC date format
     */
    public static String formatUTC(Date date) {
        if (date != null) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
            TimeZone timeZone = TimeZone.getTimeZone("UTC");
            simpleDateFormat.setTimeZone(timeZone);
            return simpleDateFormat.format(date);
        }
        return "";
    }

    /**
     * @param date
     * @return yyyy-MM-dd UTC date format
     */
    public static String formatUTCYYYYMMDD(Date date) {
        if (date != null) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            TimeZone timeZone = TimeZone.getTimeZone("UTC");
            simpleDateFormat.setTimeZone(timeZone);
            return simpleDateFormat.format(date);
        }
        return "";
    }

}
