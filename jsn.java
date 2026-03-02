public abstract class jsn implements jsa {
    public int c;
    public jro d;
    jsj e;
    public final jsd f;
    public int g;
    public boolean h;
    public final jsc i;
    public final jsc j;
    protected int k;
    protected int l;

    public jsn(jro jro0) {
        this.f = new jsd(this);
        this.g = 0;
        this.h = false;
        this.i = new jsc(this);
        this.j = new jsc(this);
        this.l = 1;
        this.d = jro0;
    }

    public long a() {
        return this.f.i ? ((long)this.f.f) : 0L;
    }

    public abstract void b();

    public abstract void c();

    public abstract void d();

    public abstract boolean e();

    @Override  // jsa
    public void f() {
        throw null;
    }

    protected final int h(int v, int v1) {
        if(v1 == 0) {
            int v2 = this.d.x;
            int v3 = v2 <= 0 ? Math.max(this.d.w, v) : Math.min(v2, v);
            return v3 == v ? v : v3;
        }
        int v4 = this.d.A;
        int v5 = v4 <= 0 ? Math.max(this.d.z, v) : Math.min(v4, v);
        return v5 == v ? v : v5;
    }

    protected final void i(jsc jsc0, jsc jsc1, int v, jsd jsd0) {
        jsc0.k.add(jsc1);
        jsc0.k.add(this.f);
        jsc0.g = v;
        jsc0.h = jsd0;
        jsc1.j.add(jsc0);
        jsd0.j.add(jsc0);
    }

    protected static final void j(jsc jsc0, jsc jsc1, int v) {
        jsc0.k.add(jsc1);
        jsc0.e = v;
        jsc1.j.add(jsc0);
    }

    protected static final jsc k(jrn jrn0) {
        jrn jrn1 = jrn0.e;
        if(jrn1 != null) {
            jro jro0 = jrn1.d;
            switch(jrn1.i - 1) {
                case 1: {
                    return jro0.h.i;
                }
                case 2: {
                    return jro0.i.i;
                }
                case 3: {
                    return jro0.h.j;
                }
                case 4: {
                    return jro0.i.j;
                }
                case 5: {
                    return jro0.i.a;
                }
                default: {
                    return null;
                }
            }
        }
        return null;
    }

    protected static final jsc l(jrn jrn0, int v) {
        jrn jrn1 = jrn0.e;
        if(jrn1 != null) {
            jro jro0 = jrn1.d;
            jsi jsi0 = v == 0 ? jro0.h : jro0.i;
            switch(jrn1.i - 1) {
                case 1: 
                case 2: {
                    return jsi0.i;
                }
                case 3: 
                case 4: {
                    return jsi0.j;
                }
                default: {
                    return null;
                }
            }
        }
        return null;
    }

    protected final void m(jrn jrn0, jrn jrn1, int v) {
        jsi jsi0;
        jsc jsc0 = jsn.k(jrn0);
        jsc jsc1 = jsn.k(jrn1);
        if(jsc0.i && jsc1.i) {
            int v1 = jrn0.b();
            int v2 = jsc0.f + v1;
            int v3 = jrn1.b();
            int v4 = jsc1.f - v3;
            jsd jsd0 = this.f;
            int v5 = v4 - v2;
            if(!jsd0.i && this.k == 3) {
                int v6 = 1;
                int v7 = this.c;
                switch(v7) {
                    case 0: {
                        jsd0.c(this.h(v5, v));
                        break;
                    }
                    case 1: {
                        jsd0.c(Math.min(this.h(jsd0.m, v), v5));
                        break;
                    }
                    default: {
                        int v8 = 0;
                        switch(v7) {
                            case 2: {
                                jro jro0 = this.d;
                                jro jro1 = jro0.V;
                                if(jro1 != null) {
                                    if(v == 0) {
                                        jsi0 = jro1.h;
                                        v6 = 0;
                                    }
                                    else {
                                        jsi0 = jro1.i;
                                        v8 = 1;
                                    }
                                    jsd jsd1 = jsi0.f;
                                    if(jsd1.i) {
                                        jsd0.c(this.h(((int)(((float)jsd1.f) * (v6 == 0 ? jro0.y : jro0.B) + 0.5f)), v6));
                                        v = v6;
                                    }
                                    else {
                                        v = v8;
                                    }
                                }
                                break;
                            }
                            case 3: {
                                jro jro2 = this.d;
                                jsi jsi1 = jro2.h;
                                if(jsi1.k != 3 || jsi1.c != 3 || (jro2.i.k != 3 || jro2.i.c != 3)) {
                                    if(v == 0) {
                                        jsi1 = jro2.i;
                                        v = 0;
                                    }
                                    else {
                                        v = 1;
                                        v8 = 1;
                                    }
                                    jsd jsd2 = jsi1.f;
                                    if(jsd2.i) {
                                        jsd0.c((v == 1 ? ((int)(((float)jsd2.f) / jro2.Y + 0.5f)) : ((int)(jro2.Y * ((float)jsd2.f) + 0.5f))));
                                    }
                                    else {
                                        v = v8;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if(jsd0.i) {
                int v9 = jsd0.f;
                if(v9 == v5) {
                    this.i.c(v2);
                    this.j.c(v4);
                    return;
                }
                float f = v == 0 ? this.d.af : this.d.ag;
                if(jsc0 == jsc1) {
                    v2 = jsc0.f;
                    v4 = jsc1.f;
                    f = 0.5f;
                }
                this.i.c(((int)(((float)v2) + 0.5f + ((float)(v4 - v2 - v9)) * f)));
                this.j.c(this.i.f + jsd0.f);
            }
        }
    }
}

