import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import java.io.InputStream;
import java.util.Set;

public final class dvkz {
    public static final bboh a;
    public static final Set b;
    public final Uri c;

    static {
        dvkz.a = bboh.b("Pay", bbcu.cZ);
        dvkz.b = ibqg.b("com.google.android.gms.fileprovider");
    }

    public dvkz(Uri uri0) {
        this.c = uri0;
    }

    public final Bitmap a(Context context0) {
        Bitmap bitmap0;
        ibuq.f(context0, "context");
        InputStream inputStream0 = this.c(context0);
        try {
            bitmap0 = BitmapFactory.decodeStream(inputStream0);
        }
        catch(Throwable throwable0) {
            ibsx.a(inputStream0, throwable0);
            throw throwable0;
        }
        ibsx.a(inputStream0, null);
        return bitmap0;
    }

    public final ByteString b(Context context0) {
        ByteString hfsf0;
        ibuq.f(context0, "context");
        InputStream inputStream0 = this.c(context0);
        try {
            hfsf0 = ByteString.C(inputStream0);
        }
        catch(Throwable throwable0) {
            ibsx.a(inputStream0, throwable0);
            throw throwable0;
        }
        ibsx.a(inputStream0, null);
        return hfsf0;
    }

    public final InputStream c(Context context0) {
        ibuq.f(context0, "context");
        return dvlx.b(context0, this.c);
    }

    public final byte[] d(Context context0) {
        byte[] arr_b;
        ibuq.f(context0, "context");
        InputStream inputStream0 = this.c(context0);
        try {
            arr_b = ghjj.g(inputStream0);
        }
        catch(Throwable throwable0) {
            ibsx.a(inputStream0, throwable0);
            throw throwable0;
        }
        ibsx.a(inputStream0, null);
        ibuq.e(arr_b, "use(...)");
        return arr_b;
    }
}

