import com.google.android.libraries.messaging.lighter.model.AccountContext;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

public final class fmaf implements flzo {
    private final AccountContext a;
    private final String b;
    private final fmga c;

    public fmaf(AccountContext accountContext0, String s, fmga fmga0) {
        this.a = accountContext0;
        this.b = s;
        this.c = fmga0;
    }

    @Override  // flzo
    public final gmcd a(hnxl hnxl0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hnpj.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        hnxl0.getClass();
        ((hnpj)hftv0).c = hnxl0;
        ((hnpj)hftv0).b |= 1;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hnpj)hftp0.b_message).d = 1;
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hnpi.a).v_newBuilder();
        String s = this.b;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        hnpi hnpi0 = (hnpi)hftp1.b_message;
        hnpi0.b = 1;
        hnpi0.c = s;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hnpj hnpj0 = (hnpj)hftp0.b_message;
        hnpi hnpi1 = (hnpi)hftp1.N_build();
        hnpi1.getClass();
        hnpj0.e = hnpi1;
        hnpj0.b |= 2;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hnpj)hftp0.b_message).f = 3;
        return gmbu.i(((hnpj)hftp0.N_build()));
    }

    @Override  // flzo
    public final gmcd b(gmcd gmcd0, Object object0) {
        return glzd.g(gmcd0, new fmae(((hnpj)object0)), gmap.a);
    }

    @Override  // flzo
    public final Object c(Object object0) {
        fmag fmag0 = new fmag(null);
        hnph hnph0 = ((hnpk)object0).b;
        if(hnph0 == null) {
            hnph0 = hnph.a;
        }
        fmag0.h((hnph0.b == 1 ? ((hnpl)hnph0.c) : hnpl.a).b);
        hnph hnph1 = ((hnpk)object0).b;
        if(hnph1 == null) {
            hnph1 = hnph.a;
        }
        fmag0.c((hnph1.b == 1 ? ((hnpl)hnph1.c) : hnpl.a).c);
        hnph hnph2 = ((hnpk)object0).b;
        if(hnph2 == null) {
            hnph2 = hnph.a;
        }
        fmag0.f((hnph2.b == 1 ? ((hnpl)hnph2.c) : hnpl.a).d);
        hnph hnph3 = ((hnpk)object0).b;
        if(hnph3 == null) {
            hnph3 = hnph.a;
        }
        fmag0.d((hnph3.b == 1 ? ((hnpl)hnph3.c) : hnpl.a).e);
        hnph hnph4 = ((hnpk)object0).b;
        if(hnph4 == null) {
            hnph4 = hnph.a;
        }
        fmag0.b((hnph4.b == 1 ? ((hnpl)hnph4.c) : hnpl.a).f);
        fmga fmga0 = this.c;
        fmag0.g(flzv.b(fmga0));
        if(iaea.n()) {
            flba.a();
            fmag0.e(System.currentTimeMillis() + TimeUnit.DAYS.toMillis(29L));
        }
        String s = fmga0.a;
        if(s != null) {
            return new fmaa(s, fmag0.a());
        }
        throw new NullPointerException("Null messageId");
    }

    @Override  // flzo
    public final void d(UUID uUID0, int v, iapk iapk0, flsl flsl0, long v1) {
        fmai fmai0 = fmaj.a();
        fmai0.g(10003);
        fmai0.n(this.a.c().f());
        fmai0.o(this.a.d().toStringUtf8());
        fmai0.p(uUID0.toString());
        fmai0.j(88);
        fmai0.m(Integer.valueOf(iapk0.t.r));
        fmai0.f(v);
        fmai0.e(v1);
        flsl0.b(fmai0.a());
    }

    @Override  // flzo
    public final void e(UUID uUID0, Object object0, flsl flsl0, long v) {
        fmaa fmaa0 = (fmaa)object0;
        fmai fmai0 = fmaj.a();
        fmai0.g(10003);
        fmai0.n(this.a.c().f());
        fmai0.o(this.a.d().toStringUtf8());
        fmai0.p(uUID0.toString());
        fmai0.j(88);
        fmai0.f(1);
        fmai0.e(v);
        flsl0.b(fmai0.a());
    }
}

