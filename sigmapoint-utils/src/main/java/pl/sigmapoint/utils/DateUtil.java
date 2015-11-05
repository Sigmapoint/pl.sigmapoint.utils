package pl.sigmapoint.utils;

import java.util.Calendar;
import java.util.Date;

public class DateUtil {

    /**
     * Get begin of day. e.g. 00:00:00 21.10.2015
     *
     * @param date
     * @return date with begin of day
     */
    public static Date getBeginDay(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        Date beginDate = new Date(calendar.getTimeInMillis());
        return beginDate;
    }

    /**
     * Get end of day.
     *
     * @param date
     * @return date with end of day
     */
    public static Date getEndDay(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        calendar.add(Calendar.DAY_OF_MONTH, 1);
        calendar.add(Calendar.SECOND, -1);
        Date endDate = new Date(calendar.getTimeInMillis());
        return endDate;
    }

    /**
     * Get begin of month.
     *
     * @param date
     * @return date with begin of month
     */
    public static Date getBeginMonth(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        Date beginMonth = new Date(calendar.getTimeInMillis());
        return beginMonth;
    }

    /**
     * Get end of month.
     *
     * @param date
     * @return date with end of month
     */
    public static Date getEndMonth(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        calendar.add(Calendar.MONTH, 1);
        calendar.add(Calendar.DAY_OF_MONTH, -1);
        Date endMonth = new Date(calendar.getTimeInMillis());
        return endMonth;
    }

}
