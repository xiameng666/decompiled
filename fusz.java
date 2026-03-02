import j..util.Objects;

public final class fusz extends fusx {
    final futa b;

    protected fusz(futa futa0) {
        Objects.requireNonNull(futa0);
        this.b = futa0;
        super(futa0);
    }

    @Override  // fusx
    protected final void m(long v, long v1, fvsf fvsf0, fvsf fvsf1) {
        fusv fusv0;
        futa futa0 = this.b;
        fvsf fvsf2 = futa.g(fvsf0, futa0.c);
        futa0.c(fvsf2);
        fusy.d(fvsf0, fvsf2);
        int v2 = (int)Math.round(fusy.a(fvsf0));
        fvwz fvwz0 = futa0.p;
        fvwz0.h(94, v2);
        futa0.e.e(v, v1, fvns.d, fvsf0);
        futa0.e.e(v, v1, fvns.k, fvsf1);
        fuuz fuuz0 = futa0.q;
        if(fuuz0 != null && futa0.i && futa0.j != null) {
            fvsf fvsf3 = futa.g(fvsf1, futa0.c);
            fuuz0.c(futa0.j, v, v1, fvsf2, fvsf3);
        }
        int v3 = fvsf2.c;
        if(v3 < 4) {
            futg.a(fvwz0, v3);
            fusv0 = fusv.c(v3);
        }
        else {
            if(futa0.g != null) {
                this.l(v, v1, fvsf2);
            }
            fusv fusv1 = futa0.d == null || !futa0.d.c ? fusv.a : this.a(v, v1, fvsf2);
            fusv0 = futa.f(fusv.a, fusv1);
        }
        futa0.e.b(fusv0);
    }
}

