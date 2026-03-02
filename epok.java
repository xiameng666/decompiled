final class epok extends ibsl implements ibtw {
    Object a;
    int b;
    final ibvd c;
    final ibtw d;
    final epnt e;

    public epok(ibvd ibvd0, ibtw ibtw0, epnt epnt0, ibrl ibrl0) {
        this.c = ibvd0;
        this.d = ibtw0;
        this.e = epnt0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((epok)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new epok(this.c, this.d, this.e, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object2;
        Object object1 = ibrx.a;
        if(this.b != 0) {
            object2 = this.a;
            ibnx.b(object0);
            goto label_16;
        }
        ibnx.b(object0);
        ibvd ibvd0 = this.c;
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)this.e).jf(5, null);
        hftp0.X(((ProtoLiteMessage)this.e));
        ibuq.e(hftp0, "toBuilder(...)");
        this.a = ibvd0;
        this.b = 1;
        Object object3 = this.d.a(hftp0, this);
        if(object3 != object1) {
            object2 = ibvd0;
            object0 = object3;
        label_16:
            ((ibvd)object2).a = object0;
            Object object4 = this.c.a;
            if(object4 == null) {
                ibuq.j("newSignificantPlaces");
                return null;
            }
            return (epnt)object4;
        }
        return object1;
    }
}

