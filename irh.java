import android.view.View;

final class irh extends ibsl implements ibtw {
    int a;
    final gsu b;
    final View c;

    public irh(gsu gsu0, View view0, ibrl ibrl0) {
        this.b = gsu0;
        this.c = view0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((irh)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new irh(this.b, this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        if(this.a == 0) {
            ibnx.b(object0);
            try {
                this.a = 1;
                gso gso0 = new gso(null);
                Object object2 = icll.b(this.b.o, gso0, this);
                if(object2 != object1) {
                    object2 = ibom.a;
                }
            }
            catch(Throwable throwable0) {
            label_12:
                View view0 = this.c;
                if(irq.a(view0) == this.b) {
                    irq.b(view0, null);
                }
                throw throwable0;
            }
            if(object2 == object1) {
                return object1;
            }
        }
        else {
            try {
                ibnx.b(object0);
            }
            catch(Throwable throwable0) {
                goto label_12;
            }
        }
        View view1 = this.c;
        if(irq.a(view1) == this.b) {
            irq.b(view1, null);
        }
        return ibom.a;
    }
}

