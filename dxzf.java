import android.accounts.Account;
import android.net.Uri;
import com.google.android.gms.chimera.modules.tapandpay.AppContextProvider;
import j..util.DesugarCollections;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class dxzf {
    public static final bboh a;
    private final Account b;
    private final String c;
    private gfsx d;

    static {
        dxzf.a = bboh.b("Pay", bbcu.cZ);
    }

    public dxzf(Account account0, String s) {
        this.d = gfqx.a;
        this.b = account0;
        this.c = s;
    }

    public final ggeo a() {
        try {
            return ggeo.k(DesugarCollections.unmodifiableMap(((dmpz)this.b().a().get(10L, TimeUnit.SECONDS)).b));
        }
        catch(ExecutionException | InterruptedException | TimeoutException unused_ex) {
            return ggnf.a;
        }
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
            frce0.e("fieldupdateinfo/" + this.c + ".pb");
            Uri uri0 = frce0.a();
            frie frie0 = frif.a();
            frie0.f(uri0);
            frie0.e(((MessageLite)dmpz.a));
            frie0.h(new frjp(cjtd.a));
            frif frif0 = frie0.a();
            gfsx gfsx0 = gfsx.m(cjtb.a.a(frif0));
            this.d = gfsx0;
            frli1 = (frli)gfsx0.d();
        }
        return frli1;
    }
}

