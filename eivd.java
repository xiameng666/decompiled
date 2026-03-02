import android.net.Uri;
import com.google.android.gms.chimera.modules.phonesky.recovery.AppContextProvider;

public final class eivd {
    public final frli a;
    private static eivd b;

    private eivd() {
        frce frce0 = new frce(AppContextProvider.a());
        frce0.d("phonesky_recovery");
        frce0.e("phonesky_recovery.pb");
        Uri uri0 = frce0.a();
        frie frie0 = frif.a();
        frie0.f(uri0);
        frie0.e(((MessageLite)eivg.a));
        frif frif0 = frie0.a();
        this.a = cjtb.a.a(frif0);
    }

    public static eivd a() {
        synchronized(eivd.class) {
            if(eivd.b == null) {
                eivd.b = new eivd();
            }
        }
        return eivd.b;
    }

    public final gmcd b() {
        return glzd.f(this.a.a(), new eiux(), gmap.a);
    }

    public final gmcd c() {
        return glzd.f(this.a.a(), new eivb(), gmap.a);
    }

    public final void d() {
        eiuv eiuv0 = new eiuv();
        ((glyq)this.a.b(eiuv0, gmap.a)).u();
    }
}

