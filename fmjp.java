import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory.Options;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;
import jeb.synthetic.TWR;

public final class fmjp {
    public static final Bitmap a(Context context0, Uri uri0, int v, int v1) {
        Bitmap bitmap0;
        int v4;
        BitmapFactory.Options bitmapFactory$Options0 = new BitmapFactory.Options();
        bitmapFactory$Options0.inJustDecodeBounds = true;
        try {
            InputStream inputStream0 = context0.getContentResolver().openInputStream(uri0);
            try {
                BitmapFactory.decodeStream(inputStream0, null, bitmapFactory$Options0);
            }
            catch(Throwable throwable0) {
                TWR.safeClose$NT(inputStream0, throwable0);
                throw throwable0;
            }
            if(inputStream0 != null) {
                inputStream0.close();
            }
        }
        catch(IOException iOException0) {
            flbj.d("LighterUriLoader", "can not create bitmap from invalid uri" + uri0, iOException0);
            goto label_36;
        }
        int v2 = bitmapFactory$Options0.outHeight;
        int v3 = bitmapFactory$Options0.outWidth;
        if(v2 <= v1 && v3 <= v) {
            v4 = 1;
        }
        else {
            for(v4 = 1; v2 / 2 / v4 >= v1 && v3 / 2 / v4 >= v; v4 += v4) {
            }
        }
        try {
            bitmapFactory$Options0.inSampleSize = v4;
            bitmapFactory$Options0.inJustDecodeBounds = false;
            InputStream inputStream1 = context0.getContentResolver().openInputStream(uri0);
            try {
                bitmap0 = BitmapFactory.decodeStream(inputStream1, null, bitmapFactory$Options0);
            }
            catch(Throwable throwable1) {
                TWR.safeClose$NT(inputStream1, throwable1);
                throw throwable1;
            }
            if(inputStream1 != null) {
                inputStream1.close();
            }
            goto label_38;
        }
        catch(IOException iOException1) {
            flbj.d("LighterUriLoader", "can not create bitmap from invalid uri" + uri0, iOException1);
        }
    label_36:
        Bitmap bitmap1 = null;
        goto label_39;
    label_38:
        bitmap1 = bitmap0;
        try {
        label_39:
            try(InputStream inputStream2 = context0.getContentResolver().openInputStream(uri0)) {
                int v5 = new llf(inputStream2).c("Orientation", 1);
                Matrix matrix0 = new Matrix();
                switch(v5) {
                    case 2: {
                        matrix0.setScale(-1.0f, 1.0f);
                        break;
                    }
                    case 3: {
                        matrix0.setRotate(180.0f);
                        break;
                    }
                    case 4: {
                        matrix0.setRotate(180.0f);
                        matrix0.postScale(-1.0f, 1.0f);
                        break;
                    }
                    case 5: {
                        matrix0.setRotate(90.0f);
                        matrix0.postScale(-1.0f, 1.0f);
                        break;
                    }
                    case 6: {
                        matrix0.setRotate(90.0f);
                        break;
                    }
                    case 7: {
                        matrix0.setRotate(-90.0f);
                        matrix0.postScale(-1.0f, 1.0f);
                        break;
                    }
                    case 8: {
                        matrix0.setRotate(-90.0f);
                        break;
                    }
                }
                return matrix0.isIdentity() ? bitmap1 : Bitmap.createBitmap(bitmap1, 0, 0, bitmap1.getWidth(), bitmap1.getHeight(), matrix0, true);
            }
        }
        catch(IOException | UnsupportedOperationException unused_ex) {
            return bitmap1;
        }
    }
}

