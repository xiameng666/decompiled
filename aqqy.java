public final class aqqy extends ibsl implements ibtw {
    int a;
    final aqqz b;

    public aqqy(aqqz aqqz0, ibrl ibrl0) {
        this.b = aqqz0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((aqqy)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new aqqy(this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            aqqx aqqx0 = new aqqx(new aqqw());
            gmcd gmcd0 = this.b.d.b(aqqx0, this.b.c);
            this.a = 1;
            if(icpu.c(gmcd0, this) == object1) {
                return object1;
            }
        }
        aqqk aqqk0 = new aqqk(this.b.b, false, true, 10);
        ghyp ghyp0 = ghyo.a(((ProtoLiteMessage)ghys.a).v_newBuilder());
        giya giya0 = gixz.a(((ProtoLiteMessage)gidi.a).v_newBuilder());
        ProtoLiteBuilder hftp0 = giya0.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gidi gidi0 = (gidi)hftp0.b_message;
        gidi0.b |= 16;
        gidi0.g = true;
        ghyp0.c(giya0.a());
        aqqk0.a(ghyp0.a(), ghyr.aO);
        return ibom.a;
    }
}

