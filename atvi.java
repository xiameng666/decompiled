public final class atvi implements Runnable {
    public final atxp a;
    public final atze b;

    public atvi(atxp atxp0, atze atze0) {
        this.a = atxp0;
        this.b = atze0;
    }

    @Override
    public final void run() {
        this.a.l.b(this.b);
    }
}

