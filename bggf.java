public final class bggf implements evqk {
    public final gged_interceptors a;
    public final evql b;
    public final evql c;
    public final evql d;

    public bggf(gged_interceptors gged0, evql evql0, evql evql1, evql evql2) {
        this.a = gged0;
        this.b = evql0;
        this.c = evql1;
        this.d = evql2;
    }

    @Override  // evqk
    public final evql a(Object object0) {
        gged_interceptors gged0 = (gged_interceptors)object0;
        gged_interceptors gged1 = gged_interceptors.n(((bggc)this.b.j()), ((bggc)this.c.j()), ((bggc)this.d.j()));
        return evrg.d(new bgic(this.a.size(), gged1));
    }
}

