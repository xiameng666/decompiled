import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class cszt extends ibsl implements ibtw {
    int a;
    Object b;
    Object c;
    int d;
    final List e;
    final cszw f;

    public cszt(List list0, cszw cszw0, ibrl ibrl0) {
        this.e = list0;
        this.f = cszw0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((cszt)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new cszt(this.e, this.f, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        switch(this.d) {
            case 0: {
                ibnx.b(object0);
                Object object2 = this.e.iterator();
                int v = 0;
                break;
            }
            case 1: {
                v = this.a;
                Object object3 = this.c;
                Object object4 = this.b;
                ibnx.b(object0);
                goto label_27;
            }
            case 2: {
                v = this.a;
                object2 = this.b;
                ibnx.b(object0);
                break;
            }
            default: {
                ibnx.b(object0);
                return ibom.a;
            }
        }
        while(((Iterator)object2).hasNext()) {
            Object object5 = ((Iterator)object2).next();
            v = v != 0 || ((cszs)object5).b ? 1 : 0;
            boolean z = ((cszs)object5).b;
            this.b = object2;
            this.c = (cszs)object5;
            this.a = v;
            this.d = 1;
            if(this.f.a.b(((cszs)object5).a, z, this) == object1) {
                return object1;
            }
            object4 = object2;
            object3 = (cszs)object5;
        label_27:
            if(((cszs)object3).b) {
                cszw cszw0 = this.f;
                for(Object object6: ((Iterable)cszw0.b.e().b())) {
                    if(!ibuq.m(((cssq)object6).a, ((cszs)object3).a)) {
                        continue;
                    }
                    goto label_35;
                }
                object6 = null;
            label_35:
                if(((cssq)object6) != null) {
                    Set set0 = ((cszs)object3).c;
                    if(!set0.isEmpty()) {
                        List list0 = ibpo.ar(set0);
                        this.b = object4;
                        this.c = null;
                        this.a = v;
                        this.d = 2;
                        if(cszw0.a(((cssq)object6), list0, this) != object1) {
                            goto label_44;
                        }
                        return object1;
                    }
                }
            }
        label_44:
            object2 = object4;
        }
        if(v != 0) {
            this.b = null;
            this.c = null;
            this.d = 3;
            if(this.f.a.d(true, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

