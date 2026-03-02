import android.app.PendingIntent;

final class dlpn extends ibsl implements ibtw {
    int a;
    final dlps b;

    public dlpn(dlps dlps0, ibrl ibrl0) {
        this.b = dlps0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dlpn)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new dlpn(this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object2;
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            evql evql0 = this.b.B().a.h().g(new edth());
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
        if(((PendingIntent)object2) != null) {
            ((PendingIntent)object2).send();
        }
        return ibom.a;
    }
}

