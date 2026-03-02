import java.util.Collection;

final class dmbk extends ibsl implements ibtw {
    int a;
    final dmbl b;

    public dmbk(dmbl dmbl0, ibrl ibrl0) {
        this.b = dmbl0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dmbk)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new dmbk(this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object2;
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        switch(v) {
            case 0: {
                evql evql0 = this.b.a.d(dyfc.b);
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
                goto label_19;
            }
        }
        ibps ibps0 = ibps.a;
        if((object2 instanceof ibnv)) {
            object2 = ibps0;
        }
        if(!((Collection)object2).isEmpty()) {
            ibuq.e(this.b.b, "access$getOctopusAppStatusDataStore$p(...)");
            this.a = 2;
            object0 = ftqa.a(this.b.b, this);
            if(object0 != object1) {
            label_19:
                dyil dyil0 = dyil.b(((dyim)object0).c);
                if(dyil0 == null) {
                    dyil0 = dyil.i;
                }
                return dyil0 == dyil.e ? Boolean.valueOf(true) : Boolean.valueOf(false);
            }
            return object1;
        }
        return Boolean.valueOf(false);
    }
}

