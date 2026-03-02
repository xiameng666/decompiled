import java.util.ArrayList;

public final class jrz extends jsn {
    ArrayList a;
    private int b;

    public jrz(jro jro0, int v) {
        super(jro0);
        jro jro3;
        this.a = new ArrayList();
        this.g = v;
        jro jro1 = this.d;
        for(jro jro2 = jro1.n(v); true; jro2 = jro1.n(this.g)) {
            jro3 = jro1;
            jro1 = jro2;
            if(jro1 == null) {
                break;
            }
        }
        this.d = jro3;
        jsn jsn0 = jro3.o(this.g);
        this.a.add(jsn0);
        for(jro jro4 = jro3.m(this.g); jro4 != null; jro4 = jro4.m(this.g)) {
            jsn jsn1 = jro4.o(this.g);
            this.a.add(jsn1);
        }
        ArrayList arrayList0 = this.a;
        int v1 = arrayList0.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            jsn jsn2 = (jsn)arrayList0.get(v2);
            int v3 = this.g;
            if(v3 == 0) {
                jsn2.d.f = this;
            }
            else if(v3 == 1) {
                jsn2.d.g = this;
            }
        }
        if(this.g == 0 && ((jrp)this.d.V).d && this.a.size() > 1) {
            this.d = ((jsn)this.a.get(this.a.size() - 1)).d;
        }
        this.b = this.g == 0 ? this.d.ak : this.d.al;
    }

    @Override  // jsn
    public final long a() {
        int v = this.a.size();
        long v2 = 0L;
        for(int v1 = 0; v1 < v; ++v1) {
            jsn jsn0 = (jsn)this.a.get(v1);
            long v3 = (long)jsn0.j.e;
            v2 = v2 + ((long)jsn0.i.e) + jsn0.a() + v3;
        }
        return v2;
    }

    @Override  // jsn
    public final void b() {
        ArrayList arrayList0 = this.a;
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ((jsn)arrayList0.get(v1)).b();
        }
        int v2 = this.a.size();
        if(v2 <= 0) {
            return;
        }
        jro jro0 = ((jsn)this.a.get(0)).d;
        jro jro1 = ((jsn)this.a.get(v2 - 1)).d;
        if(this.g == 0) {
            jrn jrn0 = jro1.M;
            jsc jsc0 = jrz.l(jro0.K, 0);
            int v3 = jro0.K.b();
            jro jro2 = this.g();
            if(jro2 != null) {
                v3 = jro2.K.b();
            }
            if(jsc0 != null) {
                jrz.j(this.i, jsc0, v3);
            }
            jsc jsc1 = jrz.l(jrn0, 0);
            int v4 = jrn0.b();
            jro jro3 = this.n();
            if(jro3 != null) {
                v4 = jro3.M.b();
            }
            if(jsc1 != null) {
                jrz.j(this.j, jsc1, -v4);
            }
        }
        else {
            jrn jrn1 = jro1.N;
            jsc jsc2 = jrz.l(jro0.L, 1);
            int v5 = jro0.L.b();
            jro jro4 = this.g();
            if(jro4 != null) {
                v5 = jro4.L.b();
            }
            if(jsc2 != null) {
                jrz.j(this.i, jsc2, v5);
            }
            jsc jsc3 = jrz.l(jrn1, 1);
            int v6 = jrn1.b();
            jro jro5 = this.n();
            if(jro5 != null) {
                v6 = jro5.N.b();
            }
            if(jsc3 != null) {
                jrz.j(this.j, jsc3, -v6);
            }
        }
        this.i.a = this;
        this.j.a = this;
    }

    @Override  // jsn
    public final void c() {
        for(int v = 0; v < this.a.size(); ++v) {
            ((jsn)this.a.get(v)).c();
        }
    }

    @Override  // jsn
    public final void d() {
        this.e = null;
        ArrayList arrayList0 = this.a;
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ((jsn)arrayList0.get(v1)).d();
        }
    }

    @Override  // jsn
    public final boolean e() {
        int v = this.a.size();
        for(int v1 = 0; v1 < v; ++v1) {
            if(!((jsn)this.a.get(v1)).e()) {
                return false;
            }
        }
        return true;
    }

    @Override  // jsn
    public final void f() {
        int v29;
        int v27;
        int v24;
        float f5;
        int v21;
        int v20;
        int v19;
        int v14;
        int v13;
        boolean z2;
        boolean z1;
        float f;
        int v5;
        jsc jsc0 = this.i;
        if(jsc0.i) {
            jsc jsc1 = this.j;
            if(!jsc1.i) {
                return;
            }
            jro jro0 = this.d.V;
            boolean z = (jro0 instanceof jrp) ? ((jrp)jro0).d : false;
            int v = jsc1.f - jsc0.f;
            int v1 = this.a.size();
            int v2;
            for(v2 = 0; true; ++v2) {
                if(v2 >= v1) {
                    v2 = -1;
                    break;
                }
                if(((jsn)this.a.get(v2)).d.ai != 8) {
                    break;
                }
            }
            int v3;
            for(v3 = v1 - 1; true; --v3) {
                if(v3 < 0) {
                    v3 = -1;
                    break;
                }
                if(((jsn)this.a.get(v3)).d.ai != 8) {
                    break;
                }
            }
            int v4 = 0;
            while(v4 < 2) {
                v5 = 0;
                int v6 = 0;
                int v7 = 0;
                int v8 = 0;
                f = 0.0f;
                while(v6 < v1) {
                    jsn jsn0 = (jsn)this.a.get(v6);
                    jro jro1 = jsn0.d;
                    if(jro1.ai == 8) {
                        z1 = z;
                    }
                    else {
                        ++v8;
                        if(v6 > 0 && v6 >= v2) {
                            v5 += jsn0.i.e;
                        }
                        jsd jsd0 = jsn0.f;
                        int v9 = jsd0.f;
                        z1 = z;
                        int v10 = jsn0.k == 3 ? 0 : 1;
                        int v11 = 0;
                        if(v10 != 0) {
                            int v12 = this.g;
                            if(v12 != 0) {
                                if(v12 != 1 || jro1.i.f.i) {
                                    goto label_47;
                                }
                                return;
                            }
                            else if(!jro1.h.f.i) {
                                return;
                            }
                        label_47:
                            v11 = v10;
                        }
                        else if(jsn0.c == 1 && v4 == 0) {
                            v9 = jsd0.m;
                            ++v7;
                            v11 = 1;
                        }
                        else if(jsd0.i) {
                            v11 = 1;
                        }
                        if(v11 == 0) {
                            ++v7;
                            float f1 = jro1.am[this.g];
                            if((f1 >= 0.0f)) {
                                f += f1;
                            }
                            v5 = v5;
                        }
                        else {
                            v5 += v9;
                        }
                        if(v6 < v1 - 1 && v6 < v3) {
                            v5 -= jsn0.j.e;
                        }
                    }
                    ++v6;
                    z = z1;
                }
                z2 = z;
                if(v5 >= v && v7 != 0) {
                    ++v4;
                    z = z2;
                    continue;
                }
                else {
                    v13 = v7;
                    v14 = v8;
                }
                goto label_84;
            }
            z2 = z;
            f = 0.0f;
            v13 = 0;
            v5 = 0;
            v14 = 0;
        label_84:
            int v15 = z2 ? jsc1.f : jsc0.f;
            if(v5 > v) {
                float f2 = (float)(v5 - v);
                v15 = z2 ? v15 + ((int)(f2 / 2.0f + 0.5f)) : v15 - ((int)(f2 / 2.0f + 0.5f));
            }
            if(v13 > 0) {
                float f3 = (float)(v - v5);
                float f4 = f3 / ((float)v13) + 0.5f;
                int v16 = 0;
                int v17 = 0;
                while(v16 < v1) {
                    jsn jsn1 = (jsn)this.a.get(v16);
                    jro jro2 = jsn1.d;
                    if(jro2.ai != 8 && jsn1.k == 3) {
                        jsd jsd1 = jsn1.f;
                        if(!jsd1.i) {
                            int v18 = f > 0.0f ? ((int)(jro2.am[this.g] * f3 / f + 0.5f)) : ((int)f4);
                            v19 = v5;
                            if(this.g == 0) {
                                v20 = jro2.x;
                                v21 = jro2.w;
                            }
                            else {
                                v20 = jro2.A;
                                v21 = jro2.z;
                            }
                            f5 = f3;
                            int v22 = jsn1.c == 1 ? Math.min(v18, jsd1.m) : v18;
                            int v23 = v20 <= 0 ? Math.max(v21, v22) : Math.min(v20, Math.max(v21, v22));
                            if(v23 != v18) {
                                ++v17;
                                v18 = v23;
                            }
                            jsd1.c(v18);
                            goto label_117;
                        }
                    }
                    v19 = v5;
                    f5 = f3;
                label_117:
                    ++v16;
                    v15 = v15;
                    v13 = v13;
                    v5 = v19;
                    f3 = f5;
                }
                v24 = v15;
                if(v17 > 0) {
                    v13 -= v17;
                    int v26 = 0;
                    for(int v25 = 0; v25 < v1; ++v25) {
                        jsn jsn2 = (jsn)this.a.get(v25);
                        if(jsn2.d.ai != 8) {
                            if(v25 > 0 && v25 >= v2) {
                                v26 += jsn2.i.e;
                            }
                            v26 += jsn2.f.f;
                            if(v25 < v1 - 1 && v25 < v3) {
                                v26 -= jsn2.j.e;
                            }
                        }
                    }
                    v5 = v26;
                }
                else {
                    v13 = v13;
                    v5 = v5;
                }
                if(this.b == 2 && v17 == 0) {
                    v27 = 0;
                    this.b = 0;
                }
                else {
                    v27 = 0;
                }
            }
            else {
                v24 = v15;
                v27 = 0;
            }
            if(v5 > v) {
                this.b = 2;
            }
            if(v14 > 0 && v13 == 0) {
                if(v2 == v3) {
                    this.b = 2;
                }
                v13 = 0;
            }
            int v28 = this.b;
            if(v28 == 1) {
                if(v14 > 1) {
                    v29 = (v - v5) / (v14 - 1);
                }
                else {
                    v29 = v14 == 1 ? (v - v5) / 2 : 0;
                }
                if(v13 > 0) {
                    v29 = 0;
                }
                int v31 = v24;
                for(int v30 = 0; v30 < v1; ++v30) {
                    jsn jsn3 = (jsn)this.a.get((z2 ? v1 - (v30 + 1) : v30));
                    if(jsn3.d.ai == 8) {
                        jsn3.i.c(v31);
                        jsn3.j.c(v31);
                    }
                    else {
                        if(v30 > 0) {
                            v31 = z2 ? v31 - v29 : v31 + v29;
                        }
                        if(v30 > 0 && v30 >= v2) {
                            v31 = z2 ? v31 - jsn3.i.e : v31 + jsn3.i.e;
                        }
                        if(z2) {
                            jsn3.j.c(v31);
                        }
                        else {
                            jsn3.i.c(v31);
                        }
                        int v32 = jsn3.k != 3 || jsn3.c != 1 ? jsn3.f.f : jsn3.f.m;
                        v31 = z2 ? v31 - v32 : v31 + v32;
                        if(z2) {
                            jsn3.i.c(v31);
                        }
                        else {
                            jsn3.j.c(v31);
                        }
                        jsn3.h = true;
                        if(v30 < v1 - 1 && v30 < v3) {
                            v31 = z2 ? v31 - -jsn3.j.e : v31 - jsn3.j.e;
                        }
                    }
                }
                return;
            }
            if(v28 == 0) {
                int v33 = (v - v5) / (v14 + 1);
                if(v13 > 0) {
                    v33 = 0;
                }
                int v35 = v24;
                for(int v34 = 0; v34 < v1; ++v34) {
                    jsn jsn4 = (jsn)this.a.get((z2 ? v1 - (v34 + 1) : v34));
                    if(jsn4.d.ai == 8) {
                        jsn4.i.c(v35);
                        jsn4.j.c(v35);
                    }
                    else {
                        int v36 = z2 ? v35 - v33 : v35 + v33;
                        if(v34 > 0 && v34 >= v2) {
                            v36 = z2 ? v36 - jsn4.i.e : v36 + jsn4.i.e;
                        }
                        if(z2) {
                            jsn4.j.c(v36);
                        }
                        else {
                            jsn4.i.c(v36);
                        }
                        int v37 = jsn4.k != 3 || jsn4.c != 1 ? jsn4.f.f : Math.min(jsn4.f.f, jsn4.f.m);
                        v35 = z2 ? v36 - v37 : v36 + v37;
                        if(z2) {
                            jsn4.i.c(v35);
                        }
                        else {
                            jsn4.j.c(v35);
                        }
                        if(v34 < v1 - 1 && v34 < v3) {
                            v35 = z2 ? v35 - -jsn4.j.e : v35 - jsn4.j.e;
                        }
                    }
                }
                return;
            }
            if(v28 != 2) {
                return;
            }
            float f6 = this.g == 0 ? this.d.af : this.d.ag;
            if(z2) {
                f6 = 1.0f - f6;
            }
            int v38 = ((int)(((float)(v - v5)) * f6 + 0.5f)) >= 0 && v13 <= 0 ? ((int)(((float)(v - v5)) * f6 + 0.5f)) : 0;
            int v39 = z2 ? v24 - v38 : v24 + v38;
            int v40;
            while((v40 = v27) < v1) {
                v27 = v40 + 1;
                jsn jsn5 = (jsn)this.a.get((z2 ? v1 - v27 : v40));
                if(jsn5.d.ai == 8) {
                    jsn5.i.c(v39);
                    jsn5.j.c(v39);
                }
                else {
                    if(v40 > 0 && v40 >= v2) {
                        v39 = z2 ? v39 - jsn5.i.e : v39 + jsn5.i.e;
                    }
                    if(z2) {
                        jsn5.j.c(v39);
                    }
                    else {
                        jsn5.i.c(v39);
                    }
                    int v41 = jsn5.k != 3 || jsn5.c != 1 ? jsn5.f.f : jsn5.f.m;
                    v39 = z2 ? v39 - v41 : v39 + v41;
                    if(z2) {
                        jsn5.i.c(v39);
                    }
                    else {
                        jsn5.j.c(v39);
                    }
                    if(v40 < v1 - 1 && v40 < v3) {
                        v39 -= (z2 ? -jsn5.j.e : jsn5.j.e);
                    }
                }
            }
        }
    }

    private final jro g() {
        for(int v = 0; v < this.a.size(); ++v) {
            jro jro0 = ((jsn)this.a.get(v)).d;
            if(jro0.ai != 8) {
                return jro0;
            }
        }
        return null;
    }

    private final jro n() {
        int v = this.a.size();
        while(true) {
            --v;
            if(v < 0) {
                break;
            }
            jro jro0 = ((jsn)this.a.get(v)).d;
            if(jro0.ai != 8) {
                return jro0;
            }
        }
        return null;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("ChainRun ");
        stringBuilder0.append((this.g == 0 ? "horizontal : " : "vertical : "));
        ArrayList arrayList0 = this.a;
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            jsn jsn0 = (jsn)arrayList0.get(v1);
            stringBuilder0.append("<");
            stringBuilder0.append(jsn0);
            stringBuilder0.append("> ");
        }
        return stringBuilder0.toString();
    }
}

