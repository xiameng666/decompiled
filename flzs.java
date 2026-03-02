import com.google.android.libraries.messaging.lighter.model.AccountContext;
import java.util.UUID;

public final class flzs implements flzo {
    private final AccountContext a;

    public flzs(AccountContext accountContext0) {
        this.a = accountContext0;
    }

    @Override  // flzo
    public final gmcd a(hnxl hnxl0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hnwv.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hnwv hnwv0 = (hnwv)hftp0.b_message;
        hnxl0.getClass();
        hnwv0.c = hnxl0;
        hnwv0.b |= 1;
        return gmbu.i(((hnwv)hftp0.N_build()));
    }

    @Override  // flzo
    public final gmcd b(gmcd gmcd0, Object object0) {
        return glzd.g(gmcd0, new flzr(((hnwv)object0)), gmap.a);
    }

    @Override  // flzo
    public final Object c(Object object0) {
        hnww hnww0 = (hnww)object0;
        return new flcc(1);
    }

    @Override  // flzo
    public final void d(UUID uUID0, int v, iapk iapk0, flsl flsl0, long v1) {
        fmai fmai0 = fmaj.a();
        fmai0.g(10003);
        fmai0.n(this.a.c().f());
        fmai0.o(this.a.d().toStringUtf8());
        fmai0.p(uUID0.toString());
        fmai0.j(4);
        fmai0.m(Integer.valueOf(iapk0.t.r));
        fmai0.f(v);
        fmai0.e(v1);
        flsl0.b(fmai0.a());
    }

    @Override  // flzo
    public final void e(UUID uUID0, Object object0, flsl flsl0, long v) {
        flcc flcc0 = (flcc)object0;
        fmai fmai0 = fmaj.a();
        fmai0.g(10003);
        fmai0.n(this.a.c().f());
        fmai0.o(this.a.d().toStringUtf8());
        fmai0.p(uUID0.toString());
        fmai0.j(4);
        fmai0.f(1);
        fmai0.e(v);
        flsl0.b(fmai0.a());
    }
}

