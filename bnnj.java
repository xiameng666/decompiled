public final class bnnj implements Runnable {
    public final bnnl a;
    public final kar b;

    public bnnj(bnnl bnnl0, kar kar0) {
        this.a = bnnl0;
        this.b = kar0;
    }

    @Override
    public final void run() {
        this.b.accept(this.a.b);
    }
}

