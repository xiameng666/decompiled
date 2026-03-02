final class jrq {
    public jro a;
    int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    final jrr h;
    private int i;
    private jrn j;
    private jrn k;
    private jrn l;
    private jrn m;
    private int n;
    private int o;
    private int p;
    private int q;
    private int r;

    public jrq(jrr jrr0, int v, jrn jrn0, jrn jrn1, jrn jrn2, jrn jrn3, int v1) {
        this.h = jrr0;
        super();
        this.a = null;
        this.b = 0;
        this.o = 0;
        this.q = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.g = 0;
        this.i = v;
        this.j = jrn0;
        this.k = jrn1;
        this.l = jrn2;
        this.m = jrn3;
        this.n = jrr0.aP;
        this.o = jrr0.aL;
        this.p = jrr0.aQ;
        this.q = jrr0.aM;
        this.r = v1;
    }

    public final int a() {
        return this.i == 1 ? this.d - this.h.aB : this.d;
    }

    public final int b() {
        return this.i == 0 ? this.c - this.h.aA : this.c;
    }

    public final void c(jro jro0) {
        int v = 0;
        if(this.i == 0) {
            jrr jrr0 = this.h;
            int v1 = jrr0.c(jro0, this.r);
            if(jro0.P() == 3) {
                ++this.g;
                v1 = 0;
            }
            int v2 = jrr0.aA;
            if(jro0.ai != 8) {
                v = v2;
            }
            this.c += v1 + v;
            int v3 = jrr0.a(jro0, this.r);
            if(this.a == null || this.b < v3) {
                this.a = jro0;
                this.b = v3;
                this.d = v3;
            }
        }
        else {
            jrr jrr1 = this.h;
            int v4 = jrr1.c(jro0, this.r);
            int v5 = jrr1.a(jro0, this.r);
            if(jro0.Q() == 3) {
                ++this.g;
                v5 = 0;
            }
            int v6 = jrr1.aB;
            if(jro0.ai != 8) {
                v = v6;
            }
            this.d += v5 + v;
            if(this.a == null || this.b < v4) {
                this.a = jro0;
                this.b = v4;
                this.c = v4;
            }
        }
        ++this.f;
    }

    public final void d(boolean z, int v, boolean z1) {
        int v23;
        int v17;
        int v16;
        boolean z3;
        int v12;
        jro jro5;
        boolean z2;
        int v4;
        int v1 = this.f;
        for(int v2 = 0; v2 < v1; ++v2) {
            int v3 = this.e + v2;
            jrr jrr0 = this.h;
            if(v3 >= jrr0.aI) {
                break;
            }
            jro jro0 = jrr0.aH[v3];
            if(jro0 != null) {
                jro0.u();
            }
        }
        if(v1 != 0 && this.a != null) {
            if(z1 && v == 0) {
                v4 = 0;
                z2 = true;
            }
            else {
                v4 = v;
                z2 = false;
            }
            int v6 = -1;
            int v7 = -1;
            for(int v5 = 0; v5 < v1; ++v5) {
                int v8 = this.e + (z ? v1 - 1 - v5 : v5);
                jrr jrr1 = this.h;
                if(v8 >= jrr1.aI) {
                    break;
                }
                jro jro1 = jrr1.aH[v8];
                if(jro1 != null && jro1.ai == 0) {
                    if(v6 == -1) {
                        v6 = v5;
                    }
                    v7 = v5;
                }
            }
            jro jro2 = null;
            if(this.i == 0) {
                jro jro3 = this.a;
                jrr jrr2 = this.h;
                jro3.al = jrr2.b;
                jrn jrn0 = jro3.L;
                jrn0.l(this.k, (v4 <= 0 ? this.o : this.o + jrr2.aB));
                if(z1) {
                    jro3.N.l(this.m, this.q);
                }
                if(v4 > 0) {
                    this.k.d.N.l(jrn0, 0);
                }
                if(jrr2.aD == 3 && !jro3.G) {
                    int v9 = 0;
                    while(v9 < v1) {
                        int v10 = this.e + (z ? v1 - 1 - v9 : v9);
                        if(v10 >= jrr2.aI) {
                            break;
                        }
                        jro jro4 = jrr2.aH[v10];
                        if(jro4.G) {
                            jro5 = jro4;
                            goto label_55;
                        }
                        ++v9;
                    }
                }
                jro5 = jro3;
            label_55:
                int v11 = 0;
                while(v11 < v1) {
                    if(z) {
                        v12 = v1 - 1 - v11;
                        z3 = true;
                    }
                    else {
                        z3 = false;
                        v12 = v11;
                    }
                    int v13 = this.e + v12;
                    if(v13 >= jrr2.aI) {
                        return;
                    }
                    jro jro6 = jrr2.aH[v13];
                    if(jro6 != null) {
                        if(v11 == 0) {
                            jro6.q(jro6.K, this.j, this.n);
                            v11 = 0;
                        }
                        if(v12 == 0) {
                            int v14 = jrr2.a;
                            float f = z3 ? 1.0f - jrr2.au : jrr2.au;
                            if(this.e == 0) {
                                int v15 = jrr2.c;
                                if(v15 == -1) {
                                    v16 = v14;
                                    goto label_82;
                                }
                                else {
                                    f = z3 ? 1.0f - jrr2.aw : jrr2.aw;
                                    v17 = v15;
                                    goto label_88;
                                }
                                goto label_81;
                            }
                            else {
                            label_81:
                                v16 = v14;
                            }
                        label_82:
                            if(z1) {
                                v17 = jrr2.as;
                                if(v17 != -1) {
                                    f = z3 ? 1.0f - jrr2.ay : jrr2.ay;
                                    goto label_88;
                                }
                            }
                            v17 = v16;
                        label_88:
                            jro6.ak = v17;
                            jro6.af = f;
                        }
                        if(v11 == v1 - 1) {
                            jro6.q(jro6.M, this.l, this.p);
                        }
                        if(jro2 != null) {
                            jrn jrn1 = jro6.K;
                            jrn jrn2 = jro2.M;
                            jrn1.l(jrn2, jrr2.aA);
                            if(v11 == v6) {
                                jrn1.g(this.n);
                            }
                            jrn2.l(jrn1, 0);
                            if(v11 == v7 + 1) {
                                jrn2.g(this.p);
                            }
                        }
                        if(jro6 != jro3) {
                            int v18 = jrr2.aD;
                            if(v18 == 3) {
                                if(jro5.G && jro6 != jro5 && jro6.G) {
                                    jro6.O.l(jro5.O, 0);
                                    goto label_118;
                                }
                                else {
                                    goto label_108;
                                }
                                goto label_107;
                            }
                            else {
                            label_107:
                                switch(v18) {
                                    case 0: {
                                        jro6.L.l(jrn0, 0);
                                        break;
                                    }
                                    case 1: {
                                        jro6.N.l(jro3.N, 0);
                                        break;
                                    }
                                    default: {
                                    label_108:
                                        if(z2) {
                                            jro6.L.l(this.k, this.o);
                                            jro6.N.l(this.m, this.q);
                                        }
                                        else {
                                            jro6.L.l(jrn0, 0);
                                            jro6.N.l(jro3.N, 0);
                                        }
                                    }
                                }
                            }
                        }
                    label_118:
                        jro2 = jro6;
                    }
                    ++v11;
                }
            }
            else {
                jro jro7 = this.a;
                jrr jrr3 = this.h;
                jro7.ak = jrr3.a;
                int v19 = v4 <= 0 ? this.n : this.n + jrr3.aA;
                if(z) {
                    jrn jrn3 = jro7.M;
                    jrn3.l(this.l, v19);
                    if(z1) {
                        jro7.K.l(this.j, this.p);
                    }
                    if(v4 > 0) {
                        this.l.d.K.l(jrn3, 0);
                    }
                }
                else {
                    jrn jrn4 = jro7.K;
                    jrn4.l(this.j, v19);
                    if(z1) {
                        jro7.M.l(this.l, this.p);
                    }
                    if(v4 > 0) {
                        this.j.d.M.l(jrn4, 0);
                    }
                }
                int v20 = 0;
                while(v20 < v1) {
                    int v21 = this.e + v20;
                    if(v21 >= jrr3.aI) {
                        break;
                    }
                    jro jro8 = jrr3.aH[v21];
                    if(jro8 != null) {
                        if(v20 == 0) {
                            jro8.q(jro8.L, this.k, this.o);
                            int v22 = jrr3.b;
                            float f1 = jrr3.av;
                            if(this.e == 0) {
                                v23 = jrr3.d;
                                if(v23 != -1) {
                                    f1 = jrr3.ax;
                                    v22 = v23;
                                    goto label_161;
                                }
                            }
                            if(z1) {
                                v23 = jrr3.at;
                                if(v23 != -1) {
                                    f1 = jrr3.az;
                                    v22 = v23;
                                }
                            }
                        label_161:
                            jro8.al = v22;
                            jro8.ag = f1;
                            v20 = 0;
                        }
                        if(v20 == v1 - 1) {
                            jro8.q(jro8.N, this.m, this.q);
                        }
                        if(jro2 != null) {
                            jrn jrn5 = jro8.L;
                            jrn jrn6 = jro2.N;
                            jrn5.l(jrn6, jrr3.aB);
                            if(v20 == v6) {
                                jrn5.g(this.o);
                            }
                            jrn6.l(jrn5, 0);
                            if(v20 == v7 + 1) {
                                jrn6.g(this.q);
                            }
                        }
                        if(jro8 != jro7) {
                            if(z) {
                                int v24 = jrr3.aC;
                                if(v24 == 0) {
                                    jro8.M.l(jro7.M, 0);
                                    goto label_203;
                                }
                                else {
                                    switch(v24) {
                                        case 1: {
                                            jro8.K.l(jro7.K, 0);
                                            goto label_203;
                                        }
                                        case 2: {
                                            jro8.K.l(jro7.K, 0);
                                            jro8.M.l(jro7.M, 0);
                                            goto label_203;
                                        }
                                        default: {
                                            goto label_203;
                                        }
                                    }
                                }
                                goto label_188;
                            }
                            else {
                            label_188:
                                int v25 = jrr3.aC;
                                if(v25 == 0) {
                                    jro8.K.l(jro7.K, 0);
                                }
                                else {
                                    switch(v25) {
                                        case 1: {
                                            jro8.M.l(jro7.M, 0);
                                            break;
                                        }
                                        case 2: {
                                            if(z2) {
                                                jro8.K.l(this.j, this.n);
                                                jro8.M.l(this.l, this.p);
                                            }
                                            else {
                                                jro8.K.l(jro7.K, 0);
                                                jro8.M.l(jro7.M, 0);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    label_203:
                        jro2 = jro8;
                    }
                    ++v20;
                }
            }
        }
    }

    public final void e(int v) {
        int v1 = this.g;
        if(v1 != 0) {
            int v2 = this.f;
            int v3 = v / v1;
            for(int v4 = 0; v4 < v2; ++v4) {
                int v5 = this.e + v4;
                jrr jrr0 = this.h;
                if(v5 >= jrr0.aI) {
                    break;
                }
                jro jro0 = jrr0.aH[v5];
                if(this.i != 0) {
                    if(jro0 != null && jro0.Q() == 3 && jro0.u == 0) {
                        jrr0.aa(jro0, jro0.P(), jro0.j(), 1, v3);
                        v3 = v3;
                    }
                }
                else if(jro0 != null && jro0.P() == 3 && jro0.t == 0) {
                    jrr0.aa(jro0, 1, v3, jro0.Q(), jro0.h());
                }
            }
            this.c = 0;
            this.d = 0;
            this.a = null;
            this.b = 0;
            int v6 = this.f;
            for(int v7 = 0; v7 < v6; ++v7) {
                int v8 = this.e + v7;
                jrr jrr1 = this.h;
                if(v8 >= jrr1.aI) {
                    break;
                }
                jro jro1 = jrr1.aH[v8];
                if(this.i == 0) {
                    this.c += jro1.j() + (jro1.ai == 8 ? 0 : jrr1.aA);
                    int v9 = jrr1.a(jro1, this.r);
                    if(this.a == null || this.b < v9) {
                        this.a = jro1;
                        this.b = v9;
                        this.d = v9;
                    }
                }
                else {
                    int v10 = jrr1.c(jro1, this.r);
                    int v11 = jrr1.a(jro1, this.r);
                    this.d += v11 + (jro1.ai == 8 ? 0 : jrr1.aB);
                    if(this.a == null || this.b < v10) {
                        this.a = jro1;
                        this.b = v10;
                        this.c = v10;
                    }
                }
            }
        }
    }

    public final void f(int v, jrn jrn0, jrn jrn1, jrn jrn2, jrn jrn3, int v1, int v2, int v3, int v4, int v5) {
        this.i = v;
        this.j = jrn0;
        this.k = jrn1;
        this.l = jrn2;
        this.m = jrn3;
        this.n = v1;
        this.o = v2;
        this.p = v3;
        this.q = v4;
        this.r = v5;
    }
}

