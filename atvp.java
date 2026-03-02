public final class atvp implements Runnable {
    public final atxp a;
    public final atyx b;
    public final String c;

    public atvp(atxp atxp0, atyx atyx0, String s) {
        this.a = atxp0;
        this.b = atyx0;
        this.c = s;
    }

    @Override
    public final void run() {
        this.a.m.d(this.b, this.c);
    }
}

