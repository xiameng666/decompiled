import com.google.android.gms.trustagent.activeunlock.common.data.communication.ConnectionInfo;

public final class eygp extends ibsl implements ibtw {
    Object a;
    int b;
    final eygq c;
    final exjx d;
    final ConnectionInfo e;

    public eygp(eygq eygq0, exjx exjx0, ConnectionInfo connectionInfo0, ibrl ibrl0) {
        this.c = eygq0;
        this.d = exjx0;
        this.e = connectionInfo0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((eygp)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new eygp(this.c, this.d, this.e, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object2;
        Object object1 = ibrx.a;
        if(this.b != 0) {
            object2 = this.a;
            ibnx.b(object0);
            this.c.e.remove(object2);
            return ibom.a;
        }
        ibnx.b(object0);
        expv expv0 = this.c.f.a(this.c.d, null);
        eygn eygn0 = new eygn(expv0, this.d, this.e);
        this.c.e.add(eygn0);
        this.a = eygn0;
        this.b = 1;
        if(expv0.a(this) != object1) {
            object2 = eygn0;
            this.c.e.remove(object2);
            return ibom.a;
        }
        return object1;
    }
}

