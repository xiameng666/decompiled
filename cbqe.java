import android.app.Application;
import java.util.List;

final class cbqe extends ibsl implements ibtw {
    final cbqh a;

    public cbqe(cbqh cbqh0, ibrl ibrl0) {
        this.a = cbqh0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((cbqe)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new cbqe(this.a, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibnx.b(object0);
        cbqh cbqh0 = this.a;
        Application application0 = cbqh0.a();
        cbaz cbaz0 = cbaz.a();
        List list0 = cbaz0.c(application0);
        List list1 = cbaz0.b(application0, "com.google.android.gms");
        ibuq.c(list0);
        Object object1 = ibpo.ah(list1, list0);
        if((((List)object1).isEmpty() & (list0.isEmpty() ^ 1)) != 0) {
            cbqh0.b.ii(cbqb.j);
            return object1;
        }
        if(((List)object1).isEmpty()) {
            cbqh0.b.ii(cbqb.c);
            return object1;
        }
        if(((List)object1).size() > 1) {
            cbqh0.b.ii(cbqb.d);
            return object1;
        }
        cbqh0.b.ii(cbqb.e);
        Object object2 = ibpo.R(((List)object1));
        cbqh0.d.ii(object2);
        return object1;
    }
}

