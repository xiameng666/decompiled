import j..util.Objects;

public final class dxze implements gmbg {
    final kar a;
    final String b;

    public dxze(dxzf dxzf0, kar kar0, String s) {
        this.a = kar0;
        this.b = s;
        Objects.requireNonNull(dxzf0);
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
        ((ggtj)dxzf.a.i()).B("Failed to get field update infos stored in protodatastore for valuable: %s", this.b);
        this.a.accept(ggna.a);
    }

    @Override  // gmbg
    public final void b(Object object0) {
        this.a.accept(((gged_interceptors)object0));
    }
}

