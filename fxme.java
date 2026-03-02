import android.net.Uri;
import com.google.android.gms.chimera.modules.location.base.AppContextProvider;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class fxme {
    public final frli a;
    public static final int b;
    private static volatile fxme c;

    static {
        bboh.c("EAlert", bbcu.g, "EmergencyPDS");
    }

    public fxme() {
        frce frce0 = new frce(AppContextProvider.a());
        frce0.d("location");
        frce0.e("emergencyalert.pb");
        Uri uri0 = frce0.a();
        frie frie0 = frif.a();
        frie0.f(uri0);
        frie0.e(((MessageLite)gxom.a));
        frie0.h(frhj.a);
        frif frif0 = frie0.a();
        this.a = cjtb.a.a(frif0);
    }

    public static fxme a() {
        if(fxme.c == null) {
            Class class0 = fxme.class;
            synchronized(class0) {
                if(fxme.c == null) {
                    fxme.c = new fxme();
                }
            }
            return fxme.c;
        }
        return fxme.c;
    }

    public final gmcd b() {
        return this.a.a();
    }

    public final gmcd c() {
        return glzd.f(this.a.a(), new fxmd(), gmap.a);
    }

    public final gmcd d() {
        return glzd.f(this.a.a(), new fxmc(), gmap.a);
    }

    public final gmcd e(boolean z) {
        fxmb fxmb0 = new fxmb(z);
        return this.a.b(fxmb0, gmap.a);
    }

    public final gxol f() {
        try {
            return (gxol)((glyq)this.d()).v(500L, TimeUnit.MILLISECONDS);
        }
        catch(ExecutionException | InterruptedException | TimeoutException unused_ex) {
            return gxol.a;
        }
    }

    public final Boolean g() {
        try {
            return (Boolean)((glyq)this.c()).v(500L, TimeUnit.MILLISECONDS);
        }
        catch(ExecutionException | InterruptedException | TimeoutException unused_ex) {
            return Boolean.valueOf(false);
        }
    }
}

