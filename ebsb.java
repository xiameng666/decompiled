import java.util.Iterator;

public final class ebsb implements evpo {
    public final ebsf a;
    public final Iterator b;
    public final dyey c;

    public ebsb(ebsf ebsf0, Iterator iterator0, dyey dyey0) {
        this.a = ebsf0;
        this.b = iterator0;
        this.c = dyey0;
    }

    @Override  // evpo
    public final Object a(evql evql0) {
        dyfj dyfj0;
        if(evql0.n()) {
            dyfj0 = dyfj.b(((dyfk)evql0.j()).e);
            if(dyfj0 == null) {
                dyfj0 = dyfj.j;
            }
        }
        else {
            dyfj0 = dyfj.c;
        }
        Iterator iterator0 = this.b;
        ebsf ebsf0 = this.a;
        ibuq.c(dyfj0);
        switch(dyfj0.ordinal()) {
            case 1: {
                Object object0 = evql0.j();
                ibuq.e(object0, "getResult(...)");
                ebsf0.o(((dyfk)object0), iterator0);
                return ebsf0.i(iterator0);
            }
            case 6: {
                Object object1 = evql0.j();
                ibuq.e(object1, "getResult(...)");
                ebsf0.o(((dyfk)object1), iterator0);
                evqp evqp0 = new evqp();
                Object object2 = evql0.j();
                ibuq.e(object2, "getResult(...)");
                ebsf0.n(((dyfk)object2), iterator0, evqp0, 1);
                return evqp0.a;
            }
            default: {
                dyfn dyfn0 = dyfm.a(((ProtoLiteMessage)dyfk.a).v_newBuilder());
                String s = evql0.n() ? ((dyfk)evql0.j()).c : this.c.c;
                ibuq.e(s, "getCid(...)");
                dyfn0.b(s);
                dyna dyna0 = dyna.b(this.c.b) == null ? dyna.k : dyna.b(this.c.b);
                ibuq.e(dyna0, "getSecureElementServiceProvider(...)");
                dyfn0.c(dyna0);
                dyfn0.d(dyfj0);
                ebsf0.o(dyfn0.a(), iterator0);
                return evrg.d(null);
            }
        }
    }
}

