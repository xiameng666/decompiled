import j..util.Objects;
import java.util.ArrayList;

final class futb extends fusx {
    final futc b;

    public futb(futc futc0) {
        Objects.requireNonNull(futc0);
        this.b = futc0;
        super(futc0);
    }

    @Override  // fusx
    protected final void m(long v, long v1, fvsf fvsf0, fvsf fvsf1) {
        fusv fusv0;
        futc futc0 = this.b;
        fvsf fvsf2 = futc.g(fvsf0, 40000000000L);
        long v2 = 0L;
        fvsf fvsf3 = fvsf0.f((Long.compare(futc0.q, -1L) == 0 ? 0L : futc0.q + 1L));
        long v3 = futc0.r;
        if(v3 != -1L) {
            v2 = v3 + 1L;
        }
        fvsf fvsf4 = fvsf1.f(v2);
        int v4 = fvsf0.c;
        if(v4 > 0) {
            futc0.q = fvsf0.d(v4 - 1);
        }
        int v5 = fvsf1.c;
        if(v5 > 0) {
            futc0.r = fvsf1.d(v5 - 1);
        }
        futc0.c(fvsf2);
        fusy.d(fvsf0, fvsf2);
        fvwz fvwz0 = futc0.p;
        fvwz0.h(94, ((int)Math.round(fusy.a(fvsf2))));
        futc0.e.e(v, v1, fvns.d, fvsf3);
        futc0.e.e(v, v1, fvns.k, fvsf4);
        fuuz fuuz0 = futc0.w;
        if(fuuz0 != null && futc0.i && futc0.j != null) {
            fvsf fvsf5 = futc.g(fvsf0, 3200000000L);
            fvsf fvsf6 = futc.g(fvsf1, 3200000000L);
            fuuz0.c(futc0.j, v, v1, fvsf5, fvsf6);
        }
        int v6 = fvsf2.c;
        if(v6 == 0) {
            futg.a(fvwz0, 0);
            fusv0 = fusv.b("accel data is empty");
        }
        else {
            int v8 = fvsf2.c(v6 - 1);
            float[][] arr2_f = fvsf2.e;
            float[] arr_f = new float[arr2_f.length];
            for(int v9 = 0; v9 < arr2_f.length; ++v9) {
                arr_f[v9] = arr2_f[v9][v8];
            }
            fvsg fvsg0 = new fvsg(fvsf2.d[v8], arr_f);
            fvsg fvsg1 = futc0.s;
            if(fvsg1 != null && fvsg0.a == fvsg1.a) {
                float[] arr_f1 = fvsg0.b;
                float[] arr_f2 = fvsg1.b;
                if(arr_f1.length == arr_f2.length) {
                    int v10 = 0;
                    while(v10 < arr_f1.length) {
                        if(Math.abs(arr_f1[v10] - arr_f2[v10]) > 0.000001f) {
                            goto label_52;
                        }
                        ++v10;
                    }
                    fusv0 = fusv.b("same accel data as previous one");
                    goto label_74;
                }
            }
        label_52:
            futc0.s = fvsg0;
            fvsf2.d(v6 - 1);
            fvsf2.d(0);
            if(futc0.g != null) {
                ArrayList arrayList0 = new ArrayList();
                for(int v11 = v6 - 1; v11 >= 0; v11 = fusr.a(fvsf2, v11, 3200000000L)) {
                    arrayList0.add(Integer.valueOf(v11));
                }
                int v12 = arrayList0.size() - 1;
                for(int v7 = 0; v12 >= 0; v7 = v13) {
                    int v13 = (int)(((Integer)arrayList0.get(v12)));
                    fvsf fvsf7 = fvsf2.e(v7, v13 + 1 - v7);
                    if(fvsf7.c >= 4) {
                        long v14 = (fvsf2.d(v6 - 1) - fvsf2.d(v7)) / 1000000L;
                        this.l(v - v14, v1 - v14, fvsf7);
                    }
                    --v12;
                }
            }
            fusv fusv1 = futc0.d == null || !futc0.d.c ? fusv.a : this.a(v, v1, fvsf2);
            fusv0 = futc.f(fusv.a, fusv1);
        }
    label_74:
        futc0.e.b(fusv0);
    }
}

