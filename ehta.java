import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class ehta {
    public static double a(double f, double f1, double f2) {
        return f * f + f1 * f1 + f2 * f2;
    }

    // String Decryptor: 1 succeeded, 0 failed
    public static long b(long v) {
        return v * 50L / 1000L;
    }

    public static ehtb c(List list0) {
        double f47;
        double f40;
        double[] arr_f19;
        int v14;
        double f15;
        ehtb ehtb0 = new ehtb();
        int v = list0.size() - 1;
        double f = v > 0 ? ((double)(((ehsj)list0.get(v)).a - ((ehsj)list0.get(0)).a)) / ((double)v) : -1.0;
        if(f <= 20.0 && f >= 0.0) {
            int v1 = list0.size();
            double[][] arr2_f = new double[3][v1];
            for(int v2 = 0; v2 < v1; ++v2) {
                double[] arr_f = arr2_f[0];
                arr_f[v2] = (double)((ehsj)list0.get(v2)).b;
                double[] arr_f1 = arr2_f[1];
                arr_f1[v2] = (double)((ehsj)list0.get(v2)).c;
                double[] arr_f2 = arr2_f[2];
                arr_f2[v2] = (double)((ehsj)list0.get(v2)).d;
            }
            int v3 = arr2_f[0].length;
            double[] arr_f3 = new double[v3];
            float[] arr_f4 = new float[3];
            double f1 = 4.900000E-324;
            double f2 = 0.0;
            double f3 = 0.0;
            double f4 = 0.0;
            double f5 = 0.0;
            double f6 = 1.797693E+308;
            int v4 = 0;
            double f7 = 0.0;
            double f8 = 4.900000E-324;
            while(v4 < v3) {
                double f9 = arr2_f[0][v4];
                double f10 = arr2_f[1][v4];
                double f11 = arr2_f[2][v4];
                f2 += f10;
                f3 += f11;
                double f12 = ehta.a(f9, f10, f11);
                arr_f4[0] = (float)(((double)arr_f4[0]) + f9);
                arr_f4[1] = (float)(((double)arr_f4[1]) + f10);
                arr_f4[2] = (float)(((double)arr_f4[2]) + f11);
                double f13 = Math.sqrt(f12);
                arr_f3[v4] = f13;
                if((f13 > f1)) {
                    f1 = f13;
                }
                f4 += f12;
                if(v4 > 0) {
                    double f14 = Math.abs(f13 - arr_f3[v4 - 1]);
                    f7 = Math.max(f7, f14);
                    f5 += f14;
                }
                f6 = Math.min(f6, Math.min(f9, Math.min(f10, f11)));
                ++v4;
                f8 = Math.max(f8, Math.max(f9, Math.max(f10, f11)));
                f7 = f7;
                arr_f3 = arr_f3;
            }
            for(int v5 = 0; v5 < 3; ++v5) {
                arr_f4[v5] /= (float)v3;
            }
            ehtb0.b = (float)(f2 / ((double)v3));
            ehtb0.c = (float)(f3 / ((double)v3));
            ehtb0.a = (float)f1;
            ehtb0.d = (float)Math.sqrt(f4 / ((double)v3));
            ehtb0.e = (float)(f5 / ((double)(v3 - 1)));
            ehtb0.f = (float)(f7 / f);
            ehtb0.l = (float)(f5 / (f8 - f6));
            if(!list0.isEmpty()) {
                long v6 = ((ehsj)list0.get(0)).a;
                int v7 = (int)(((double)(((ehsj)list0.get(list0.size() - 1)).a - v6)) * 0.02);
                if(v7 == 0) {
                    v7 = 1;
                }
                double[][] arr2_f1 = new double[3][v7];
                long v8 = ((ehsj)list0.get(0)).a;
                double[] arr_f5 = arr2_f1[0];
                arr_f5[0] = (double)((ehsj)list0.get(0)).b;
                double[] arr_f6 = arr2_f1[1];
                arr_f6[0] = (double)((ehsj)list0.get(0)).c;
                double[] arr_f7 = arr2_f1[2];
                arr_f7[0] = (double)((ehsj)list0.get(0)).d;
                int v9 = 1;
                int v10 = 0;
                while(v9 < v7) {
                    while(true) {
                        f15 = ((double)v8) + ((double)v9) / 0.02;
                        if(!(f15 > ((double)((ehsj)list0.get(v10 + 1)).a))) {
                            break;
                        }
                        ++v10;
                    }
                    long v11 = ((ehsj)list0.get(v10)).a;
                    long v12 = ((ehsj)list0.get(v10 + 1)).a;
                    double[] arr_f8 = arr2_f1[0];
                    double f16 = ((double)v12) - f15;
                    double f17 = f15 - ((double)v11);
                    double f18 = (double)(v12 - v11);
                    arr_f8[v9] = (((double)((ehsj)list0.get(v10)).b) * f16 + ((double)((ehsj)list0.get(v10 + 1)).b) * f17) / f18;
                    double[] arr_f9 = arr2_f1[1];
                    arr_f9[v9] = (((double)((ehsj)list0.get(v10)).c) * f16 + ((double)((ehsj)list0.get(v10 + 1)).c) * f17) / f18;
                    double[] arr_f10 = arr2_f1[2];
                    arr_f10[v9] = (((double)((ehsj)list0.get(v10)).d) * f16 + ((double)((ehsj)list0.get(v10 + 1)).d) * f17) / f18;
                    ++v9;
                    v7 = v7;
                }
                double f19 = 0.0;
                for(int v13 = 0; v13 < arr2_f1[0].length; v13 = v14 + 1) {
                    double[] arr_f11 = arr2_f1[0];
                    double f20 = arr_f11[v13];
                    double[] arr_f12 = arr2_f1[1];
                    double f21 = arr_f12[v13];
                    double[] arr_f13 = arr2_f1[2];
                    double f22 = arr_f13[v13];
                    if(v13 > 0) {
                        double f23 = arr_f11[v13 - 1];
                        double f24 = arr_f12[v13 - 1];
                        double f25 = arr_f13[v13 - 1];
                        v14 = v13;
                        double f26 = Math.acos((f20 * f23 + f24 * f21 + f25 * f22) / (Math.sqrt(Math.pow(f23, 2.0) + Math.pow(f24, 2.0) + Math.pow(f25, 2.0)) * Math.sqrt(Math.pow(f20, 2.0) + Math.pow(f21, 2.0) + Math.pow(f22, 2.0))));
                        f19 += (double)(Double.isNaN(f26) ? 0.0f : ((float)Math.toDegrees(f26)));
                    }
                    else {
                        v14 = v13;
                    }
                }
                ehtb0.g = (float)(f19 / ((double)(arr2_f1[0].length - 1)));
            }
            double[] arr_f14 = new double[arr2_f[0].length + 1];
            for(int v15 = 0; v15 < 3; ++v15) {
                double[] arr_f15 = arr2_f[v15];
                int v16 = (int)Math.round(1.0);
                for(int v17 = 0; v17 < 3; ++v17) {
                    if(v16 != 0 && arr_f15.length > 1) {
                        double f27 = 0.0;
                        for(int v18 = 0; v18 < arr_f15.length; ++v18) {
                            arr_f14[v18] = f27;
                            f27 += arr_f15[v18];
                        }
                        arr_f14[arr_f15.length] = f27;
                        int v19 = Math.min(v16, (arr_f15.length + 1) / 2);
                        int v20;
                        for(v20 = 0; v20 < v19; ++v20) {
                            int v21 = v20 + v20 + 1;
                            arr_f15[v20] = arr_f14[v21] / ((double)v21);
                        }
                        int v22 = arr_f15.length - v16;
                        while(v20 < v22) {
                            arr_f15[v20] = (arr_f14[v20 + v16 + 1] - arr_f14[v20 - v16]) * (1.0 / ((double)(v16 + v16 + 1)));
                            ++v20;
                        }
                        while(v20 < arr_f15.length) {
                            int v23 = arr_f15.length - v20;
                            arr_f15[v20] = (f27 - arr_f14[v20 + v20 - arr_f15.length + 1]) / ((double)(v23 + v23 - 1));
                            ++v20;
                        }
                    }
                }
            }
            double[] arr_f16 = new double[3];
            for(int v24 = 0; v24 < 3; ++v24) {
                double[] arr_f17 = arr2_f[v24];
                double f28 = 0.0;
                for(int v25 = 0; v25 < arr_f17.length; ++v25) {
                    f28 += arr_f17[v25];
                }
                arr_f16[v24] = f28 / ((double)arr_f17.length);
            }
            double f29 = arr_f16[0];
            double f30 = arr_f16[1];
            double f31 = arr_f16[2];
            double f32 = Math.sqrt(f29 * f29 + f30 * f30 + f31 * f31);
            if(f32 != 0.0) {
                double[] arr_f18 = new double[3];
                for(int v26 = 0; v26 < 3; ++v26) {
                    arr_f18[v26] = arr_f16[v26] / f32;
                }
                do {
                    arr_f19 = new double[3];
                    arr_f19[0] = Math.random() - 0.5;
                    arr_f19[1] = Math.random() - 0.5;
                    double f33 = Math.random() - 0.5;
                    arr_f19[2] = f33;
                    double f34 = arr_f18[0] * arr_f19[0];
                    double f35 = arr_f18[1] * arr_f19[1];
                    double f36 = arr_f18[2] * f33;
                    for(int v27 = 0; v27 < 3; ++v27) {
                        arr_f19[v27] -= (f34 + f35 + f36) * arr_f18[v27];
                    }
                    double f37 = arr_f19[0];
                    double f38 = arr_f19[1];
                    double f39 = arr_f19[2];
                    f40 = Math.sqrt(f37 * f37 + f38 * f38 + f39 * f39);
                }
                while(!(f40 > 0.1));
                for(int v28 = 0; v28 < 3; ++v28) {
                    arr_f19[v28] /= f40;
                }
                double f41 = arr_f18[1] * arr_f19[2] - arr_f18[2] * arr_f19[1];
                double f42 = arr_f18[2] * arr_f19[0] - arr_f19[2] * arr_f18[0];
                double f43 = arr_f18[0] * arr_f19[1] - arr_f18[1] * arr_f19[0];
                double[] arr_f20 = arr2_f[0];
                double[] arr_f21 = arr2_f[1];
                double[] arr_f22 = new double[3];
                double[] arr_f23 = arr2_f[2];
                for(int v29 = 0; v29 < arr2_f[0].length; ++v29) {
                    double f44 = arr_f18[0] * arr2_f[0][v29];
                    double f45 = arr_f18[1] * arr2_f[1][v29];
                    double f46 = arr_f18[2] * arr2_f[2][v29];
                    for(int v30 = 0; true; ++v30) {
                        f47 = f44 + f45 + f46;
                        if(v30 >= 3) {
                            break;
                        }
                        arr_f22[v30] = arr2_f[v30][v29] - f47 * arr_f18[v30];
                    }
                    arr_f23[v29] = f47;
                    double f48 = arr_f22[0];
                    double f49 = arr_f22[1];
                    double f50 = arr_f22[2];
                    arr_f20[v29] = arr_f19[0] * f48 + arr_f19[1] * f49 + arr_f19[2] * f50;
                    arr_f21[v29] = f48 * f41 + f49 * f42 + f50 * f43;
                }
                double f51 = 0.0;
                double f52 = 0.0;
                double f53 = 0.0;
                for(int v31 = 0; v31 < arr_f20.length; ++v31) {
                    double f54 = arr_f20[v31];
                    f52 += f54 * f54;
                    double f55 = arr_f21[v31];
                    f51 += f54 * f55;
                    f53 += f55 * f55;
                }
                double f56 = Math.atan2(f51 + f51, f52 - f53) / 2.0;
                double[] arr_f24 = {f56, 1.570796 + f56};
                double[][] arr2_f2 = new double[2][2];
                double[] arr_f25 = new double[2];
                for(int v32 = 0; v32 < 2; ++v32) {
                    arr2_f2[v32][0] = Math.cos(arr_f24[v32]);
                    arr2_f2[v32][1] = Math.sin(arr_f24[v32]);
                    double[] arr_f26 = arr2_f2[v32];
                    double f57 = arr_f26[0];
                    double f58 = f52 * f57 + f51 * arr_f26[1];
                    double f59 = f57 * f51 + arr_f26[1] * f53;
                    arr_f25[v32] = f58 * f58 + f59 * f59;
                }
                if(arr_f25[0] <= arr_f25[1]) {
                    arr2_f2 = new double[][]{arr2_f2[1], arr2_f2[0]};
                }
                double[] arr_f27 = arr2_f[1];
                double[] arr_f28 = arr2_f[0];
                for(int v33 = 0; v33 < arr2_f[0].length; ++v33) {
                    double f60 = arr_f20[v33];
                    double[] arr_f29 = arr2_f2[0];
                    double f61 = arr_f29[0] * f60;
                    double f62 = arr_f21[v33];
                    double f63 = arr_f29[1] * f62;
                    double[] arr_f30 = arr2_f2[1];
                    double f64 = f60 * arr_f30[0];
                    double f65 = f62 * arr_f30[1];
                    arr_f27[v33] = f61 + f63;
                    arr_f28[v33] = f64 + f65;
                }
            }
            double[] arr_f31 = arr2_f[0];
            double[] arr_f32 = arr2_f[1];
            double f66 = 0.0;
            for(int v34 = 0; v34 < arr_f32.length; ++v34) {
                double f67 = arr_f32[v34];
                f66 += f67 * f67;
            }
            ehtb0.h = (float)(f66 / ((double)arr_f32.length));
            double[] arr_f33 = new double[arr_f31.length];
            for(int v35 = 0; v35 < arr_f31.length; ++v35) {
                arr_f33[v35] = Math.hypot(arr_f31[v35], arr_f32[v35]);
            }
            Arrays.sort(arr_f33);
            ehtb0.i = (float)ehsp.a(0.94, arr_f33);
            ehtb0.j = (float)ehsp.a(0.44, arr_f33);
            float f68 = (float)ehsp.a(0.75, arr_f33);
            ehtb0.k = f68;
            float f69 = ehtb0.j;
            ehtb0.m = ehtb0.i / f69;
            ehtb0.n = f68 / f69;
            return ehtb0;
        }
        return ehtb0;
    }

    public static ehtb d(ehsl ehsl0, long v, long v1) {
        return ehta.c(ehta.e(ehsl0, v, v1));
    }

    public static List e(ehsl ehsl0, long v, long v1) {
        List list0 = new ArrayList();
        for(int v2 = 0; v2 < ehsl0.a; ++v2) {
            long v3 = ehsl0.c(v2);
            if(v3 >= v1) {
                break;
            }
            if(v3 >= v) {
                list0.add(new ehsj(v3, ehsl0.a(v2, 0), ehsl0.a(v2, 1), ehsl0.a(v2, 2)));
            }
        }
        return list0;
    }
}

