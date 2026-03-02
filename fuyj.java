public final class fuyj {
    public final double[][] a;
    public final double[] b;
    public final fuye c;
    public final fuyg d;
    public final fuyk[] e;
    public final fuyd f;

    public fuyj(double[] arr_f, double[][] arr2_f, double[][] arr2_f1, double[][][] arr3_f, int[] arr_v, double[] arr_f1, int[] arr_v1, int[] arr_v2, fvur fvur0) {
        this.c = new fuye(fvur0);
        this.d = new fuyg();
        this.b = new double[2];
        this.a = new double[2][2];
        for(int v1 = 0; v1 < 2; ++v1) {
            double f = arr_f[v1];
            this.b[v1] = Double.compare(f, 0.0) <= 0 ? -1.000000E+20 : Math.log(f);
            for(int v2 = 0; v2 < 2; ++v2) {
                double[] arr_f2 = this.a[v1];
                double f1 = arr2_f[v1][v2];
                arr_f2[v2] = f1 > 0.0 ? Math.log(f1) : -1.000000E+20;
            }
        }
        this.e = new fuyk[2];
        this.f = new fuyd(arr2_f1, arr3_f);
        for(int v = 0; v < 2; ++v) {
            this.e[v] = new fuyk(arr_v[v], arr_f1[v], arr_v1[v], arr_v2[v]);
        }
    }
}

