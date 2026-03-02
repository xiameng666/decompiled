final class aicx extends ibsl implements ibtw {
    final aicy a;
    final ghwp b;

    public aicx(aicy aicy0, ghwp ghwp0, ibrl ibrl0) {
        this.a = aicy0;
        this.b = ghwp0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((aicx)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new aicx(this.a, this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibnx.b(object0);
        aicw aicw0 = new aicw(this.b);
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ghon.a).v_newBuilder();
        ibuq.e(hftp0, "newBuilder(...)");
        aicw0.a(hftp0);
        ProtoLiteMessage hftv0 = hftp0.N_build();
        ibuq.e(hftv0, "build(...)");
        cdwn.v().c(((ProtoLiteMessage)(((ghon)hftv0)))).a();
        ghwm ghwm0 = ghwm.b(this.b.f) == null ? ghwm.a : ghwm.b(this.b.f);
        aicy.a.h("MissedCallRetrieverEvent " + (ghwo.b(this.b.c) == null ? ghwo.a : ghwo.b(this.b.c)).name() + " " + ghwm0.name() + " logged successfully.", new Object[0]);
        return ibom.a;
    }
}

