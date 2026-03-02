import java.util.List;

public final class hwk {
    public final hvj a;
    private final ify b;
    private final hwg c;
    private final ifb d;
    private boolean e;

    public hwk(ify ify0) {
        this.b = ify0;
        this.a = new hvj(ify0.r());
        this.c = new hwg();
        this.d = new ifb();
    }

    public final int a(hwh hwh0, hwy hwy0, boolean z) {
        boolean z9;
        boolean z6;
        boolean z5;
        long v28;
        long[] arr_v3;
        Object[] arr_object2;
        long[] arr_v2;
        int v20;
        int v19;
        Object object0;
        boolean z4;
        int v15;
        int v7;
        List list1;
        boolean z1;
        long v5;
        long v4;
        hwg hwg1;
        if(this.e) {
            return 0;
        }
        try {
            this.e = true;
            hwg hwg0 = this.c;
            List list0 = hwh0.a;
            byi byi0 = new byi(list0.size());
            int v1 = list0.size();
            int v2 = 0;
            while(v2 < v1) {
                hwj hwj0 = (hwj)list0.get(v2);
                byi byi1 = hwg0.a;
                long v3 = hwj0.a;
                hwf hwf0 = (hwf)byi1.d(v3);
                if(hwf0 == null) {
                    hwg1 = hwg0;
                    v4 = hwj0.b;
                    v5 = hwj0.d;
                    z1 = false;
                }
                else {
                    hwg1 = hwg0;
                    v4 = hwf0.a;
                    v5 = hwy0.g(hwf0.b);
                    z1 = true;
                }
                hwe hwe0 = new hwe(v3, hwj0.b, hwj0.d, hwj0.e, hwj0.f, v4, v5, z1, hwj0.g, hwj0.i, hwj0.j, hwj0.k);
                long v6 = hwj0.b;
                byi0.h(v3, hwe0);
                if(hwj0.e) {
                    list1 = list0;
                    v7 = v1;
                    byi1.h(v3, new hwf(v6, hwj0.c));
                }
                else {
                    list1 = list0;
                    v7 = v1;
                    byi1.i(v3);
                }
                ++v2;
                list0 = list1;
                v1 = v7;
                hwg0 = hwg1;
            }
            int v8 = 1;
            hvo hvo0 = new hvo(byi0, hwh0);
            byi byi2 = hvo0.a;
            int v9 = byi2.b();
            for(int v10 = 0; v10 < v9; ++v10) {
                hwe hwe1 = (hwe)byi2.f(v10);
                if(hwe1.d || hwe1.h) {
                    v8 = 0;
                    break;
                }
            }
            int v11 = byi2.b();
            int v12 = 0;
            while(v12 < v11) {
                hwe hwe2 = (hwe)byi2.f(v12);
                if(v8 != 0 || hvu.d(hwe2)) {
                    ifb ifb0 = this.d;
                    this.b.H(hwe2.c, ifb0, hwe2.i, true);
                    if(!ifb0.isEmpty()) {
                        hvj hvj0 = this.a;
                        long v13 = hwe2.a;
                        boolean z2 = hvu.d(hwe2);
                        hvs hvs0 = hvj0.f;
                        byd byd0 = hvj0.h;
                        byd0.d();
                        int v14 = ifb0.a();
                        v15 = v8;
                        hvs hvs1 = hvs0;
                        int v16 = 0;
                        boolean z3 = true;
                        while(v16 < v14) {
                            hfb hfb0 = ifb0.c(v16);
                            if(hfb0.B) {
                                hfb0.A = new hvi(hvj0, hfb0);
                                if(z3) {
                                    z4 = z2;
                                    int v17 = hvs1.d.b;
                                    Object[] arr_object = hvs1.d.a;
                                    int v18 = 0;
                                    while(true) {
                                        object0 = null;
                                        if(v18 < v17) {
                                            Object object1 = arr_object[v18];
                                            if(ibuq.m(((hvr)object1).a, hfb0)) {
                                                object0 = object1;
                                            }
                                            else {
                                                ++v18;
                                                v17 = v17;
                                                continue;
                                            }
                                        }
                                        break;
                                    }
                                    if(((hvr)object0) != null) {
                                        ((hvr)object0).c = true;
                                        ((hvr)object0).b.b(v13);
                                        Object object2 = byd0.a(v13);
                                        if(object2 == null) {
                                            object2 = new bzd(null);
                                            byd0.e(v13, object2);
                                        }
                                        ((bzd)object2).p(((hvr)object0));
                                        hvs1 = (hvr)object0;
                                        z3 = true;
                                        goto label_113;
                                    }
                                }
                                else {
                                    z4 = z2;
                                }
                                hvr hvr0 = new hvr(hfb0);
                                hvr0.b.b(v13);
                                Object object3 = byd0.a(v13);
                                if(object3 == null) {
                                    object3 = new bzd(null);
                                    byd0.e(v13, object3);
                                }
                                ((bzd)object3).p(hvr0);
                                hvs1.d.n(hvr0);
                                hvs1 = hvr0;
                                z3 = false;
                            }
                            else {
                                z4 = z2;
                            }
                        label_113:
                            ++v16;
                            v11 = v11;
                            v12 = v12;
                            z2 = z4;
                        }
                        v19 = v11;
                        v20 = v12;
                        if(z2) {
                            long[] arr_v = byd0.b;
                            Object[] arr_object1 = byd0.c;
                            long[] arr_v1 = byd0.a;
                            int v21 = arr_v1.length - 2;
                            if(v21 >= 0) {
                                int v22 = 0;
                                while(true) {
                                    long v23 = arr_v1[v22];
                                    if((~v23 << 7 & v23 & 0x8080808080808080L) == 0x8080808080808080L) {
                                        goto label_162;
                                    }
                                    int v24 = 0;
                                    while(true) {
                                        arr_v2 = arr_v;
                                        int v25 = 8 - (~(v22 - v21) >>> 0x1F);
                                        if(v24 >= v25) {
                                            break;
                                        }
                                        if((v23 & 0xFFL) < 0x80L) {
                                            int v26 = (v22 << 3) + v24;
                                            arr_object2 = arr_object1;
                                            long v27 = arr_v2[v26];
                                            bzd bzd0 = (bzd)arr_object2[v26];
                                            arr_v3 = arr_v1;
                                            v28 = v23;
                                            Object[] arr_object3 = hvs0.d.a;
                                            int v29 = hvs0.d.b;
                                            int v30 = 0;
                                            while(v30 < v29) {
                                                ((hvr)arr_object3[v30]).d(v27, bzd0);
                                                ++v30;
                                                v29 = v29;
                                            }
                                        }
                                        else {
                                            arr_object2 = arr_object1;
                                            arr_v3 = arr_v1;
                                            v28 = v23;
                                        }
                                        v23 = v28 >> 8;
                                        ++v24;
                                        arr_v = arr_v2;
                                        arr_object1 = arr_object2;
                                        arr_v1 = arr_v3;
                                    }
                                    Object[] arr_object4 = arr_object1;
                                    long[] arr_v4 = arr_v1;
                                    if(v25 == 8) {
                                        goto label_165;
                                    label_162:
                                        arr_v2 = arr_v;
                                        arr_object4 = arr_object1;
                                        arr_v4 = arr_v1;
                                    label_165:
                                        if(v22 != v21) {
                                            ++v22;
                                            arr_v = arr_v2;
                                            arr_object1 = arr_object4;
                                            arr_v1 = arr_v4;
                                            continue;
                                        }
                                        break;
                                    }
                                    ifb0.clear();
                                    goto label_178;
                                }
                                ifb0.clear();
                                goto label_178;
                            }
                        }
                        ifb0.clear();
                        goto label_178;
                    }
                }
                v15 = v8;
                v19 = v11;
                v20 = v12;
            label_178:
                v12 = v20 + 1;
                v8 = v15;
                v11 = v19;
            }
            hvj hvj1 = this.a;
            hvs hvs2 = hvj1.f;
            if(hvs2.b(byi2, hvj1.a, hvo0, z)) {
                z6 = true;
                hvj1.b = true;
                gwq gwq0 = hvs2.d;
                Object[] arr_object5 = gwq0.a;
                int v31 = gwq0.b;
                boolean z7 = false;
                for(int v32 = 0; v32 < v31; ++v32) {
                    z7 = ((hvr)arr_object5[v32]).e(hvo0, z) || z7;
                }
                Object[] arr_object6 = gwq0.a;
                int v33 = gwq0.b;
                boolean z8 = false;
                for(int v34 = 0; v34 < v33; ++v34) {
                    z8 = ((hvr)arr_object6[v34]).c(hvo0) || z8;
                }
                hvs2.f();
                z5 = z8 || z7;
                hvj1.b = false;
                if(hvj1.e) {
                    hvj1.e = false;
                    bzd bzd1 = hvj1.g;
                    int v35 = bzd1.b;
                    for(int v36 = 0; v36 < v35; ++v36) {
                        hvj1.c(((hfb)bzd1.c(v36)));
                    }
                    bzd1.k();
                }
                if(hvj1.c) {
                    hvj1.c = false;
                    hvj1.b();
                }
                if(hvj1.d) {
                    hvj1.d = false;
                    hvj1.a();
                }
            }
            else {
                z5 = false;
                z6 = true;
            }
            z9 = false;
            if(!hvo0.c) {
                int v37 = byi2.b();
                for(int v38 = 0; v38 < v37; ++v38) {
                    hwe hwe3 = (hwe)byi2.f(v38);
                    if(hvu.h(hwe3) && hwe3.c()) {
                        z9 = true;
                        break;
                    }
                }
            }
            int v39 = byi2.b();
            for(int v40 = 0; true; ++v40) {
                if(v40 >= v39) {
                    z6 = false;
                    break;
                }
                if(((hwe)byi2.f(v40)).c()) {
                    break;
                }
            }
        }
        finally {
            this.e = false;
        }
        return hwl.a(z5, z9, z6);
    }

    public final void b() {
        if(!this.e) {
            this.c.a.g();
            this.a.b();
        }
    }
}

