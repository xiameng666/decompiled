public final class ivv {
    public final ivt a;
    public final ivy b;
    public boolean c;
    public Object d;
    private boolean e;
    private boolean f;
    private long g;
    private final ibth h;
    private final hjw i;
    private final bzd j;

    public ivv() {
        bxw.a();
        this(null);
    }

    public ivv(byte[] arr_b) {
        this.a = new ivt();
        this.b = new ivy();
        this.j = new bzd(null);
        this.g = -1L;
        this.h = new ivu(this);
        this.i = new hjw();
    }

    public final void a() {
        long[] arr_v2;
        long v = System.currentTimeMillis();
        if(this.e) {
            this.e = false;
            Object[] arr_object = this.j.a;
            int v1 = this.j.b;
            for(int v2 = 0; v2 < v1; ++v2) {
                ((ibth)arr_object[v2]).a();
            }
            ivt ivt0 = this.a;
            long[] arr_v = ivt0.a;
            int v3 = ivt0.c;
            for(int v4 = 0; v4 < arr_v.length - 2 && v4 < v3; v4 += 3) {
                long v5 = arr_v[v4 + 2];
                if((((int)(v5 >> 61)) & 1) != 0) {
                    long v6 = arr_v[v4];
                    long v7 = arr_v[v4 + 1];
                    if(((ivx)this.b.e.a(((int)v5) & 0x3FFFFFF)) != null) {
                        throw null;
                    }
                }
            }
            Object[] arr_object1 = this.b.e.c;
            long[] arr_v1 = this.b.e.a;
            int v8 = arr_v1.length - 2;
            if(v8 >= 0) {
                int v9 = 0;
                while(true) {
                    long v10 = arr_v1[v9];
                    if((~v10 << 7 & v10 & 0x8080808080808080L) == 0x8080808080808080L) {
                        goto label_39;
                    }
                    int v11 = 8 - (~(v9 - v8) >>> 0x1F);
                    for(int v12 = 0; v12 < v11; ++v12) {
                        if((v10 & 0xFFL) < 0x80L && ((ivx)arr_object1[(v9 << 3) + v12]) != null) {
                            throw null;
                        }
                        v10 >>= 8;
                    }
                    if(v11 == 8) {
                    label_39:
                        if(v9 != v8) {
                            ++v9;
                            continue;
                        }
                    }
                    goto label_42;
                }
            }
            else {
            label_42:
                arr_v2 = ivt0.a;
                int v13 = ivt0.c;
            }
            for(int v14 = 0; v14 < arr_v2.length - 2 && v14 < v13; v14 += 3) {
                arr_v2[v14 + 2] &= 0xDFFFFFFFFFFFFFFFL;
            }
        }
        if(this.c) {
            this.c = false;
            Object[] arr_object2 = this.b.e.c;
            long[] arr_v3 = this.b.e.a;
            int v15 = arr_v3.length - 2;
            if(v15 >= 0) {
                int v16 = 0;
                while(true) {
                    long v17 = arr_v3[v16];
                    if((~v17 << 7 & v17 & 0x8080808080808080L) == 0x8080808080808080L) {
                        goto label_67;
                    }
                    int v18 = 8 - (~(v16 - v15) >>> 0x1F);
                    for(int v19 = 0; v19 < v18; ++v19) {
                        if((v17 & 0xFFL) < 0x80L && ((ivx)arr_object2[(v16 << 3) + v19]) != null) {
                            throw null;
                        }
                        v17 >>= 8;
                    }
                    if(v18 == 8) {
                    label_67:
                        if(v16 != v15) {
                            ++v16;
                            continue;
                        }
                    }
                    goto label_70;
                }
            }
            else {
                goto label_70;
            }
        }
        else {
        label_70:
            if(this.f) {
                this.f = false;
                ivt ivt1 = this.a;
                long[] arr_v4 = ivt1.a;
                int v20 = ivt1.c;
                long[] arr_v5 = ivt1.b;
                int v22 = 0;
                for(int v21 = 0; v21 < arr_v4.length - 2 && v22 < arr_v5.length - 2 && v21 < v20; v21 += 3) {
                    if(arr_v4[v21 + 2] != 0x1FFFFFFFFFFFFFFFL) {
                        arr_v5[v22] = arr_v4[v21];
                        arr_v5[v22 + 1] = arr_v4[v21 + 1];
                        arr_v5[v22 + 2] = arr_v4[v21 + 2];
                        v22 += 3;
                    }
                }
                ivt1.c = v22;
                ivt1.a = arr_v5;
                ivt1.b = arr_v4;
            }
        }
        ivy ivy0 = this.b;
        if(ivy0.a > v) {
            return;
        }
        Object[] arr_object3 = ivy0.e.c;
        long[] arr_v6 = ivy0.e.a;
        int v23 = arr_v6.length - 2;
        if(v23 >= 0) {
            int v24 = 0;
            while(true) {
                long v25 = arr_v6[v24];
                if((~v25 << 7 & v25 & 0x8080808080808080L) != 0x8080808080808080L) {
                    int v26 = 8 - (~(v24 - v23) >>> 0x1F);
                    for(int v27 = 0; v27 < v26; ++v27) {
                        if((v25 & 0xFFL) < 0x80L && ((ivx)arr_object3[(v24 << 3) + v27]) != null) {
                            throw null;
                        }
                        v25 >>= 8;
                    }
                    if(v26 == 8) {
                        goto label_108;
                    }
                    break;
                }
            label_108:
                if(v24 == v23) {
                    break;
                }
                ++v24;
            }
        }
        ivy0.a = -1L;
    }

    public final void b() {
        this.e = true;
    }

    public final void c(ify ify0) {
        int v = 1;
        this.e = true;
        int v1 = ify0.c & 0x3FFFFFF;
        long[] arr_v = this.a.a;
        int v2 = this.a.c;
        int v3 = 0;
        for(int v4 = 0; v4 < arr_v.length - 2 && v4 < v2; v4 += 3) {
            long v5 = arr_v[v4 + 2];
            if((((int)v5) & 0x3FFFFFF) == v1) {
                arr_v[v4 + 2] = 0x2000000000000000L | v5;
                break;
            }
        }
        Object object0 = this.d;
        if(object0 == null) {
            v = 0;
        }
        long v6 = this.b.a;
        if(v6 >= 0L) {
            v3 = v;
        }
        else if(v != 0) {
            return;
        }
        if(this.g == v6 && v3 != 0) {
            return;
        }
        if(object0 != null) {
            heg.a.removeCallbacks(((Runnable)object0));
        }
        long v7 = System.currentTimeMillis();
        long v8 = Math.max(v6, 16L + v7);
        this.g = v8;
        hef hef0 = new hef(this.h);
        heg.a.postDelayed(hef0, v8 - v7);
        this.d = hef0;
    }

    public final void d(ify ify0) {
        long v = ivv.j(ify0);
        if(ivw.b(v)) {
            ify0.f = v;
            ify0.aB();
            gwq gwq0 = ify0.k();
            Object[] arr_object = gwq0.a;
            int v1 = gwq0.b;
            for(int v2 = 0; v2 < v1; ++v2) {
                this.e(((ify)arr_object[v2]), false);
            }
            this.c(ify0);
            return;
        }
        this.h(ify0);
    }

    public final void e(ify ify0, boolean z) {
        long[] arr_v3;
        ihc ihc0 = ify0.q();
        int v = ihc0.w();
        int v1 = ihc0.v();
        long v2 = ify0.d;
        long v3 = ify0.e >> 0x20;
        long v4 = ify0.e & 0xFFFFFFFFL;
        this.i(ify0);
        long v5 = ify0.d;
        if(!ivw.b(v5)) {
            this.g(ify0, z);
            return;
        }
        ify0.e = ((long)v1) & 0xFFFFFFFFL | ((long)v) << 0x20;
        int v6 = jlf.a(v5);
        int v7 = jlf.b(v5);
        int v8 = v6 + v;
        int v9 = v7 + v1;
        if(!z && jlf.f(v5, v2) && ((int)v3) == v && ((int)v4) == v1) {
            return;
        }
        int v10 = ify0.c;
        if(!z) {
            ivt ivt0 = this.a;
            long[] arr_v = ivt0.a;
            int v11 = ivt0.c;
            int v12 = 0;
            while(v12 < arr_v.length - 2 && v12 < v11) {
                long v13 = arr_v[v12 + 2];
                if((((int)v13) & 0x3FFFFFF) == (v10 & 0x3FFFFFF)) {
                    long v14 = arr_v[v12];
                    arr_v[v12] = ((long)v6) << 0x20 | ((long)v7) & 0xFFFFFFFFL;
                    arr_v[v12 + 1] = ((long)v8) << 0x20 | ((long)v9) & 0xFFFFFFFFL;
                    arr_v[v12 + 2] = v13 | 0x2000000000000000L;
                    int v15 = v6 - ((int)(v14 >> 0x20));
                    int v16 = v7 - ((int)v14);
                    if(((v15 == 0 ? 0 : 1) | (v16 == 0 ? 0 : 1)) == 0) {
                        goto label_69;
                    }
                    long[] arr_v1 = ivt0.a;
                    long[] arr_v2 = ivt0.b;
                    int v17 = ivt0.c / 3;
                    arr_v2[0] = ((long)(v12 + 3 & 0x3FFFFFF)) << 26 | v13 & 0xFFF0000003FFFFFFL;
                    int v18 = 1;
                    while(v18 > 0) {
                        --v18;
                        long v19 = arr_v2[v18];
                        int v20 = ((int)v19) & 0x3FFFFFF;
                        int v21 = ((int)(v19 >> 26)) & 0x3FFFFFF;
                        int v22 = ((int)(v19 >> 52)) & 0x1FF;
                        while(v21 < arr_v1.length - 2 && v21 < (v22 == 0x1FF ? v17 : v22 + v21)) {
                            long v23 = arr_v1[v21 + 2];
                            if((((int)(v23 >> 26)) & 0x3FFFFFF) == v20) {
                                long v24 = arr_v1[v21];
                                long v25 = arr_v1[v21 + 1];
                                arr_v3 = arr_v1;
                                arr_v3[v21] = ((long)(((int)v24) + v16)) & 0xFFFFFFFFL | ((long)(((int)(v24 >> 0x20)) + v15)) << 0x20;
                                arr_v3[v21 + 1] = ((long)(((int)v25) + v16)) & 0xFFFFFFFFL | ((long)(((int)(v25 >> 0x20)) + v15)) << 0x20;
                                arr_v3[v21 + 2] = v23 | 0x2000000000000000L;
                                if((((int)(v23 >> 52)) & 0x1FF) > 0) {
                                    arr_v2[v18] = v23 & 0xFFF0000003FFFFFFL | ((long)(v21 + 3 & 0x3FFFFFF)) << 26;
                                    ++v18;
                                }
                            }
                            else {
                                arr_v3 = arr_v1;
                            }
                            v21 += 3;
                            arr_v1 = arr_v3;
                        }
                        arr_v1 = arr_v1;
                    }
                    goto label_69;
                }
                v12 += 3;
            }
        }
        ify ify1 = ify0.n();
        this.a.a(v10, v6, v7, v8, v9, (ify1 == null ? -1 : ify1.c), ify0.u.j(0x400), ify0.u.j(16));
    label_69:
        this.b();
    }

    public final void f(ify ify0) {
        int v = ify0.c & 0x3FFFFFF;
        long[] arr_v = this.a.a;
        int v1 = this.a.c;
        for(int v2 = 0; v2 < arr_v.length - 2 && v2 < v1; v2 += 3) {
            if((((int)arr_v[v2 + 2]) & 0x3FFFFFF) == v) {
                arr_v[v2] = -1L;
                arr_v[v2 + 1] = -1L;
                arr_v[v2 + 2] = 0x1FFFFFFFFFFFFFFFL;
                break;
            }
        }
        this.b();
        this.f = true;
    }

    private final void g(ify ify0, boolean z) {
        ihy ihy0 = ify0.s();
        ihc ihc0 = ify0.q();
        hjw hjw0 = this.i;
        hjw0.c(((float)ihc0.w()), ((float)ihc0.v()));
        while(ihy0 != null) {
            iil iil0 = ihy0.G;
            long v = ((long)Float.floatToRawIntBits(jlf.a(ihy0.y))) << 0x20 | ((long)Float.floatToRawIntBits(jlf.b(ihy0.y))) & 0xFFFFFFFFL;
            float f = Float.intBitsToFloat(((int)(v >> 0x20)));
            float f1 = Float.intBitsToFloat(((int)(0xFFFFFFFFL & v)));
            hjw0.a += f;
            hjw0.b += f1;
            hjw0.c += f;
            hjw0.d += f1;
            ihy0 = ihy0.x;
            if(iil0 != null) {
                float[] arr_f = iil0.m();
                if(!hmc.a(arr_f)) {
                    hmb.b(arr_f, hjw0);
                }
            }
        }
        int v1 = (int)hjw0.a;
        int v2 = (int)hjw0.b;
        int v3 = (int)hjw0.c;
        int v4 = (int)hjw0.d;
        int v5 = ify0.c;
        if(!z) {
            long[] arr_v = this.a.a;
            int v6 = this.a.c;
            int v7 = 0;
            while(v7 < arr_v.length - 2 && v7 < v6) {
                long v8 = arr_v[v7 + 2];
                if((((int)v8) & 0x3FFFFFF) == (v5 & 0x3FFFFFF)) {
                    arr_v[v7] = ((long)v1) << 0x20 | ((long)v2) & 0xFFFFFFFFL;
                    arr_v[v7 + 1] = ((long)v3) << 0x20 | ((long)v4) & 0xFFFFFFFFL;
                    arr_v[v7 + 2] = 0x2000000000000000L | v8;
                    goto label_39;
                }
                v7 += 3;
            }
        }
        ify ify1 = ify0.n();
        this.a.a(v5, v1, v2, v3, v4, (ify1 == null ? -1 : ify1.c), ify0.u.j(0x400), ify0.u.j(16));
    label_39:
        this.b();
    }

    private final void h(ify ify0) {
        gwq gwq0 = ify0.k();
        Object[] arr_object = gwq0.a;
        int v = gwq0.b;
        for(int v1 = 0; v1 < v; ++v1) {
            ify ify1 = (ify)arr_object[v1];
            this.g(ify1, false);
            this.h(ify1);
        }
    }

    private final void i(ify ify0) {
        long v2;
        long v = ify0.s().y;
        ify ify1 = ify0.n();
        if(ify1 != null) {
            if(!ivw.b(ify1.d)) {
                this.i(ify1);
            }
            long v1 = ify1.d;
            if(ivw.b(v1)) {
                if(ify1.g) {
                    v2 = ivv.j(ify1);
                    ify1.f = v2;
                    ify1.aB();
                }
                else {
                    v2 = ify1.f;
                }
                v = ivw.b(v2) ? jlf.d(jlf.d(v1, v2), v) : 0x7FFFFFFF7FFFFFFFL;
            }
            else {
                v = 0x7FFFFFFF7FFFFFFFL;
            }
        }
        ify0.d = v;
    }

    private static final long j(ify ify0) {
        ihy ihy0 = ify0.s();
        ihy ihy1 = ify0.r();
        long v = 0L;
        while(ihy1 != null && ihy1 != ihy0) {
            iil iil0 = ihy1.G;
            v = jlg.a(v, ihy1.y);
            ihy1 = ihy1.x;
            if(iil0 != null) {
                float[] arr_f = iil0.m();
                int v1 = ivw.a(arr_f);
                if(v1 != 3) {
                    if((v1 & 2) == 0) {
                        return 0x7FFFFFFF7FFFFFFFL;
                    }
                    v = hmb.a(arr_f, v);
                }
            }
        }
        return jlg.b(v);
    }
}

