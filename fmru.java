public final class fmru implements Runnable {
    public final fmrx a;
    public final boolean b;

    public fmru(fmrx fmrx0, boolean z) {
        this.a = fmrx0;
        this.b = z;
    }

    @Override
    public final void run() {
        this.a.f = false;
        this.a.e = true;
        this.a.g = this.b;
    }
}

