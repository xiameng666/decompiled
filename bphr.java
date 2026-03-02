public final class bphr implements glzn {
    public final bpik a;

    public bphr(bpik bpik0) {
        this.a = bpik0;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        hfuo hfuo0 = ((fqzl)object0).l;
        int v = ((fqzl)object0).b & 0x20;
        int v1 = v == 0 ? 1 : 0;
        if(v != 0) {
            fqxm fqxm0 = ((fqzl)object0).j;
            if(fqxm0 == null) {
                fqxm0 = fqxm.a;
            }
            gfsx gfsx0 = gfsx.m(fqxm0.e);
            return this.a.o(hfuo0, ((boolean)(v1 ^ 1)), gfsx0);
        }
        return this.a.o(hfuo0, ((boolean)(v1 ^ 1)), gfqx.a);
    }
}

