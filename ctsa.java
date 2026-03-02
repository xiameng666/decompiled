import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

final class ctsa extends ibsl implements ibtw {
    Object a;
    int b;
    final ctsg c;
    private Object d;

    public ctsa(ctsg ctsg0, ibrl ibrl0) {
        this.c = ctsg0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((ctsa)this.c(((icih)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new ctsa(this.c, ibrl0);
        ibrl1.d = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        icih icih0;
        Object object2;
        Object object1 = ibrx.a;
        if(this.b == 0) {
            ibnx.b(object0);
            icih0 = (icih)this.d;
            ArrayList arrayList0 = new ArrayList();
            ctsg ctsg0 = this.c;
            synchronized(ctsg0) {
                Collection collection0 = ctsg0.e.values();
                ArrayList arrayList1 = new ArrayList(ibpo.q(collection0, 10));
                for(Object object3: collection0) {
                    arrayList1.add(new ctoy(((ctoq)object3)));
                }
                arrayList0.addAll(arrayList1);
            }
            object2 = arrayList0.iterator();
        }
        else {
            object2 = this.a;
            icih0 = (icih)this.d;
            ibnx.b(object0);
        }
        while(((Iterator)object2).hasNext()) {
            Object object4 = ((Iterator)object2).next();
            this.d = icih0;
            this.a = object2;
            this.b = 1;
            if(icih0.a(((ctpc)object4), this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

