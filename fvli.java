public final class fvli implements Runnable {
    public final fvls a;
    public final float[] b;
    public final long c;
    public final int d;

    public fvli(fvls fvls0, float[] arr_f, long v, int v1) {
        this.a = fvls0;
        this.b = arr_f;
        this.c = v;
        this.d = v1;
    }

    @Override
    public final void run() {
        this.a.a.h(this.b, this.c, this.d);
    }
}

