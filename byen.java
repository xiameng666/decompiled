import com.google.android.gms.common.api.Status;
import com.google.android.gms.identitycredentials.ClearRegistryRequest;
import com.google.android.gms.identitycredentials.ClearRegistryResponse;

final class byen extends ibsl implements ibtw {
    Object a;
    Object b;
    int c;
    final bxyn d;
    final bxyi e;
    final ClearRegistryRequest f;

    public byen(bxyn bxyn0, bxyi bxyi0, ClearRegistryRequest clearRegistryRequest0, ibrl ibrl0) {
        this.d = bxyn0;
        this.e = bxyi0;
        this.f = clearRegistryRequest0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((byen)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new byen(this.d, this.e, this.f, ibrl0);
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
            ((bxyn)object3).d(((Status)object2), ((ClearRegistryResponse)object0), cckf.d(bbdp.cm));
            return Status.b;
        }
        ibnx.b(object0);
        bxyn bxyn0 = this.d;
        Status status0 = Status.b;
        this.a = bxyn0;
        this.b = status0;
        this.c = 1;
        Object object4 = this.e.c(this.f, bxxf.a, this);
        if(object4 != object1) {
            object0 = object4;
            object3 = bxyn0;
            object2 = status0;
            ((bxyn)object3).d(((Status)object2), ((ClearRegistryResponse)object0), cckf.d(bbdp.cm));
            return Status.b;
        }
        return object1;
    }
}

