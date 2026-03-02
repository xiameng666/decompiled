import java.util.ArrayList;

public final class gbdp {
    final gbdr a;
    final hdrw b;
    gbdp c;
    ArrayList d;
    gbdq e;
    gbdq f;
    gbdq g;
    private int h;

    private gbdp(gbdr gbdr0, hdrw hdrw0) {
        this.a = gbdr0;
        this.b = hdrw0;
    }

    public static gbdp a(gbdr gbdr0, hdrw hdrw0) {
        gbdp gbdp0 = new gbdp(gbdr0, hdrw0);
        hdrw hdrw1 = gbdp0.b;
        if((hdrw1.b & 1) == 0) {
            gbdp0.c = null;
        }
        else {
            gbdp gbdp1 = gbdp0.a.b(hdrw1.c);
            gbdp0.c = gbdp1;
            gbdp1.h(gbdp0);
        }
        for(Object object0: hdrw1.d) {
            hdrv hdrv0 = (hdrv)object0;
            gbdr gbdr1 = gbdp0.a;
            if(gbdr1.e(hdrv0.d)) {
                int v = 0;
                for(Object object1: new hfuh(hdrv0.e, hdrv.a)) {
                    v += ((hdry)object1).g;
                }
                gbdp0.h |= v;
                hdrz hdrz0 = hdrv0.f == null ? hdrz.a : hdrv0.f;
                if((hdrz0.b & 2) != 0) {
                    if(gbdp0.e == null) {
                        gbdp0.e = new gbdq(((MessageLite)(hdrz0.f == null ? hdtf.a : hdrz0.f)), (gbdp0.c == null ? null : gbdp0.c.d()), gbdr1);
                    }
                    gbdp0.e.j(((MessageLite)(hdrz0.f == null ? hdtf.a : hdrz0.f)), v);
                }
                if((hdrz0.b & 1) != 0) {
                    if(gbdp0.f == null) {
                        gbdp0.f = new gbdq(((MessageLite)(hdrz0.e == null ? hdrf.b : hdrz0.e)), (gbdp0.c == null ? null : gbdp0.c.c()), gbdr1);
                    }
                    gbdp0.f.j(((MessageLite)(hdrz0.e == null ? hdrf.b : hdrz0.e)), v);
                }
                if(hdrz0.c != 0) {
                    if(gbdp0.g == null) {
                        gbdp0.g = new gbdq(((MessageLite)hdrz0), (gbdp0.c == null ? null : gbdp0.c.b()), gbdr1);
                    }
                    gbdp0.g.j(((MessageLite)hdrz0), v);
                }
            }
        }
        if(gbdp0.e == null && gbdp0.c == null) {
            gbdp0.e = new gbdq(((MessageLite)hdtf.a), null, gbdp0.a);
        }
        if(gbdp0.f == null && gbdp0.c == null) {
            gbdp0.f = new gbdq(((MessageLite)hdrf.b), null, gbdp0.a);
        }
        if(gbdp0.g == null && gbdp0.c == null) {
            gbdp0.g = new gbdq(((MessageLite)hdrz.a), null, gbdp0.a);
        }
        return gbdp0;
    }

    public final gbdq b() {
        gbdq gbdq0 = this.g;
        if(gbdq0 != null) {
            return gbdq0;
        }
        gbdp gbdp0 = this.c;
        gftb.check(gbdp0);
        return gbdp0.b();
    }

    public final gbdq c() {
        gbdq gbdq0 = this.f;
        if(gbdq0 != null) {
            return gbdq0;
        }
        gbdp gbdp0 = this.c;
        gftb.check(gbdp0);
        return gbdp0.c();
    }

    public final gbdq d() {
        gbdq gbdq0 = this.e;
        if(gbdq0 != null) {
            return gbdq0;
        }
        gbdp gbdp0 = this.c;
        gftb.check(gbdp0);
        return gbdp0.d();
    }

    final void e() {
        ArrayList arrayList0 = this.d;
        if(arrayList0 != null) {
            int v = arrayList0.size();
            for(int v1 = 0; v1 < v; ++v1) {
                ((gbdp)arrayList0.get(v1)).c = null;
            }
            this.d.clear();
        }
        gbdp gbdp0 = this.c;
        if(gbdp0 != null) {
            ArrayList arrayList1 = gbdp0.d;
            if(arrayList1 != null) {
                arrayList1.remove(this);
            }
        }
        this.c = null;
    }

    final void f() {
        if(this.c == null) {
            hdrw hdrw0 = this.b;
            if((hdrw0.b & 1) != 0) {
                gbdp gbdp0 = this.a.b(hdrw0.c);
                this.c = gbdp0;
                gbdp0.f();
                this.c.h(this);
                gbdq gbdq0 = this.e;
                if(gbdq0 != null) {
                    gbdp gbdp1 = this.c;
                    gftb.check(gbdp1);
                    gbdq0.k(gbdp1.d());
                }
                gbdq gbdq1 = this.f;
                if(gbdq1 != null) {
                    gbdp gbdp2 = this.c;
                    gftb.check(gbdp2);
                    gbdq1.k(gbdp2.c());
                }
                gbdq gbdq2 = this.g;
                if(gbdq2 != null) {
                    gbdp gbdp3 = this.c;
                    gftb.check(gbdp3);
                    gbdq2.k(gbdp3.b());
                }
            }
        }
    }

    public final boolean g(hdry hdry0) {
        return gbcc.b(this.h, hdry0) ? true : this.c != null && this.c.g(hdry0);
    }

    private final void h(gbdp gbdp0) {
        if(this.d == null) {
            this.d = new ArrayList();
        }
        this.d.add(gbdp0);
    }
}

