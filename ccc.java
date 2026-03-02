final class ccc extends ibur implements ibtx {
    final ibts a;
    final clj b;

    public ccc(ibts ibts0, clj clj0) {
        this.a = ibts0;
        this.b = clj0;
        super(3);
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        ibq ibq0 = ((ias)object1).e(((jkp)object2).a);
        if(((iax)object0).ep()) {
            Object object3 = this.b.g();
            if(!((Boolean)this.a.a(object3)).booleanValue()) {
                return iaw.b(((iax)object0), 0, 0, new ccb(ibq0));
            }
        }
        long v = ((long)ibq0.a) << 0x20 | ((long)ibq0.b) & 0xFFFFFFFFL;
        return iaw.b(((iax)object0), ((int)(v >> 0x20)), ((int)(0xFFFFFFFFL & v)), new ccb(ibq0));
    }
}

