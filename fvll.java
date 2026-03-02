public final class fvll implements Runnable {
    public final fvls a;
    public final double[] b;
    public final double[] c;
    public final double[] d;
    public final double[] e;
    public final double[] f;
    public final long g;

    public fvll(fvls fvls0, double[] arr_f, double[] arr_f1, double[] arr_f2, double[] arr_f3, double[] arr_f4, long v) {
        this.a = fvls0;
        this.b = arr_f;
        this.c = arr_f1;
        this.d = arr_f2;
        this.e = arr_f3;
        this.f = arr_f4;
        this.g = v;
    }

    @Override
    public final void run() {
        this.a.a.u(this.b, this.c, this.d, this.e, this.f, this.g);
    }
}

