import android.accounts.Account;
import android.net.Uri;
import com.google.android.gms.chimera.modules.tapandpay.AppContextProvider;

public final class dyab {
    public static volatile boolean a = true;
    private final Account b;
    private final String c;
    private gfsx d;

    static {
    }

    public dyab(Account account0, String s) {
        this.d = gfqx.a;
        this.b = account0;
        this.c = s;
    }

    public final void a(String s, kar kar0) {
        glzd.f(this.b().a(), new dxzy(s, kar0), gmap.a);
    }

    public final frli b() {
        frli frli1;
        synchronized(this) {
            if(this.d.i()) {
                return (frli)this.d.d();
            }
            frce frce0 = new frce(AppContextProvider.a());
            frce0.d("pay");
            frce0.c(this.b);
            frce0.e("passupdatenotice/" + this.c + ".pb");
            Uri uri0 = frce0.a();
            frie frie0 = frif.a();
            frie0.f(uri0);
            frie0.e(((MessageLite)dxec.a));
            if(dyab.a) {
                frie0.h(new frjp(cjtd.a));
            }
            frif frif0 = frie0.a();
            gfsx gfsx0 = gfsx.m(cjtb.a.a(frif0));
            this.d = gfsx0;
            frli1 = (frli)gfsx0.d();
        }
        return frli1;
    }

    public final void c(gged_interceptors gged0) {
        this.b().b(new dxzz(gged0), gmap.a);
    }
}

