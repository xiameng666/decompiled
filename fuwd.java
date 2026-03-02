import java.util.Arrays;

public final class fuwd {
    public static void a(fuwg fuwg0, fvsf fvsf0) {
        int v31;
        int v28;
        float[] arr_f25;
        int v12;
        double f21;
        double f14;
        double[] arr_f3;
        double f6;
        double f5;
        double f4;
        double[][] arr2_f = fuwr.g(fvsf0, 128.0);
        fuwg0.z = (float)fuwr.i(arr2_f[0]);
        fuwg0.A = (float)fuwr.i(arr2_f[1]);
        fuwg0.B = (float)fuwr.i(arr2_f[2]);
        int v1 = arr2_f[0].length + 1;
        double[] arr_f = new double[v1];
        for(int v2 = 0; v2 < 3; ++v2) {
            fuwr.h(arr2_f[v2], 0.01, arr_f);
        }
        gftb.checkTrue(arr2_f[1].length == arr2_f[0].length);
        gftb.checkTrue(arr2_f[2].length == arr2_f[0].length);
        double[] arr_f1 = new double[3];
        for(int v3 = 0; v3 < 3; ++v3) {
            arr_f1[v3] = fuwr.a(arr2_f[v3]);
        }
        double f = arr_f1[0];
        double f1 = arr_f1[1];
        double f2 = arr_f1[2];
        double f3 = Math.sqrt(f * f + f1 * f1 + f2 * f2);
        if(f3 == 0.0) {
            f4 = 0.0;
            f5 = 0.0;
            f6 = 0.0;
        }
        else {
            double[] arr_f2 = new double[3];
            for(int v4 = 0; v4 < 3; ++v4) {
                arr_f2[v4] = arr_f1[v4] / f3;
            }
            do {
                arr_f3 = new double[3];
                arr_f3[0] = Math.random() - 0.5;
                arr_f3[1] = Math.random() - 0.5;
                double f7 = Math.random() - 0.5;
                arr_f3[2] = f7;
                double f8 = arr_f2[0] * arr_f3[0];
                double f9 = arr_f2[1] * arr_f3[1];
                double f10 = arr_f2[2] * f7;
                for(int v5 = 0; v5 < 3; ++v5) {
                    arr_f3[v5] -= (f8 + f9 + f10) * arr_f2[v5];
                }
                double f11 = arr_f3[0];
                double f12 = arr_f3[1];
                double f13 = arr_f3[2];
                f14 = Math.sqrt(f11 * f11 + f12 * f12 + f13 * f13);
            }
            while(!(f14 > 0.1));
            for(int v6 = 0; v6 < 3; ++v6) {
                arr_f3[v6] /= f14;
            }
            double f15 = arr_f2[1] * arr_f3[2] - arr_f2[2] * arr_f3[1];
            double f16 = arr_f2[2] * arr_f3[0] - arr_f3[2] * arr_f2[0];
            double f17 = arr_f2[0] * arr_f3[1] - arr_f2[1] * arr_f3[0];
            double[] arr_f4 = arr2_f[0];
            double[] arr_f5 = arr2_f[1];
            double[] arr_f6 = new double[3];
            double[] arr_f7 = arr2_f[2];
            for(int v = 0; v < arr2_f[0].length; ++v) {
                double f18 = arr_f2[0] * arr2_f[0][v];
                double f19 = arr_f2[1] * arr2_f[1][v];
                double f20 = arr_f2[2] * arr2_f[2][v];
                for(int v7 = 0; true; ++v7) {
                    f21 = f18 + f19 + f20;
                    if(v7 >= 3) {
                        break;
                    }
                    arr_f6[v7] = arr2_f[v7][v] - f21 * arr_f2[v7];
                }
                arr_f7[v] = f21;
                double f22 = arr_f6[0];
                double f23 = arr_f6[1];
                double f24 = arr_f6[2];
                arr_f4[v] = arr_f3[0] * f22 + arr_f3[1] * f23 + arr_f3[2] * f24;
                arr_f5[v] = f22 * f15 + f23 * f16 + f24 * f17;
            }
            gftb.checkTrue(((boolean)(arr_f5.length == arr_f4.length ? 1 : 0)));
            double f25 = 0.0;
            double f26 = 0.0;
            double f27 = 0.0;
            for(int v8 = 0; v8 < arr_f4.length; ++v8) {
                double f28 = arr_f4[v8];
                f26 += f28 * f28;
                double f29 = arr_f5[v8];
                f25 += f28 * f29;
                f27 += f29 * f29;
            }
            double f30 = Math.atan2(f25 + f25, f26 - f27) / 2.0;
            double[] arr_f8 = {f30, 1.570796 + f30};
            double[][] arr2_f1 = new double[2][2];
            double[] arr_f9 = new double[2];
            for(int v9 = 0; v9 < 2; ++v9) {
                arr2_f1[v9][0] = Math.cos(arr_f8[v9]);
                arr2_f1[v9][1] = Math.sin(arr_f8[v9]);
                double[] arr_f10 = arr2_f1[v9];
                double f31 = arr_f10[0];
                double f32 = f31 * f25 + arr_f10[1] * f27;
                double f33 = new double[]{f26 * f31 + f25 * arr_f10[1], f32}[0];
                arr_f9[v9] = f33 * f33 + f32 * f32;
            }
            if(arr_f9[0] <= arr_f9[1]) {
                arr2_f1 = new double[][]{arr2_f1[1], arr2_f1[0]};
            }
            double[] arr_f11 = arr2_f[1];
            double[] arr_f12 = arr2_f[0];
            for(int v10 = 0; v10 < arr2_f[0].length; ++v10) {
                double f34 = arr_f4[v10];
                double[] arr_f13 = arr2_f1[0];
                double f35 = arr_f13[0] * f34;
                double f36 = arr_f5[v10];
                double f37 = arr_f13[1] * f36;
                double[] arr_f14 = arr2_f1[1];
                double f38 = f34 * arr_f14[0];
                double f39 = f36 * arr_f14[1];
                arr_f11[v10] = f35 + f37;
                arr_f12[v10] = f38 + f39;
            }
        }
        double[] arr_f15 = arr2_f[0];
        double[] arr_f16 = arr2_f[1];
        double[] arr_f17 = arr2_f[2];
        double f40 = fuwr.a(arr_f17);
        for(int v11 = 0; true; ++v11) {
            v12 = arr_f17.length;
            if(v11 >= v12) {
                break;
            }
            arr_f17[v11] -= f40;
        }
        double f41 = fuwr.b(arr_f16);
        double f42 = fuwr.b(arr_f17);
        fuwg0.a = (float)(fuwr.b(arr_f15) + f41 + f42);
        fuwg0.s = (float)f41;
        fuwg0.c = (float)f42;
        int v13 = arr2_f[0].length;
        int v14 = v13 / 3;
        double[] arr_f18 = new double[3];
        double[] arr_f19 = new double[3];
        for(int v15 = 0; v15 < 3; ++v15) {
            double f43 = 0.0;
            double f44 = 0.0;
            for(int v16 = 0; v16 < v14; ++v16) {
                double f45 = arr2_f[v15][v16];
                f43 += f45;
                f44 += f45 * f45;
            }
            arr_f18[v15] = f43;
            arr_f19[v15] = f44;
        }
        double f46 = Infinity;
        int v17 = 0;
        double f47 = 0.0;
        while(true) {
            double f48 = 0.0;
            int v18 = 0;
            while(v18 < 3) {
                double f49 = arr_f19[v18] / ((double)v14);
                double f50 = arr_f18[v18] / ((double)v14);
                f48 += f49 - f50 * f50;
                ++v18;
                f42 = f42;
            }
            if((f48 > f47)) {
                f47 = f48;
            }
            if((f48 < f46)) {
                f46 = f48;
            }
            int v19 = v17 + v14;
            if(v19 == v13 - 1) {
                break;
            }
            int v20 = 0;
            while(v20 < 3) {
                double f51 = arr_f18[v20];
                double[] arr_f20 = arr2_f[v20];
                arr_f18[v20] = f51 + (-arr_f20[v17] + arr_f20[v19]);
                double f52 = arr_f19[v20];
                double f53 = arr_f20[v17];
                double f54 = arr_f20[v19];
                arr_f19[v20] = f52 + (-f53 * f53 + f54 * f54);
                ++v20;
                v12 = v12;
                v13 = v13;
                v14 = v14;
            }
            ++v17;
            f42 = f42;
        }
        float f55 = (float)(f46 / f47);
        if(1 == Float.isNaN(f55)) {
            f55 = 1.0f;
        }
        fuwg0.b = f55;
        fuwg0.k = fuwc.a(arr_f17);
        fuwg0.l = Math.abs(fuwc.a(arr_f16) - 0.5f);
        int v21 = arr_f16.length;
        gftb.checkTrue(v21 == v12);
        gftb.checkTrue(v1 >= v21 + 1);
        double[] arr_f21 = new double[v21];
        int v22 = 0;
        while(v22 < 4) {
            System.arraycopy(arr_f16, 0, arr_f21, 0, arr_f16.length);
            double f56 = ((double)(1 << v22)) * 0.02;
            fuwr.h(arr_f21, f56, arr_f);
            float[] arr_f22 = fuwg0.n;
            float f57 = (float)(fuwr.e(arr_f21) / f41);
            float f58 = 0.0f;
            if(Float.isNaN(f57)) {
                f57 = 0.0f;
            }
            arr_f22[v22] = f57;
            fuwg0.q[v22] = fuwc.b(arr_f21);
            System.arraycopy(arr_f17, 0, arr_f21, 0, arr_f17.length);
            fuwr.h(arr_f21, f56, arr_f);
            float[] arr_f23 = fuwg0.m;
            float f59 = (float)(fuwr.e(arr_f21) / f42);
            if(!Float.isNaN(f59)) {
                f58 = f59;
            }
            arr_f23[v22] = f58;
            float[] arr_f24 = fuwg0.o;
            int v23 = 0;
            int v24 = 0;
            int v25 = 0;
            int v26 = 0;
            while(v25 < v21 - 1) {
                int v27 = arr_f21[v25] > 0.0 ? 1 : 0;
                if(arr_f21[v25 + 1] <= 0.0) {
                    arr_f25 = arr_f24;
                    v28 = 0;
                }
                else {
                    arr_f25 = arr_f24;
                    v28 = 1;
                }
                if(v27 != v28) {
                    if(v23 == 0) {
                        v26 = v25;
                    }
                    ++v23;
                    v24 = v25;
                }
                ++v25;
                arr_f24 = arr_f25;
            }
            arr_f24[v22] = v23 > 1 ? ((float)(v23 - 1)) / ((float)(v24 - v26)) : ((float)v23) / ((float)(v21 - 1));
            fuwg0.p[v22] = fuwc.b(arr_f21);
            if(v22 == 1) {
                int v30 = 0;
                for(int v29 = 1; v29 < v21; ++v29) {
                    if((arr_f21[v29] > arr_f21[v29 - 1])) {
                        ++v30;
                    }
                }
                fuwg0.r = ((float)v30) / ((float)(v21 - 1));
                v31 = 1;
            }
            else {
                v31 = v22;
            }
            v22 = v31 + 1;
            arr_f16 = arr_f16;
        }
        double[] arr_f26 = new double[arr_f15.length];
        for(int v32 = 0; v32 < arr_f15.length; ++v32) {
            arr_f26[v32] = Math.hypot(arr_f15[v32], arr_f16[v32]);
        }
        Arrays.sort(arr_f26);
        fuwg0.t = (float)fuwr.c(0.94, arr_f26);
        fuwg0.u = (float)fuwr.c(0.75, arr_f26);
        fuwg0.v = (float)fuwr.c(0.44, arr_f26);
        Arrays.sort(arr_f17);
        fuwg0.d = (float)fuwr.c(0.5, arr_f17);
        fuwg0.e = (float)fuwr.c(0.03, arr_f17);
        fuwg0.f = (float)fuwr.c(0.93, arr_f17);
        fuwg0.g = (float)fuwr.c(0.13, arr_f17);
        fuwg0.h = (float)fuwr.c(0.8, arr_f17);
        fuwg0.i = (float)fuwr.c(0.28, arr_f17);
        fuwg0.j = (float)fuwr.c(0.62, arr_f17);
        arr2_f[2] = null;
        fuwg0.w = (float)f4;
        fuwg0.x = (float)f5;
        fuwg0.y = (float)f6;
    }
}

