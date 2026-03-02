public final class bpic implements glzn {
    public final bpik a;
    public final boolean b;
    public final fqzl c;

    public bpic(bpik bpik0, boolean z, fqzl fqzl0) {
        this.a = bpik0;
        this.b = z;
        this.c = fqzl0;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        Void void0 = (Void)object0;
        if(this.b) {
            ggdy ggdy0 = new ggdy();
            ggdy0.i((this.c.j == null ? fqxm.a : this.c.j));
            ggdy0.k(this.c.l);
            gged_interceptors gged0 = ggdy0.h();
            gfsx gfsx0 = gfsx.m((this.c.j == null ? fqxm.a : this.c.j).e);
            return this.a.o(gged0, false, gfsx0);
        }
        return gmbx.a;
    }
}

