public final class cnj implements cnc {
    public final int a;
    public final int b;
    private final bxt c;
    private final bxv d;
    private final cie e;
    private int[] f;
    private float[] g;
    private cht h;
    private cht i;
    private cht j;
    private cht k;
    private float[] l;
    private float[] m;
    private chx n;

    public cnj(bxt bxt0, bxv bxv0, int v, int v1, cie cie0) {
        this.c = bxt0;
        this.d = bxv0;
        this.a = v;
        this.b = v1;
        this.e = cie0;
        this.f = cna.a;
        this.g = cna.b;
        this.l = cna.b;
        this.m = cna.b;
        this.n = cna.c;
    }

    @Override  // cmx
    public final long a(cht cht0, cht cht1, cht cht2) {
        return cnb.a(this);
    }

    @Override  // cmx
    public final cht b(cht cht0, cht cht1, cht cht2) {
        return cmw.a(this, cht0, cht1, cht2);
    }

    @Override  // cmx
    public final cht c(long v, cht cht0, cht cht1, cht cht2) {
        int v1 = (int)cna.a(this, v / 1000000L);
        bxv bxv0 = this.d;
        cni cni0 = (cni)bxv0.a(v1);
        if(cni0 == null) {
            if(v1 >= this.a) {
                return cht1;
            }
            if(v1 <= 0) {
                return cht0;
            }
            this.k(cht0, cht1, cht2);
            cht cht3 = this.h;
            ibuq.c(cht3);
            int v2 = 0;
            if(this.n != cna.c) {
                float f = this.h(v1);
                float[] arr_f = this.l;
                chw[][] arr2_chw = this.n.a;
                float f1 = arr2_chw[0][0].a;
                int v3 = arr2_chw.length - 1;
                float f2 = arr2_chw[v3][0].b;
                if(f >= f1 && f <= f2) {
                    boolean z = false;
                    for(int v4 = 0; v4 < arr2_chw.length; ++v4) {
                        int v6 = 0;
                        for(int v5 = 0; v5 < arr_f.length - 1; v5 += 2) {
                            chw chw0 = arr2_chw[v4][v6];
                            if((f <= chw0.b)) {
                                if(chw0.g) {
                                    arr_f[v5] = chw0.c(f);
                                    arr_f[v5 + 1] = chw0.d(f);
                                }
                                else {
                                    chw0.e(f);
                                    arr_f[v5] = chw0.h + chw0.e * chw0.c;
                                    arr_f[v5 + 1] = chw0.i + chw0.f * chw0.d;
                                }
                                z = true;
                            }
                            ++v6;
                        }
                        if(z) {
                            break;
                        }
                    }
                }
                else {
                    int v7 = arr_f.length - 1;
                    int v8 = Float.compare(f, f2);
                    if(v8 > 0) {
                        f1 = f2;
                    }
                    if(v8 <= 0) {
                        v3 = 0;
                    }
                    float f3 = f - f1;
                    int v9 = 0;
                    for(int v10 = 0; v9 < v7; ++v10) {
                        chw chw1 = arr2_chw[v3][v10];
                        if(chw1.g) {
                            arr_f[v9] = chw1.c(f1) + chw1.h * f3;
                            arr_f[v9 + 1] = chw1.d(f1) + chw1.i * f3;
                        }
                        else {
                            chw1.e(f1);
                            float f4 = chw1.a() * f3;
                            arr_f[v9] = chw1.h + chw1.e * chw1.c + f4;
                            float f5 = chw1.b() * f3;
                            arr_f[v9 + 1] = chw1.i + chw1.f * chw1.d + f5;
                        }
                        v9 += 2;
                    }
                }
                while(v2 < arr_f.length) {
                    cht3.e(v2, arr_f[v2]);
                    ++v2;
                }
                return cht3;
            }
            int v11 = this.j(v1);
            float f6 = this.i(v11, v1, true);
            bxt bxt0 = this.c;
            cni cni1 = (cni)bxv0.a(bxt0.a(v11));
            if(cni1 != null) {
                cht cht4 = cni1.a;
                if(cht4 != null) {
                    cht0 = cht4;
                }
            }
            cni cni2 = (cni)bxv0.a(bxt0.a(v11 + 1));
            if(cni2 != null) {
                cht cht5 = cni2.a;
                if(cht5 != null) {
                    cht1 = cht5;
                }
            }
            int v12 = cht3.b();
            while(v2 < v12) {
                cht3.e(v2, cht0.a(v2) * (1.0f - f6) + cht1.a(v2) * f6);
                ++v2;
            }
            return cht3;
        }
        return cni0.a;
    }

    @Override  // cmx
    public final cht d(long v, cht cht0, cht cht1, cht cht2) {
        long v1 = cna.a(this, v / 1000000L);
        if(v1 < 0L) {
            return cht2;
        }
        this.k(cht0, cht1, cht2);
        cht cht3 = this.i;
        ibuq.c(cht3);
        int v2 = 0;
        if(this.n != cna.c) {
            float f = this.h(((int)v1));
            float[] arr_f = this.m;
            chw[][] arr2_chw = this.n.a;
            float f1 = arr2_chw[0][0].a;
            float f2 = arr2_chw[arr2_chw.length - 1][0].b;
            if(f < f1) {
                f = f1;
            }
            if(f <= f2) {
                f2 = f;
            }
            boolean z = false;
            for(int v3 = 0; v3 < arr2_chw.length; ++v3) {
                int v4 = 0;
                for(int v5 = 0; v4 < arr_f.length - 1; ++v5) {
                    chw chw0 = arr2_chw[v3][v5];
                    if((f2 <= chw0.b)) {
                        if(chw0.g) {
                            arr_f[v4] = chw0.h;
                            arr_f[v4 + 1] = chw0.i;
                        }
                        else {
                            chw0.e(f2);
                            arr_f[v4] = chw0.a();
                            arr_f[v4 + 1] = chw0.b();
                        }
                        z = true;
                    }
                    v4 += 2;
                }
                if(z) {
                    break;
                }
            }
            while(v2 < arr_f.length) {
                cht3.e(v2, arr_f[v2]);
                ++v2;
            }
            return cht3;
        }
        cht cht4 = cna.b(this, v1 - 1L, cht0, cht1, cht2);
        cht cht5 = cna.b(this, v1, cht0, cht1, cht2);
        int v6 = cht4.b();
        while(v2 < v6) {
            cht3.e(v2, (cht4.a(v2) - cht5.a(v2)) * 1000.0f);
            ++v2;
        }
        return cht3;
    }

    @Override  // cmx
    public final boolean e() {
        return false;
    }

    @Override  // cnc
    public final int f() {
        return this.b;
    }

    @Override  // cnc
    public final int g() {
        return this.a;
    }

    private final float h(int v) {
        return this.i(this.j(v), v, false);
    }

    private final float i(int v, int v1, boolean z) {
        cie cie0;
        bxt bxt0 = this.c;
        if(v >= bxt0.b - 1) {
            return ((float)v1) / 1000.0f;
        }
        int v2 = bxt0.a(v);
        int v3 = bxt0.a(v + 1);
        if(v1 == v2) {
            return ((float)v2) / 1000.0f;
        }
        cni cni0 = (cni)this.d.a(v2);
        if(cni0 == null) {
            cie0 = this.e;
        }
        else {
            cie0 = cni0.b;
            if(cie0 == null) {
                cie0 = this.e;
            }
        }
        float f = (float)(v3 - v2);
        float f1 = cie0.a(((float)(v1 - v2)) / f);
        return z ? f1 : (f * f1 + ((float)v2)) / 1000.0f;
    }

    private final int j(int v) {
        int v4;
        bxt bxt0 = this.c;
        int v1 = bxt0.b;
        if(v1 <= 0) {
            cad.c("");
        }
        int v2 = v1 - 1;
        int v3 = 0;
        while(true) {
            if(v3 > v2) {
                v4 = -(v3 + 1);
                break;
            }
            v4 = v3 + v2 >>> 1;
            int v5 = bxt0.a[v4];
            if(v5 < v) {
                v3 = v4 + 1;
            }
            else {
                if(v5 <= v) {
                    break;
                }
                v2 = v4 - 1;
            }
        }
        return v4 >= -1 ? v4 : -(v4 + 2);
    }

    private final void k(cht cht0, cht cht1, cht cht2) {
        float[] arr_f1;
        chx chx0 = this.n;
        chx chx1 = cna.c;
        if(this.h == null) {
            this.h = cht0.c();
            this.i = cht2.c();
            bxt bxt0 = this.c;
            int v = bxt0.b;
            float[] arr_f = new float[v];
            for(int v1 = 0; v1 < v; ++v1) {
                arr_f[v1] = ((float)bxt0.a(v1)) / 1000.0f;
            }
            this.g = arr_f;
            int v2 = bxt0.b;
            int[] arr_v = new int[v2];
            for(int v3 = 0; v3 < v2; ++v3) {
                int v4 = bxt0.a(v3);
                cni cni0 = (cni)this.d.a(v4);
                arr_v[v3] = 0;
            }
            this.f = arr_v;
        }
        if(chx0 == chx1 || this.n != chx1 && ibuq.m(this.j, cht0) && ibuq.m(this.k, cht1)) {
            return;
        }
        this.j = cht0;
        this.k = cht1;
        int v5 = (cht0.b() & 1) + cht0.b();
        this.l = new float[v5];
        this.m = new float[v5];
        bxt bxt1 = this.c;
        int v6 = bxt1.b;
        float[][] arr2_f = new float[v6][];
        int v7 = 0;
        while(v7 < v6) {
            int v8 = bxt1.a(v7);
            cni cni1 = (cni)this.d.a(v8);
            if(v8 == 0) {
                if(cni1 == null) {
                    arr_f1 = new float[v5];
                    for(int v9 = 0; v9 < v5; ++v9) {
                        arr_f1[v9] = cht0.a(v9);
                    }
                    goto label_65;
                }
                else {
                    v8 = 0;
                }
            }
            if(v8 == this.a && cni1 == null) {
                arr_f1 = new float[v5];
                for(int v10 = 0; v10 < v5; ++v10) {
                    arr_f1[v10] = cht1.a(v10);
                }
            }
            else {
                ibuq.c(cni1);
                cht cht3 = cni1.a;
                float[] arr_f2 = new float[v5];
                for(int v11 = 0; v11 < v5; ++v11) {
                    arr_f2[v11] = cht3.a(v11);
                }
                arr_f1 = arr_f2;
            }
        label_65:
            arr2_f[v7] = arr_f1;
            ++v7;
        }
        this.n = new chx(this.f, this.g, arr2_f);
    }
}

