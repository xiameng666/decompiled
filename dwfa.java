final class dwfa extends ibsl implements ibtw {
    int a;
    final dwfb b;

    public dwfa(dwfb dwfb0, ibrl ibrl0) {
        this.b = dwfb0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dwfa)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new dwfa(this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object2;
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        switch(v) {
            case 0: {
                dsik dsik0 = new dsik("ucp_one_time_acknowledgement");
                evql evql0 = edph.a(this.b.f.a(dsik0));
                this.a = 1;
                object2 = fsdk.a(evql0, this);
                if(object2 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                object2 = ((ibnw)object0).a;
                break;
            }
            default: {
                return ibom.a;
            }
        }
        if(ibnw.b(object2)) {
            gfqx gfqx0 = gfqx.a;
            if((object2 instanceof ibnv)) {
                object2 = gfqx0;
            }
            dwfb dwfb0 = this.b;
            if(!hwvf.a.b().j() && dwfb0.o != 3 && ((gfsx)object2).i() && ((donh)((gfsx)object2).d()).c) {
                dwfb0.e();
                dwfb.k(dwfb0);
                return ibom.a;
            }
            this.a = 2;
            if(dwfb0.b(this) == object1) {
                return object1;
            }
        }
        else {
            a.ae(dwfb.a.j(), "Check local user acknowledge failed", ibnw.a(object2));
            this.b.f();
        }
        return ibom.a;
    }
}

