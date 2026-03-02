import java.util.List;

public final class jsk extends jsn {
    public final jsc a;
    jsd b;

    public jsk(jro jro0) {
        super(jro0);
        jsc jsc0 = new jsc(this);
        this.a = jsc0;
        this.b = null;
        this.i.l = 6;
        this.j.l = 7;
        jsc0.l = 8;
        this.g = 1;
    }

    @Override  // jsn
    public final void b() {
        jro jro0 = this.d;
        if(jro0.e) {
            this.f.c(jro0.h());
        }
        jsd jsd0 = this.f;
        if(!jsd0.i) {
            this.k = this.d.Q();
            if(this.d.G) {
                this.b = new jsd(this);
            }
            if(this.k != 3) {
                if(this.k == 4) {
                    jro jro1 = this.d.V;
                    if(jro1 != null && jro1.Q() == 1) {
                        int v = this.d.N.b();
                        int v1 = jro1.h() - this.d.L.b() - v;
                        int v2 = this.d.L.b();
                        jsk.j(this.i, jro1.i.i, v2);
                        int v3 = -this.d.N.b();
                        jsk.j(this.j, jro1.i.j, v3);
                        jsd0.c(v1);
                        return;
                    }
                }
                if(this.k == 1) {
                    jsd0.c(this.d.h());
                }
            }
        }
        else if(this.k == 4) {
            jro jro2 = this.d.V;
            if(jro2 != null && jro2.Q() == 1) {
                int v4 = this.d.L.b();
                jsk.j(this.i, jro2.i.i, v4);
                int v5 = -this.d.N.b();
                jsk.j(this.j, jro2.i.j, v5);
                return;
            }
        }
        if(jsd0.i) {
            jro jro3 = this.d;
            if(jro3.e) {
                jrn[] arr_jrn = jro3.S;
                jrn jrn0 = arr_jrn[2];
                jrn jrn1 = jrn0.e;
                if(jrn1 != null && arr_jrn[3].e != null) {
                    if(jro3.L()) {
                        this.i.e = this.d.S[2].b();
                        this.j.e = -this.d.S[3].b();
                    }
                    else {
                        jsc jsc0 = jsk.k(this.d.S[2]);
                        if(jsc0 != null) {
                            jsk.j(this.i, jsc0, this.d.S[2].b());
                        }
                        jsc jsc1 = jsk.k(this.d.S[3]);
                        if(jsc1 != null) {
                            jsk.j(this.j, jsc1, -this.d.S[3].b());
                        }
                        this.i.b = true;
                        this.j.b = true;
                    }
                    jro jro4 = this.d;
                    if(jro4.G) {
                        jsk.j(this.a, this.i, jro4.ac);
                    }
                }
                else if(jrn1 != null) {
                    jsc jsc2 = jsk.k(jrn0);
                    if(jsc2 != null) {
                        jsc jsc3 = this.i;
                        jsk.j(jsc3, jsc2, this.d.S[2].b());
                        jsk.j(this.j, jsc3, jsd0.f);
                        jro jro5 = this.d;
                        if(jro5.G) {
                            jsk.j(this.a, jsc3, jro5.ac);
                        }
                    }
                }
                else {
                    jrn jrn2 = arr_jrn[3];
                    if(jrn2.e == null) {
                        jrn jrn3 = arr_jrn[4];
                        if(jrn3.e != null) {
                            jsc jsc6 = jsk.k(jrn3);
                            if(jsc6 != null) {
                                jsk.j(this.a, jsc6, 0);
                                jsc jsc7 = this.i;
                                jsk.j(jsc7, this.a, -this.d.ac);
                                jsk.j(this.j, jsc7, jsd0.f);
                            }
                        }
                        else if(!(jro3 instanceof jrt) && jro3.V != null && jro3.N(7).e == null) {
                            jsc jsc8 = this.i;
                            int v6 = this.d.l();
                            jsk.j(jsc8, this.d.V.i.i, v6);
                            jsk.j(this.j, jsc8, jsd0.f);
                            jro jro7 = this.d;
                            if(jro7.G) {
                                jsk.j(this.a, jsc8, jro7.ac);
                            }
                        }
                    }
                    else {
                        jsc jsc4 = jsk.k(jrn2);
                        if(jsc4 != null) {
                            jsc jsc5 = this.j;
                            jsk.j(jsc5, jsc4, -this.d.S[3].b());
                            jsk.j(this.i, jsc5, -jsd0.f);
                        }
                        jro jro6 = this.d;
                        if(jro6.G) {
                            jsk.j(this.a, this.i, jro6.ac);
                        }
                    }
                }
            }
            else {
                jsd0.a(this);
                goto label_121;
            }
        }
        else {
            if(this.k == 3) {
                jro jro8 = this.d;
                switch(jro8.u) {
                    case 2: {
                        jro jro9 = jro8.V;
                        if(jro9 != null) {
                            jsd jsd1 = jro9.i.f;
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
                        if(!jro8.L()) {
                            jro jro10 = this.d;
                            if(jro10.t != 3) {
                                jsd jsd2 = jro10.h.f;
                                jsd0.k.add(jsd2);
                                jsd2.j.add(jsd0);
                                jsd0.b = true;
                                List list1 = jsd0.j;
                                list1.add(this.i);
                                list1.add(this.j);
                            }
                        }
                    }
                }
            }
            else {
                jsd0.a(this);
            }
        label_121:
            jro jro11 = this.d;
            jrn[] arr_jrn1 = jro11.S;
            jrn jrn4 = arr_jrn1[2];
            jrn jrn5 = jrn4.e;
            if(jrn5 != null && arr_jrn1[3].e != null) {
                if(jro11.L()) {
                    this.i.e = this.d.S[2].b();
                    this.j.e = -this.d.S[3].b();
                }
                else {
                    jsc jsc9 = jsk.k(this.d.S[2]);
                    jsc jsc10 = jsk.k(this.d.S[3]);
                    if(jsc9 != null) {
                        jsc9.a(this);
                    }
                    if(jsc10 != null) {
                        jsc10.a(this);
                    }
                    this.l = 4;
                }
                if(this.d.G) {
                    this.i(this.a, this.i, 1, this.b);
                }
            }
            else if(jrn5 == null) {
                jrn jrn6 = arr_jrn1[3];
                if(jrn6.e == null) {
                    jrn jrn7 = arr_jrn1[4];
                    if(jrn7.e != null) {
                        jsc jsc16 = jsk.k(jrn7);
                        if(jsc16 != null) {
                            jsk.j(this.a, jsc16, 0);
                            jsc jsc17 = this.i;
                            this.i(jsc17, this.a, -1, this.b);
                            this.i(this.j, jsc17, 1, jsd0);
                        }
                    }
                    else if(!(jro11 instanceof jrt)) {
                        jro jro13 = jro11.V;
                        if(jro13 != null) {
                            jsc jsc18 = this.i;
                            int v7 = jro11.l();
                            jsk.j(jsc18, jro13.i.i, v7);
                            this.i(this.j, jsc18, 1, jsd0);
                            if(this.d.G) {
                                this.i(this.a, jsc18, 1, this.b);
                            }
                            if(this.k == 3) {
                                jro jro14 = this.d;
                                if((jro14.Y > 0.0f)) {
                                    jsi jsi1 = jro14.h;
                                    if(jsi1.k == 3) {
                                        jsi1.f.j.add(jsd0);
                                        jsd0.k.add(this.d.h.f);
                                        jsd0.a = this;
                                    }
                                }
                            }
                        }
                    }
                }
                else {
                    jsc jsc13 = jsk.k(jrn6);
                    if(jsc13 != null) {
                        jsc jsc14 = this.j;
                        jsk.j(jsc14, jsc13, -this.d.S[3].b());
                        jsc jsc15 = this.i;
                        this.i(jsc15, jsc14, -1, jsd0);
                        if(this.d.G) {
                            this.i(this.a, jsc15, 1, this.b);
                        }
                    }
                }
            }
            else {
                jsc jsc11 = jsk.k(jrn4);
                if(jsc11 != null) {
                    jsc jsc12 = this.i;
                    jsk.j(jsc12, jsc11, this.d.S[2].b());
                    this.i(this.j, jsc12, 1, jsd0);
                    if(this.d.G) {
                        this.i(this.a, jsc12, 1, this.b);
                    }
                    if(this.k == 3) {
                        jro jro12 = this.d;
                        if((jro12.Y > 0.0f)) {
                            jsi jsi0 = jro12.h;
                            if(jsi0.k == 3) {
                                jsi0.f.j.add(jsd0);
                                jsd0.k.add(this.d.h.f);
                                jsd0.a = this;
                            }
                        }
                    }
                }
            }
            if(jsd0.k.size() == 0) {
                jsd0.c = true;
            }
        }
    }

    @Override  // jsn
    public final void c() {
        jsc jsc0 = this.i;
        if(jsc0.i) {
            this.d.ab = jsc0.f;
        }
    }

    @Override  // jsn
    public final void d() {
        this.e = null;
        this.i.b();
        this.j.b();
        this.a.b();
        this.f.b();
        this.h = false;
    }

    @Override  // jsn
    public final boolean e() {
        return this.k == 3 ? this.d.u == 0 : true;
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
            if(jsd0.c && !jsd0.i && this.k == 3) {
                jro jro0 = this.d;
                switch(jro0.u) {
                    case 2: {
                        jro jro1 = jro0.V;
                        if(jro1 != null) {
                            jsd jsd1 = jro1.i.f;
                            if(jsd1.i) {
                                jsd0.c(((int)(((float)jsd1.f) * jro0.B + 0.5f)));
                            }
                        }
                        break;
                    }
                    case 3: {
                        jsd jsd2 = jro0.h.f;
                        if(jsd2.i) {
                            switch(jro0.Z) {
                                case -1: {
                                    f = ((float)jsd2.f) / jro0.Y;
                                    break;
                                }
                                case 0: {
                                    f = ((float)jsd2.f) * jro0.Y;
                                    break;
                                }
                                default: {
                                    f = ((float)jsd2.f) / jro0.Y;
                                }
                            }
                            jsd0.c(((int)(f + 0.5f)));
                        }
                    }
                }
            }
            jsc jsc0 = this.i;
            if(jsc0.c) {
                jsc jsc1 = this.j;
                if(jsc1.c && (!jsc0.i || !jsc1.i || !jsd0.i)) {
                    if(!jsd0.i && this.k == 3 && (this.d.t == 0 && !this.d.L())) {
                        jsc jsc2 = (jsc)jsc0.k.get(0);
                        jsc jsc3 = (jsc)jsc1.k.get(0);
                        int v1 = jsc2.f + jsc0.e;
                        int v2 = jsc3.f + jsc1.e;
                        jsc0.c(v1);
                        jsc1.c(v2);
                        jsd0.c(v2 - v1);
                        return;
                    }
                    if(!jsd0.i && this.k == 3 && this.c == 1) {
                        List list0 = jsc0.k;
                        if(list0.size() > 0) {
                            List list1 = jsc1.k;
                            if(list1.size() > 0) {
                                jsc jsc4 = (jsc)list0.get(0);
                                jsc jsc5 = (jsc)list1.get(0);
                                int v3 = jsd0.m;
                                int v4 = jsc5.f + jsc1.e - (jsc4.f + jsc0.e);
                                if(v4 < v3) {
                                    jsd0.c(v4);
                                }
                                else {
                                    jsd0.c(v3);
                                }
                            }
                        }
                    }
                    if(jsd0.i) {
                        List list2 = jsc0.k;
                        if(list2.size() > 0) {
                            List list3 = jsc1.k;
                            if(list3.size() > 0) {
                                jsc jsc6 = (jsc)list2.get(0);
                                jsc jsc7 = (jsc)list3.get(0);
                                int v5 = jsc6.f;
                                int v6 = jsc0.e + v5;
                                int v7 = jsc7.f;
                                int v8 = jsc1.e + v7;
                                float f1 = jsc6 == jsc7 ? 0.5f : this.d.ag;
                                if(jsc6 != jsc7) {
                                    v7 = v8;
                                }
                                if(jsc6 != jsc7) {
                                    v5 = v6;
                                }
                                jsc0.c(((int)(((float)v5) + 0.5f + ((float)(v7 - v5 - jsd0.f)) * f1)));
                                jsc1.c(jsc0.f + jsd0.f);
                            }
                        }
                    }
                }
            }
            return;
        }
        this.m(this.d.L, this.d.N, 1);
    }

    public final void g() {
        this.h = false;
        jsc jsc0 = this.i;
        jsc0.b();
        jsc0.i = false;
        jsc jsc1 = this.j;
        jsc1.b();
        jsc1.i = false;
        this.a.b();
        this.a.i = false;
        this.f.i = false;
    }

    @Override
    public final String toString() {
        return "VerticalRun " + this.d.aj;
    }
}

