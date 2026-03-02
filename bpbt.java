import j..util.Collection.-EL;

public final class bpbt implements gfsi {
    public final gfsx a;

    public bpbt(gfsx gfsx0) {
        this.a = gfsx0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        return Boolean.valueOf(Collection.-EL.stream(((fqzc)object0).b).anyMatch(new bpbm(this.a)));
    }
}

