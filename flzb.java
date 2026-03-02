import android.content.Context;
import com.google.android.libraries.messaging.lighter.model.AccountContext;
import java.util.List;
import java.util.UUID;

public final class flzb implements flzo {
    private final Context a;
    private final AccountContext b;
    private final flce c;

    public flzb(Context context0, AccountContext accountContext0, flce flce0) {
        this.a = context0;
        this.b = accountContext0;
        this.c = flce0;
    }

    @Override  // flzo
    public final gmcd a(hnxl hnxl0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hnqj.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        hnxl0.getClass();
        ((hnqj)hftv0).c = hnxl0;
        ((hnqj)hftv0).b |= 1;
        ByteString hfsf0 = this.b.d();
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hnqj)hftp0.b_message).d = hfsf0;
        List list0 = this.c.a();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hnqj hnqj0 = (hnqj)hftp0.b_message;
        hfuf hfuf0 = hnqj0.e;
        if(!hfuf0.c()) {
            hnqj0.e = ProtoLiteMessage.C(hfuf0);
        }
        ggqk ggqk0 = ((gged_interceptors)list0).E();
        while(ggqk0.hasNext()) {
            Object object0 = ggqk0.next();
            hnqj0.e.i(((Integer)object0).intValue());
        }
        String s = flbi.a(this.a);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hnqj hnqj1 = (hnqj)hftp0.b_message;
        s.getClass();
        hnqj1.f = s;
        return gmbu.i(((hnqj)hftp0.N_build()));
    }

    @Override  // flzo
    public final gmcd b(gmcd gmcd0, Object object0) {
        return glzd.g(gmcd0, new flza(((hnqj)object0)), gmap.a);
    }

    @Override  // flzo
    public final Object c(Object object0) {
        hnqk hnqk0 = (hnqk)object0;
        return null;
    }

    @Override  // flzo
    public final void d(UUID uUID0, int v, iapk iapk0, flsl flsl0, long v1) {
        fmai fmai0 = fmaj.a();
        fmai0.g(10003);
        fmai0.n(this.b.c().f());
        fmai0.o(this.b.d().toStringUtf8());
        fmai0.p(uUID0.toString());
        fmai0.j(20);
        fmai0.f(v);
        fmai0.m(Integer.valueOf(iapk0.t.r));
        fmai0.e(v1);
        flsl0.b(fmai0.a());
    }

    @Override  // flzo
    public final void e(UUID uUID0, Object object0, flsl flsl0, long v) {
        Void void0 = (Void)object0;
        fmai fmai0 = fmaj.a();
        fmai0.g(10003);
        fmai0.n(this.b.c().f());
        fmai0.o(this.b.d().toStringUtf8());
        fmai0.p(uUID0.toString());
        fmai0.j(20);
        fmai0.f(1);
        fmai0.e(v);
        flsl0.b(fmai0.a());
    }
}

