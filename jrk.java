public final class jrk extends jrt {
    public int a;
    public boolean b;
    public int c;
    boolean d;

    public jrk() {
        this.a = 0;
        this.b = true;
        this.c = 0;
        this.d = false;
    }

    public final int a() {
        switch(this.a) {
            case 0: 
            case 1: {
                return 0;
            }
            case 2: 
            case 3: {
                return 1;
            }
            default: {
                return -1;
            }
        }
    }

    @Override  // jro
    public final void b(jrd jrd0, boolean z) {
        int v5;
        jrn[] arr_jrn = this.S;
        jrn jrn0 = this.K;
        arr_jrn[0] = jrn0;
        jrn jrn1 = this.L;
        arr_jrn[2] = jrn1;
        jrn jrn2 = this.M;
        arr_jrn[1] = jrn2;
        jrn jrn3 = this.N;
        arr_jrn[3] = jrn3;
        for(int v = 0; v < 6; ++v) {
            jrn jrn4 = arr_jrn[v];
            jrn4.h = jrd0.b(jrn4);
        }
        int v1 = this.a;
        if(v1 >= 0 && v1 < 4) {
            jrn jrn5 = arr_jrn[v1];
            if(!this.d) {
                this.c();
            }
            if(this.d) {
                this.d = false;
                int v2 = this.a;
                if(v2 == 0 || v2 == 1) {
                    goto label_28;
                }
                if(v2 == 2 || v2 == 3) {
                    jrd0.f(jrn1.h, this.ab);
                    jrd0.f(jrn3.h, this.ab);
                    return;
                label_28:
                    jrd0.f(jrn0.h, this.aa);
                    jrd0.f(jrn2.h, this.aa);
                }
            }
            else {
                int v3 = 0;
                while(true) {
                    boolean z1 = false;
                    if(v3 < this.aK) {
                        jro jro0 = this.aJ[v3];
                        if(this.b || jro0.d()) {
                            if(this.a != 0 && this.a != 1 || jro0.P() != 3 || jro0.K.e == null || jro0.M.e == null) {
                                if((this.a == 2 || this.a == 3) && jro0.Q() == 3 && jro0.L.e != null && jro0.N.e != null) {
                                    z1 = true;
                                    break;
                                }
                                ++v3;
                                continue;
                            }
                            z1 = true;
                        }
                        else {
                            ++v3;
                            continue;
                        }
                    }
                    break;
                }
                boolean z2 = jrn0.h() || jrn2.h();
                boolean z3 = jrn1.h() || jrn3.h();
                if(z1) {
                    v5 = 4;
                }
                else {
                    int v4 = this.a;
                    v5 = 5;
                    if(v4 != 0) {
                    label_56:
                        if(v4 != 2) {
                        label_59:
                            if((v4 != 1 || !z2) && (v4 != 3 || !z3)) {
                                v5 = 4;
                            }
                        }
                        else if(!z3) {
                            z3 = false;
                            goto label_59;
                        }
                    }
                    else if(!z2) {
                        z2 = false;
                        v4 = 0;
                        goto label_56;
                    }
                }
                for(int v6 = 0; v6 < this.aK; ++v6) {
                    jro jro1 = this.aJ[v6];
                    if(this.b || jro1.d()) {
                        jri jri0 = jrd0.b(jro1.S[this.a]);
                        int v7 = this.a;
                        jrn jrn6 = jro1.S[v7];
                        jrn6.h = jri0;
                        int v8 = jrn6.e == null || jrn6.e.d != this ? 0 : jrn6.f;
                        if(v7 != 0 && v7 != 2) {
                            jri jri1 = jrn5.h;
                            int v9 = this.c + v8;
                            jrb jrb0 = jrd0.a();
                            jri jri2 = jrd0.c();
                            jri2.e = 0;
                            jrb0.h(jri1, jri0, jri2, v9);
                            jrd0.e(jrb0);
                        }
                        else {
                            jri jri3 = jrn5.h;
                            int v10 = this.c - v8;
                            jrb jrb1 = jrd0.a();
                            jri jri4 = jrd0.c();
                            jri4.e = 0;
                            jrb1.i(jri3, jri0, jri4, v10);
                            jrd0.e(jrb1);
                        }
                        jrd0.m(jrn5.h, jri0, this.c + v8, v5);
                    }
                }
                int v11 = this.a;
                if(v11 == 0) {
                    jrd0.m(jrn2.h, jrn0.h, 0, 8);
                    jrd0.m(jrn0.h, this.V.M.h, 0, 4);
                    jrd0.m(jrn0.h, this.V.K.h, 0, 0);
                    return;
                }
                switch(v11) {
                    case 1: {
                        jrd0.m(jrn0.h, jrn2.h, 0, 8);
                        jrd0.m(jrn0.h, this.V.K.h, 0, 4);
                        jrd0.m(jrn0.h, this.V.M.h, 0, 0);
                        return;
                    }
                    case 2: {
                        jrd0.m(jrn3.h, jrn1.h, 0, 8);
                        jrd0.m(jrn1.h, this.V.N.h, 0, 4);
                        jrd0.m(jrn1.h, this.V.L.h, 0, 0);
                        return;
                    }
                    case 3: {
                        jrd0.m(jrn1.h, jrn3.h, 0, 8);
                        jrd0.m(jrn1.h, this.V.L.h, 0, 4);
                        jrd0.m(jrn1.h, this.V.N.h, 0, 0);
                        break;
                    }
                }
            }
        }
    }

    public final boolean c() {
        boolean z = true;
        for(int v1 = 0; true; ++v1) {
            int v2 = this.aK;
            if(v1 >= v2) {
                break;
            }
            jro jro0 = this.aJ[v1];
            if(this.b || jro0.d()) {
                if((this.a == 0 || this.a == 1) && !jro0.e()) {
                    z = false;
                }
                else if((this.a == 2 || this.a == 3) && !jro0.f()) {
                    z = false;
                }
            }
        }
        if(z && v2 > 0) {
            int v3 = 0;
            boolean z1 = false;
            for(int v = 0; v < this.aK; ++v) {
                jro jro1 = this.aJ[v];
                if(this.b || jro1.d()) {
                    if(!z1) {
                        int v4 = this.a;
                        if(v4 == 0) {
                            v3 = jro1.N(2).a();
                        }
                        else if(v4 == 1) {
                            v3 = jro1.N(4).a();
                        }
                        else if(v4 == 2) {
                            v3 = jro1.N(3).a();
                        }
                        else if(v4 == 3) {
                            v3 = jro1.N(5).a();
                        }
                    }
                    int v5 = this.a;
                    if(v5 == 0) {
                        v3 = Math.min(v3, jro1.N(2).a());
                    }
                    else if(v5 == 1) {
                        v3 = Math.max(v3, jro1.N(4).a());
                    }
                    else if(v5 == 2) {
                        v3 = Math.min(v3, jro1.N(3).a());
                    }
                    else if(v5 == 3) {
                        v3 = Math.max(v3, jro1.N(5).a());
                    }
                    z1 = true;
                }
            }
            int v6 = v3 + this.c;
            if(this.a != 0 && this.a != 1) {
                this.z(v6, v6);
            }
            else {
                this.y(v6, v6);
            }
            this.d = true;
            return true;
        }
        return false;
    }

    @Override  // jro
    public final boolean d() {
        return true;
    }

    @Override  // jro
    public final boolean e() {
        return this.d;
    }

    @Override  // jro
    public final boolean f() {
        return this.d;
    }

    @Override  // jro
    public final String toString() {
        String s = "[Barrier] " + this.aj + " {";
        for(int v = 0; v < this.aK; ++v) {
            jro jro0 = this.aJ[v];
            if(v > 0) {
                s = s + ", ";
            }
            s = s + jro0.aj;
        }
        return s + "}";
    }
}

