final class ctkr implements icih {
    final icih a;

    public ctkr(icih icih0) {
        this.a = icih0;
        super();
    }

    @Override  // icih
    public final Object a(Object object0, ibrl ibrl0) {
        cubs cubs0 = cubr.a(((ProtoLiteMessage)ctze.a).v_newBuilder());
        cubs0.b(hfxt.a(((byte[])object0)));
        ctze ctze0 = cubs0.a();
        Object object1 = this.a.a(ctze0, ibrl0);
        return object1 == ibrx.a ? object1 : ibom.a;
    }
}

