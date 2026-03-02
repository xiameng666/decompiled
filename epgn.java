import com.google.android.gms.common.api.Status;

public final class epgn extends ibsl implements ibtw {
    Object a;
    Object b;
    int c;
    final epgw d;
    final ephb e;

    public epgn(epgw epgw0, ephb ephb0, ibrl ibrl0) {
        this.d = epgw0;
        this.e = ephb0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((epgn)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new epgn(this.d, this.e, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object3;
        Object object2;
        Object object1 = ibrx.a;
        if(this.c != 0) {
            object2 = this.b;
            object3 = this.a;
            ibnx.b(object0);
            ((epgw)object3).a(((Status)object2), ((Number)object0).intValue());
            return Status.b;
        }
        ibnx.b(object0);
        epgw epgw0 = this.d;
        Status status0 = Status.b;
        this.a = epgw0;
        this.b = status0;
        this.c = 1;
        Object object4 = this.e.a.c(this);
        if(object4 != object1) {
            object0 = object4;
            object3 = epgw0;
            object2 = status0;
            ((epgw)object3).a(((Status)object2), ((Number)object0).intValue());
            return Status.b;
        }
        return object1;
    }
}

