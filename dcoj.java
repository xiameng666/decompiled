final class dcoj extends ibsl implements ibtw {
    int a;
    final dcor b;
    final dcoa c;
    final dcny d;

    public dcoj(dcor dcor0, dcoa dcoa0, dcny dcny0, ibrl ibrl0) {
        this.b = dcor0;
        this.c = dcoa0;
        this.d = dcny0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dcoj)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new dcoj(this.b, this.c, this.d, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            this.a = 1;
            Object object2 = iccl.a(new dcoq(this.b, this.c, this.d, null), this);
            if(object2 != object1) {
                object2 = ibom.a;
            }
            if(object2 == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

