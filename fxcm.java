public final class fxcm implements gfsi {
    public final fxcn a;
    public final Runnable b;

    public fxcm(fxcn fxcn0, Runnable runnable0) {
        this.a = fxcn0;
        this.b = runnable0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        fxcq fxcq0 = this.a.g;
        fxcq0.f = false;
        this.b.run();
        fwze fwze0 = this.a.d;
        fwrm.b(fwze0.mH(), ((hecr)object0).a);
        if(!this.a.f) {
            fxcq0.e.b(false);
        }
        fwze0.s().j(fwzf.a);
        return (hecr)object0;
    }
}

