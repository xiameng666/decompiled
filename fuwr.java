public final class fuwr {
    public static double a(double[] arr_f) {
        double f = 0.0;
        for(int v = 0; v < arr_f.length; ++v) {
            f += arr_f[v];
        }
        return f / ((double)arr_f.length);
    }

    public static double b(double[] arr_f) {
        return fuwr.d(arr_f) / ((double)arr_f.length);
    }

    public static double c(double f, double[] arr_f) {
        return arr_f[((int)(f * ((double)(arr_f.length - 1)) + 0.5))];
    }

    public static double d(double[] arr_f) {
        double f = 0.0;
        for(int v = 0; v < arr_f.length; ++v) {
            double f1 = arr_f[v];
            f += f1 * f1;
        }
        return f;
    }

    public static double e(double[] arr_f) {
        double f = fuwr.a(arr_f);
        return fuwr.b(arr_f) - f * f;
    }

    public static double[][] f(fvsf fvsf0, double f, int v) {
        double f1;
        fvsf fvsf1 = fvsf0;
        int v1 = v;
        double[][] arr2_f = new double[3][v1];
        long v2 = fvsf1.d(0);
        int v3 = 0;
        while(v3 < 3) {
            double[] arr_f = arr2_f[v3];
            arr_f[0] = (double)fvsf1.a(0, v3);
            int v4 = 1;
            int v5 = 0;
            while(v4 < v1) {
                while(true) {
                    f1 = ((double)v2) + ((double)v4) / f;
                    if(!(f1 > ((double)fvsf1.d(v5 + 1)))) {
                        break;
                    }
                    ++v5;
                }
                long v6 = fvsf1.d(v5);
                long v7 = fvsf1.d(v5 + 1);
                double[] arr_f1 = arr2_f[v3];
                arr_f1[v4] = (((double)fvsf1.a(v5, v3)) * (((double)v7) - f1) + ((double)fvsf1.a(v5 + 1, v3)) * (f1 - ((double)v6))) / ((double)(v7 - v6));
                ++v4;
                fvsf1 = fvsf0;
                v1 = v;
                arr2_f = arr2_f;
            }
            ++v3;
            fvsf1 = fvsf0;
            v1 = v;
        }
        return arr2_f;
    }

    public static double[][] g(fvsf fvsf0, double f) {
        long v = fvsf0.d(0);
        int v1 = (int)(((double)(fvsf0.d(fvsf0.c - 1) - v)) * (f * 1.000000E-09));
        if(v1 == 0) {
            v1 = 1;
        }
        return fuwr.f(fvsf0, f * 1.000000E-09, v1);
    }

    @Deprecated
    public static void h(double[] arr_f, double f, double[] arr_f1) {
        int v = (int)Math.round(((long)f) * 0x4060000000000000L);
        for(int v1 = 0; v1 < 3; ++v1) {
            gftb.checkTrue(arr_f1.length >= arr_f.length + 1);
            double f1 = 0.0;
            for(int v2 = 0; v2 < arr_f.length; ++v2) {
                arr_f1[v2] = f1;
                f1 += arr_f[v2];
            }
            arr_f1[arr_f.length] = f1;
            for(int v3 = 0; v3 < arr_f.length; ++v3) {
                int v4 = Math.max(v3 - v, 0);
                int v5 = Math.min(v3 + v, arr_f.length - 1);
                arr_f[v3] = (arr_f1[v5 + 1] - arr_f1[v4]) / ((double)(v5 - v4 + 1));
            }
        }
    }

    public static double i(double[] arr_f) {
        int v = 4;
        double f = 0.0;
        while(v < arr_f.length) {
            double f1 = arr_f[v] - arr_f[v - 4];
            f += f1 * f1;
            v += 4;
        }
        return f / ((double)((v >> 2) - 1));
    }
}

