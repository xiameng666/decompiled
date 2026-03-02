import android.accounts.Account;
import android.net.Uri;
import com.google.android.gms.chimera.modules.tapandpay.AppContextProvider;
import java.util.List;

public final class dyav {
    public static final dxxo a;
    private final Account b;
    private final String c;
    private gfsx d;

    static {
        dyav.a = new dxxo();
    }

    public dyav(Account account0, String s) {
        this.d = gfqx.a;
        this.b = account0;
        this.c = s;
    }

    static gged_interceptors a(List list0) {
        int v;
        ggdy ggdy0 = new ggdy();
        for(Object object0: list0) {
            dydu dydu0 = (dydu)object0;
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gveb.a).v_newBuilder();
            switch((dydt.b(dydu0.d) == 0 ? 1 : dydt.b(dydu0.d)) - 2) {
                case 1: {
                    v = 3;
                    break;
                }
                case 2: {
                    v = 4;
                    break;
                }
                case 3: {
                    v = 5;
                    break;
                }
                case 5: {
                    v = 7;
                    break;
                }
                default: {
                    v = 2;
                }
            }
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gveb)hftp0.b_message).d = v - 2;
            int v1 = dydu0.d;
            if(dydt.b(v1) == 3 && dydu0.b == 2) {
                dydp dydp0 = (dydp)dydu0.c;
                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gvdy.a).v_newBuilder();
                String s = dydp0.c;
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ProtoLiteMessage hftv0 = hftp1.b_message;
                s.getClass();
                ((gvdy)hftv0).b |= 1;
                ((gvdy)hftv0).c = s;
                long v2 = dydp0.d;
                if(!hftv0.isImmutable()) {
                    hftp1.ensureMutable();
                }
                gvdy gvdy0 = (gvdy)hftp1.b_message;
                gvdy0.b |= 2;
                gvdy0.d = v2;
                gvdy gvdy1 = (gvdy)hftp1.N_build();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gveb gveb0 = (gveb)hftp0.b_message;
                gvdy1.getClass();
                gveb0.c = gvdy1;
                gveb0.b = 2;
            }
            else if(dydt.b(v1) == 4 && dydu0.b == 3) {
                dydr dydr0 = (dydr)dydu0.c;
                ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gvdz.a).v_newBuilder();
                String s1 = dydr0.c;
                if(!hftp2.b_message.isImmutable()) {
                    hftp2.ensureMutable();
                }
                gvdz gvdz0 = (gvdz)hftp2.b_message;
                s1.getClass();
                gvdz0.b |= 1;
                gvdz0.c = s1;
                guvs guvs0 = (guvs)dyav.a.ic().kt((dydq.b(dydr0.d) == null ? dydq.c : dydq.b(dydr0.d)));
                if(!hftp2.b_message.isImmutable()) {
                    hftp2.ensureMutable();
                }
                gvdz gvdz1 = (gvdz)hftp2.b_message;
                gvdz1.d = guvs0.a();
                gvdz1.b |= 2;
                gvdz gvdz2 = (gvdz)hftp2.N_build();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gveb gveb1 = (gveb)hftp0.b_message;
                gvdz2.getClass();
                gveb1.c = gvdz2;
                gveb1.b = 3;
            }
            else if(dydt.b(v1) == 5 && dydu0.b == 4) {
                dydo dydo0 = (dydo)dydu0.c;
                ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)gvdx.a).v_newBuilder();
                String s2 = dydo0.c;
                if(!hftp3.b_message.isImmutable()) {
                    hftp3.ensureMutable();
                }
                ProtoLiteMessage hftv1 = hftp3.b_message;
                s2.getClass();
                ((gvdx)hftv1).b |= 1;
                ((gvdx)hftv1).c = s2;
                hfuo hfuo0 = dydo0.d;
                if(!hftv1.isImmutable()) {
                    hftp3.ensureMutable();
                }
                gvdx gvdx0 = (gvdx)hftp3.b_message;
                hfuo hfuo1 = gvdx0.d;
                if(!hfuo1.c()) {
                    gvdx0.d = ProtoLiteMessage.E(hfuo1);
                }
                hfrj.E(hfuo0, gvdx0.d);
                gvdx gvdx1 = (gvdx)hftp3.N_build();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gveb gveb2 = (gveb)hftp0.b_message;
                gvdx1.getClass();
                gveb2.c = gvdx1;
                gveb2.b = 4;
            }
            else {
                if(dydt.b(v1) == 6 && dydu0.b == 5) {
                    continue;
                }
                if(dydt.b(v1) == 7 && dydu0.b == 6) {
                    ProtoLiteBuilder hftp4 = ((ProtoLiteMessage)gvea.a).v_newBuilder();
                    String s3 = (dydu0.b == 6 ? ((dyds)dydu0.c) : dyds.a).c;
                    if(!hftp4.b_message.isImmutable()) {
                        hftp4.ensureMutable();
                    }
                    gvea gvea0 = (gvea)hftp4.b_message;
                    s3.getClass();
                    gvea0.b |= 1;
                    gvea0.c = s3;
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    gveb gveb3 = (gveb)hftp0.b_message;
                    gvea gvea1 = (gvea)hftp4.N_build();
                    gvea1.getClass();
                    gveb3.c = gvea1;
                    gveb3.b = 6;
                }
            }
            ggdy0.i(((gveb)hftp0.N_build()));
        }
        return ggdy0.h();
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
            frce0.e("recentuseraction/" + this.c + ".pb");
            Uri uri0 = frce0.a();
            frie frie0 = frif.a();
            frie0.f(uri0);
            frie0.e(((MessageLite)dydv.a));
            frie0.h(new frjp(cjtd.a));
            frif frif0 = frie0.a();
            gfsx gfsx0 = gfsx.m(cjtb.a.a(frif0));
            this.d = gfsx0;
            frli1 = (frli)gfsx0.d();
        }
        return frli1;
    }
}

