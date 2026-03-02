final class jmq extends ibsl implements ibtw {
    int a;
    final boolean b;
    final jmw c;
    final long d;

    public jmq(boolean z, jmw jmw0, long v, ibrl ibrl0) {
        this.b = z;
        this.c = jmw0;
        this.d = v;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((jmq)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new jmq(this.b, this.c, this.d, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        switch(v) {
            case 0: {
                if(!this.b) {
                    this.a = 1;
                    object0 = this.c.b.d(0L, this.d, this);
                    if(object0 == object1) {
                        return object1;
                    }
                    break;
                }
                this.a = 2;
                object0 = this.c.b.d(this.d, 0L, this);
                if(object0 == object1) {
                    return object1;
                }
            label_14:
                jls jls0 = (jls)object0;
                return ibom.a;
            }
            case 1: {
                break;
            }
            default: {
                goto label_14;
            }
        }
        jls jls1 = (jls)object0;
        return ibom.a;
    }
}

