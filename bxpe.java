import android.content.res.Resources;
import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri.Builder;
import android.net.Uri;

public final class bxpe {
    public static Bitmap a(Drawable drawable0) {
        if(drawable0 == null) {
            return null;
        }
        if((drawable0 instanceof BitmapDrawable)) {
            return ((BitmapDrawable)drawable0).getBitmap();
        }
        Bitmap bitmap0 = Bitmap.createBitmap(drawable0.getIntrinsicWidth(), drawable0.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas0 = new Canvas(bitmap0);
        drawable0.setBounds(0, 0, canvas0.getWidth(), canvas0.getHeight());
        drawable0.draw(canvas0);
        return bitmap0;
    }

    public static String b(String s, Resources resources0) {
        Uri.Builder uri$Builder0 = Uri.parse(s).buildUpon();
        return (resources0.getConfiguration().uiMode & 0x30) == 0x20 || jg.b == 2 ? uri$Builder0.appendQueryParameter("color_scheme", "dark").build().toString() : uri$Builder0.appendQueryParameter("color_scheme", "light").build().toString();
    }
}

