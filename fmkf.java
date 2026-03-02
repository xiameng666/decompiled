public final class fmkf implements gfsi {
    public final String a;

    public fmkf(String s) {
        this.a = s;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        fmll fmll0 = new fmll();
        fmll0.c(((hnuy)object0).d.toByteArray());
        fmll0.b(((hnuy)object0).c);
        hnrp hnrp0 = ((hnuy)object0).e;
        if(hnrp0 == null) {
            hnrp0 = hnrp.a;
        }
        fmll0.b = (fmbi)flwo.b(hnrp0, gfsx.m(this.a), gfsx.m(this.a)).d();
        hnrx hnrx0 = ((hnuy)object0).f;
        if(hnrx0 == null) {
            hnrx0 = hnrx.a;
        }
        fmll0.a = flwz.a(hnrx0);
        return fmll0.a();
    }
}

