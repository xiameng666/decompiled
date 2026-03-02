import android.accounts.Account;
import com.google.android.gms.common.api.Status;

public final class ebxr implements ibts {
    public final ebxx a;
    public final dylc b;

    public ebxr(ebxx ebxx0, dylc dylc0) {
        this.a = ebxx0;
        this.b = dylc0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        Void void0 = (Void)object0;
        ebxx ebxx0 = this.a;
        dxzq dxzq0 = ebxx0.k;
        String s = null;
        if(dxzq0 == null) {
            ibuq.j("octopusAppStatusDataStoreProvider");
            dxzq0 = null;
        }
        Account account0 = ebxx0.f;
        if(account0 == null) {
            ibuq.j("account");
            account0 = null;
        }
        String s1 = ebxx0.g;
        if(s1 == null) {
            ibuq.j("environment");
        }
        else {
            s = s1;
        }
        ((glyq)dxzq0.a(account0, s).b(new ebxv(new ebxu()), ebxx0.b())).u();
        dyra dyra0 = ebxx0.a();
        dyju dyju0 = ebxx0.b.b == 12 ? ((dyju)ebxx0.b.c) : dyju.a;
        gurm gurm0 = gurm.b(dyju0.e) == null ? gurm.n : gurm.b(dyju0.e);
        dylc dylc0 = this.b;
        ibuq.e(gurm0, "getOrigin(...)");
        ibuq.f(dylc0, "cardData");
        ibuq.f(gurm0, "origin");
        dypo dypo0 = dyra0.c;
        if(dypo0.n(dylc0)) {
            dyra0.n();
        }
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)dylb.a).v_newBuilder();
        ibuq.f(hftp0, "builder");
        ibuq.f(gurm0, "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        dylb dylb0 = (dylb)hftp0.b_message;
        dylb0.d = gurm0.a();
        hfwn hfwn0 = hfyn.h(System.currentTimeMillis());
        ibuq.e(hfwn0, "fromMillis(...)");
        ibuq.f(hfwn0, "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        dylb dylb1 = (dylb)hftp0.b_message;
        hfwn0.getClass();
        dylb1.c = hfwn0;
        dylb1.b |= 1;
        ProtoLiteMessage hftv0 = hftp0.N_build();
        ibuq.e(hftv0, "build(...)");
        dypo0.k(dylc0, ((dylb)hftv0));
        dyqp dyqp0 = new dyqp(new dyqo());
        ((glyq)dyra0.j.b(dyqp0, dyra0.g)).u();
        ebxx0.a().f(dylc0).v(ebxx0.b(), new ebxw());
        dyga dyga0 = dyfz.a(((ProtoLiteMessage)dyfy.a).v_newBuilder());
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)dyjv.a).v_newBuilder();
        ibuq.f(hftp1, "builder");
        ProtoLiteMessage hftv1 = hftp1.N_build();
        ibuq.e(hftv1, "build(...)");
        ibuq.f(((dyjv)hftv1), "value");
        ProtoLiteBuilder hftp2 = dyga0.a;
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        dyfy dyfy0 = (dyfy)hftp2.b_message;
        ((dyjv)hftv1).getClass();
        dyfy0.c = (dyjv)hftv1;
        dyfy0.b = 11;
        byte[] arr_b = dyga0.a().toBytesArray();
        ebxx0.c.b(Status.b, arr_b);
        return ibom.a;
    }
}

