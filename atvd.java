public final class atvd implements Runnable {
    public final atxp a;
    public final int b;
    public final int c;

    public atvd(atxp atxp0, int v, int v1) {
        this.a = atxp0;
        this.b = v;
        this.c = v1;
    }

    @Override
    public final void run() {
        this.a.i.h(this.b, this.c);
    }
}

