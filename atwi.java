public final class atwi implements Runnable {
    public final atxp a;
    public final boolean b;

    public atwi(atxp atxp0, boolean z) {
        this.a = atxp0;
        this.b = z;
    }

    @Override
    public final void run() {
        this.a.g.e(this.b);
    }
}

