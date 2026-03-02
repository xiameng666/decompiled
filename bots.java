public final class bots implements gfsi {
    public final gfsx a;
    public final gfsx b;
    public final gfsx c;

    public bots(gfsx gfsx0, gfsx gfsx1, gfsx gfsx2) {
        this.a = gfsx0;
        this.b = gfsx1;
        this.c = gfsx2;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        gfsx gfsx0 = this.a;
        gfsx gfsx1 = this.b;
        gfsx gfsx2 = this.c;
        boul.t(((fqzl)object0), gfsx0, gfsx1, gfsx2);
        boolean z = true;
        if(!gfsx0.i() || ((fqzl)object0).e == ((Boolean)gfsx0.d()).booleanValue()) {
            if(gfsx0.i() && !((Boolean)gfsx0.d()).booleanValue()) {
                gfsx1 = gfsx.m(boul.b());
            }
            if(!gfsx1.i() || ((fqzl)object0).c == 22 && ((ProtoLiteMessage)(((fqza)((fqzl)object0).d))).equals(gfsx1.d())) {
                if(gfsx0.i() && !((Boolean)gfsx0.d()).booleanValue()) {
                    gfsx2 = gfsx.m(gtas.a);
                }
                if(gfsx2.i()) {
                    gtas gtas0 = gtas.b(((fqzl)object0).g);
                    if(gtas0 == null) {
                        gtas0 = gtas.a;
                    }
                    return gtas0 == gfsx2.d() ? Boolean.valueOf(false) : Boolean.valueOf(true);
                }
                z = false;
            }
        }
        return Boolean.valueOf(z);
    }
}

