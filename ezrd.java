import android.accounts.Account;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

final class ezrd extends ibsl implements ibtw {
    Object a;
    Object b;
    int c;
    final ezrg d;
    final List e;

    public ezrd(ezrg ezrg0, List list0, ibrl ibrl0) {
        this.d = ezrg0;
        this.e = list0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((ezrd)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new ezrd(this.d, this.e, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object3;
        Object object2;
        Object object1 = ibrx.a;
        switch(this.c) {
            case 0: {
                ibnx.b(object0);
                this.c = 1;
                if(this.d.b(this) == object1) {
                    return object1;
                }
                object3 = ibpo.ay(this.e);
                object2 = this.d.a.keySet().iterator();
                break;
            }
            case 1: {
                ibnx.b(object0);
                object3 = ibpo.ay(this.e);
                object2 = this.d.a.keySet().iterator();
                break;
            }
            default: {
                object2 = this.b;
                object3 = this.a;
                ibnx.b(object0);
            }
        }
        while(((Iterator)object2).hasNext()) {
            Object object4 = ((Iterator)object2).next();
            Account account0 = (Account)object4;
            if(!((Set)object3).contains(account0)) {
                ezsr ezsr0 = (ezsr)this.d.a.get(account0);
                ezrc ezrc0 = (ezsr0 instanceof ezrc) ? ((ezrc)ezsr0) : null;
                if(ezrc0 != null) {
                    this.a = object3;
                    this.b = object2;
                    this.c = 2;
                    Object object5 = ezrc0.b.a(ezrc0.a, this);
                    if(object5 != object1) {
                        object5 = ibom.a;
                    }
                    if(object5 == object1) {
                        return object1;
                    }
                }
            }
        }
        return ibom.a;
    }
}

