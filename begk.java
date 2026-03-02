import java.util.List;

public final class begk implements evpo {
    public final begp a;
    public final List b;

    public begk(begp begp0, List list0) {
        this.a = begp0;
        this.b = list0;
    }

    @Override  // evpo
    public final Object a(evql evql0) {
        gged_interceptors gged0;
        List list0 = this.b;
        begp begp0 = this.a;
        if(!evql0.n()) {
            a.ae(begp.a.j(), "fetching passkey facets failed", evql0.i());
            bedi bedi0 = new bedi(((gged_interceptors)list0.get(0)), ggna.a);
            bedv bedv0 = new bedv(bedu.a, bedi0, null);
            begp0.f.l(bedv0);
            bedi bedi1 = new bedi(((gged_interceptors)list0.get(0)), ggna.a);
            begp0.i.f(bedi1);
            return null;
        }
        lqi lqi0 = begp0.f;
        if(list0.isEmpty()) {
            gged0 = ggna.a;
            ibuq.e(gged0, "of(...)");
        }
        else {
            gged0 = (gged_interceptors)list0.get(0);
        }
        bedi bedi2 = new bedi(gged0, ((gged_interceptors)evql0.j()));
        lqi0.l(new bedv(bedu.a, bedi2, null));
        if(!list0.isEmpty()) {
            bedi bedi3 = new bedi(((gged_interceptors)list0.get(0)), ((gged_interceptors)evql0.j()));
            begp0.i.f(bedi3);
        }
        return null;
    }
}

