import com.google.android.gms.common.api.Status;
import com.google.android.gms.significantplaces.SignificantPlaceParceable;

public final class epgm extends ibsl implements ibtw {
    Object a;
    Object b;
    int c;
    final epgt d;
    final SignificantPlaceParceable e;
    final ephb f;

    public epgm(epgt epgt0, ephb ephb0, SignificantPlaceParceable significantPlaceParceable0, ibrl ibrl0) {
        this.d = epgt0;
        this.f = ephb0;
        this.e = significantPlaceParceable0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((epgm)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new epgm(this.d, this.f, this.e, ibrl0);
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
            ((epgt)object3).a(((Status)object2), ((Boolean)object0).booleanValue());
            return Status.b;
        }
        ibnx.b(object0);
        epgt epgt0 = this.d;
        Status status0 = Status.b;
        this.a = epgt0;
        this.b = status0;
        this.c = 1;
        Object object4 = this.f.a.a(this.e, this);
        if(object4 != object1) {
            object0 = object4;
            object3 = epgt0;
            object2 = status0;
            ((epgt)object3).a(((Status)object2), ((Boolean)object0).booleanValue());
            return Status.b;
        }
        return object1;
    }
}

