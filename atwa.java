public final class atwa implements Runnable {
    public final atxp a;
    public final gkff b;
    public final Long c;
    public final int d;

    public atwa(atxp atxp0, gkff gkff0, Long long0, int v) {
        this.a = atxp0;
        this.b = gkff0;
        this.c = long0;
        this.d = v;
    }

    @Override
    public final void run() {
        this.a.p.a(this.b, this.c, this.d);
    }
}

