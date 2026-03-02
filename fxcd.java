public final class fxcd implements gfsi {
    public final fxcq a;
    public final boolean b;

    public fxcd(fxcq fxcq0, boolean z) {
        this.a = fxcq0;
        this.b = z;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        this.a.f = false;
        this.a.e.b(this.b);
        return (hecr)object0;
    }
}

