import com.google.android.gms.significantplaces.SignificantPlacesRequest;

public final class ephj extends ibsl implements ibtw {
    Object a;
    int b;
    final SignificantPlacesRequest c;
    final azts d;
    private Object e;

    public ephj(azts azts0, SignificantPlacesRequest significantPlacesRequest0, ibrl ibrl0) {
        this.d = azts0;
        this.c = significantPlacesRequest0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((ephj)this.c(((ichm)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new ephj(this.d, this.c, ibrl0);
        ibrl1.e = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ichm ichm1;
        Object object2;
        Object object1 = ibrx.a;
        switch(this.b) {
            case 0: {
                ibnx.b(object0);
                ichm ichm0 = (ichm)this.e;
                object2 = new ephi(ichm0);
                ibuq.e(gmap.a, "directExecutor(...)");
                evql evql0 = this.d.bS(35303, this.c, ((epga)object2), gmap.a);
                this.e = ichm0;
                this.a = object2;
                this.b = 1;
                if(ictn.b(evql0, this) != object1) {
                    ichm1 = ichm0;
                    goto label_18;
                }
                break;
            }
            case 1: {
                object2 = this.a;
                ichm1 = (ichm)this.e;
                ibnx.b(object0);
            label_18:
                ephg ephg0 = new ephg(this.d, ((ephi)object2));
                this.e = null;
                this.a = null;
                this.b = 2;
                if(ichl.b(ichm1, ephg0, this) != object1) {
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

