final class jsh extends jsn {
    public jsh(jro jro0) {
        super(jro0);
    }

    @Override  // jsn
    public final void b() {
        jro jro0 = this.d;
        if((jro0 instanceof jrk)) {
            jsc jsc0 = this.i;
            jsc0.b = true;
            int v = ((jrk)jro0).a;
            boolean z = ((jrk)jro0).b;
            int v1 = 0;
            switch(v) {
                case 0: {
                    jsc0.l = 4;
                    while(v1 < ((jrk)jro0).aK) {
                        jro jro1 = ((jrk)jro0).aJ[v1];
                        if(z || jro1.ai != 8) {
                            jsc jsc1 = jro1.h.i;
                            jsc1.j.add(jsc0);
                            jsc0.k.add(jsc1);
                        }
                        ++v1;
                    }
                    this.g(this.d.h.i);
                    this.g(this.d.h.j);
                    return;
                }
                case 1: {
                    jsc0.l = 5;
                    while(v1 < ((jrk)jro0).aK) {
                        jro jro2 = ((jrk)jro0).aJ[v1];
                        if(z || jro2.ai != 8) {
                            jsc jsc2 = jro2.h.j;
                            jsc2.j.add(jsc0);
                            jsc0.k.add(jsc2);
                        }
                        ++v1;
                    }
                    this.g(this.d.h.i);
                    this.g(this.d.h.j);
                    return;
                }
                case 2: {
                    jsc0.l = 6;
                    while(v1 < ((jrk)jro0).aK) {
                        jro jro3 = ((jrk)jro0).aJ[v1];
                        if(z || jro3.ai != 8) {
                            jsc jsc3 = jro3.i.i;
                            jsc3.j.add(jsc0);
                            jsc0.k.add(jsc3);
                        }
                        ++v1;
                    }
                    this.g(this.d.i.i);
                    this.g(this.d.i.j);
                    return;
                }
                case 3: {
                    jsc0.l = 7;
                    while(v1 < ((jrk)jro0).aK) {
                        jro jro4 = ((jrk)jro0).aJ[v1];
                        if(z || jro4.ai != 8) {
                            jsc jsc4 = jro4.i.j;
                            jsc4.j.add(jsc0);
                            jsc0.k.add(jsc4);
                        }
                        ++v1;
                    }
                    this.g(this.d.i.i);
                    this.g(this.d.i.j);
                }
            }
        }
    }

    @Override  // jsn
    public final void c() {
        jro jro0 = this.d;
        if((jro0 instanceof jrk)) {
            switch(((jrk)jro0).a) {
                case 0: 
                case 1: {
                    jro0.aa = this.i.f;
                    break;
                }
                default: {
                    jro0.ab = this.i.f;
                }
            }
        }
    }

    @Override  // jsn
    public final void d() {
        this.e = null;
        this.i.b();
    }

    @Override  // jsn
    public final boolean e() {
        return false;
    }

    @Override  // jsn
    public final void f() {
        jrk jrk0 = (jrk)this.d;
        int v = jrk0.a;
        jsc jsc0 = this.i;
        int v1 = 0;
        int v2 = -1;
        for(Object object0: jsc0.k) {
            int v3 = ((jsc)object0).f;
            if(v2 == -1 || v3 < v2) {
                v2 = v3;
            }
            if(v1 < v3) {
                v1 = v3;
            }
        }
        if(v != 0 && v != 2) {
            jsc0.c(v1 + jrk0.c);
            return;
        }
        jsc0.c(v2 + jrk0.c);
    }

    private final void g(jsc jsc0) {
        jsc jsc1 = this.i;
        jsc1.j.add(jsc0);
        jsc0.k.add(jsc1);
    }
}

