import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import java.io.ByteArrayOutputStream;

public final class ctwb {
    public static final ByteString a(Drawable drawable0, int v, int v1) {
        Bitmap bitmap0;
        if(drawable0 == null) {
            ibuq.e(ByteString.b, "EMPTY");
            return ByteString.b;
        }
        if((drawable0 instanceof BitmapDrawable) && ((BitmapDrawable)drawable0).getBitmap() != null) {
            bitmap0 = ((BitmapDrawable)drawable0).getBitmap();
            ibuq.e(bitmap0, "getBitmap(...)");
            if(bitmap0.getWidth() != v || bitmap0.getHeight() != v1) {
                bitmap0 = Bitmap.createScaledBitmap(bitmap0, v, v1, true);
            }
        }
        else {
            Bitmap bitmap1 = Bitmap.createBitmap(v, v1, Bitmap.Config.ARGB_8888);
            Canvas canvas0 = new Canvas(bitmap1);
            drawable0.setBounds(0, 0, bitmap1.getWidth(), bitmap1.getHeight());
            drawable0.draw(canvas0);
            bitmap0 = bitmap1;
        }
        ibuq.f(bitmap0, "image");
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
        bitmap0.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream0);
        return ByteString.copyFrom(byteArrayOutputStream0.toByteArray());
    }
}

