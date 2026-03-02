import android.content.Context;
import java.util.ArrayList;
import java.util.List;

public final class crya {
    private static final bboh a;

    static {
        crya.a = bboh.b("MobileDataPlan", bbcu.ck);
    }

    public static boolean a(Context context0, Integer integer0) {
        hhcr hhcr3;
        hfys hfys3;
        if(!hvjw.i()) {
            ((ggtj)crya.a.j()).x("CONSENT_STATUS_CONVERSION_FAILURE_FLAG_DISABLED. Consent status conversion");
            crxn.c().l(hhct.cB, integer0);
            return true;
        }
        if(csli.c(context0) == null) {
            crxn.c().l(hhct.cF, integer0);
            return true;
        }
        crvw crvw0 = crvw.c();
        hfys hfys0 = crvw0.l();
        if(hfys0 != null) {
            crxn crxn0 = crxn.c();
            hhcr hhcr0 = hhcr.b(hfys0.g) == null ? hhcr.k : hhcr.b(hfys0.g);
            crxn0.m(hhct.cy, ggna.a, hhcr0, integer0);
            return true;
        }
        List list0 = csli.A(context0, 2);
        if(!list0.isEmpty()) {
            hfuo hfuo0 = hvjw.a.e().d().b;
            ArrayList arrayList0 = new ArrayList();
            Object object0 = null;
            hfys hfys1 = null;
            boolean z = false;
            for(Object object1: list0) {
                cslv cslv0 = (cslv)object1;
                String s = cslv0.b;
                if(hfuo0.contains(s)) {
                    arrayList0.add(new cslv(cslv0.a, s, cslv0.c, cslv0.d, null, null, null, -1, null, null));
                    z = true;
                }
                else {
                    String s1 = cslv0.a;
                    hfys hfys2 = crvw0.j(s1);
                    if(hfys2 == null) {
                        hfys3 = hfys1;
                    }
                    else {
                        hhcr hhcr1 = hhcr.b(hfys2.g) == null ? hhcr.k : hhcr.b(hfys2.g);
                        if(hhcr.a.equals(hhcr1)) {
                            hfys3 = hfys1;
                        }
                        else {
                            hhcr hhcr2 = hhcr.b(hfys2.g) == null ? hhcr.k : hhcr.b(hfys2.g);
                            hfys3 = hfys1;
                            arrayList0.add(new cslv(s1, s, cslv0.c, cslv0.d, hhcr2, ((long)hfys2.h), null, -1, null, null));
                            if(hfys3 == null || hfys2.h > hfys3.h) {
                                object0 = hhcr.b(hfys2.g) == null ? hhcr.k : hhcr.b(hfys2.g);
                                hfys1 = hfys2;
                                continue;
                            }
                        }
                    }
                    hfys1 = hfys3;
                }
            }
            if(hhcr.e.equals(object0)) {
                hhcr3 = hhcr.g;
            }
            else if(hhcr.d.equals(object0) || hhcr.b.equals(object0)) {
                hhcr3 = hhcr.i;
            }
            else if(hhcr.c.equals(object0) || hhcr.f.equals(object0)) {
                hhcr3 = hhcr.j;
            }
            else if(z) {
                hhcr3 = hhcr.i;
            }
            else {
                hhcr3 = hhcr.g;
            }
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hfys.a).v_newBuilder();
            String s2 = crwm.c().b((hhcr.i == hhcr3 || hhcr.j == hhcr3 ? "AIzaSyAxmTFlJLw9-uEJ1pFJUzw8LX7veGxGUoI" : "AIzaSyDjSMHkZSQWmcCKsNnvZcjRc2ZaJbAXpR4")).c;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            ((hfys)hftv0).d = s2;
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            hfys hfys4 = (hfys)hftp0.b_message;
            hfys4.g = hhcr3.a();
            if(!crvw0.A(((hfys)hftp0.N_build()))) {
                ((ggtj)crya.a.j()).x("FAILURE_SAVING_DEVICE_CONSENT_STATUS. Consent status conversion");
                crxn.c().m(hhct.cA, arrayList0, hhcr3, integer0);
                return false;
            }
            crxn.c().m(hhct.cz, arrayList0, hhcr3, integer0);
            return true;
        }
        ((ggtj)crya.a.j()).x("FAILURE_NO_SIM_CARDS. Consent status conversion");
        crxn.c().l(hhct.cD, integer0);
        return true;
    }

    public static boolean b(Context context0) {
        if(!hvjw.i()) {
            return false;
        }
        return crvw.c().l() == null ? !csli.A(context0, 2).isEmpty() : false;
    }
}

