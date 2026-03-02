import android.net.Uri;
import com.google.android.gms.chimera.modules.location.base.AppContextProvider;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class fxlu {
    public final frli a;
    private static volatile fxlu b;

    public fxlu() {
        frce frce0 = new frce(AppContextProvider.a());
        frce0.d("location");
        frce0.e("arwemergencyalert.pb");
        Uri uri0 = frce0.a();
        frie frie0 = frif.a();
        frie0.f(uri0);
        frie0.e(((MessageLite)gxom.a));
        frie0.h(frhj.a);
        frif frif0 = frie0.a();
        this.a = cjtb.a.a(frif0);
    }

    public static fxlu a() {
        if(fxlu.b == null) {
            Class class0 = fxlu.class;
            synchronized(class0) {
                if(fxlu.b == null) {
                    fxlu.b = new fxlu();
                }
            }
            return fxlu.b;
        }
        return fxlu.b;
    }

    public final gmcd b() {
        return glzd.f(this.a.a(), new fxlt(), gmap.a);
    }

    public final gmcd c(boolean z) {
        fxls fxls0 = new fxls(z);
        return this.a.b(fxls0, gmap.a);
    }

    public final Boolean d() {
        try {
            return (Boolean)((glyq)this.b()).v(500L, TimeUnit.MILLISECONDS);
        }
        catch(ExecutionException | InterruptedException | TimeoutException unused_ex) {
            return Boolean.valueOf(false);
        }
    }
}

