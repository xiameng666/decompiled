import com.google.android.gms.trustagent.activeunlock.common.data.communication.ConnectionInfo;
import j..time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class eyga extends ibsl implements ibtw {
    Object a;
    int b;
    final eygb c;
    final eyfz d;
    final ConnectionInfo e;

    public eyga(eygb eygb0, eyfz eyfz0, ConnectionInfo connectionInfo0, ibrl ibrl0) {
        this.c = eygb0;
        this.d = eyfz0;
        this.e = connectionInfo0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((eyga)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new eyga(this.c, this.d, this.e, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object2;
        Object object1 = ibrx.a;
        if(this.b != 0) {
            object2 = this.a;
            ibnx.b(object0);
            goto label_13;
        }
        ibnx.b(object0);
        eygb eygb0 = this.c;
        this.a = eygb0;
        this.b = 1;
        Object object3 = this.d.b.F(this);
        if(object3 != object1) {
            object2 = eygb0;
            object0 = object3;
        label_13:
            ConnectionInfo connectionInfo0 = this.e;
            Map map0 = ((eygb)object2).d;
            List list0 = (List)map0.get(connectionInfo0);
            if(list0 == null) {
                list0 = new ArrayList();
                map0.put(connectionInfo0, list0);
            }
            if(((Duration)object0) != null) {
                list0.add(((Duration)object0));
            }
            if(list0.size() >= 10) {
                gged_interceptors gged0 = ggdx.a(list0);
                ((eygb)object2).a.f(gzyo.b, gged0, connectionInfo0);
                list0.clear();
            }
            return ibom.a;
        }
        return object1;
    }
}

