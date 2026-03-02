import java.util.List;

public final class jsi extends jsn {
    private static final int[] a;

    static {
        jsi.a = new int[2];
    }

    public jsi(jro jro0) {
        super(jro0);
        this.i.l = 4;
        this.j.l = 5;
        this.g = 0;
    }

    @Override  // jsn
    public final void b() {
        jro jro0 = this.d;
        if(jro0.e) {
            this.f.c(jro0.j());
        }
        jsd jsd0 = this.f;
        if(!jsd0.i) {
            int v = this.d.P();
            this.k = v;
            if(v != 3) {
                if(this.k == 4) {
                    jro jro1 = this.d.V;
                    if(jro1 != null && (jro1.P() == 1 || jro1.P() == 4)) {
                        int v1 = this.d.M.b();
                        int v2 = jro1.j() - this.d.K.b() - v1;
                        int v3 = this.d.K.b();
                        jsi.j(this.i, jro1.h.i, v3);
                        int v4 = -this.d.M.b();
                        jsi.j(this.j, jro1.h.j, v4);
                        jsd0.c(v2);
                        return;
                    }
                }
                if(this.k == 1) {
                    jsd0.c(this.d.j());
                }
            }
        }
        else if(this.k == 4) {
            jro jro2 = this.d.V;
            if(jro2 != null && (jro2.P() == 1 || jro2.P() == 4)) {
                int v5 = this.d.K.b();
                jsi.j(this.i, jro2.h.i, v5);
                int v6 = -this.d.M.b();
                jsi.j(this.j, jro2.h.j, v6);
                return;
            }
        }
        if(jsd0.i) {
            jro jro3 = this.d;
            if(jro3.e) {
                jrn[] arr_jrn = jro3.S;
                jrn jrn0 = arr_jrn[0];
                jrn jrn1 = jrn0.e;
                if(jrn1 != null && arr_jrn[1].e != null) {
                    if(jro3.K()) {
                        this.i.e = this.d.S[0].b();
                        this.j.e = -this.d.S[1].b();
                        return;
                    }
                    jsc jsc0 = jsi.k(this.d.S[0]);
                    if(jsc0 != null) {
                        jsi.j(this.i, jsc0, this.d.S[0].b());
                    }
                    jsc jsc1 = jsi.k(this.d.S[1]);
                    if(jsc1 != null) {
                        jsi.j(this.j, jsc1, -this.d.S[1].b());
                    }
                    this.i.b = true;
                    this.j.b = true;
                    return;
                }
                if(jrn1 == null) {
                    jrn jrn2 = arr_jrn[1];
                    if(jrn2.e != null) {
                        jsc jsc4 = jsi.k(jrn2);
                        if(jsc4 != null) {
                            jsc jsc5 = this.j;
                            jsi.j(jsc5, jsc4, -this.d.S[1].b());
                            jsi.j(this.i, jsc5, -jsd0.f);
                        }
                    }
                    else if(!(jro3 instanceof jrt) && jro3.V != null && jro3.N(7).e == null) {
                        jsc jsc6 = this.i;
                        int v7 = this.d.k();
                        jsi.j(jsc6, this.d.V.h.i, v7);
                        jsi.j(this.j, jsc6, jsd0.f);
                    }
                }
                else {
                    jsc jsc2 = jsi.k(jrn0);
                    if(jsc2 != null) {
                        jsc jsc3 = this.i;
                        jsi.j(jsc3, jsc2, this.d.S[0].b());
                        jsi.j(this.j, jsc3, jsd0.f);
                    }
                }
            }
            else {
                goto label_71;
            }
        }
        else {
        label_71:
            if(this.k == 3) {
                jro jro4 = this.d;
                switch(jro4.t) {
                    case 2: {
                        jro jro5 = jro4.V;
                        if(jro5 != null) {
                            jsd jsd1 = jro5.i.f;
                            jsd0.k.add(jsd1);
                            jsd1.j.add(jsd0);
                            jsd0.b = true;
                            List list0 = jsd0.j;
                            list0.add(this.i);
                            list0.add(this.j);
                        }
                        break;
                    }
                    case 3: {
                        if(jro4.u == 3) {
                            this.i.a = this;
                            this.j.a = this;
                            jro4.i.i.a = this;
                            jro4.i.j.a = this;
                            jsd0.a = this;
                            if(jro4.L()) {
                                List list1 = jsd0.k;
                                list1.add(this.d.i.f);
                                this.d.i.f.j.add(jsd0);
                                this.d.i.f.a = this;
                                list1.add(this.d.i.i);
                                list1.add(this.d.i.j);
                                this.d.i.i.j.add(jsd0);
                                this.d.i.j.j.add(jsd0);
                            }
                            else if(this.d.K()) {
                                this.d.i.f.k.add(jsd0);
                                jsd0.j.add(this.d.i.f);
                            }
                            else {
                                this.d.i.f.k.add(jsd0);
                            }
                        }
                        else {
                            jsd jsd2 = jro4.i.f;
                            jsd0.k.add(jsd2);
                            jsd2.j.add(jsd0);
                            this.d.i.i.j.add(jsd0);
                            this.d.i.j.j.add(jsd0);
                            jsd0.b = true;
                            jsc jsc7 = this.i;
                            List list2 = jsd0.j;
                            list2.add(jsc7);
                            jsc jsc8 = this.j;
                            list2.add(jsc8);
                            jsc7.k.add(jsd0);
                            jsc8.k.add(jsd0);
                        }
                    }
                }
            }
            jro jro6 = this.d;
            jrn[] arr_jrn1 = jro6.S;
            jrn jrn3 = arr_jrn1[0];
            jrn jrn4 = jrn3.e;
            if(jrn4 != null && arr_jrn1[1].e != null) {
                if(jro6.K()) {
                    this.i.e = this.d.S[0].b();
                    this.j.e = -this.d.S[1].b();
                    return;
                }
                jsc jsc9 = jsi.k(this.d.S[0]);
                jsc jsc10 = jsi.k(this.d.S[1]);
                if(jsc9 != null) {
                    jsc9.a(this);
                }
                if(jsc10 != null) {
                    jsc10.a(this);
                }
                this.l = 4;
                return;
            }
            if(jrn4 == null) {
                jrn jrn5 = arr_jrn1[1];
                if(jrn5.e != null) {
                    jsc jsc13 = jsi.k(jrn5);
                    if(jsc13 != null) {
                        jsc jsc14 = this.j;
                        jsi.j(jsc14, jsc13, -this.d.S[1].b());
                        this.i(this.i, jsc14, -1, jsd0);
                    }
                }
                else if(!(jro6 instanceof jrt)) {
                    jro jro7 = jro6.V;
                    if(jro7 != null) {
                        jsc jsc15 = this.i;
                        int v8 = jro6.k();
                        jsi.j(jsc15, jro7.h.i, v8);
                        this.i(this.j, jsc15, 1, jsd0);
                    }
                }
            }
            else {
                jsc jsc11 = jsi.k(jrn3);
                if(jsc11 != null) {
                    jsc jsc12 = this.i;
                    jsi.j(jsc12, jsc11, this.d.S[0].b());
                    this.i(this.j, jsc12, 1, jsd0);
                }
            }
        }
    }

    @Override  // jsn
    public final void c() {
        jsc jsc0 = this.i;
        if(jsc0.i) {
            this.d.aa = jsc0.f;
        }
    }

    @Override  // jsn
    public final void d() {
        this.e = null;
        this.i.b();
        this.j.b();
        this.f.b();
        this.h = false;
    }

    @Override  // jsn
    public final boolean e() {
        return this.k == 3 ? this.d.t == 0 : true;
    }

    @Override  // jsn
    public final void f() {
        float f;
        int v = this.l - 1;
        if(this.l == 0) {
            throw null;
        }
        if(v != 3) {
            jsd jsd0 = this.f;
            if(!jsd0.i && this.k == 3) {
                jro jro0 = this.d;
                switch(jro0.t) {
                    case 2: {
                        jro jro1 = jro0.V;
                        if(jro1 != null) {
                            jsd jsd1 = jro1.h.f;
                            if(jsd1.i) {
                                jsd0.c(((int)(((float)jsd1.f) * jro0.y + 0.5f)));
                            }
                        }
                        goto label_112;
                    }
                    case 3: {
                        if(jro0.u != 0 && jro0.u != 3) {
                            switch(jro0.Z) {
                                case -1: {
                                    f = ((float)jro0.i.f.f) * jro0.Y;
                                    break;
                                }
                                case 0: {
                                    f = ((float)jro0.i.f.f) / jro0.Y;
                                    break;
                                }
                                default: {
                                    f = ((float)jro0.i.f.f) * jro0.Y;
                                }
                            }
                            jsd0.c(((int)(f + 0.5f)));
                            goto label_112;
                        }
                        else {
                            jsc jsc0 = jro0.i.i;
                            jsc jsc1 = jro0.i.j;
                            boolean z = jro0.K.e != null;
                            boolean z1 = jro0.L.e != null;
                            boolean z2 = jro0.M.e != null;
                            boolean z3 = jro0.N.e != null;
                            int v1 = jro0.Z;
                            if(z && z1 && z2 && z3) {
                                float f1 = jro0.Y;
                                if(jsc0.i && jsc1.i) {
                                    jsc jsc2 = this.i;
                                    if(jsc2.c) {
                                        jsc jsc3 = this.j;
                                        if(jsc3.c) {
                                            int v2 = ((jsc)jsc2.k.get(0)).f + jsc2.e;
                                            int v3 = ((jsc)jsc3.k.get(0)).f;
                                            jsi.n(jsi.a, v2, v3 - jsc3.e, jsc0.f + jsc0.e, jsc1.f - jsc1.e, f1, v1);
                                            jsd0.c(jsi.a[0]);
                                            this.d.i.f.c(jsi.a[1]);
                                            return;
                                        }
                                    }
                                }
                                else {
                                    jsc jsc4 = this.i;
                                    if(jsc4.i) {
                                        jsc jsc5 = this.j;
                                        if(!jsc5.i) {
                                            goto label_55;
                                        }
                                        else if(jsc0.c && jsc1.c) {
                                            int v4 = jsc4.f + jsc4.e;
                                            int v5 = jsc5.f - jsc5.e;
                                            int v6 = ((jsc)jsc0.k.get(0)).f + jsc0.e;
                                            int v7 = ((jsc)jsc1.k.get(0)).f;
                                            jsi.n(jsi.a, v4, v5, v6, v7 - jsc1.e, f1, v1);
                                            jsd0.c(jsi.a[0]);
                                            this.d.i.f.c(jsi.a[1]);
                                            goto label_55;
                                        }
                                    }
                                    else {
                                    label_55:
                                        if(jsc4.c) {
                                            jsc jsc6 = this.j;
                                            if(jsc6.c && jsc0.c && jsc1.c) {
                                                int v8 = ((jsc)jsc4.k.get(0)).f + jsc4.e;
                                                int v9 = ((jsc)jsc6.k.get(0)).f - jsc6.e;
                                                int v10 = ((jsc)jsc0.k.get(0)).f + jsc0.e;
                                                int v11 = ((jsc)jsc1.k.get(0)).f;
                                                jsi.n(jsi.a, v8, v9, v10, v11 - jsc1.e, f1, v1);
                                                jsd0.c(jsi.a[0]);
                                                this.d.i.f.c(jsi.a[1]);
                                                goto label_112;
                                            }
                                        }
                                    }
                                }
                            }
                            else if(z && z2) {
                                jsc jsc7 = this.i;
                                if(jsc7.c) {
                                    jsc jsc8 = this.j;
                                    if(jsc8.c) {
                                        float f2 = jro0.Y;
                                        int v12 = ((jsc)jsc7.k.get(0)).f + jsc7.e;
                                        int v13 = ((jsc)jsc8.k.get(0)).f - jsc8.e - v12;
                                        if(v1 != -1 && v1 != 0) {
                                            int v14 = this.h(v13, 0);
                                            int v15 = (int)(((float)v14) / f2 + 0.5f);
                                            int v16 = this.h(v15, 1);
                                            if(v15 != v16) {
                                                v14 = (int)(((float)v16) * f2 + 0.5f);
                                            }
                                            jsd0.c(v14);
                                            this.d.i.f.c(v16);
                                        }
                                        else {
                                            int v17 = this.h(v13, 0);
                                            int v18 = (int)(((float)v17) * f2 + 0.5f);
                                            int v19 = this.h(v18, 1);
                                            if(v18 != v19) {
                                                v17 = (int)(((float)v19) / f2 + 0.5f);
                                            }
                                            jsd0.c(v17);
                                            this.d.i.f.c(v19);
                                        }
                                        goto label_112;
                                    }
                                }
                            }
                            else if(!z1 || !z3) {
                                goto label_112;
                            }
                            else if(jsc0.c && jsc1.c) {
                                float f3 = jro0.Y;
                                int v20 = ((jsc)jsc0.k.get(0)).f + jsc0.e;
                                int v21 = ((jsc)jsc1.k.get(0)).f - jsc1.e - v20;
                                if(v1 == 0) {
                                    int v25 = this.h(v21, 1);
                                    int v26 = (int)(((float)v25) * f3 + 0.5f);
                                    int v27 = this.h(v26, 0);
                                    if(v26 != v27) {
                                        v25 = (int)(((float)v27) / f3 + 0.5f);
                                    }
                                    jsd0.c(v27);
                                    this.d.i.f.c(v25);
                                }
                                else {
                                    int v22 = this.h(v21, 1);
                                    int v23 = (int)(((float)v22) / f3 + 0.5f);
                                    int v24 = this.h(v23, 0);
                                    if(v23 != v24) {
                                        v22 = (int)(((float)v24) * f3 + 0.5f);
                                    }
                                    jsd0.c(v24);
                                    this.d.i.f.c(v22);
                                }
                                goto label_112;
                            }
                        }
                        break;
                    }
                    default: {
                        goto label_112;
                    }
                }
            }
            else {
            label_112:
                jsc jsc9 = this.i;
                if(jsc9.c) {
                    jsc jsc10 = this.j;
                    if(jsc10.c && (!jsc9.i || !jsc10.i || !jsd0.i)) {
                        if(!jsd0.i && this.k == 3 && (this.d.t == 0 && !this.d.K())) {
                            jsc jsc11 = (jsc)jsc9.k.get(0);
                            jsc jsc12 = (jsc)jsc10.k.get(0);
                            int v28 = jsc11.f + jsc9.e;
                            int v29 = jsc12.f + jsc10.e;
                            jsc9.c(v28);
                            jsc10.c(v29);
                            jsd0.c(v29 - v28);
                            return;
                        }
                        if(!jsd0.i && this.k == 3 && this.c == 1) {
                            List list0 = jsc9.k;
                            if(list0.size() > 0) {
                                List list1 = jsc10.k;
                                if(list1.size() > 0) {
                                    jsc jsc13 = (jsc)list0.get(0);
                                    jsc jsc14 = (jsc)list1.get(0);
                                    int v30 = this.d.x;
                                    jsd0.c((v30 <= 0 ? Math.max(this.d.w, Math.min(jsc14.f + jsc10.e - (jsc13.f + jsc9.e), jsd0.m)) : Math.min(v30, Math.max(this.d.w, Math.min(jsc14.f + jsc10.e - (jsc13.f + jsc9.e), jsd0.m)))));
                                }
                            }
                        }
                        if(jsd0.i) {
                            jsc jsc15 = (jsc)jsc9.k.get(0);
                            jsc jsc16 = (jsc)jsc10.k.get(0);
                            int v31 = jsc15.f;
                            int v32 = jsc9.e + v31;
                            int v33 = jsc16.f;
                            int v34 = jsc10.e + v33;
                            float f4 = jsc15 == jsc16 ? 0.5f : this.d.af;
                            if(jsc15 != jsc16) {
                                v33 = v34;
                            }
                            if(jsc15 != jsc16) {
                                v31 = v32;
                            }
                            jsc9.c(((int)(((float)v31) + 0.5f + ((float)(v33 - v31 - jsd0.f)) * f4)));
                            jsc10.c(jsc9.f + jsd0.f);
                        }
                    }
                }
            }
            return;
        }
        this.m(this.d.K, this.d.M, 0);
    }

    public final void g() {
        this.h = false;
        jsc jsc0 = this.i;
        jsc0.b();
        jsc0.i = false;
        jsc jsc1 = this.j;
        jsc1.b();
        jsc1.i = false;
        this.f.i = false;
    }

    private static final void n(int[] arr_v, int v, int v1, int v2, int v3, float f, int v4) {
        int v5 = v3 - v2;
        int v6 = v1 - v;
        switch(v4) {
            case -1: {
                int v7 = (int)(((float)v5) * f + 0.5f);
                if(v7 <= v6) {
                    arr_v[0] = v7;
                    arr_v[1] = v5;
                    return;
                }
                int v8 = (int)(((float)v6) / f + 0.5f);
                if(v8 <= v5) {
                    arr_v[0] = v6;
                    arr_v[1] = v8;
                }
                return;
            }
            case 0: {
                arr_v[0] = (int)(((float)v5) * f + 0.5f);
                arr_v[1] = v5;
                return;
            }
            default: {
                arr_v[0] = v6;
                arr_v[1] = (int)(((float)v6) * f + 0.5f);
            }
        }
    }

    @Override
    public final String toString() {
        return "HorizontalRun " + this.d.aj;
    }
}

