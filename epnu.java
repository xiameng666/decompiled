import com.google.android.gms.significantplaces.storage.SignificantPlacesStateFlow;

final class epnu extends ibsl implements ibtw {
    int a;
    final SignificantPlacesStateFlow b;

    public epnu(SignificantPlacesStateFlow significantPlacesStateFlow0, ibrl ibrl0) {
        this.b = significantPlacesStateFlow0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((epnu)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new epnu(this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            this.a = 1;
            if(this.b.b.a(ibps.a, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

