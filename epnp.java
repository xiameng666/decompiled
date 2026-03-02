final class epnp extends ibsl implements ibtw {
    int a;
    final ibtw b;
    final epoo c;

    public epnp(ibtw ibtw0, epoo epoo0, ibrl ibrl0) {
        this.b = ibtw0;
        this.c = epoo0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((epnp)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new epnp(this.b, this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v != 0) {
            return object0;
        }
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)this.c).jf(5, null);
        hftp0.X(((ProtoLiteMessage)this.c));
        ibuq.e(hftp0, "toBuilder(...)");
        this.a = 1;
        Object object2 = this.b.a(hftp0, this);
        return object2 == object1 ? object1 : object2;
    }
}

