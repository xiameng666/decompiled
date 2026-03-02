public final class fuyk {
    public final int a;
    public final int b;
    public double[] c;
    public double[] d;
    private final int e;
    private final double f;

    public fuyk(int v, double f, int v1, int v2) {
        this.e = v;
        this.f = f;
        this.a = v1;
        this.b = v2;
    }

    public final void a() {
        if(this.c == null) {
            int v = this.b;
            int v1 = this.e;
            double[] arr_f = new double[v + 1];
            double f = Math.log(this.f);
            double f1 = Math.log(1.0 - this.f) * ((double)v1);
            double[] arr_f1 = new double[v + 1];
            int v2 = 0;
            double f2 = 0.0;
            double f3 = -1.000000E+20;
            while(v2 <= v) {
                arr_f[v2] = ((double)v2) * f + f2 + f1;
                f2 += Math.log(((double)(v2 + v1)) / ((double)(v2 + 1)));
                f3 = fuyf.b(f3, arr_f[v2]);
                arr_f1[v2] = f3;
                ++v2;
                f1 = f1;
                arr_f = arr_f;
                f = f;
            }
            int v3 = this.a;
            double f4 = v3 <= 0 ? -1.000000E+20 : arr_f1[v3 - 1];
            double f5 = fuyf.a(f3, f4);
            this.c = new double[v + 1];
            this.d = new double[v + 1];
            while(v3 <= v) {
                this.c[v3] = arr_f[v3] - f5;
                this.d[v3] = fuyf.a(f3, f4) - f5;
                f4 = arr_f1[v3];
                ++v3;
            }
        }
    }
}

