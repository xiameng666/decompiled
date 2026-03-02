import com.google.android.gms.significantplaces.storage.SignificantPlacesStateFlow;

public final class epnw extends ibsl implements ibtw {
    Object a;
    int b;
    final SignificantPlacesStateFlow c;

    public epnw(SignificantPlacesStateFlow significantPlacesStateFlow0, ibrl ibrl0) {
        this.c = significantPlacesStateFlow0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((epnw)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new epnw(this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object2;
        Object object1 = ibrx.a;
        switch(this.b) {
            case 0: {
                ibnx.b(object0);
                object2 = this.c.b;
                this.a = object2;
                this.b = 1;
                object0 = epom.a.c(this);
                if(object0 != object1) {
                    goto label_13;
                }
                break;
            }
            case 1: {
                object2 = this.a;
                ibnx.b(object0);
            label_13:
                this.a = null;
                this.b = 2;
                if(((icnl)object2).a(object0, this) != object1) {
                    return ibom.a;
                }
                break;
            }
            default: {
                ibnx.b(object0);
                return ibom.a;
            }
        }
        return object1;
    }
}

