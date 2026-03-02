final class rth extends ibsl implements ibtw {
    int a;
    final rtm b;
    final rrh c;
    final Object d;

    public rth(rtm rtm0, rrh rrh0, Object object0, ibrl ibrl0) {
        this.b = rtm0;
        this.c = rrh0;
        this.d = object0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((rth)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new rth(this.b, this.c, this.d, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        switch(v) {
            case 0: {
                this.a = 1;
                object0 = rtm.f(this.b, this.c, this.d, this);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                break;
            }
            default: {
                return object0;
            }
        }
        this.a = 2;
        Object object2 = rtm.j(this.b, ((ryh)object0), this);
        return object2 == object1 ? object1 : object2;
    }
}

