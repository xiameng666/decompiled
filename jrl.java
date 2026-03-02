import java.util.ArrayList;

public final class jrl {
    public static void a(jrp jrp0, jrd jrd0, ArrayList arrayList0, int v) {
        jro jro33;
        int v44;
        jro jro32;
        jro jro31;
        jro jro30;
        int v43;
        jri jri18;
        jro jro29;
        jri jri17;
        jri jri16;
        jri jri15;
        jrn jrn17;
        int v38;
        int v37;
        jri jri12;
        jri jri10;
        jrn jrn15;
        int v33;
        jro jro24;
        jro jro23;
        jro jro25;
        jro jro19;
        jrd jrd2;
        jro jro18;
        jro jro17;
        jro jro16;
        float f9;
        float f8;
        int v29;
        float f7;
        int v28;
        ArrayList arrayList3;
        int v22;
        jro jro13;
        jrm[] arr_jrm3;
        int v20;
        int v17;
        jro jro12;
        float f2;
        int v16;
        boolean z1;
        jrm[] arr_jrm2;
        int v14;
        int v13;
        jro jro4;
        int v9;
        int v8;
        int v2;
        jrm[] arr_jrm;
        int v1;
        jrp jrp1 = jrp0;
        jrd jrd1 = jrd0;
        ArrayList arrayList1 = arrayList0;
        if(v == 0) {
            v1 = jrp1.av;
            arr_jrm = jrp1.ay;
            v2 = 0;
        }
        else {
            v1 = jrp1.aw;
            arr_jrm = jrp1.ax;
            v2 = 2;
        }
        int v3 = v1;
        jrm[] arr_jrm1 = arr_jrm;
        int v4 = 0;
        while(v4 < v3) {
            jrm jrm0 = arr_jrm1[v4];
            jri jri0 = null;
            if(!jrm0.t) {
                int v5 = jrm0.o;
                int v6 = v5 + v5;
                jro jro0 = jrm0.a;
                jro jro1 = jro0;
                jro jro2 = jro1;
                boolean z = false;
                while(!z) {
                    ++jrm0.i;
                    jro1.ao[v5] = null;
                    jro1.an[v5] = null;
                    if(jro1.ai == 8) {
                        v9 = v5;
                    }
                    else {
                        ++jrm0.l;
                        if(jro1.O(v5) == 3) {
                            v9 = v5;
                        }
                        else {
                            int v7 = jrm0.m;
                            if(v5 == 0) {
                                v8 = jro1.j();
                                v9 = 0;
                            }
                            else {
                                v8 = jro1.h();
                                v9 = 1;
                            }
                            jrm0.m = v7 + v8;
                        }
                        int v10 = jrm0.m + jro1.S[v6].b();
                        jrm0.m = v10;
                        jrm0.m = v10 + jro1.S[v6 + 1].b();
                        int v11 = jrm0.n + jro1.S[v6].b();
                        jrm0.n = v11;
                        jrm0.n = v11 + jro1.S[v6 + 1].b();
                        if(jrm0.b == null) {
                            jrm0.b = jro1;
                        }
                        jrm0.d = jro1;
                        if(jro1.ar[v9] == 3) {
                            int v12 = jro1.v[v9];
                            switch(v12) {
                                case 2: {
                                    v12 = 2;
                                    break;
                                }
                                case 0: 
                                case 3: {
                                    break;
                                }
                                default: {
                                    goto label_75;
                                }
                            }
                            ++jrm0.j;
                            float f = jro1.am[v9];
                            if((f > 0.0f)) {
                                jrm0.k += f;
                            }
                            if(jro1.ai != 8 && (v12 == 0 || v12 == 3)) {
                                if((f < 0.0f)) {
                                    jrm0.q = true;
                                }
                                else {
                                    jrm0.r = true;
                                }
                                if(jrm0.h == null) {
                                    jrm0.h = new ArrayList();
                                }
                                jrm0.h.add(jro1);
                            }
                            if(jrm0.f == null) {
                                jrm0.f = jro1;
                            }
                            jro jro3 = jrm0.g;
                            if(jro3 != null) {
                                jro3.an[v9] = jro1;
                            }
                            jrm0.g = jro1;
                        }
                    }
                label_75:
                    if(jro2 != jro1) {
                        jro2.ao[v9] = jro1;
                    }
                    jrn jrn0 = jro1.S[v6 + 1].e;
                    if(jrn0 == null) {
                        jro4 = null;
                    }
                    else {
                        jro4 = jrn0.d;
                        jrn jrn1 = jro4.S[v6].e;
                        if(jrn1 == null || jrn1.d != jro1) {
                            jro4 = null;
                        }
                    }
                    z = jro4 == null;
                    if(jro4 == null) {
                        jro4 = jro1;
                    }
                    jro2 = jro1;
                    jro1 = jro4;
                }
                jro jro5 = jrm0.b;
                if(jro5 != null) {
                    jrm0.m -= jro5.S[v6].b();
                }
                jro jro6 = jrm0.d;
                if(jro6 != null) {
                    jrm0.m -= jro6.S[v6 + 1].b();
                }
                jrm0.c = jro1;
                jrm0.e = v5 == 0 && jrm0.p ? jrm0.c : jro0;
                jrm0.s = jrm0.r && jrm0.q;
            }
            jrm0.t = true;
            if(arrayList1 != null && !arrayList1.contains(jrm0.a)) {
                v13 = v4;
                v14 = v3;
                arr_jrm2 = arr_jrm1;
            }
            else {
                jro jro7 = jrm0.a;
                jro jro8 = jrm0.c;
                jro jro9 = jrm0.b;
                jro jro10 = jrm0.d;
                jro jro11 = jrm0.e;
                float f1 = jrm0.k;
                int v15 = jrp1.ar[v];
                if(v == 0) {
                    v13 = v4;
                    z1 = jro11.ak == 1;
                    v16 = jro11.ak == 2 ? 1 : 0;
                    f2 = f1;
                    jro12 = jro7;
                    v17 = jro11.ak == 0 ? 1 : 0;
                }
                else {
                    v13 = v4;
                    v17 = jro11.al == 0 ? 1 : 0;
                    z1 = jro11.al == 1;
                    v16 = jro11.al == 2 ? 1 : 0;
                    f2 = f1;
                    jro12 = jro7;
                }
                boolean z2 = false;
                while(!z2) {
                    jrn[] arr_jrn = jro12.S;
                    jrn jrn2 = arr_jrn[v2];
                    int v18 = 1 == v16 ? 1 : 4;
                    int[] arr_v = jro12.ar;
                    int v19 = jrn2.b();
                    boolean z3 = arr_v[v] == 3 && jro12.v[v] == 0;
                    jrn jrn3 = jrn2.e;
                    if(jrn3 != null && jro12 != jro7) {
                        v19 += jrn3.b();
                    }
                    if(v16 != 0 && jro12 != jro7 && jro12 != jro9) {
                        v18 = 8;
                    }
                    if(jrn3 == null) {
                        v20 = v3;
                        arr_jrm3 = arr_jrm1;
                    }
                    else {
                        if(jro12 == jro9) {
                            v20 = v3;
                            arr_jrm3 = arr_jrm1;
                            jrd1.g(jrn2.h, jrn3.h, v19, 6);
                        }
                        else {
                            v20 = v3;
                            arr_jrm3 = arr_jrm1;
                            jrd1.g(jrn2.h, jrn3.h, v19, 8);
                        }
                        if(z3 && v16 == 0) {
                            v18 = 5;
                        }
                        jrd1.m(jrn2.h, jrn2.e.h, v19, (jro12 != jro9 || v16 == 0 || !jro12.U[v] ? v18 : 5));
                    }
                    if(v15 == 2) {
                        if(jro12.ai != 8 && arr_v[v] == 3) {
                            jrd1.g(arr_jrn[v2 + 1].h, arr_jrn[v2].h, 0, 5);
                        }
                        jrd1.g(arr_jrn[v2].h, jrp1.S[v2].h, 0, 8);
                    }
                    jrn jrn4 = arr_jrn[v2 + 1].e;
                    if(jrn4 == null) {
                        jro13 = null;
                    }
                    else {
                        jro13 = jrn4.d;
                        jrn jrn5 = jro13.S[v2].e;
                        if(jrn5 == null || jrn5.d != jro12) {
                            jro13 = null;
                        }
                    }
                    z2 = jro13 == null;
                    if(jro13 != null) {
                        jro12 = jro13;
                    }
                    v16 = v16;
                    v3 = v20;
                    arr_jrm1 = arr_jrm3;
                }
                v14 = v3;
                arr_jrm2 = arr_jrm1;
                if(jro10 != null) {
                    jrn[] arr_jrn1 = jro8.S;
                    if(arr_jrn1[v2 + 1].e != null) {
                        jrn jrn6 = jro10.S[v2 + 1];
                        if(jro10.ar[v] == 3 && jro10.v[v] == 0 && v16 == 0) {
                            jrn jrn7 = jrn6.e;
                            if(jrn7.d == jrp1) {
                                int v21 = -jrn6.b();
                                v22 = v2 + 1;
                                jrd1.m(jrn6.h, jrn7.h, v21, 5);
                                goto label_196;
                            }
                        }
                        v22 = v2 + 1;
                        if(v16 != 0) {
                            jrn jrn8 = jrn6.e;
                            if(jrn8.d == jrp1) {
                                int v23 = -jrn6.b();
                                jrd1.m(jrn6.h, jrn8.h, v23, 4);
                            }
                        }
                    label_196:
                        int v24 = -jrn6.b();
                        jrd1.h(jrn6.h, arr_jrn1[v22].e.h, v24, 6);
                    }
                }
                if(v15 == 2) {
                    jri jri1 = jrp1.S[v2 + 1].h;
                    jrn jrn9 = jro8.S[v2 + 1];
                    int v25 = jrn9.b();
                    jrd1.g(jri1, jrn9.h, v25, 8);
                }
                ArrayList arrayList2 = jrm0.h;
                if(arrayList2 != null) {
                    int v26 = arrayList2.size();
                    if(v26 > 1) {
                        float f3 = !jrm0.q || jrm0.s ? f2 : ((float)jrm0.j);
                        jro jro14 = null;
                        float f4 = 0.0f;
                        int v27 = 0;
                        while(v27 < v26) {
                            jro jro15 = (jro)arrayList2.get(v27);
                            float f5 = jro15.am[v];
                            float f6 = f5;
                            if(Float.compare(f5, 0.0f) < 0) {
                                if(jrm0.s) {
                                    arrayList3 = arrayList2;
                                    v28 = v26;
                                    jrd1.m(jro15.S[v2 + 1].h, jro15.S[v2].h, 0, 4);
                                    f7 = f3;
                                    v29 = v27;
                                    goto label_278;
                                }
                                else {
                                    f8 = 1.0f;
                                    goto label_226;
                                }
                                goto label_225;
                            }
                            else {
                            label_225:
                                f8 = f6;
                            }
                        label_226:
                            arrayList3 = arrayList2;
                            v28 = v26;
                            int v30 = Float.compare(f8, 0.0f);
                            if(v30 == 0) {
                                jrd1.m(jro15.S[v2 + 1].h, jro15.S[v2].h, 0, 8);
                                f7 = f3;
                                v29 = v27;
                            }
                            else {
                                if(jro14 == null) {
                                    f9 = f8;
                                    f7 = f3;
                                    jro16 = jro15;
                                    v29 = v27;
                                }
                                else {
                                    f9 = f8;
                                    jri jri2 = jro14.S[v2].h;
                                    jri jri3 = jro14.S[v2 + 1].h;
                                    jri jri4 = jro15.S[v2].h;
                                    jri jri5 = jro15.S[v2 + 1].h;
                                    f7 = f3;
                                    jrb jrb0 = jrd1.a();
                                    jro16 = jro15;
                                    jrb0.b = 0.0f;
                                    if(Float.compare(f7, 0.0f) == 0 || f4 == f9) {
                                        v29 = v27;
                                        jrb0.e.g(jri2, 1.0f);
                                        jrb0.e.g(jri3, -1.0f);
                                        jrb0.e.g(jri5, 1.0f);
                                        jrb0.e.g(jri4, -1.0f);
                                    }
                                    else if(f4 == 0.0f) {
                                        jrb0.e.g(jri2, 1.0f);
                                        jrb0.e.g(jri3, -1.0f);
                                        v29 = v27;
                                    }
                                    else if(v30 == 0) {
                                        jrb0.e.g(jri4, 1.0f);
                                        jrb0.e.g(jri5, -1.0f);
                                        v29 = v27;
                                    }
                                    else {
                                        v29 = v27;
                                        jrb0.e.g(jri2, 1.0f);
                                        jrb0.e.g(jri3, -1.0f);
                                        jra jra0 = jrb0.e;
                                        float f10 = f4 / f7 / (f9 / f7);
                                        jra0.g(jri5, f10);
                                        jrb0.e.g(jri4, -f10);
                                    }
                                    jrd1.e(jrb0);
                                }
                                f4 = f9;
                                jro14 = jro16;
                            }
                        label_278:
                            v27 = v29 + 1;
                            arrayList2 = arrayList3;
                            v26 = v28;
                            f3 = f7;
                        }
                    }
                }
                if(jro9 != null && (jro9 == jro10 || v16 != 0)) {
                    jrn jrn10 = jro7.S[v2];
                    jrn jrn11 = jro8.S[v2 + 1];
                    jri jri6 = jrn10.e == null ? null : jrn10.e.h;
                    jri jri7 = jrn11.e == null ? null : jrn11.e.h;
                    jrn jrn12 = jro9.S[v2];
                    if(jro10 != null) {
                        jrn11 = jro10.S[v2 + 1];
                    }
                    if(jri6 != null && jri7 != null) {
                        jro17 = jro9;
                        int v31 = jrn11.b();
                        jro18 = jro10;
                        jrd1.d(jrn12.h, jri6, jrn12.b(), (v == 0 ? jro11.af : jro11.ag), jri7, jrn11.h, v31, 7);
                    }
                    else {
                        jro17 = jro9;
                        jro18 = jro10;
                    }
                    jrd2 = jrd0;
                    jro19 = jro17;
                }
                else {
                    jro18 = jro10;
                    if(v17 == 0) {
                    label_370:
                        jro25 = jro9;
                    }
                    else {
                        if(jro9 == null) {
                            jro25 = null;
                            goto label_371;
                        }
                        else {
                            int v32 = jrm0.j <= 0 || jrm0.i != jrm0.j ? 0 : 1;
                            jro jro20 = jro9;
                            jro jro21 = jro20;
                            while(jro21 != null) {
                                jro jro22;
                                for(jro22 = jro21.ao[v]; jro22 != null && jro22.ai == 8; jro22 = jro22.ao[v]) {
                                }
                                if(jro22 == null && jro21 != jro18) {
                                    jro23 = jro20;
                                    jro24 = null;
                                    v33 = v32;
                                }
                                else {
                                    jrn[] arr_jrn2 = jro21.S;
                                    jrn jrn13 = arr_jrn2[v2];
                                    jri jri8 = jrn13.h;
                                    jri jri9 = jrn13.e == null ? null : jrn13.e.h;
                                    if(jro20 != jro21) {
                                        jri9 = jro20.S[v2 + 1].h;
                                    }
                                    else if(jro21 == jro9) {
                                        jrn jrn14 = jro7.S[v2].e;
                                        jri9 = jrn14 == null ? null : jrn14.h;
                                    }
                                    int v34 = jrn13.b();
                                    int v35 = arr_jrn2[v2 + 1].b();
                                    if(jro22 == null) {
                                        jro24 = null;
                                        jrn15 = jro8.S[v2 + 1].e;
                                        jri10 = jrn15 == null ? null : jrn15.h;
                                    }
                                    else {
                                        jrn15 = jro22.S[v2];
                                        jro24 = jro22;
                                        jri10 = jrn15.h;
                                    }
                                    jri jri11 = arr_jrn2[v2 + 1].h;
                                    if(jrn15 != null) {
                                        v35 += jrn15.b();
                                    }
                                    int v36 = v34 + jro20.S[v2 + 1].b();
                                    if(jri8 != null && jri9 != null && jri10 != null && jri11 != null) {
                                        if(jro21 == jro9) {
                                            v36 = jro9.S[v2].b();
                                        }
                                        if(jro21 == jro18) {
                                            v35 = jro18.S[v2 + 1].b();
                                        }
                                        if(1 == v32) {
                                            jri12 = jri9;
                                            v37 = v35;
                                            v38 = 8;
                                        }
                                        else {
                                            jri12 = jri9;
                                            v37 = v35;
                                            v38 = 5;
                                        }
                                        jro23 = jro20;
                                        v33 = v32;
                                        jrd0.d(jri8, jri12, v36, 0.5f, jri10, jri11, v37, v38);
                                    }
                                    else {
                                        jro23 = jro20;
                                        v33 = v32;
                                    }
                                }
                                jro20 = jro21.ai == 8 ? jro23 : jro21;
                                jro21 = jro24;
                                v32 = v33;
                            }
                            jrd2 = jrd0;
                            jro19 = jro9;
                            goto label_462;
                        }
                        goto label_370;
                    }
                label_371:
                    if(z1 && jro9 != null) {
                        int v39 = jrm0.j <= 0 || jrm0.i != jrm0.j ? 0 : 1;
                        jro jro26 = jro9;
                        jro jro27 = jro26;
                        while(jro26 != null) {
                            jro jro28;
                            for(jro28 = jro26.ao[v]; jro28 != null && jro28.ai == 8; jro28 = jro28.ao[v]) {
                            }
                            if(jro26 != jro9 && jro26 != jro18 && jro28 != null) {
                                if(jro28 == jro18) {
                                    jro28 = null;
                                }
                                jrn[] arr_jrn3 = jro26.S;
                                jrn jrn16 = arr_jrn3[v2];
                                jri jri13 = jrn16.h;
                                jrn[] arr_jrn4 = jro27.S;
                                jri jri14 = arr_jrn4[v2 + 1].h;
                                int v40 = jrn16.b();
                                int v41 = arr_jrn3[v2 + 1].b();
                                if(jro28 == null) {
                                    jri16 = jri13;
                                    jrn jrn19 = jro18.S[v2];
                                    jri15 = jrn19 == null ? null : jrn19.h;
                                    jrn17 = jrn19;
                                    jri17 = arr_jrn3[v2 + 1].h;
                                }
                                else {
                                    jrn17 = jro28.S[v2];
                                    jri15 = jrn17.h;
                                    jri16 = jri13;
                                    jrn jrn18 = jrn17.e;
                                    jri17 = jrn18 == null ? null : jrn18.h;
                                }
                                if(jrn17 != null) {
                                    v41 += jrn17.b();
                                }
                                int v42 = v40 + arr_jrn4[v2 + 1].b();
                                if(1 == v39) {
                                    jro29 = jro27;
                                    jri18 = jri14;
                                    v43 = 8;
                                }
                                else {
                                    jro29 = jro27;
                                    jri18 = jri14;
                                    v43 = 4;
                                }
                                if(jri16 != null && jri18 != null && jri15 != null && jri17 != null) {
                                    jro30 = jro29;
                                    jro31 = jro28;
                                    jro32 = jro26;
                                    v44 = v39;
                                    jrd0.d(jri16, jri18, v42, 0.5f, jri15, jri17, v41, v43);
                                }
                                else {
                                    v44 = v39;
                                    jro31 = jro28;
                                    jro32 = jro26;
                                    jro30 = jro29;
                                }
                                jro26 = jro31;
                            }
                            else {
                                v44 = v39;
                                jro32 = jro26;
                                jro30 = jro27;
                                jro26 = jro28;
                            }
                            jro27 = jro32.ai == 8 ? jro30 : jro32;
                            v39 = v44;
                        }
                        jrd2 = jrd0;
                        jrn jrn20 = jro9.S[v2];
                        jrn jrn21 = jro7.S[v2].e;
                        jrn jrn22 = jro18.S[v2 + 1];
                        jrn jrn23 = jro8.S[v2 + 1].e;
                        if(jrn21 == null) {
                        }
                        else if(jro9 != jro18) {
                            int v45 = jrn20.b();
                            jrd2.m(jrn20.h, jrn21.h, v45, 5);
                        }
                        else if(jrn23 != null) {
                            int v46 = jrn20.b();
                            int v47 = jrn22.b();
                            jro33 = jro25;
                            jrd2.d(jrn20.h, jrn21.h, v46, 0.5f, jrn22.h, jrn23.h, v47, 5);
                            goto label_455;
                        }
                        jro33 = jro25;
                    label_455:
                        if(jrn23 != null && jro9 != jro18) {
                            int v48 = -jrn22.b();
                            jrd2.m(jrn22.h, jrn23.h, v48, 5);
                        }
                    }
                    else {
                        jrd2 = jrd0;
                        jro33 = jro25;
                    }
                    jro19 = jro33;
                }
            label_462:
                if((v17 != 0 || z1) && jro19 != null && jro19 != jro18) {
                    jrn[] arr_jrn5 = jro19.S;
                    jrn jrn24 = arr_jrn5[v2];
                    if(jro18 == null) {
                        jro18 = jro19;
                    }
                    jrn[] arr_jrn6 = jro18.S;
                    jrn jrn25 = arr_jrn6[v2 + 1];
                    jri jri19 = jrn24.e == null ? null : jrn24.e.h;
                    jri jri20 = jrn25.e == null ? null : jrn25.e.h;
                    if(jro8 == jro18) {
                        jri0 = jri20;
                    }
                    else {
                        jrn jrn26 = jro8.S[v2 + 1].e;
                        if(jrn26 != null) {
                            jri0 = jrn26.h;
                        }
                    }
                    if(jro19 == jro18) {
                        jrn25 = arr_jrn5[v2 + 1];
                    }
                    if(jri19 != null && jri0 != null) {
                        jrd2.d(jrn24.h, jri19, jrn24.b(), 0.5f, jri0, jrn25.h, arr_jrn6[v2 + 1].b(), 5);
                    }
                }
            }
            v4 = v13 + 1;
            jrp1 = jrp0;
            jrd1 = jrd0;
            arrayList1 = arrayList0;
            v3 = v14;
            arr_jrm1 = arr_jrm2;
        }
    }
}

