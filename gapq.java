import android.content.Context;
import android.graphics.BitmapFactory;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.InputStream;

final class gapq extends ibuo implements ibtw {
    public gapq(Object object0) {
        super(2, object0, gapr.class, "getBitmapFromUri", "getBitmapFromUri(Landroid/content/Context;Landroid/net/Uri;)Landroid/graphics/Bitmap;", 0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        Object object2;
        InputStream inputStream0;
        Context context0 = (Context)object0;
        Uri uri0 = (Uri)object1;
        ibuq.f(context0, "p0");
        ibuq.f(uri0, "p1");
        gapr gapr0 = (gapr)this.e;
        try {
            inputStream0 = fqbf.d(context0, uri0, fqbe.c);
        }
        catch(FileNotFoundException unused_ex) {
            inputStream0 = fqbf.d(context0, uri0, fqbe.a);
        }
        try {
            object2 = BitmapFactory.decodeStream(inputStream0);
        }
        catch(Throwable throwable0) {
            ibsx.a(inputStream0, throwable0);
            throw throwable0;
        }
        ibsx.a(inputStream0, null);
        return object2;
    }
}

