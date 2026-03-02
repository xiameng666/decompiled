import android.net.Uri;
import com.google.android.gms.chimera.modules.location.base.AppContextProvider;

public final class fuyc {
    public final frli a;
    private static volatile fuyc b;

    public fuyc() {
        frce frce0 = new frce(AppContextProvider.a());
        frce0.d("location");
        frce0.e("drivingbehavior.pb");
        Uri uri0 = frce0.a();
        frie frie0 = frif.a();
        frie0.f(uri0);
        frie0.e(((MessageLite)gwkg.a));
        frie0.h(frhj.a);
        frif frif0 = frie0.a();
        this.a = cjtb.a.a(frif0);
    }

    public static fuyc a() {
        if(fuyc.b == null) {
            Class class0 = fuyc.class;
            synchronized(class0) {
                if(fuyc.b == null) {
                    fuyc.b = new fuyc();
                }
            }
            return fuyc.b;
        }
        return fuyc.b;
    }

    public final gmcd b() {
        return huue.p() ? glzd.f(this.a.a(), new fuxz(), gmap.a) : gmbu.i(gwkf.a);
    }

    public final gmcd c() {
        return huue.p() ? glzd.f(this.a.a(), new fuyb(), gmap.a) : gmbu.i(Boolean.valueOf(false));
    }

    public final gmcd d(boolean z) {
        if(!huue.p()) {
            return gmbx.a;
        }
        fuxy fuxy0 = new fuxy(z);
        return this.a.b(fuxy0, gmap.a);
    }

    public final gmcd e(gwkf gwkf0) {
        if(!huue.p()) {
            return gmbx.a;
        }
        fuya fuya0 = new fuya(gwkf0);
        return this.a.b(fuya0, gmap.a);
    }
}

