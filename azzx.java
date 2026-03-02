public final class azzx implements Runnable {
    public final back a;
    public final boolean b;

    public azzx(back back0, boolean z) {
        this.a = back0;
        this.b = z;
    }

    @Override
    public final void run() {
        back back0 = this.a;
        if(bboj.f(back0.a) && !this.b) {
            new bacj(back0).start();
        }
    }
}

