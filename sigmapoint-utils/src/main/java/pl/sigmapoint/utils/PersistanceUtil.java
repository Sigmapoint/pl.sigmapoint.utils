package pl.sigmapoint.utils;

import android.content.Context;

import java.util.Set;

public class PersistanceUtil {
    private final Context context;
    private String sharedPrefName;

    public PersistanceUtil(Context context, String sharedPrefName) {
        this.context = context;
        this.sharedPrefName = sharedPrefName;
    }

    public void persist(String key, String value) {
        SharedPreferencesUtil.getPreferences(context, sharedPrefName).edit().putString(key, value).commit();
    }

    public void persist(String key, Long value) {
        SharedPreferencesUtil.getPreferences(context, sharedPrefName).edit().putLong(key, value).commit();
    }

    public void persist(String key, Integer value) {
        SharedPreferencesUtil.getPreferences(context, sharedPrefName).edit().putInt(key, value).commit();
    }

    public void persist(String key, Float value) {
        SharedPreferencesUtil.getPreferences(context, sharedPrefName).edit().putFloat(key, value).commit();
    }

    public void persist(String key, Boolean value) {
        SharedPreferencesUtil.getPreferences(context, sharedPrefName).edit().putBoolean(key, value).commit();
    }

    public void persist(String key, Set<String> value) {
        SharedPreferencesUtil.getPreferences(context, sharedPrefName).edit().putStringSet(key, value).commit();
    }

    public Object load(String key) {
        return SharedPreferencesUtil.getPreferences(context, sharedPrefName).getAll().get(key);
    }

    public String loadString(String key) {
        return (String) load(key);
    }

    public Long loadLong(String key) {
        return (Long) load(key);
    }

    public Integer loadInt(String key) {
        return (Integer) load(key);
    }

    public Float loadFloat(String key) {
        return (Float) load(key);
    }

    public Boolean loadBoolean(String key) {
        return (Boolean) load(key);
    }

    public Set<String> loadStringSet(String key) {
        return (Set<String>) load(key);
    }

    public void remove(String key) {
        SharedPreferencesUtil.getPreferences(context, sharedPrefName).edit().remove(key).commit();
    }

    public String getSharedPrefName() {
        return sharedPrefName;
    }

    public void setSharedPrefName(String sharedPrefName) {
        this.sharedPrefName = sharedPrefName;
    }
}
