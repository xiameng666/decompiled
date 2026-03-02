public final class auer implements gmbg {
    final ibth a;
    final ibth b;

    public auer(ibth ibth0, ibth ibth1) {
        this.a = ibth0;
        this.b = ibth1;
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
        ibuq.f(throwable0, "t");
        a.ae(auez.b.j(), "Error retrieving LIA setting state; will treat as OFF", throwable0);
        auek.a.set(true);
        this.a.a();
    }

    @Override  // gmbg
    public final void b(Object object0) {
        int v = ((Number)object0).intValue();
        ((ggtj)auez.b.h()).B("LIA setting state = %s", (v == 2 ? "OFF" : "ON"));
        auek.a.set(v == 2);
        (v == 2 ? this.a : this.b).a();
    }
}

