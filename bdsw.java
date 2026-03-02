public final class bdsw implements ibth {
    public final ibth a;
    public final ibth b;

    public bdsw(ibth ibth0, ibth ibth1) {
        this.a = ibth0;
        this.b = ibth1;
    }

    @Override  // ibth
    public final Object a() {
        this.a.a();
        this.b.a();
        return ibom.a;
    }
}

