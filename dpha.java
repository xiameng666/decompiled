import android.content.Context;
import dagger.internal.DoubleCheck;
import dagger.internal.Provider;
import j..util.DesugarCollections;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class dpha {
    public final cjpc a;
    public final frli b;

    public dpha(Context context0, String s, frii frii0) {
        frie frie0 = frif.a();
        frce frce0 = new frce(context0);
        frce0.d("pay");
        frce0.e(a.a(s, "mse/", "/index.pb"));
        frie0.f(frce0.a());
        frie0.e(((MessageLite)dpef.a));
        this.b = frii0.a(frie0.a());
        this.a = cjqh.a(context0, "pay", "mse_synthetic_ids_" + s, 0);
    }

    public final dped a(long v) {
        dped dped0 = (dped)((dpef)dpha.c(this.b.a())).b.get(Long.valueOf(v));
        return dped0 == null ? dped.a : dped0;
    }

    public static dpha b() {
        Provider provider0 = DoubleCheck.b(cjsr.a);
        return new dpha(dlnj.a(), dmgy.a(), ((frii)provider0.get()));
    }

    public static Object c(gmcd gmcd0) {
        try {
            return gmcd0.get(10L, TimeUnit.SECONDS);
        }
        catch(ExecutionException executionException0) {
            throw new cjuh(8, "Could not read/write MSE index data", null, executionException0);
        }
        catch(InterruptedException interruptedException0) {
            throw new cjuh(14, "Could not read/write MSE index data", null, interruptedException0);
        }
        catch(TimeoutException timeoutException0) {
            throw new cjuh(15, "Could not read/write MSE index data", null, timeoutException0);
        }
    }

    public final Map d() {
        return DesugarCollections.unmodifiableMap(((dpef)dpha.c(this.b.a())).b);
    }

    public final void e(long v) {
        this.g(new dpgr(v));
    }

    public final void f(long v, String s, String s1, long v1, boolean z, String s2) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)dped.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        s1.getClass();
        ((dped)hftv0).c = s1;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        s.getClass();
        ((dped)hftv1).b = s;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp0.b_message;
        ((dped)hftv2).d = v1;
        if(!hftv2.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv3 = hftp0.b_message;
        ((dped)hftv3).e = z;
        if(!hftv3.isImmutable()) {
            hftp0.ensureMutable();
        }
        dped dped0 = (dped)hftp0.b_message;
        s2.getClass();
        dped0.f = s2;
        this.g(new dpgy(v, ((dped)hftp0.N_build())));
    }

    public final void g(gfsi gfsi0) {
        dpha.c(this.b.b(gfsi0, gmap.a));
    }
}

