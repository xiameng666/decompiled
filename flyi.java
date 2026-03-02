import android.text.TextUtils;
import com.google.android.libraries.messaging.lighter.model.AccountContext;
import java.util.UUID;

public final class flyi implements flzo {
    public final AccountContext a;
    private final int b;
    private final String c;

    public flyi(AccountContext accountContext0, int v, String s) {
        this.a = accountContext0;
        this.b = v;
        this.c = s;
    }

    @Override  // flzo
    public final gmcd a(hnxl hnxl0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hnqc.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        hnxl0.getClass();
        ((hnqc)hftv0).c = hnxl0;
        ((hnqc)hftv0).b |= 1;
        int v = this.b;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hnqc)hftp0.b_message).d = v;
        String s = this.c;
        if(!TextUtils.isEmpty(s)) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hnqc hnqc0 = (hnqc)hftp0.b_message;
            s.getClass();
            hnqc0.e = s;
        }
        return gmbu.i(((hnqc)hftp0.N_build()));
    }

    @Override  // flzo
    public final gmcd b(gmcd gmcd0, Object object0) {
        return glzd.g(gmcd0, new flyh(((hnqc)object0)), gmap.a);
    }

    @Override  // flzo
    public final Object c(Object object0) {
        hnqd hnqd0 = (hnqd)object0;
        flbt flbt0 = new flbt();
        flbt0.c(hnqd0.c);
        flbt0.b(gged_interceptors.i(ggia.h(hnqd0.b, new flyg(this))));
        return flbt0.a();
    }

    @Override  // flzo
    public final void d(UUID uUID0, int v, iapk iapk0, flsl flsl0, long v1) {
        fmai fmai0 = fmaj.a();
        fmai0.g(10003);
        fmai0.n(this.a.c().f());
        fmai0.o(this.a.d().toStringUtf8());
        fmai0.p(uUID0.toString());
        fmai0.j(8);
        fmai0.f(v);
        fmai0.m(Integer.valueOf(iapk0.t.r));
        fmai0.e(v1);
        flsl0.b(fmai0.a());
    }

    @Override  // flzo
    public final void e(UUID uUID0, Object object0, flsl flsl0, long v) {
        flbu flbu0 = (flbu)object0;
        fmai fmai0 = fmaj.a();
        fmai0.g(10003);
        fmai0.n(this.a.c().f());
        fmai0.o(this.a.d().toStringUtf8());
        fmai0.p(uUID0.toString());
        fmai0.j(8);
        fmai0.f(1);
        fmai0.e(v);
        flsl0.b(fmai0.a());
    }
}

