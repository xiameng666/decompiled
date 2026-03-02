import android.util.Pair;
import j..util.Optional;

public final class ebsd implements evpo {
    public final String a;
    public final ebsf b;
    public final dyna c;

    public ebsd(String s, ebsf ebsf0, dyna dyna0) {
        this.a = s;
        this.b = ebsf0;
        this.c = dyna0;
    }

    @Override  // evpo
    public final Object a(evql evql0) {
        String s = this.a;
        dyna dyna0 = this.c;
        if(!evql0.n()) {
            a.e(ebsf.a.i(), "Download card %s failed", s, evql0.i());
            dyfn dyfn0 = dyfm.a(((ProtoLiteMessage)dyfk.a).v_newBuilder());
            dyfn0.b(s);
            dyfn0.c(dyna0);
            dyfn0.d(dyfj.c);
            return dyfn0.a();
        }
        Object object0 = (dyfk)((Pair)evql0.j()).first;
        Optional optional0 = (Optional)((Pair)evql0.j()).second;
        if((dyfj.b(object0.e) == null ? dyfj.j : dyfj.b(object0.e)).equals(dyfj.b) && optional0.isPresent()) {
            dykv dykv0 = ((dyhj)optional0.get()).c;
            if(dykv0 == null) {
                dykv0 = dykv.a;
            }
            ebsf ebsf0 = this.b;
            ibuq.e(dykv0, "getSeMfiPrepaidPaymentMethod(...)");
            dyth dyth0 = ebsf0.j;
            if(dyth0 == null) {
                ibuq.j("sePrepaidCardTosStateManager");
                dyth0 = null;
            }
            dyib dyib0 = dykv0.d == null ? dyib.a : dykv0.d;
            if(!dyth0.a((dyna.b(dyib0.b) == null ? dyna.k : dyna.b(dyib0.b)), ibpo.b((dykv0.c == null ? dylc.a : dykv0.c).d), null)) {
                goto label_28;
            }
            dyib dyib1 = dykv0.d == null ? dyib.a : dykv0.d;
            ibuq.e(dyib1, "getMfiCardInfo(...)");
            if(ibuq.m((ebsf0.b.b == 3 ? ((dyff)ebsf0.b.c) : dyff.a).d, s) && dyia.a(dyib1.h) != 5) {
                ebsf0.c().l(dyib1.c).A(new ebrx());
                return object0;
            label_28:
                ebsf0.p(12, dyna0);
                dyfn dyfn1 = dyfm.a(((ProtoLiteMessage)dyfk.a).v_newBuilder());
                String s1 = object0.c;
                ibuq.e(s1, "getCid(...)");
                dyfn1.b(s1);
                dyfn1.c(dyna0);
                dyfn1.d(dyfj.c);
                return dyfn1.a();
            }
        }
        return object0;
    }
}

