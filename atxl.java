public final class atxl implements Runnable {
    public final atxp a;
    public final ggeo b;

    public atxl(atxp atxp0, ggeo ggeo0) {
        this.a = atxp0;
        this.b = ggeo0;
    }

    @Override
    public final void run() {
        this.a.t.a(this.b);
    }
}

