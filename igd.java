public final class igd {
    public final ify a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public int g;
    public int h;
    public boolean i;
    public boolean j;
    public int k;
    public boolean l;
    public boolean m;
    public int n;
    public final ihc o;
    public igt p;
    public int q;

    public igd(ify ify0) {
        this.a = ify0;
        this.q = 5;
        this.o = new ihc(this);
    }

    public final ihy a() {
        return this.a.u.d;
    }

    public final jkp b() {
        return this.o.j ? new jkp(this.o.d) : null;
    }

    public final jkp c() {
        return this.p == null ? null : this.p.l;
    }

    public final void d() {
        this.o.x = true;
        igt igt0 = this.p;
        if(igt0 != null) {
            igt0.r = true;
        }
    }

    public final void e() {
        this.e = true;
        this.f = true;
    }

    public final void f() {
        int v = this.a.aC();
        switch(v) {
            case 3: {
            label_4:
                if(this.o.y) {
                    this.j(true);
                }
                else {
                    this.i(true);
                }
                break;
            }
            case 4: {
                v = 4;
                goto label_4;
            }
        }
        if(v == 4) {
            if(this.p != null && this.p.s) {
                this.l(true);
                return;
            }
            this.k(true);
        }
    }

    public final void g(int v) {
        int v1 = this.k;
        this.k = v;
        if((v1 == 0 ? 1 : 0) != (v == 0 ? 1 : 0)) {
            ify ify0 = this.a.n();
            igd igd0 = ify0 == null ? null : ify0.v;
            if(igd0 != null) {
                if(v == 0) {
                    igd0.g(igd0.k - 1);
                    return;
                }
                igd0.g(igd0.k + 1);
            }
        }
    }

    public final void h(int v) {
        int v1 = this.n;
        this.n = v;
        if((v1 == 0 ? 1 : 0) != (v == 0 ? 1 : 0)) {
            ify ify0 = this.a.n();
            igd igd0 = ify0 == null ? null : ify0.v;
            if(igd0 != null) {
                if(v == 0) {
                    igd0.h(igd0.n - 1);
                    return;
                }
                igd0.h(igd0.n + 1);
            }
        }
    }

    public final void i(boolean z) {
        if(this.j != z) {
            this.j = z;
            if(z) {
                if(!this.i) {
                    this.g(this.k + 1);
                }
            }
            else if(!this.i) {
                this.g(this.k - 1);
            }
        }
    }

    public final void j(boolean z) {
        if(this.i != z) {
            this.i = z;
            if(z) {
                if(!this.j) {
                    this.g(this.k + 1);
                }
            }
            else if(!this.j) {
                this.g(this.k - 1);
            }
        }
    }

    public final void k(boolean z) {
        if(this.m != z) {
            this.m = z;
            if(z) {
                if(!this.l) {
                    this.h(this.n + 1);
                }
            }
            else if(!this.l) {
                this.h(this.n - 1);
            }
        }
    }

    public final void l(boolean z) {
        if(this.l != z) {
            this.l = z;
            if(z) {
                if(!this.m) {
                    this.h(this.n + 1);
                }
            }
            else if(!this.m) {
                this.h(this.n - 1);
            }
        }
    }

    public final void m() {
        ihc ihc0 = this.o;
        if((ihc0.r != null || ihc0.p().f() != null) && ihc0.q) {
            ihc0.q = false;
            ihc0.r = ihc0.p().f();
            ify ify0 = this.a.n();
            if(ify0 != null) {
                ify.ax(ify0, false, 7);
            }
        }
        igt igt0 = this.p;
        if(igt0 != null) {
            if(igt0.u == null) {
                igm igm0 = igt0.q().C();
                ibuq.c(igm0);
                if(igm0.f() != null) {
                    goto label_13;
                }
            }
            else {
            label_13:
                if(igt0.t) {
                    igt0.t = false;
                    igm igm1 = igt0.q().C();
                    ibuq.c(igm1);
                    igt0.u = igm1.f();
                    ify ify1 = this.a;
                    if(ige.a(ify1)) {
                        ify ify2 = ify1.n();
                        if(ify2 != null) {
                            ify.ax(ify2, false, 7);
                        }
                    }
                    else {
                        ify ify3 = ify1.n();
                        if(ify3 != null) {
                            ify.av(ify3, false, 7);
                        }
                    }
                }
            }
        }
    }

    public final boolean n() {
        return this.o.v;
    }
}

