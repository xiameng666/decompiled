import com.google.android.gms.location.internal.ParcelableGeofence;
import java.util.List;

public final class epot extends ibsl implements ibtw {
    final eppe a;
    final cmnj b;
    private Object c;

    public epot(eppe eppe0, cmnj cmnj0, ibrl ibrl0) {
        this.a = eppe0;
        this.b = cmnj0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((epot)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new epot(this.a, this.b, ibrl0);
        ibrl1.c = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibnx.b(object0);
        icck icck0 = (icck)this.c;
        cmnj cmnj0 = this.b;
        eppe eppe0 = this.a;
        synchronized(eppe0.a) {
            List list0 = cmnj0.c;
            if(list0 == null) {
                list0 = ibps.a;
            }
            for(Object object2: list0) {
                epoq epoq0 = (epoq)eppe0.f.get(((ParcelableGeofence)object2).a);
                if(epoq0 != null) {
                    epoq0.b = cmnj0.b;
                }
            }
            iccl.f(icck0);
            eppe0.F();
        }
        return ibom.a;
    }
}

