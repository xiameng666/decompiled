import java.util.ArrayList;

public final class jrs extends jro {
    public float a;
    public int as;
    private boolean at;
    public int b;
    public int c;
    public jrn d;

    public jrs() {
        this.a = -1.0f;
        this.b = -1;
        this.c = -1;
        this.d = this.L;
        this.as = 0;
        this.T.clear();
        this.T.add(this.d);
        for(int v = 0; v < 6; ++v) {
            this.S[v] = this.d;
        }
    }

    @Override  // jro
    public final jrn N(int v) {
        switch(v - 1) {
            case 1: 
            case 3: {
                return this.as == 1 ? this.d : null;
            }
            case 2: 
            case 4: {
                return this.as == 0 ? this.d : null;
            }
            default: {
                return null;
            }
        }
    }

    @Override  // jro
    public final void V(boolean z) {
        if(this.V == null) {
            return;
        }
        int v = jrd.o(this.d);
        if(this.as == 1) {
            this.aa = v;
            this.ab = 0;
            this.A(this.V.h());
            this.F(0);
            return;
        }
        this.aa = 0;
        this.ab = v;
        this.F(this.V.j());
        this.A(0);
    }

    public final void a(int v) {
        this.d.f(v);
        this.at = true;
    }

    @Override  // jro
    public final void b(jrd jrd0, boolean z) {
        jro jro0 = this.V;
        if(jro0 != null) {
            jrn jrn0 = jro0.N(2);
            jrn jrn1 = jro0.N(4);
            jro jro1 = this.V;
            int v = 1;
            int v1 = jro1 == null || jro1.ar[0] != 2 ? 0 : 1;
            if(this.as == 0) {
                jrn0 = jro0.N(3);
                jrn1 = jro0.N(5);
                if(jro1 == null || jro1.ar[1] != 2) {
                    v = 0;
                }
                v1 = v;
            }
            if(this.at) {
                jrn jrn2 = this.d;
                if(jrn2.c) {
                    jri jri0 = jrd0.b(jrn2);
                    jrd0.f(jri0, this.d.a());
                    if(this.b == -1) {
                        if(this.c != -1 && v1 != 0) {
                            jri jri1 = jrd0.b(jrn1);
                            jrd0.g(jri0, jrd0.b(jrn0), 0, 5);
                            jrd0.g(jri1, jri0, 0, 5);
                        }
                    }
                    else if(v1 != 0) {
                        jrd0.g(jrd0.b(jrn1), jri0, 0, 5);
                    }
                    this.at = false;
                    return;
                }
            }
            if(this.b != -1) {
                jri jri2 = jrd0.b(this.d);
                jrd0.m(jri2, jrd0.b(jrn0), this.b, 8);
                if(v1 != 0) {
                    jrd0.g(jrd0.b(jrn1), jri2, 0, 5);
                }
            }
            else if(this.c != -1) {
                jri jri3 = jrd0.b(this.d);
                jri jri4 = jrd0.b(jrn1);
                jrd0.m(jri3, jri4, -this.c, 8);
                if(v1 != 0) {
                    jrd0.g(jri3, jrd0.b(jrn0), 0, 5);
                    jrd0.g(jri4, jri3, 0, 5);
                }
            }
            else if(this.a != -1.0f) {
                jri jri5 = jrd0.b(this.d);
                jri jri6 = jrd0.b(jrn1);
                float f = this.a;
                jrb jrb0 = jrd0.a();
                jrb0.e.g(jri5, -1.0f);
                jrb0.e.g(jri6, f);
                jrd0.e(jrb0);
            }
        }
    }

    public final void c(int v) {
        if(this.as != v) {
            this.as = v;
            ArrayList arrayList0 = this.T;
            arrayList0.clear();
            this.d = this.as == 1 ? this.K : this.L;
            arrayList0.add(this.d);
            jrn[] arr_jrn = this.S;
            for(int v1 = 0; v1 < 6; ++v1) {
                arr_jrn[v1] = this.d;
            }
        }
    }

    @Override  // jro
    public final boolean d() {
        return true;
    }

    @Override  // jro
    public final boolean e() {
        return this.at;
    }

    @Override  // jro
    public final boolean f() {
        return this.at;
    }
}

