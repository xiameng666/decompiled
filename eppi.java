import com.google.android.gms.location.places.personalized.AliasedPlace;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

final class eppi extends ibsl implements ibtw {
    int a;
    final ibts b;
    final String c;

    public eppi(ibts ibts0, String s, ibrl ibrl0) {
        this.b = ibts0;
        this.c = s;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((eppi)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new eppi(this.b, this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            ibuq.c(this.c);
            evql evql0 = ((cnmr)this.b.a(this.c)).f();
            this.a = 1;
            object0 = ictn.b(evql0, this);
            if(object0 == object1) {
                return object1;
            }
        }
        List list0 = ((azui)object0).e();
        ibuq.e(list0, "getAliasedPlaces(...)");
        Object object2 = new ArrayList(ibpo.q(list0, 10));
        for(Object object3: list0) {
            ((Collection)object2).add(((AliasedPlace)object3).a);
        }
        return object2;
    }
}

