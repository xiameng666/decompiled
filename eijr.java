import android.content.Context;
import android.net.Uri;
import com.google.android.gms.chimera.modules.personalsafety.AppContextProvider;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class eijr {
    public final eijd a;
    public final frli b;
    private static volatile eijr c;
    private final Executor d;
    private final frli e;

    public eijr() {
        Context context0 = AppContextProvider.a();
        frce frce0 = new frce(context0);
        frce0.d("personalsafety");
        frce0.e("personalsafety_optin.pb");
        Uri uri0 = frce0.a();
        frie frie0 = frif.a();
        frie0.f(uri0);
        frie0.e(((MessageLite)gwod.a));
        frie0.h(new frjp(cjtd.a));
        frif frif0 = frie0.a();
        this.e = cjtb.a.a(frif0);
        frce frce1 = new frce(context0);
        frce1.d("personalsafety");
        frce1.e("personalsafety_info.pb");
        Uri uri1 = frce1.a();
        frie frie1 = frif.a();
        frie1.f(uri1);
        frie1.e(((MessageLite)gwmf.a));
        frie1.h(new frjp(cjtd.a));
        frif frif1 = frie1.a();
        this.b = cjtb.a.a(frif1);
        this.a = new eijd(context0);
        this.d = new bblp(0x7FFFFFFF, 9);
    }

    public static eijr a() {
        if(eijr.c == null) {
            Class class0 = eijr.class;
            synchronized(class0) {
                if(eijr.c == null) {
                    eijr.c = new eijr();
                }
            }
            return eijr.c;
        }
        return eijr.c;
    }

    public final gmcd b() {
        return glzd.f(this.e.a(), new eijm(), gmap.a);
    }

    public final gmcd c(boolean z) {
        hrtd.ay();
        eijp eijp0 = new eijp(z);
        gmcd gmcd0 = this.e.b(eijp0, gmap.a);
        gmbu.t(gmcd0, new eijq(this), this.d);
        return gmcd0;
    }

    public final Long d() {
        try {
            return (Long)((glyq)glzd.f(this.b.a(), new eijo(), gmap.a)).v(500L, TimeUnit.MILLISECONDS);
        }
        catch(ExecutionException | InterruptedException | TimeoutException unused_ex) {
            return (long)-1L;
        }
    }
}

