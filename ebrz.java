import java.util.Iterator;

public final class ebrz implements evpo {
    public final ebsf a;
    public final Iterator b;
    public final dyfk c;

    public ebrz(ebsf ebsf0, Iterator iterator0, dyfk dyfk0) {
        this.a = ebsf0;
        this.b = iterator0;
        this.c = dyfk0;
    }

    @Override  // evpo
    public final Object a(evql evql0) {
        dyfk dyfk0;
        ebsf ebsf0 = this.a;
        Iterator iterator0 = this.b;
        if(evql0.n()) {
            dyfj dyfj0 = dyfj.b(((dyfk)evql0.j()).e);
            if(dyfj0 == null) {
                dyfj0 = dyfj.j;
            }
            if(dyfj0 == dyfj.b) {
                Object object0 = evql0.j();
                ibuq.e(object0, "getResult(...)");
                ebsf0.o(((dyfk)object0), iterator0);
                dyff dyff0 = ebsf0.b.b == 3 ? ((dyff)ebsf0.b.c) : dyff.a;
                if((dyfe.b(dyff0.e) == null ? dyfe.d : dyfe.b(dyff0.e)) == dyfe.b) {
                    ebsf0.g().d();
                }
                return ebsf0.i(iterator0);
            }
        }
        if(evql0.n()) {
            dyfk0 = (dyfk)evql0.j();
        }
        else {
            dyfn dyfn0 = dyfm.a(((ProtoLiteMessage)dyfk.a).v_newBuilder());
            String s = this.c.c;
            ibuq.e(s, "getCid(...)");
            dyfn0.b(s);
            dyna dyna0 = dyna.b(this.c.f) == null ? dyna.k : dyna.b(this.c.f);
            ibuq.e(dyna0, "getServiceProvider(...)");
            dyfn0.c(dyna0);
            dyfn0.d(dyfj.c);
            dyfk0 = dyfn0.a();
        }
        ibuq.c(dyfk0);
        ebsf0.o(dyfk0, iterator0);
        dyff dyff1 = ebsf0.b.b == 3 ? ((dyff)ebsf0.b.c) : dyff.a;
        if((dyfe.b(dyff1.e) == null ? dyfe.d : dyfe.b(dyff1.e)) == dyfe.b) {
            ebwn ebwn0 = ebsf0.g();
            ibuq.e("Your transit card could not be added", "getString(...)");
            ebwn.e(ebwn0, "Your transit card could not be added");
        }
        return evrg.d(null);
    }
}

