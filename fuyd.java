public final class fuyd {
    private final double[][] a;
    private final double[][][] b;
    private final int c;
    private final double[] d;
    private double[] e;

    public fuyd(double[][] arr2_f, double[][][] arr3_f) {
        double f4;
        double f3;
        double f;
        this.c = arr2_f[0].length;
        for(int v = 0; v < 2; ++v) {
            gftb.checkTrue(arr2_f[v].length == this.c);
            gftb.checkTrue(arr3_f[v].length == this.c);
            for(int v1 = 0; true; ++v1) {
                int v2 = this.c;
                if(v1 >= v2) {
                    break;
                }
                gftb.checkTrue(arr3_f[v][v1].length == v2);
            }
        }
        this.a = arr2_f;
        this.b = arr3_f;
        this.e = new double[2];
        this.d = new double[2];
        int v3 = 0;
        while(v3 < 2) {
            double[] arr_f = this.d;
            double[][] arr2_f1 = arr3_f[v3];
            double[][] arr2_f2 = new double[arr2_f1.length][arr2_f1.length];
            int v4 = 0;
        alab1:
            while(true) {
                f = 0.0;
                if(v4 >= arr2_f1.length) {
                    break;
                }
                int v5 = 0;
                while(v5 <= v4) {
                    double f1 = arr2_f1[v4][v5];
                    double f2 = 0.0;
                    for(int v6 = 0; v6 < v5; ++v6) {
                        f2 += arr2_f2[v4][v6] * arr2_f2[v5][v6];
                    }
                    if(v4 == v5) {
                        if(f1 >= f2) {
                            f3 = Math.sqrt(f1 - f2);
                            goto label_42;
                        }
                        else {
                            arr2_f2 = null;
                            break alab1;
                        }
                        goto label_41;
                    }
                    else {
                    label_41:
                        f3 = (f1 - f2) / arr2_f2[v5][v5];
                    }
                label_42:
                    arr2_f2[v4][v5] = f3;
                    ++v5;
                }
                if((arr2_f2[v4][v4] <= 0.0)) {
                    arr2_f2 = null;
                    break;
                }
                else {
                    ++v4;
                    continue;
                }
                goto label_59;
            }
            if(arr2_f2 == null) {
                f4 = NaN;
            }
            else {
                for(int v7 = 0; v7 < arr2_f2.length; ++v7) {
                    f += Math.log(arr2_f2[v7][v7]);
                }
                f4 = f + f;
            }
        label_59:
            arr_f[v3] = f4 * 0.5 - Math.log(6.283185) * ((double)arr2_f[v3].length) * 0.5;
            ++v3;
        }
    }

    public final double a(int v) {
        return this.e[v];
    }

    public final void b() {
        for(int v = 0; v < 2; ++v) {
            this.e[v] = 0.0;
        }
    }

    public final void c(float[] arr_f) {
        boolean z = arr_f.length == this.c;
        gftb.checkTrue(z);
        gftb.checkTrue(z);
        double[] arr_f1 = new double[2];
        for(int v1 = 0; v1 < 2; ++v1) {
            double[][] arr2_f = this.b[v1];
            double[] arr_f2 = this.a[v1];
            double f = 0.0;
            for(int v2 = 0; v2 < arr_f2.length; ++v2) {
                for(int v3 = 0; v3 < arr_f2.length; ++v3) {
                    f += (((double)arr_f[v2]) - arr_f2[v2]) * arr2_f[v2][v3] * (((double)arr_f[v3]) - arr_f2[v3]);
                }
            }
            arr_f1[v1] = f * -0.5 + this.d[v1];
        }
        for(int v = 0; v < 2; ++v) {
            this.e[v] += arr_f1[v];
        }
    }
}

