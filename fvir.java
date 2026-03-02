import j..util.Objects;
import java.util.Arrays;
import java.util.List;

public final class fvir {
    public final fviq a;
    public final fvjc b;
    private final int[] c;
    private final int d;
    private final List e;
    private final fvdq f;

    public fvir(fviq fviq0, fviy fviy0, int[] arr_v, List list0, fvdq fvdq0) {
        this.a = fviq0;
        this.b = fviy0.a;
        this.c = arr_v;
        this.f = fvdq0;
        this.d = glwy.f(arr_v);
        this.e = list0;
    }

    public final double a(int v) {
        byte[] arr_b = this.f(v);
        double f = 0.0;
        for(int v1 = 0; true; ++v1) {
            int[] arr_v = this.c;
            if(v1 >= arr_v.length) {
                break;
            }
            int v2 = arr_v[v1];
            if(((fvix)this.d().get(v1)).e()) {
                gftb.q(arr_b[v2] != 0x7F);
                f += fvbz.a(fvis.b(arr_b[v2]), ((fvix)this.d().get(v1)).c);
            }
        }
        return f;
    }

    public final fvcl b() {
        return this.a.c;
    }

    public final List c() {
        fvjc fvjc0 = this.b;
        if(fvjc0.d == null) {
            fvjc0.d = gged_interceptors.h(gggq.d(fvjc0.a.values(), new fviz()));
        }
        return fvjc0.d;
    }

    public final List d() {
        return this.b.a();
    }

    public final void e(int v, float[] arr_f) {
        int[] arr_v = this.c;
        gftb.checkTrue(arr_f.length == arr_v.length);
        byte[] arr_b = this.f(v);
        for(int v1 = 0; v1 < arr_f.length; ++v1) {
            arr_f[v1] = fvis.b(arr_b[arr_v[v1]]);
        }
    }

    private final byte[] f(int v) {
        fvcl fvcl3;
        fvio fvio1;
        float f12;
        float f11;
        double f10;
        double f9;
        fvcl fvcl2;
        int v10;
        gged_interceptors gged1;
        int v9;
        byte[] arr_b3;
        float f5;
        float[] arr_f;
        fviq fviq1;
        int v7;
        fvir fvir0 = this;
        fviq fviq0 = fvir0.a;
        fvcl fvcl0 = fviq0.c;
        if(fvcl0.j(v) == hirl.c) {
            int v1 = fvir0.d + 1;
            if(fviq0.a.length < v1) {
                fviq0.a = new byte[v1];
                Arrays.fill(fviq0.a, fvis.a(0.0f));
            }
            return fviq0.a;
        }
        int v2 = fvcl0.f(v);
        int v3 = fvcl0.g(v);
        fvcq fvcq0 = fviq0.b;
        byte[] arr_b = (byte[])fvcq0.b(v2, v3);
        if(arr_b == null || arr_b.length < fvir0.d + 1) {
            if(arr_b == null) {
                fvir0.f.H();
            }
            if(arr_b == null) {
                arr_b = new byte[0];
            }
            byte[] arr_b1 = new byte[fvir0.d + 1];
            System.arraycopy(arr_b, 0, arr_b1, 0, arr_b.length);
            Arrays.fill(arr_b1, arr_b.length, fvir0.d + 1, 0x7F);
            fvcq0.c(v2, v3, arr_b1);
            arr_b = arr_b1;
        }
        int v4 = 0;
        while(v4 < arr_b.length) {
            if(arr_b[v4] == 0x7F) {
                goto label_31;
            }
            ++v4;
        }
        if(hunr.a.m().al()) {
            fvir0.f.F();
            return arr_b;
        }
    label_31:
        fvir0.f.I();
        float f = fvcl0.c(v) + 1.5f;
        gftb.x(v, fvcl0.e * fvcl0.d);
        ggxn ggxn0 = new ggxn(fvcl0.b + (((double)(v % fvcl0.d)) + 0.5) * fvcl0.f, fvcl0.c + (((double)(v / fvcl0.d)) + 0.5) * fvcl0.f);
        fvil fvil0 = new fvil(ggxn0.a, ggxn0.b, ((double)f));
        int v5 = 0;
        while(v5 < arr_b.length) {
            if(arr_b[v5] == 0x7F) {
                fvio fvio0 = fviq0.h;
                gged_interceptors gged0 = gged_interceptors.l(((fvim)fvir0.e.get(v5)));
                int v6 = ((ggna)gged0).c;
                fvcl fvcl1 = fvio0.a;
                v7 = v5;
                double f1 = fvcl1.f;
                fvil fvil1 = new fvil((fvil0.a - fvcl1.b) / f1, (fvil0.b - fvcl1.c) / f1, fvil0.c);
                double f2 = fvil1.a;
                double f3 = fvil1.b;
                fvil0 = fvil0;
                hirl hirl0 = fvcl1.j(fvcl1.e(((int)f2), ((int)f3)));
                fviq1 = fviq0;
                hirl hirl1 = hirl.a;
                boolean z = hirl0 == hirl1 ? 0 : true;
                gftb.checkTrue(z);
                byte[] arr_b2 = arr_b;
                double f4 = fvil1.c;
                if((f4 < ((double)fvcl1.c(fvcl1.e(((int)f2), ((int)f3)))))) {
                    arr_f = new float[v6];
                    f5 = 0.0f;
                    new float[v6];
                }
                else {
                    arr_f = new float[v6];
                    float[] arr_f1 = new float[v6];
                    int v8 = 0;
                    while(v8 < v6) {
                        fvim fvim0 = (fvim)gged0.get(v8);
                        double f6 = fvim0.b;
                        boolean z1 = Double.compare(fvim0.b, -90.0) >= 0 && (f6 <= 90.0) ? true : 0;
                        gftb.f(z1, "Bad elevation: %s", Double.valueOf(f6));
                        double f7 = fvim0.a;
                        double f8 = 0.0;
                        boolean z2 = (f7 >= 0.0) && (f7 <= 360.0) ? true : 0;
                        gftb.f(z2, "Bad azimuth: %s", Double.valueOf(f7));
                        fvin fvin0 = fvio0.b;
                        Objects.requireNonNull(fvin0);
                        if((f6 < 5.0)) {
                            v9 = v8;
                            gged1 = gged0;
                            v10 = v6;
                            fvcl2 = fvcl1;
                            f9 = f4;
                            f10 = f1;
                            f11 = 0.0f;
                            f12 = 0.0f;
                            fvio1 = fvio0;
                        }
                        else {
                            double f13 = Math.tan(Math.toRadians(f6));
                            Objects.requireNonNull(fvin0);
                            gged1 = gged0;
                            Objects.requireNonNull(fvin0);
                            double f14 = Math.tan(Math.toRadians(Math.min(f6 + 5.0, 90.0)));
                            double f15 = f1 / Math.cos(Math.toRadians(f6));
                            v9 = v8;
                            double f16 = Math.cos(Math.toRadians(90.0 - f7));
                            double f17 = Math.sin(Math.toRadians(90.0 - f7));
                            double f18 = Math.min((((double)fvcl1.a) - f4) / Math.tan(Math.toRadians(Math.max(f6 - 5.0, 0.01))), fvin0.a);
                            double f19 = -0.0;
                            double f20 = 0.000001;
                            f9 = f4;
                            f10 = f1;
                            double f21 = f3;
                            double f22 = f2;
                            double f23 = 0.0;
                            fvio1 = fvio0;
                            while(true) {
                                if(Double.compare(f20, f18) <= 0 && (f19 < f14)) {
                                    Objects.requireNonNull(fvin0);
                                    Objects.requireNonNull(fvin0);
                                    if((f23 * 0.5 < 20.0)) {
                                        v10 = v6;
                                        if(fvcl1.k(((int)f22), ((int)f21))) {
                                            int v11 = fvcl1.e(((int)f22), ((int)f21));
                                            double f24 = (double)fvcl1.c(v11);
                                            double f25 = (f24 - f9) / f20;
                                            hirl hirl2 = fvcl1.j(v11);
                                            if(hirl2 == hirl.d) {
                                                fvcl3 = fvcl1;
                                                double f26 = ((double)fvcl1.d(v11)) + f24 - (f9 + f20 * f13);
                                                if((f26 > 0.0)) {
                                                    f23 += Math.min(f26, f15);
                                                }
                                            }
                                            else {
                                                fvcl3 = fvcl1;
                                            }
                                            if(hirl2 != hirl1) {
                                                f19 = Math.max(f19, f25);
                                            }
                                            f22 += f16;
                                            f21 += f17;
                                            f20 += f10;
                                            v6 = v10;
                                            fvcl1 = fvcl3;
                                            continue;
                                        }
                                        else {
                                            break;
                                        }
                                    }
                                }
                                v10 = v6;
                                break;
                            }
                            fvcl2 = fvcl1;
                            Objects.requireNonNull(fvin0);
                            if((f19 < f14)) {
                                Objects.requireNonNull(fvin0);
                                if((f23 * 0.5 < 20.0)) {
                                    Objects.requireNonNull(fvin0);
                                    Objects.requireNonNull(fvin0);
                                    Objects.requireNonNull(fvin0);
                                    Objects.requireNonNull(fvin0);
                                    f8 = 0.5 - glwp.a(Math.toDegrees(Math.atan(f19)) - f6, -5.0, 5.0) / 10.0;
                                }
                            }
                            f12 = (float)(f23 * 0.5);
                            f11 = (float)f8;
                        }
                        arr_f[v9] = f11;
                        if(f11 <= 0.0f) {
                            f12 = 999.0f;
                        }
                        arr_f1[v9] = f12;
                        v8 = v9 + 1;
                        fvio0 = fvio1;
                        arr_b2 = arr_b2;
                        arr_f = arr_f;
                        arr_f1 = arr_f1;
                        gged0 = gged1;
                        f4 = f9;
                        f1 = f10;
                        v6 = v10;
                        fvcl1 = fvcl2;
                    }
                }
                arr_b3 = arr_b2;
                gftb.D(0, arr_f.length);
                arr_b3[v7] = fvis.a(f5);
            }
            else {
                fvil0 = fvil0;
                fviq1 = fviq0;
                v7 = v5;
                arr_b3 = arr_b;
            }
            v5 = v7 + 1;
            fvir0 = this;
            fviq0 = fviq1;
            arr_b = arr_b3;
        }
        return arr_b;
    }
}

