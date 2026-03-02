import java.util.List;

public final class duat implements evpo {
    public final duay a;
    public final String b;

    public duat(duay duay0, String s) {
        this.a = duay0;
        this.b = s;
    }

    @Override  // evpo
    public final Object a(evql evql0) {
        List list0 = (List)evql0.j();
        if(list0.isEmpty()) {
            ((ggtj)duay.a.j()).x("No browser allowlist found. Syncing and trying again.");
            return this.a.d(this.b).g(new duas(this.a, this.b));
        }
        return evrg.d(list0);
    }
}

