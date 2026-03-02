public final class bpdj implements glzn {
    public final bpik a;
    public final bnvk b;
    public final bntw c;

    public bpdj(bpik bpik0, bntw bntw0, bnvk bnvk0) {
        this.a = bpik0;
        this.c = bntw0;
        this.b = bnvk0;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        if(((Boolean)object0).booleanValue()) {
            return gmbu.i(Boolean.valueOf(true));
        }
        return this.c.e() ? gmbu.i(Boolean.valueOf(false)) : gdta.g(this.b.c()).i(new bpgo(this.a), this.a.m);
    }
}

