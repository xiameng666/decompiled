import java.util.Iterator;
import java.util.List;

final class lam extends ibsl implements ibtw {
    Object a;
    Object b;
    Object c;
    int d;
    Object e;
    final List f;
    final List g;

    public lam(List list0, List list1, ibrl ibrl0) {
        this.f = list0;
        this.g = list1;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((lam)this.c(object0, ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new lam(this.f, this.g, ibrl0);
        ibrl1.e = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        List list0;
        Object object2;
        Object object6;
        Object object5;
        Object object3;
        Object object1 = ibrx.a;
        switch(this.d) {
            case 0: {
                ibnx.b(object0);
                object0 = this.e;
                list0 = this.g;
                object2 = ibpr.a;
                goto label_30;
            }
            case 1: {
                object3 = this.c;
                Object object4 = this.b;
                object5 = this.a;
                List list1 = (List)this.e;
                ibnx.b(object0);
                object6 = object4;
                list0 = list1;
                break;
            }
            default: {
                object2 = this.a;
                list0 = (List)this.e;
                ibnx.b(object0);
                goto label_30;
            }
        }
        while(true) {
            if(((Boolean)object0).booleanValue()) {
                list0.add(new lal(((lai)object6), null));
                this.e = list0;
                this.a = object5;
                this.b = null;
                this.c = null;
                this.d = 2;
                object0 = ((lai)object6).b();
                if(object0 == object1) {
                    return object1;
                }
            }
            else {
                object0 = object3;
            }
            object2 = object5;
        label_30:
            if(!((Iterator)object2).hasNext()) {
                break;
            }
            Object object7 = ((Iterator)object2).next();
            this.e = list0;
            this.a = object2;
            this.b = (lai)object7;
            this.c = object0;
            this.d = 1;
            Object object8 = ((lai)object7).c();
            if(object8 != object1) {
                object3 = object0;
                object0 = object8;
                object6 = (lai)object7;
                object5 = object2;
                continue;
            }
            return object1;
        }
        return object0;
    }
}

