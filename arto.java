import android.content.Context;
import android.net.Uri;
import java.io.IOException;

public final class arto {
    private final aqql a;
    private final frli b;

    private arto(frli frli0) {
        this.a = new aqql(new String[]{"CustomDownloadProtoDataStore"});
        this.b = frli0;
    }

    public static arto a(Context context0) {
        frce frce0 = new frce(context0);
        frce0.d("backup");
        frce0.e("backup.customdownloadstate.pb");
        Uri uri0 = frce0.a();
        frie frie0 = frif.a();
        frie0.f(uri0);
        frie0.e(((MessageLite)artu.a));
        frif frif0 = frie0.a();
        return new arto(cjtb.a.a(frif0));
    }

    public final artu b() {
        try {
            return (artu)gmbs.b(this.b.a(), IOException.class);
        }
        catch(IOException iOException0) {
            this.a.g("Returning default instance of proto, since exception was thrown", iOException0, new Object[0]);
            return artu.a;
        }
    }

    public final void c(artu artu0) {
        try {
            artn artn0 = new artn(artu0);
            gmbs.b(this.b.b(artn0, gmap.a), IOException.class);
        }
        catch(IOException iOException0) {
            this.a.g("Exception was thrown while updating", iOException0, new Object[0]);
        }
    }
}

