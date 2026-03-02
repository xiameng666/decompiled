import com.google.android.gms.significantplaces.service.StalePlacesCleaningService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class epif extends ibsl implements ibtw {
    Object a;
    int b;
    int c;
    final StalePlacesCleaningService d;

    public epif(StalePlacesCleaningService stalePlacesCleaningService0, ibrl ibrl0) {
        this.d = stalePlacesCleaningService0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((epif)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new epif(this.d, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        int v2;
        Object object2;
        Object object1 = ibrx.a;
        switch(this.c) {
            case 0: {
                ibnx.b(object0);
                this.c = 1;
                object0 = eppm.a.a(this.d, false, this);
                if(object0 != object1) {
                    goto label_12;
                }
                break;
            }
            case 1: {
                ibnx.b(object0);
            label_12:
                object2 = (List)object0;
                if(((Collection)object2).isEmpty()) {
                    return ibom.a;
                }
                this.a = object2;
                this.c = 2;
                object0 = epnr.a.b(this);
                if(object0 != object1) {
                    goto label_21;
                }
                break;
            }
            case 2: {
                object2 = this.a;
                ibnx.b(object0);
            label_21:
                int v1 = ((Number)object0).intValue();
                ((ggtj)epig.a.h()).z("Previous removedPlaces: %d", v1);
                v2 = v1 + ((List)object2).size();
                ArrayList arrayList0 = new ArrayList(ibpo.q(((Iterable)object2), 10));
                for(Object object3: ((Iterable)object2)) {
                    arrayList0.add(((epng)object3).c);
                }
                epie epie0 = new epie(ibpo.ay(arrayList0));
                this.a = null;
                this.b = v2;
                this.c = 3;
                if(epom.a.e(epie0, this) != object1) {
                    goto label_39;
                }
                break;
            }
            case 3: {
                int v3 = this.b;
                ibnx.b(object0);
                v2 = v3;
            label_39:
                this.b = v2;
                this.c = 4;
                if(epnr.a.c(v2, this) != object1) {
                    ((ggtj)epig.a.h()).z("New removedPlaces: %d", v2);
                    return ibom.a;
                }
                break;
            }
            default: {
                int v = this.b;
                ibnx.b(object0);
                ((ggtj)epig.a.h()).z("New removedPlaces: %d", v);
                return ibom.a;
            }
        }
        return object1;
    }
}

