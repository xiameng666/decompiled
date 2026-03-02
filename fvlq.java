public final class fvlq implements Runnable {
    public final fvls a;
    public final int b;
    public final int c;

    public fvlq(fvls fvls0, int v, int v1) {
        this.a = fvls0;
        this.b = v;
        this.c = v1;
    }

    @Override
    public final void run() {
        this.a.a.D(this.b, this.c);
    }
}

