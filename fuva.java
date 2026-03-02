import com.google.android.gms.location.SleepSegmentEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class fuva {
    public final fvwz a;
    public final fuyj b;
    public final futh c;
    public final fwxt d;
    public final int e;

    public fuva(fvwz fvwz0, futd futd0, fuyj fuyj0) {
        this.a = fvwz0;
        this.b = fuyj0;
        this.c = futd0.c;
        this.d = futd0.b;
        this.e = (int)huwz.e();
    }

    public final fvut a(fvsl fvsl0) {
        SleepSegmentEvent sleepSegmentEvent0;
        fvsl fvsl1;
        double f4;
        double f3;
        int v25;
        int v24;
        fuyd fuyd1;
        double[][] arr2_f10;
        double[][] arr2_f9;
        int v14;
        float[][] arr2_f5;
        double[] arr_f3;
        int v12;
        float[][] arr2_f4;
        double[] arr_f2;
        int v10;
        double[][] arr2_f3;
        fuyk[] arr_fuyk;
        double[][] arr2_f2;
        fuyj fuyj0 = this.b;
        fuye fuye0 = fuyj0.c;
        long v = fuye0.d() - ((long)fuye0.c()) * 360000L;
        ArrayList arrayList0 = new ArrayList();
        fuyd fuyd0 = fuyj0.f;
        fuyd0.b();
        int v1 = fuye0.c();
        float[][] arr2_f = new float[0xF0][];
        for(int v2 = 0; v2 < fuye0.a(); ++v2) {
            float[] arr_f = new float[1];
            arr2_f[v2] = arr_f;
            arr_f[0] = fuye0.e[v2][0];
        }
        int v3 = fuye0.c();
        double[][] arr2_f1 = new double[v3 + 1][2];
        int v4 = 0;
        while(true) {
            arr2_f2 = fuyj0.a;
            arr_fuyk = fuyj0.e;
            if(v4 >= v3) {
                break;
            }
            int v5 = (fuye0.b - v4 + 0xF0) % 0xF0;
            fuyd0.b();
            double[] arr_f1 = new double[2];
            int v6 = v5;
            for(int v7 = 0; v7 < 2; ++v7) {
                arr_f1[v7] = -1.000000E+20;
            }
            int v8 = 1;
            while(true) {
                if(v8 <= fuye.k(arr_fuyk)) {
                    arr2_f3 = arr2_f2;
                    int v9 = (v6 + v8 + 0xF0) % 0xF0;
                    fuyd0.c(arr2_f[v9]);
                    v10 = v3;
                    int v11 = 0;
                    while(v11 < 2) {
                        fuyk fuyk0 = arr_fuyk[v11];
                        if(v8 >= fuyk0.a && v8 <= fuyk0.b) {
                            double f = (v9 == fuye0.a ? 0.0 : arr2_f1[v9][v11]) + fuyd0.a(v11);
                            arr_f2 = arr_f1;
                            arr2_f4 = arr2_f;
                            arr_f2[v11] = fuyf.b(arr_f2[v11], f);
                        }
                        else {
                            arr_f2 = arr_f1;
                            arr2_f4 = arr2_f;
                        }
                        ++v11;
                        v1 = v1;
                        arr2_f = arr2_f4;
                        arr_f1 = arr_f2;
                    }
                    v12 = v1;
                    arr_f3 = arr_f1;
                    arr2_f5 = arr2_f;
                    if(v9 == fuye0.a) {
                        for(int v13 = 0; v13 < 2; ++v13) {
                            if(v8 < arr_fuyk[v13].a) {
                                arr_f3[v13] = fuyf.b(arr_f3[v13], fuyd0.a(v13));
                            }
                        }
                        v14 = 0;
                        break;
                    }
                    else {
                        ++v8;
                        arr2_f2 = arr2_f3;
                        v3 = v10;
                        v1 = v12;
                        arr2_f = arr2_f5;
                        arr_f1 = arr_f3;
                        continue;
                    }
                }
                arr2_f3 = arr2_f2;
                v10 = v3;
                v12 = v1;
                arr_f3 = arr_f1;
                arr2_f5 = arr2_f;
                v14 = 0;
                break;
            }
            while(v14 < 2) {
                double f1 = -1.000000E+20;
                for(int v15 = 0; v15 < 2; ++v15) {
                    f1 = fuyf.b(f1, arr_f3[v15] + arr2_f3[v14][v15]);
                }
                arr2_f1[v6][v14] = f1;
                ++v14;
            }
            ++v4;
            v = v;
            v3 = v10;
            v1 = v12;
            arr2_f = arr2_f5;
        }
        double[][] arr2_f6 = new double[v1 + 1][2];
        double[][] arr2_f7 = new double[v1 + 1][2];
        int v16 = v1;
        while(v16 >= 0) {
            int v17 = (fuye0.a - v16 + 0xF0) % 0xF0;
            boolean z = v17 == fuye0.a;
            int v18 = v1 - v16;
            int v19 = v18 + 1;
            int v20 = fuye.k(arr_fuyk);
            double[][] arr2_f8 = new double[2][v20 + 1];
            fuyd0.b();
            int v21 = 1;
            while(v21 <= v20) {
                if(v21 <= v19) {
                    arr2_f9 = arr2_f8;
                    arr2_f10 = arr2_f1;
                    fuyd0.c(arr2_f[(v17 + 0xF0 - v21 + 1) % 0xF0]);
                }
                else {
                    arr2_f9 = arr2_f8;
                    arr2_f10 = arr2_f1;
                }
                int v22 = 0;
                while(v22 < 2) {
                    fuyk fuyk1 = arr_fuyk[v22];
                    int v23 = fuyk1.b;
                    if(v21 <= v23 && (z || v21 >= fuyk1.a)) {
                        double f2 = fuyd0.a(v22);
                        if(v21 < v19) {
                            fuyd1 = fuyd0;
                            v24 = v22;
                            v25 = v19;
                            f3 = -1.000000E+20;
                            for(int v26 = 0; v26 < 2; ++v26) {
                                f3 = fuyf.b(f3, arr2_f6[(v17 + 0xF0 - v21) % 0xF0][v26] + arr2_f2[v26][v24]);
                            }
                        }
                        else {
                            fuyd1 = fuyd0;
                            v24 = v22;
                            v25 = v19;
                            f3 = fuyj0.b[v24];
                        }
                        if(!z) {
                            if(v21 >= fuyk1.a && v21 <= v23) {
                                if(fuyk1.c == null) {
                                    fuyk1.a();
                                }
                                f4 = fuyk1.c[v21];
                                goto label_151;
                            }
                        }
                        else if(v21 <= v23) {
                            if(fuyk1.d == null) {
                                fuyk1.a();
                            }
                            int v27 = fuyk1.a;
                            f4 = v21 < v27 ? fuyk1.d[v27] : fuyk1.d[v21];
                            goto label_151;
                        }
                        f4 = -1.000000E+20;
                    label_151:
                        arr2_f9[v24][v21] = f2 + f3 + f4;
                    }
                    else {
                        fuyd1 = fuyd0;
                        v24 = v22;
                        v25 = v19;
                        arr2_f9[v24][v21] = -1.000000E+20;
                    }
                    v22 = v24 + 1;
                    v20 = v20;
                    arr_fuyk = arr_fuyk;
                    fuyd0 = fuyd1;
                    v19 = v25;
                }
                ++v21;
                arr2_f8 = arr2_f9;
                arr2_f1 = arr2_f10;
            }
            for(int v28 = 0; v28 < 2; ++v28) {
                arr2_f7[v17][v28] = -1.000000E+20;
                fuyk fuyk2 = arr_fuyk[v28];
                int v29 = fuyk2.a;
                int v30 = fuyk2.b;
                int v31 = v17 == fuye0.a ? 1 : v29;
                double f5 = -1.000000E+20;
                while(v31 <= v30) {
                    f5 = fuyf.b(f5, arr2_f8[v28][v31]);
                    ++v31;
                }
                arr2_f6[v17][v28] = f5;
                double[] arr_f4 = new double[v30 + 1];
                arr_f4[v30] = arr2_f8[v28][v30];
                int v32 = v30;
                while(v32 > 1) {
                    arr_f4[v32 - 1] = fuyf.b(arr2_f8[v28][v32 - 1], arr_f4[v32]);
                    --v32;
                    arr_f4 = arr_f4;
                }
                for(int v33 = 0; v33 < v30 && v33 <= v18; ++v33) {
                    double f6 = v17 == fuye0.a ? arr_f4[v33 + 1] : arr2_f1[v17][v28] + (v29 >= v33 + 1 ? arr_f4[v29] : arr_f4[v33 + 1]);
                    double[] arr_f5 = arr2_f7[(v17 - v33 + 0xF0) % 0xF0];
                    arr_f5[v28] = fuyf.b(arr_f5[v28], f6);
                }
            }
            --v16;
            arr2_f1 = arr2_f1;
            arr_fuyk = arr_fuyk;
            fuyd0 = fuyd0;
        }
        double[][] arr2_f11 = (double[][])new fvuf(arr2_f7, arr2_f6).a;
        ArrayList arrayList1 = new ArrayList(2);
        int v34 = 0;
        for(double f7 = -1.0; v34 < arr2_f11.length; f7 = f8) {
            double[] arr_f6 = arr2_f11[(fuye0.f ? (fuye0.a + v34) % 0xF0 : v34)];
            double f8 = arr_f6[1] - arr_f6[0];
            if((f7 < 0.0) && (f8 >= 0.0)) {
                arrayList1.add(Integer.valueOf(Math.max(0, v34 - 1)));
            }
            else if((f7 >= 0.0) && (f8 < 0.0)) {
                arrayList1.add(Integer.valueOf(v34));
            }
            ++v34;
        }
        if(arrayList1.size() % 2 == 1) {
            arrayList1.add(Integer.valueOf(arr2_f11.length - 1));
        }
        ArrayList arrayList2 = new ArrayList(arrayList1.size() / 2);
        for(int v35 = 0; v35 < arrayList1.size() / 2; ++v35) {
            int v36 = v35 + v35;
            arrayList2.add(new fvsl(v + ((long)(((int)(((Integer)arrayList1.get(v36)))))) * 360000L, v + ((long)(((int)(((Integer)arrayList1.get(v36 + 1)))))) * 360000L));
        }
        for(Object object0: arrayList2) {
            arrayList0.add(new fvuf(((long)((fvsl)object0).b), ((long)((fvsl)object0).c)));
        }
        List list0 = fuva.e(arrayList0);
        if(list0.isEmpty()) {
            fvsl1 = fvsl0;
            sleepSegmentEvent0 = null;
        }
        else {
            float[][] arr2_f12 = fuye0.f();
            long v37 = fuye0.d();
            ArrayList arrayList3 = new ArrayList();
            int v38 = arr2_f12.length - 1;
            for(Object object1: list0) {
                int v39 = fuye.h(((fvsl)object1).b, v37, v38);
                int v40 = fuye.h(((fvsl)object1).c, v37, v38);
                int v41 = v39;
                while(v39 >= 0 && fuye.j(arr2_f12[v39])) {
                    v41 = v39;
                    --v39;
                }
                long v42 = fuye.i(v41, v37, v38);
                int v43 = v40;
                while(v43 <= v38) {
                    if(fuye.j(arr2_f12[v43]) && v43 != v38) {
                        ++v43;
                        continue;
                    }
                    else {
                        v40 = v43;
                    }
                    break;
                }
                long v44 = fuye.i(v40, v37, v38);
                if(v40 == v38) {
                    long v45 = fvsl0.c;
                    if(v44 < v45) {
                        v44 = v45;
                    }
                }
                arrayList3.add(new fvsl(v42, v44));
            }
            fvsl1 = fvsl0;
            fvsl fvsl2 = null;
            for(Object object2: arrayList3) {
                fvsl fvsl3 = fuva.b(fvsl1, ((fvsl)object2));
                if(fvsl3 != null) {
                    long v46 = TimeUnit.HOURS.toMillis(huwz.a.h().m());
                    if(fvsl2 == null || fvsl3.c - fvsl3.b >= v46) {
                        fvsl2 = fvsl3;
                    }
                }
            }
            sleepSegmentEvent0 = fvsl2 == null ? null : fuva.d(true, fvsl2, fuye0);
        }
        huwz huwz0 = huwz.a;
        long v47 = TimeUnit.HOURS.toMillis(huwz0.h().g());
        if(huwz0.h().H() && sleepSegmentEvent0 == null || sleepSegmentEvent0 != null && sleepSegmentEvent0.b - sleepSegmentEvent0.a > v47) {
            fvsl fvsl4 = fuye.l(fvsl1, fuye0.f(), fuye0.d());
            if(fvsl4 != null) {
                sleepSegmentEvent0 = fuva.d(true, fvsl4, fuye0);
            }
        }
        if(sleepSegmentEvent0 != null) {
            ArrayList arrayList4 = new ArrayList();
            arrayList4.add(sleepSegmentEvent0);
            fvwz fvwz0 = this.a;
            futg.b(fvwz0, sleepSegmentEvent0);
            long v48 = sleepSegmentEvent0.a;
            long v49 = sleepSegmentEvent0.b;
            long v50 = TimeUnit.MILLISECONDS.toMinutes(v49 - v48);
            if(huwz0.h().A() && v50 < huwz0.h().l()) {
                fvsl fvsl5 = new fvsl(v48, v49);
                long v51 = TimeUnit.MILLISECONDS.toMinutes(fvsl5.b - fvsl1.b);
                float[][] arr2_f13 = fuye0.f();
                long v52 = fuye0.d();
                fvsl fvsl6 = v51 <= huwz.c() ? null : fuye.l(new fvsl(fvsl1.b, fvsl5.b), arr2_f13, v52);
                fvsl fvsl7 = TimeUnit.MILLISECONDS.toMinutes(fvsl1.c - fvsl5.c) <= huwz.c() ? null : fuye.l(new fvsl(fvsl5.c, fvsl1.c), arr2_f13, v52);
                if(fvsl6 == null && fvsl7 == null) {
                    fvsl6 = null;
                }
                else if(fvsl6 == null || fvsl7 != null && fvsl7.a() > fvsl6.a()) {
                    fvsl6 = fvsl7;
                }
                if(fvsl6 != null) {
                    SleepSegmentEvent sleepSegmentEvent1 = fuva.d(true, fvsl6, fuye0);
                    arrayList4.add(sleepSegmentEvent1);
                    futg.b(fvwz0, sleepSegmentEvent1);
                }
            }
            return new fvut(arrayList4, null);
        }
        return null;
    }

    static final fvsl b(fvsl fvsl0, fvsl fvsl1) {
        long v = Math.max(fvsl0.b, fvsl1.b);
        long v1 = Math.min(fvsl0.c, fvsl1.c);
        return v >= v1 ? null : new fvsl(v, v1);
    }

    static final boolean c(long v, long v1) {
        long v2 = TimeUnit.DAYS.toHours(1L) + huwz.f() - huwz.e();
        return v <= v1 + TimeUnit.HOURS.toMillis(v2);
    }

    static final SleepSegmentEvent d(boolean z, fvsl fvsl0, fuye fuye0) {
        long v = 0L;
        long v1 = 0L;
        for(Object object0: fuva.e(fuye0.e())) {
            fvsl fvsl1 = fuva.b(((fvsl)object0), fvsl0);
            if(fvsl1 != null) {
                v1 += fvsl1.c - fvsl1.b;
            }
        }
        int v2 = (int)TimeUnit.MILLISECONDS.toMinutes(v1);
        long v3 = z ? fvsl0.b : 0L;
        if(z) {
            v = fvsl0.c;
        }
        if(z) {
            return v2 <= 0 ? new SleepSegmentEvent(v3, v, 0, v2, fuye0.b()) : new SleepSegmentEvent(v3, v, 1, v2, fuye0.b());
        }
        return new SleepSegmentEvent(v3, v, 2, v2, fuye0.b());
    }

    private static List e(List list0) {
        List list1 = new ArrayList(list0.size());
        for(Object object0: list0) {
            list1.add(new fvsl(((long)(((Long)((fvuf)object0).a))), ((long)(((Long)((fvuf)object0).b)))));
        }
        return list1;
    }
}

