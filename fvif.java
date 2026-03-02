final class fvif {
    public final double a;
    public final double[] b;
    public final double[] c;
    public final double[] d;
    public final double[] e;
    public final double[] f;

    public fvif() {
        double f = Math.abs(120.0);
        this.a = f;
        gftb.checkTrue(f > 0.0);
        this.b = new double[7];
        this.c = new double[7];
        this.d = new double[7];
        this.e = new double[7];
        this.f = new double[7];
    }

    public static void a(double[] arr_f, double[] arr_f1, double f, double[] arr_f2) {
        for(int v = 0; v < 7; ++v) {
            arr_f2[v] = arr_f[v] + arr_f1[v] * f;
        }
    }
}

