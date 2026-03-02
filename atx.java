public final class atx implements Runnable {
    public final aud a;
    public final boolean b;
    public final jqt c;

    public atx(aud aud0, boolean z, jqt jqt0) {
        this.a = aud0;
        this.b = z;
        this.c = jqt0;
    }

    @Override
    public final void run() {
        aud aud0 = this.a;
        aow aow0 = aud0.b;
        aow0.p(aud0.l);
        aud0.k = this.b;
        jqt jqt0 = this.c;
        if(!aud0.d) {
            jqt0.c(new azq("Camera is not active."));
            return;
        }
        aud0.l = new aty(aud0, aow0.c(), jqt0);
        aow0.h(aud0.l);
    }
}

