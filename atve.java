public final class atve implements Runnable {
    public final atxp a;
    public final glbe b;
    public final int c;
    public final String d;

    public atve(atxp atxp0, glbe glbe0, int v, String s) {
        this.a = atxp0;
        this.b = glbe0;
        this.c = v;
        this.d = s;
    }

    @Override
    public final void run() {
        this.a.u.a(this.b, null, this.c, gkey.bG, this.d);
    }
}

