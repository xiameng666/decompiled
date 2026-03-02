public final class fmkh implements gfsi {
    public final String a;

    public fmkh(String s) {
        this.a = s;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        fmgs fmgs0 = fmgt.a();
        hnrx hnrx0 = ((hnuq)object0).j;
        if(hnrx0 == null) {
            hnrx0 = hnrx.a;
        }
        if(((ProtoLiteMessage)hnrx0).isInitialized()) {
            hnrx hnrx1 = ((hnuq)object0).j;
            if(hnrx1 == null) {
                hnrx1 = hnrx.a;
            }
            fmgs0.f(flwz.a(hnrx1));
        }
        if(!((hnuq)object0).d.isEmpty()) {
            fmgs0.b(((hnuq)object0).d);
        }
        hnrp hnrp0 = ((hnuq)object0).e;
        if(hnrp0 == null) {
            hnrp0 = hnrp.a;
        }
        gfsx gfsx0 = flwo.b(hnrp0, gfsx.m(this.a), gfsx.m(this.a));
        if(!gfsx0.i()) {
            return gfqx.a;
        }
        fmgs0.g(((hnuq)object0).c);
        fmgs0.a = (fmbi)gfsx0.d();
        hjie hjie0 = ((hnuq)object0).f;
        if(hjie0 == null) {
            hjie0 = hjie.a;
        }
        fmgs0.h(flwp.a(hjie0));
        hjie hjie1 = ((hnuq)object0).g;
        if(hjie1 == null) {
            hjie1 = hjie.a;
        }
        fmgs0.c(flwp.a(hjie1));
        hjie hjie2 = ((hnuq)object0).h;
        if(hjie2 == null) {
            hjie2 = hjie.a;
        }
        fmgs0.d(flwp.a(hjie2));
        fmgs0.e(((hnuq)object0).i);
        return gfsx.m(fmgs0.a());
    }
}

