package pl.sigmapoint.utils;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ImageUtil {

    /**
     * Encode bitmap to Base64
     * @param image input image
     * @param quality compress quality
     * @param compressFormat compress format
     * @return String with encoded image
     */
    public static String encodeToBase64(Bitmap image, int quality, Bitmap.CompressFormat compressFormat) {
        ByteArrayOutputStream baos = null;
        try {
            baos = new ByteArrayOutputStream();
            image.compress(compressFormat, quality, baos);
            byte[] b = baos.toByteArray();
            return Base64.encodeToString(b, Base64.DEFAULT);
        } finally {
            try {
                if (baos != null) {
                    baos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * Decode Bitmap from Base64
     * @param input Base64 image
     * @return decode Bitmap
     */
    public static Bitmap decodeBase64(String input) {
        byte[] decodedByte = Base64.decode(input, 0);
        return BitmapFactory.decodeByteArray(decodedByte, 0, decodedByte.length);
    }
}