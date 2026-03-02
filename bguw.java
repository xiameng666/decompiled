public final class bguw implements Runnable {
    public final bgux a;
    public final boolean b;

    public bguw(bgux bgux0, boolean z) {
        this.a = bgux0;
        this.b = z;
    }

    @Override
    public final void run() {
        this.a.b.m(((boolean)(this.b ^ 1)));
    }
}

