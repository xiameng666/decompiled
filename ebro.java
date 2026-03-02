import java.util.Iterator;

public final class ebro implements evpz {
    public final ebsf a;
    public final dyfk b;
    public final int c;
    public final Iterator d;
    public final evqp e;

    public ebro(ebsf ebsf0, dyfk dyfk0, int v, Iterator iterator0, evqp evqp0) {
        this.a = ebsf0;
        this.b = dyfk0;
        this.c = v;
        this.d = iterator0;
        this.e = evqp0;
    }

    @Override  // evpz
    public final void hF(evql evql0) {
        ebsf ebsf0 = this.a;
        Iterator iterator0 = this.d;
        dyfk dyfk0 = this.b;
        evqp evqp0 = this.e;
        if(evql0.n() && ((Boolean)evql0.j()).booleanValue()) {
            dyna dyna0 = dyna.b(dyfk0.f) == null ? dyna.k : dyna.b(dyfk0.f);
            ibuq.e(dyna0, "getServiceProvider(...)");
            String s = dyfk0.c;
            ibuq.e(s, "getCid(...)");
            ebsf0.h(dyna0, s).f(ebsf0.k(), new ebrz(ebsf0, iterator0, dyfk0)).s(ebsf0.k(), new ebsa(evqp0));
            return;
        }
        int v = this.c;
        if(((long)v) >= hwsd.D()) {
            dyfn dyfn0 = dyfm.a(((ProtoLiteMessage)dyfk.a).v_newBuilder());
            String s1 = dyfk0.c;
            ibuq.e(s1, "getCid(...)");
            dyfn0.b(s1);
            dyna dyna1 = dyna.b(dyfk0.f) == null ? dyna.k : dyna.b(dyfk0.f);
            ibuq.e(dyna1, "getServiceProvider(...)");
            dyfn0.c(dyna1);
            dyfn0.d(dyfj.c);
            ebsf0.o(dyfn0.a(), iterator0);
            dyff dyff0 = ebsf0.b.b == 3 ? ((dyff)ebsf0.b.c) : dyff.a;
            if((dyfe.b(dyff0.e) == null ? dyfe.d : dyfe.b(dyff0.e)) == dyfe.b) {
                ebwn ebwn0 = ebsf0.g();
                ibuq.e("Your transit card could not be added", "getString(...)");
                ebwn.e(ebwn0, "Your transit card could not be added");
            }
            evqp0.c(null);
            return;
        }
        ebsf0.n(dyfk0, iterator0, evqp0, v + 1);
    }
}

