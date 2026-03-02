import android.content.Context;
import com.google.android.libraries.messaging.lighter.model.AccountContext;
import java.util.Map;
import java.util.UUID;

public final class flyp implements flzo {
    private final AccountContext a;
    private final int b;
    private final gged_interceptors c;
    private final String d;
    private final Context e;
    private final Map f;
    private final flsl g;

    public flyp(AccountContext accountContext0, int v, String s, gged_interceptors gged0, Context context0, Map map0, flsl flsl0) {
        this.a = accountContext0;
        this.b = v;
        this.c = gged0;
        this.d = s;
        this.e = context0;
        this.f = map0;
        this.g = flsl0;
    }

    @Override  // flzo
    public final gmcd a(hnxl hnxl0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hnrf.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hnrf hnrf0 = (hnrf)hftp0.b_message;
        hnxl0.getClass();
        hnrf0.c = hnxl0;
        hnrf0.b |= 1;
        flyn flyn0 = new flyn();
        gged_interceptors gged0 = flbp.c(this.c, flyn0);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hnrf hnrf1 = (hnrf)hftp0.b_message;
        hfuo hfuo0 = hnrf1.d;
        if(!hfuo0.c()) {
            hnrf1.d = ProtoLiteMessage.E(hfuo0);
        }
        hfrj.E(gged0, hnrf1.d);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((hnrf)hftv0).e = 0L;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((hnrf)hftv1).f = 0L;
        int v = this.b;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp0.b_message;
        ((hnrf)hftv2).g = v;
        String s = this.d;
        if(s != null) {
            if(!hftv2.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((hnrf)hftp0.b_message).h = s;
        }
        return gmbu.i(((hnrf)hftp0.N_build()));
    }

    @Override  // flzo
    public final gmcd b(gmcd gmcd0, Object object0) {
        return glzd.g(gmcd0, new flyo(((hnrf)object0)), gmap.a);
    }

    @Override  // flzo
    public final Object c(Object object0) {
        ggdy ggdy0 = new ggdy();
        for(Object object1: ((hnrg)object0).b) {
            gfsx gfsx0 = flww.a(((hnqr)object1), this.a, this.e, this.f, this.g);
            if(gfsx0.i()) {
                ggdy0.i(gfsx0.d());
            }
        }
        gged_interceptors gged0 = ggdy0.h();
        if(gged0 == null) {
            throw new NullPointerException("Null messages");
        }
        String s = ((hnrg)object0).c;
        if(s != null) {
            return new flkm(s, gged0);
        }
        throw new NullPointerException("Null nextPageToken");
    }

    @Override  // flzo
    public final void d(UUID uUID0, int v, iapk iapk0, flsl flsl0, long v1) {
        fmai fmai0 = fmaj.a();
        fmai0.g(10003);
        fmai0.n(this.a.c().f());
        fmai0.o(this.a.d().toStringUtf8());
        fmai0.p(uUID0.toString());
        fmai0.j(26);
        fmai0.m(Integer.valueOf(iapk0.t.r));
        fmai0.f(v);
        fmai0.e(v1);
        flsl0.b(fmai0.a());
    }

    @Override  // flzo
    public final void e(UUID uUID0, Object object0, flsl flsl0, long v) {
        flkm flkm0 = (flkm)object0;
        fmai fmai0 = fmaj.a();
        fmai0.g(10003);
        fmai0.n(this.a.c().f());
        fmai0.o(this.a.d().toStringUtf8());
        fmai0.p(uUID0.toString());
        fmai0.j(26);
        fmai0.f(1);
        fmai0.e(v);
        flsl0.b(fmai0.a());
    }
}

