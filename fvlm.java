public final class fvlm implements Runnable {
    public final fvls a;
    public final int b;
    public final int c;
    public final int d;

    public fvlm(fvls fvls0, int v, int v1, int v2) {
        this.a = fvls0;
        this.b = v;
        this.c = v1;
        this.d = v2;
    }

    @Override
    public final void run() {
        this.a.a.C(this.b, this.c, this.d);
    }
}

