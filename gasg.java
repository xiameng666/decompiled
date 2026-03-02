import android.content.ContentResolver;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.ImageDecoder.Source;
import android.graphics.ImageDecoder;
import android.net.Uri;
import android.util.SparseIntArray;
import android.util.TypedValue;
import java.io.IOException;

public final class gasg {
    public static final SparseIntArray a;
    private static hfid b;

    static {
        SparseIntArray sparseIntArray0 = new SparseIntArray(9);
        gasg.a = sparseIntArray0;
        sparseIntArray0.put(5, 0x7F080C88);  // drawable:quantum_ic_arrow_back_vd_black_24
        sparseIntArray0.put(4, 0x7F080CD8);  // drawable:quantum_ic_close_vd_black_24
        sparseIntArray0.put(11, 0x7F080DB7);
        sparseIntArray0.put(12, 0x7F080DB8);
        sparseIntArray0.put(17, 0x7F0804A4);
        sparseIntArray0.put(18, 0x7F0804A3);
        sparseIntArray0.put(22, 0x7F0804A5);  // drawable:gpay_logo_expressive_dynamic_color
        sparseIntArray0.put(19, 0x7F080D31);
        sparseIntArray0.put(20, 0x7F080D33);
        sparseIntArray0.put(21, 0x7F080D32);
        sparseIntArray0.put(23, 0x7F080F9C);  // drawable:tap_to_add_card
        sparseIntArray0.put(24, 0x7F0808A4);  // drawable:lens_camera
        sparseIntArray0.put(25, 0x7F08089C);  // drawable:keyboard
        sparseIntArray0.put(26, 0x7F080528);  // drawable:gs_contactless_vd_theme_24
    }

    public static int a(int v) {
        return (int)TypedValue.applyDimension(1, ((float)v), Resources.getSystem().getDisplayMetrics());
    }

    public static Bitmap b(ContentResolver contentResolver0, Uri uri0) {
        ImageDecoder.Source imageDecoder$Source0 = ImageDecoder.createSource(contentResolver0, uri0);
        try {
            return ImageDecoder.decodeBitmap(imageDecoder$Source0);
        }
        catch(IOException unused_ex) {
            return null;
        }
    }

    static hdif c(hdil hdil0, gbdr gbdr0) {
        for(Object object0: hdil0.f) {
            hdif hdif0 = (hdif)object0;
            if(gbdr0.e(hdif0.d)) {
                return hdif0;
            }
        }
        return null;
    }

    public static hfid d() {
        synchronized(gasg.class) {
            if(gasg.b == null) {
                gasg.b = new hfid(null);
            }
        }
        return gasg.b;
    }
}

