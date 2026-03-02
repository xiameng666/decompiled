public final class czsz implements Runnable {
    public final czte a;
    public final czth b;

    public czsz(czte czte0, czth czth0) {
        this.a = czte0;
        this.b = czth0;
    }

    @Override
    public final void run() {
        czth czth0 = this.b;
        cztg cztg0 = this.a.b;
        if(cztg0.d.get()) {
            bbpb.b(czth0);
            return;
        }
        cztg0.c.add(czth0);
    }
}

