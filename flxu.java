import com.google.android.libraries.messaging.lighter.model.AccountContext;
import java.util.List;
import java.util.UUID;

public final class flxu implements flzo {
    private final AccountContext a;
    private final List b;

    public flxu(AccountContext accountContext0, List list0) {
        this.a = accountContext0;
        this.b = list0;
    }

    @Override  // flzo
    public final gmcd a(hnxl hnxl0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hnvv.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hnvv hnvv0 = (hnvv)hftp0.b_message;
        hnxl0.getClass();
        hnvv0.c = hnxl0;
        hnvv0.b |= 1;
        AccountContext accountContext0 = this.a;
        ggdy ggdy0 = new ggdy();
        for(Object object0: this.b) {
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hnxk.a).v_newBuilder();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            hnxk hnxk0 = (hnxk)hftp1.b_message;
            ((String)object0).getClass();
            hnxk0.c = (String)object0;
            hnxb hnxb0 = flwu.c(accountContext0.c().f());
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            hnxk hnxk1 = (hnxk)hftp1.b_message;
            hnxb0.getClass();
            hnxk1.d = hnxb0;
            hnxk1.b |= 1;
            ggdy0.i(((hnxk)hftp1.N_build()));
        }
        gged_interceptors gged0 = ggdy0.h();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hnvv hnvv1 = (hnvv)hftp0.b_message;
        hfuo hfuo0 = hnvv1.d;
        if(!hfuo0.c()) {
            hnvv1.d = ProtoLiteMessage.E(hfuo0);
        }
        hfrj.E(gged0, hnvv1.d);
        return gmbu.i(((hnvv)hftp0.N_build()));
    }

    @Override  // flzo
    public final gmcd b(gmcd gmcd0, Object object0) {
        return glzd.g(gmcd0, new flxt(((hnvv)object0)), gmap.a);
    }

    @Override  // flzo
    public final Object c(Object object0) {
        hnvw hnvw0 = (hnvw)object0;
        return null;
    }

    @Override  // flzo
    public final void d(UUID uUID0, int v, iapk iapk0, flsl flsl0, long v1) {
        fmai fmai0 = fmaj.a();
        fmai0.g(10003);
        fmai0.n(this.a.c().f());
        fmai0.o(this.a.d().toStringUtf8());
        fmai0.p(uUID0.toString());
        fmai0.j(13);
        fmai0.m(Integer.valueOf(iapk0.t.r));
        fmai0.f(v);
        fmai0.e(v1);
        flsl0.b(fmai0.a());
    }

    @Override  // flzo
    public final void e(UUID uUID0, Object object0, flsl flsl0, long v) {
        Void void0 = (Void)object0;
        fmai fmai0 = fmaj.a();
        fmai0.g(10003);
        fmai0.n(this.a.c().f());
        fmai0.o(this.a.d().toStringUtf8());
        fmai0.p(uUID0.toString());
        fmai0.j(13);
        fmai0.f(1);
        fmai0.e(v);
        flsl0.b(fmai0.a());
    }
}

