import java.util.List;

final class dmbn extends ibsl implements ibtw {
    int a;
    final dmbo b;

    public dmbn(dmbo dmbo0, ibrl ibrl0) {
        this.b = dmbo0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dmbn)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new dmbn(this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object2;
        Object object1 = ibrx.a;
        int v = this.a;
        boolean z = true;
        ibnx.b(object0);
        if(v == 0) {
            evql evql0 = this.b.a.d(dyfc.b);
            this.a = 1;
            object2 = fsdk.a(evql0, this);
            if(object2 == object1) {
                return object1;
            }
        }
        else {
            object2 = ((ibnw)object0).a;
        }
        if((object2 instanceof ibnv)) {
            object2 = null;
        }
        boolean z1 = ((List)object2) == null ? false : ((List)object2).isEmpty();
        if(hwnm.a.f().P()) {
            return !z1 || ((dyiu)this.b.b.a().get()).b ? Boolean.valueOf(false) : Boolean.valueOf(true);
        }
        if(!z1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}

