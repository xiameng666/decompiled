public final class bnom implements glzn {
    public final bnop a;
    public final gszb b;

    public bnom(bnop bnop0, gszb gszb0) {
        this.a = bnop0;
        this.b = gszb0;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        if(((Boolean)object0).booleanValue()) {
            return gmbx.a;
        }
        gszb gszb0 = this.b;
        bnop bnop0 = this.a;
        if((gszb0.b == 8 ? ((gtdm)gszb0.c) : gtdm.a).b == 1) {
            gtdm gtdm0 = gszb0.b == 8 ? ((gtdm)gszb0.c) : gtdm.a;
            return gtdm0.b == 1 ? gdta.g(bnop0.c.m(((gsyz)gtdm0.c))).h(new bnoo(bnop0), gmap.a) : gdta.g(bnop0.c.m(gsyz.a)).h(new bnoo(bnop0), gmap.a);
        }
        return gdta.g(gmbx.a).h(new bnoo(bnop0), gmap.a);
    }
}

