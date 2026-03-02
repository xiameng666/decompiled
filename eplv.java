import com.google.android.gms.significantplaces.settings.TrustedPlacesListChimeraActivity;
import java.util.ArrayList;
import java.util.List;

public final class eplv extends ibsl implements ibtw {
    Object a;
    int b;
    int c;
    final TrustedPlacesListChimeraActivity d;

    public eplv(TrustedPlacesListChimeraActivity trustedPlacesListChimeraActivity0, ibrl ibrl0) {
        this.d = trustedPlacesListChimeraActivity0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((eplv)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new eplv(this.d, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        int v1;
        Object object5;
        Object object3;
        Object object1 = ibrx.a;
        switch(this.c) {
            case 0: {
                ibnx.b(object0);
                this.c = 1;
                object0 = eppm.a.a(this.d, true, this);
                if(object0 != object1) {
                    goto label_10;
                }
                break;
            }
            case 1: {
                ibnx.b(object0);
            label_10:
                if(((List)object0).isEmpty()) {
                    return ibom.a;
                }
                this.a = (List)object0;
                this.c = 2;
                Object object2 = epnr.a.b(this);
                if(object2 != object1) {
                    object3 = (List)object0;
                    object0 = object2;
                    goto label_20;
                }
                break;
            }
            case 2: {
                object3 = this.a;
                ibnx.b(object0);
            label_20:
                int v = ((Number)object0).intValue();
                ArrayList arrayList0 = new ArrayList(ibpo.q(((Iterable)object3), 10));
                for(Object object4: ((Iterable)object3)) {
                    arrayList0.add(((epng)object4).c);
                }
                eplu eplu0 = new eplu(ibpo.ay(arrayList0));
                this.a = object3;
                this.b = v;
                this.c = 3;
                if(epom.a.e(eplu0, this) != object1) {
                    object5 = object3;
                    v1 = v;
                    goto label_38;
                }
                break;
            }
            case 3: {
                v1 = this.b;
                object5 = this.a;
                ibnx.b(object0);
            label_38:
                this.a = null;
                this.c = 4;
                if(epnr.a.c(v1 + ((List)object5).size(), this) != object1) {
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

