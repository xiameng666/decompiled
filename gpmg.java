public final class gpmg implements Runnable {
    public final gpmh a;
    public final Object b;

    public gpmg(gpmh gpmh0, Object object0) {
        this.a = gpmh0;
        this.b = object0;
    }

    @Override
    public final void run() {
        this.a.a.c(this.b);
    }
}

