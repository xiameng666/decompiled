import android.net.Uri;
import java.util.ArrayList;
import java.util.List;

final class dgob extends ibsl implements ibtw {
    Object a;
    final dgop b;

    public dgob(dgop dgop0, ibrl ibrl0) {
        this.b = dgop0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dgob)this.c(((dgnb)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new dgob(this.b, ibrl0);
        ibrl1.a = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibnx.b(object0);
        dgnb dgnb0 = (dgnb)this.a;
        if((dgnb0 instanceof dgmx)) {
            dgfc dgfc0 = ((dgmx)dgnb0).a;
            dgop dgop0 = this.b;
            dgyp dgyp0 = dgym.a();
            ArrayList arrayList0 = new ArrayList(ibpo.q(dgfc0.c, 10));
            for(Object object1: dgfc0.c) {
                arrayList0.add(((dgfl)object1).c(Uri.EMPTY));
            }
            ArrayList arrayList1 = new ArrayList(ibpo.q(dgfc0.d, 10));
            for(Object object2: dgfc0.d) {
                arrayList1.add(((dggj)object2).c(""));
            }
            List list0 = ibpo.ak(arrayList0, arrayList1);
            ArrayList arrayList2 = new ArrayList(ibpo.q(dgfc0.e, 10));
            for(Object object3: dgfc0.e) {
                arrayList2.add(((dggo)object3).c(null, false));
            }
            List list1 = ibpo.ak(list0, arrayList2);
            ArrayList arrayList3 = new ArrayList(ibpo.q(dgfc0.f, 10));
            for(Object object4: dgfc0.f) {
                arrayList3.add(((dgen)object4).c(dbvh.a(null, null, null, 0, 0, 0)));
            }
            List list2 = ibpo.ak(list1, arrayList3);
            dgyp0.a(new dgyb(dgop0.i.a, list2));
        }
        return ibom.a;
    }
}

