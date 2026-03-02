public final class ihl {
    public final ify a;
    public final ihk b;
    public final ife c;
    public ihy d;
    public final hfb e;
    public hfb f;
    public gwq g;
    public gwq h;
    public final gwq i;
    private ihj j;

    public ihl(ify ify0) {
        this.a = ify0;
        ihk ihk0 = new ihk();
        ihk0.t = -1;
        this.b = ihk0;
        ife ife0 = new ife(ify0);
        this.c = ife0;
        this.d = ife0;
        this.e = ife0.f;
        this.f = ife0.f;
        this.i = new gwq(new hfc[16]);
    }

    public final int a() {
        return this.f.t;
    }

    public final void b() {
        for(hfb hfb0 = this.f; hfb0 != null; hfb0 = hfb0.v) {
            hfb0.K();
        }
    }

    public final void c() {
        for(hfb hfb0 = this.e; hfb0 != null; hfb0 = hfb0.u) {
            if(hfb0.B) {
                hfb0.L();
            }
        }
    }

    public final void d(hfb hfb0, ihy ihy0) {
        for(hfb hfb1 = hfb0.u; hfb1 != null; hfb1 = hfb1.u) {
            if(hfb1 == this.b) {
                ify ify0 = this.a.n();
                ihy0.x = ify0 == null ? null : ify0.r();
                this.d = ihy0;
                return;
            }
            if((hfb1.s & 2) != 0) {
                break;
            }
            hfb1.R(ihy0);
        }
    }

    public final void e() {
        for(hfb hfb0 = this.f; hfb0 != null; hfb0 = hfb0.v) {
            hfb0.N();
            if(hfb0.y) {
                iia.d(hfb0);
            }
            if(hfb0.z) {
                iia.g(hfb0);
            }
            hfb0.y = false;
            hfb0.z = false;
        }
    }

    public final void f() {
        for(hfb hfb0 = this.e; hfb0 != null; hfb0 = hfb0.u) {
            if(hfb0.B) {
                hfb0.O();
            }
        }
    }

    public final void g(int v, gwq gwq0, gwq gwq1, hfb hfb0, boolean z) {
        int v47;
        int v38;
        int v37;
        int v33;
        int v32;
        int v30;
        int[] arr_v6;
        int[] arr_v4;
        int v27;
        int v26;
        int v25;
        int v20;
        int v19;
        int v18;
        int v17;
        int[] arr_v3;
        gwq gwq3;
        gwq gwq2;
        int v1;
        ihj ihj0 = this.j;
        if(ihj0 == null) {
            v1 = v;
            gwq2 = gwq0;
            gwq3 = gwq1;
            ihj0 = new ihj(this, hfb0, v1, gwq2, gwq3, z);
            this.j = ihj0;
        }
        else {
            v1 = v;
            gwq2 = gwq0;
            gwq3 = gwq1;
            ihj0.a = hfb0;
            ihj0.b = v1;
            ihj0.c = gwq2;
            ihj0.d = gwq3;
            ihj0.e = z;
        }
        int v2 = gwq2.b - v1;
        int v3 = gwq3.b - v1;
        int v4 = (v2 + v3 + 1) / 2;
        iff iff0 = new iff(v4 * 3);
        iff iff1 = new iff(v4 * 4);
        iff1.d(0, v2, 0, v3);
        int v5 = v4 + v4 + 1;
        int[] arr_v = new int[v5];
        int[] arr_v1 = new int[v5];
        int[] arr_v2 = new int[5];
        while(iff1.a != 0) {
            int v6 = iff1.b();
            int v7 = iff1.b();
            int v8 = iff1.b();
            int v9 = iff1.b();
            int v10 = v8 - v9;
            int v11 = v6 - v7;
            if(v10 > 0 && v11 > 0) {
                int v12 = (v10 + v11 + 1) / 2;
                iec.b(arr_v, 1, v9);
                iec.b(arr_v1, 1, v8);
                int v13 = 0;
                while(v13 < v12) {
                    int v14 = v10 - v11;
                    int v15 = Math.abs(v14) & 1;
                    int v16 = -v13;
                    while(v16 <= v13) {
                        if(v16 == -v13) {
                            arr_v3 = arr_v2;
                            v17 = v12;
                            v18 = v7;
                        }
                        else {
                            arr_v3 = arr_v2;
                            if(v16 == v13) {
                                v17 = v12;
                                v18 = v7;
                            }
                            else {
                                v17 = v12;
                                v18 = v7;
                                if(iec.a(arr_v, v16 + 1) > iec.a(arr_v, v16 - 1)) {
                                    goto label_58;
                                }
                            }
                            v19 = iec.a(arr_v, v16 - 1);
                            v20 = v19 + 1;
                            goto label_60;
                        }
                    label_58:
                        v19 = iec.a(arr_v, v16 + 1);
                        v20 = v19;
                    label_60:
                        int v21 = v20 == v19 ? 1 : 0;
                        int v22 = v18 + (v20 - v9) - v16;
                        int v23;
                        for(v23 = v22; v20 < v8 && v23 < v6 && ihj0.a(v20, v23); ++v23) {
                            ++v20;
                        }
                        iec.b(arr_v, v16, v20);
                        if(v15 != 0) {
                            int v24 = v14 - v16;
                            if(v24 >= -v13 + 1 && v24 <= v13 - 1 && iec.a(arr_v1, v24) <= v20) {
                                v25 = v6;
                                v26 = v8;
                                v27 = v18;
                                ihi.a(v19, v22 - ((v13 == 0 ? 0 : 1) & v21), v20, v23, false, arr_v3);
                                arr_v4 = arr_v3;
                                goto label_128;
                            }
                        }
                        v7 = v18;
                        arr_v2 = arr_v3;
                        v6 = v6;
                        v16 += 2;
                        v8 = v8;
                        v12 = v17;
                    }
                    v25 = v6;
                    int v28 = v8;
                    int[] arr_v5 = arr_v2;
                    v27 = v7;
                    int v29 = -v13;
                    while(v29 <= v13) {
                        if(v29 == -v13) {
                            arr_v6 = arr_v5;
                            v30 = v28;
                        }
                        else {
                            if(v29 == v13) {
                                arr_v6 = arr_v5;
                                v30 = v28;
                            }
                            else {
                                arr_v6 = arr_v5;
                                v30 = v28;
                                if(iec.a(arr_v1, v29 + 1) < iec.a(arr_v1, v29 - 1)) {
                                    goto label_104;
                                }
                            }
                            int v31 = iec.a(arr_v1, v29 - 1);
                            v32 = v31 - 1;
                            v33 = v31;
                            goto label_106;
                        }
                    label_104:
                        v32 = iec.a(arr_v1, v29 + 1);
                        v33 = v32;
                    label_106:
                        int v34 = v25 - (v30 - v32 - v29);
                        int v35 = v32 == v33 ? 1 : 0;
                        int v36 = v34;
                        while(true) {
                            if(v32 > v9 && v34 > v27) {
                                v37 = v34;
                                v38 = v33;
                                int v39 = v37 - 1;
                                if(ihj0.a(v32 - 1, v39)) {
                                    --v32;
                                    v34 = v39;
                                    v33 = v38;
                                    continue;
                                }
                                else {
                                    break;
                                }
                            }
                            v37 = v34;
                            v38 = v33;
                            break;
                        }
                        iec.b(arr_v1, v29, v32);
                        if((v14 & 1 ^ 1) != 0) {
                            int v40 = v14 - v29;
                            if(v40 >= -v13 && v40 <= v13 && iec.a(arr_v, v40) >= v32) {
                                v26 = v30;
                                ihi.a(v32, v37, v38, v36 + ((v13 == 0 ? 0 : 1) & v35), true, arr_v6);
                                arr_v4 = arr_v6;
                            label_128:
                                if(Math.min(arr_v4[2] - arr_v4[0], arr_v4[3] - arr_v4[1]) > 0) {
                                    int v41 = arr_v4[0];
                                    int v42 = arr_v4[1];
                                    int v43 = arr_v4[3] - v42;
                                    int v44 = arr_v4[2] - v41;
                                    if(v43 != v44) {
                                        v44 = Math.min(v44, v43);
                                        int v45 = arr_v4[4] == 0 ? 0 : 1;
                                        v41 += (v45 | ijg.a(arr_v4)) ^ 1;
                                        v42 += (v45 | ijg.a(arr_v4) ^ 1) ^ 1;
                                    }
                                    iff0.c(v41, v42, v44);
                                }
                                iff1.d(v9, arr_v4[0], v27, arr_v4[1]);
                                iff1.d(arr_v4[2], v26, arr_v4[3], v25);
                                goto label_154;
                            }
                        }
                        arr_v5 = arr_v6;
                        v28 = v30;
                        v29 += 2;
                    }
                    ++v13;
                    v7 = v27;
                    arr_v2 = arr_v5;
                    v8 = v28;
                    v12 = v12;
                    v6 = v25;
                }
            }
            arr_v4 = arr_v2;
        label_154:
            arr_v2 = arr_v4;
        }
        int v46 = iff0.a;
        if(v46 % 3 != 0) {
            hxt.d("Array size not a multiple of 3");
        }
        if(v46 > 3) {
            v47 = 0;
            iff0.e(0, v46 - 3);
        }
        else {
            v47 = 0;
        }
        iff0.c(v2, v3, 0);
        int v48 = 0;
        int v49 = 0;
        while(v49 < iff0.a) {
            int v50 = iff0.a(v49) - iff0.a(v49 + 2);
            int v51 = iff0.a(v49 + 1) - iff0.a(v49 + 2);
            int v52 = iff0.a(v49 + 2);
            v49 += 3;
            while(v47 < v50) {
                hfb hfb1 = ihj0.a.v;
                ibuq.c(hfb1);
                if((hfb1.s & 2) != 0) {
                    ihy ihy0 = hfb1.x;
                    ibuq.c(ihy0);
                    ihy ihy1 = ihy0.x;
                    ihy ihy2 = ihy0.w;
                    ibuq.c(ihy2);
                    if(ihy1 != null) {
                        ihy1.w = ihy2;
                    }
                    ihy2.x = ihy1;
                    ihj0.f.d(ihj0.a, ihy2);
                }
                ihj0.a = ihl.l(hfb1);
                ++v47;
            }
            while(v48 < v51) {
                ihl ihl0 = ihj0.f;
                ihj0.a = ihl.k(((hfa)ihj0.d.a[ihj0.b + v48]), ihj0.a);
                if(ihj0.e) {
                    hfb hfb2 = ihj0.a.v;
                    ibuq.c(hfb2);
                    ihy ihy3 = hfb2.x;
                    ibuq.c(ihy3);
                    ifk ifk0 = ien.c(ihj0.a);
                    if(ifk0 == null) {
                        ihj0.a.R(ihy3);
                    }
                    else {
                        ifn ifn0 = new ifn(ihl0.a, ifk0);
                        ihj0.a.R(ifn0);
                        ihl0.d(ihj0.a, ifn0);
                        ifn0.x = ihy3.x;
                        ifn0.w = ihy3;
                        ihy3.x = ifn0;
                    }
                    ihj0.a.K();
                    ihj0.a.N();
                    iia.d(ihj0.a);
                }
                else {
                    ihj0.a.y = true;
                }
                ++v48;
            }
            while(v52 > 0) {
                hfb hfb3 = ihj0.a.v;
                ibuq.c(hfb3);
                ihj0.a = hfb3;
                int v53 = ihj0.b;
                hfa hfa0 = (hfa)ihj0.c.a[v53 + v47];
                hfa hfa1 = (hfa)ihj0.d.a[v53 + v48];
                if(!ibuq.m(hfa0, hfa1)) {
                    ihl.m(hfa0, hfa1, ihj0.a);
                }
                ++v47;
                ++v48;
                --v52;
            }
        }
        this.h();
    }

    public final void h() {
        hfb hfb0 = this.e.u;
        int v = 0;
        while(hfb0 != null && hfb0 != this.b) {
            v |= hfb0.s;
            hfb0.t = v;
            hfb0 = hfb0.u;
        }
    }

    public final void i() {
        ifn ifn0;
        hfb hfb0 = this.e.u;
        ife ife0 = this.c;
        while(hfb0 != null) {
            ifk ifk0 = ien.c(hfb0);
            if(ifk0 == null) {
                hfb0.R(ife0);
            }
            else {
                ihy ihy0 = hfb0.x;
                if(ihy0 == null) {
                    ifn ifn1 = new ifn(this.a, ifk0);
                    hfb0.R(ifn1);
                    ifn0 = ifn1;
                }
                else {
                    ifn0 = (ifn)ihy0;
                    ifk ifk1 = ifn0.f;
                    ifn0.H(ifk0);
                    if(ifk1 != hfb0) {
                        ifn0.ap();
                    }
                }
                ife0.x = ifn0;
                ifn0.w = ife0;
                ife0 = ifn0;
            }
            hfb0 = hfb0.u;
        }
        ify ify0 = this.a.n();
        ife0.x = ify0 == null ? null : ify0.r();
        this.d = ife0;
    }

    public final boolean j(int v) {
        return (this.a() & v) != 0;
    }

    public static final hfb k(hfa hfa0, hfb hfb0) {
        hfb hfb1;
        if((hfa0 instanceof ihf)) {
            hfb1 = ((ihf)hfa0).d();
            hfb1.s = iia.c(hfb1);
        }
        else {
            hfb1 = new idx(hfa0);
        }
        if(hfb1.B) {
            hxt.d("A ModifierNodeElement cannot return an already attached node from create() ");
        }
        hfb1.y = true;
        hfb hfb2 = hfb0.v;
        if(hfb2 != null) {
            hfb2.u = hfb1;
            hfb1.v = hfb2;
        }
        hfb0.v = hfb1;
        hfb1.u = hfb0;
        return hfb1;
    }

    public static final hfb l(hfb hfb0) {
        if(hfb0.B) {
            iia.f(hfb0);
            hfb0.O();
            hfb0.L();
        }
        hfb hfb1 = hfb0.v;
        hfb hfb2 = hfb0.u;
        if(hfb1 != null) {
            hfb1.u = hfb2;
            hfb0.v = null;
        }
        if(hfb2 != null) {
            hfb2.v = hfb1;
            hfb0.u = null;
        }
        ibuq.c(hfb2);
        return hfb2;
    }

    public static final void m(hfa hfa0, hfa hfa1, hfb hfb0) {
        if((hfa0 instanceof ihf) && (hfa1 instanceof ihf)) {
            ibuq.d(hfb0, "null cannot be cast to non-null type T of androidx.compose.ui.node.NodeChainKt.updateUnsafe");
            ((ihf)hfa1).e(hfb0);
            if(hfb0.B) {
                iia.g(hfb0);
                return;
            }
            hfb0.z = true;
            return;
        }
        if((hfb0 instanceof idx)) {
            if(((idx)hfb0).B) {
                ((idx)hfb0).u();
            }
            ((idx)hfb0).a = hfa1;
            ((idx)hfb0).s = iia.a(hfa1);
            if(((idx)hfb0).B) {
                ((idx)hfb0).t(false);
            }
            if(hfb0.B) {
                iia.g(hfb0);
                return;
            }
            hfb0.z = true;
            return;
        }
        hxt.d("Unknown Modifier.Node type");
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("[");
        hfb hfb0 = this.f;
        hfb hfb1 = this.e;
        if(hfb0 == hfb1) {
            stringBuilder0.append("]");
            return stringBuilder0.toString();
        }
        while(hfb0 != null && hfb0 != hfb1) {
            stringBuilder0.append(hfb0.toString());
            if(hfb0.v == hfb1) {
                stringBuilder0.append("]");
                return stringBuilder0.toString();
            }
            stringBuilder0.append(",");
            hfb0 = hfb0.v;
        }
        return stringBuilder0.toString();
    }
}

