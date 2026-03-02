import java.util.ArrayList;

final class tzv extends ibsl implements ibtw {
    int a;
    final tzw b;
    private Object c;

    public tzv(tzw tzw0, ibrl ibrl0) {
        this.b = tzw0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((tzv)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new tzv(this.b, ibrl0);
        ibrl1.c = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        icck icck0;
        Object object1 = ibrx.a;
        if(this.a != 0) {
            icck0 = (icck)this.c;
            ibnx.b(object0);
            goto label_13;
        }
        ibnx.b(object0);
        icck icck1 = (icck)this.c;
        this.c = icck1;
        this.a = 1;
        Object object2 = ((tzu)this.b.a).a.a(this);
        if(object2 != object1) {
            icck0 = icck1;
            object0 = object2;
        label_13:
            uae uae0 = (uae)object0;
            ibvd ibvd0 = new ibvd();
            synchronized(icck0) {
                this.b.b = uae0;
                ibvd0.a = new ArrayList(this.b.c);
                this.b.c.clear();
            }
            for(Object object3: ((Iterable)ibvd0.a)) {
                ((upm)object3).e(uae0.a, uae0.b);
            }
            return ibom.a;
        }
        return object1;
    }
}

