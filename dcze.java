final class dcze extends ibsl implements ibtx {
    int a;
    Object b;
    private Object c;

    public dcze(ibrl ibrl0) {
        super(3, ibrl0);
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        dcze dcze0 = new dcze(((ibrl)object2));
        dcze0.c = (icih)object0;
        dcze0.b = (Exception)object1;
        return dcze0.jI(ibom.a);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            Object object2 = this.c;
            if(dcwk.a(((Throwable)this.b)) != 35505) {
                return Boolean.valueOf(false);
            }
            this.c = null;
            this.a = 1;
            if(((icih)object2).a(null, this) == object1) {
                return object1;
            }
        }
        return Boolean.valueOf(true);
    }
}

