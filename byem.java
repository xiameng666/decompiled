import com.google.android.gms.common.api.Status;
import com.google.android.gms.identitycredentials.ClearExportRequest;
import com.google.android.gms.identitycredentials.ClearExportResponse;

final class byem extends ibsl implements ibtw {
    Object a;
    Object b;
    int c;
    final bxyn d;
    final bxyi e;
    final ClearExportRequest f;

    public byem(bxyn bxyn0, bxyi bxyi0, ClearExportRequest clearExportRequest0, ibrl ibrl0) {
        this.d = bxyn0;
        this.e = bxyi0;
        this.f = clearExportRequest0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((byem)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new byem(this.d, this.e, this.f, ibrl0);
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
            ((bxyn)object3).c(((Status)object2), ((ClearExportResponse)object0), cckf.d(bbdp.cm));
            return Status.b;
        }
        ibnx.b(object0);
        bxyn bxyn0 = this.d;
        Status status0 = Status.b;
        this.a = bxyn0;
        this.b = status0;
        this.c = 1;
        Object object4 = this.e.b(this.f, this);
        if(object4 != object1) {
            object0 = object4;
            object3 = bxyn0;
            object2 = status0;
            ((bxyn)object3).c(((Status)object2), ((ClearExportResponse)object0), cckf.d(bbdp.cm));
            return Status.b;
        }
        return object1;
    }
}

