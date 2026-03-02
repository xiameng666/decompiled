public final class fmxt implements fmoz {
    public final fmya a;

    public fmxt(fmya fmya0) {
        this.a = fmya0;
    }

    @Override  // fmoz
    public final void a(Object object0) {
        fmya fmya0 = this.a;
        boolean z = fmya0.p;
        int v = ((gged_interceptors)object0).isEmpty() ^ 1;
        fmya0.p = v;
        if(z != v) {
            fmya0.d();
        }
    }
}

