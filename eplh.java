import com.google.android.gms.location.places.personalized.AliasedPlace;
import java.util.ArrayList;
import java.util.List;

final class eplh extends ibsl implements ibtw {
    int a;
    final ezmb b;
    final gmcg c;
    final String d;
    final azui e;
    private Object f;

    public eplh(azui azui0, ezmb ezmb0, gmcg gmcg0, String s, ibrl ibrl0) {
        this.e = azui0;
        this.b = ezmb0;
        this.c = gmcg0;
        this.d = s;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((eplh)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new eplh(this.e, this.b, this.c, this.d, ibrl0);
        ibrl1.f = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            icck icck0 = (icck)this.f;
            List list0 = this.e.e();
            ibuq.e(list0, "getAliasedPlaces(...)");
            ezmb ezmb0 = this.b;
            gmcg gmcg0 = this.c;
            String s = this.d;
            ArrayList arrayList0 = new ArrayList(ibpo.q(list0, 10));
            for(Object object2: list0) {
                arrayList0.add(icbb.a(icck0, null, null, new eplg(ezmb0, ((AliasedPlace)object2), gmcg0, s, null), 3));
            }
            this.a = 1;
            object0 = icay.a(arrayList0, this);
            if(object0 == object1) {
                return object1;
            }
        }
        return ibpo.r(((Iterable)object0));
    }
}

