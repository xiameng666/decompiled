public final class jsg extends jsn {
    public jsg(jro jro0) {
        super(jro0);
        jro0.h.d();
        jro0.i.d();
        this.g = ((jrs)jro0).as;
    }

    @Override  // jsn
    public final void b() {
        jro jro0 = this.d;
        int v = ((jrs)jro0).b;
        int v1 = ((jrs)jro0).c;
        if(((jrs)jro0).as == 1) {
            if(v != -1) {
                jsc jsc0 = this.i;
                jsc0.k.add(jro0.V.h.i);
                this.d.V.h.i.j.add(jsc0);
                jsc0.e = v;
            }
            else if(v1 == -1) {
                jsc jsc2 = this.i;
                jsc2.b = true;
                jsc2.k.add(jro0.V.h.j);
                this.d.V.h.j.j.add(jsc2);
            }
            else {
                jsc jsc1 = this.i;
                jsc1.k.add(jro0.V.h.j);
                this.d.V.h.j.j.add(jsc1);
                jsc1.e = -v1;
            }
            this.g(this.d.h.i);
            this.g(this.d.h.j);
            return;
        }
        if(v != -1) {
            jsc jsc3 = this.i;
            jsc3.k.add(jro0.V.i.i);
            this.d.V.i.i.j.add(jsc3);
            jsc3.e = v;
        }
        else if(v1 == -1) {
            jsc jsc5 = this.i;
            jsc5.b = true;
            jsc5.k.add(jro0.V.i.j);
            this.d.V.i.j.j.add(jsc5);
        }
        else {
            jsc jsc4 = this.i;
            jsc4.k.add(jro0.V.i.j);
            this.d.V.i.j.j.add(jsc4);
            jsc4.e = -v1;
        }
        this.g(this.d.i.i);
        this.g(this.d.i.j);
    }

    @Override  // jsn
    public final void c() {
        jro jro0 = this.d;
        if(((jrs)jro0).as == 1) {
            jro0.aa = this.i.f;
            return;
        }
        jro0.ab = this.i.f;
    }

    @Override  // jsn
    public final void d() {
        this.i.b();
    }

    @Override  // jsn
    public final boolean e() {
        return false;
    }

    @Override  // jsn
    public final void f() {
        jsc jsc0 = this.i;
        if(jsc0.c && !jsc0.i) {
            jsc0.c(((int)(((float)((jsc)jsc0.k.get(0)).f) * ((jrs)this.d).a + 0.5f)));
        }
    }

    private final void g(jsc jsc0) {
        jsc jsc1 = this.i;
        jsc1.j.add(jsc0);
        jsc0.k.add(jsc1);
    }
}

