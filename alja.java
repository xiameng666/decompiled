import android.net.Uri;
import com.google.android.gms.chimera.modules.auth.proximity.AppContextProvider;

public final class alja {
    private static alja a;
    private final frli b;

    private alja() {
        frce frce0 = new frce(AppContextProvider.a());
        frce0.d("proximity_auth");
        frce0.e("PhoneHubEventsLoggerIdentifier.pb");
        Uri uri0 = frce0.a();
        frie frie0 = frif.a();
        frie0.f(uri0);
        frie0.e(((MessageLite)alus.a));
        frif frif0 = frie0.a();
        this.b = cjtb.a.a(frif0);
    }

    public static alja a() {
        synchronized(alja.class) {
            if(alja.a == null) {
                alja.a = new alja();
            }
        }
        return alja.a;
    }

    public final gmcd b() {
        return glzd.f(this.b.a(), new aliw(), gmap.a);
    }

    public final gmcd c() {
        return glzd.f(this.b.a(), new aliy(), gmap.a);
    }

    public final gmcd d(String s) {
        return glzd.f(this.b.a(), new alix(s), gmap.a);
    }

    public final gmcd e(String s, long v) {
        aliz aliz0 = new aliz(s, v);
        return this.b.b(aliz0, gmap.a);
    }
}

