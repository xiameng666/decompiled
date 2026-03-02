import com.google.android.gms.location.places.personalized.AliasedPlace;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.trustlet.place.model.LightPlace;
import java.util.ArrayList;
import java.util.Collection;

final class eplg extends ibsl implements ibtw {
    int a;
    final ezmb b;
    final AliasedPlace c;
    final gmcg d;
    final String e;

    public eplg(ezmb ezmb0, AliasedPlace aliasedPlace0, gmcg gmcg0, String s, ibrl ibrl0) {
        this.b = ezmb0;
        this.c = aliasedPlace0;
        this.d = gmcg0;
        this.e = s;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((eplg)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new eplg(this.b, this.c, this.d, this.e, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            gmcd gmcd0 = this.b.a(this.c.a, this.d, true);
            this.a = 1;
            object0 = icpu.c(gmcd0, this);
            if(object0 == object1) {
                return object1;
            }
        }
        if(((LightPlace)object0) != null) {
            ibuq.e(this.c.b, "getPlaceAliases(...)");
            String s = this.e;
            Object object2 = new ArrayList(ibpo.q(this.c.b, 10));
            for(Object object3: this.c.b) {
                epni epni0 = epnh.a(((ProtoLiteMessage)epng.a).v_newBuilder());
                epni0.g(((LightPlace)object0).c());
                ibuq.c(((String)object3));
                epni0.f(((String)object3));
                epni0.c(((LightPlace)object0).b());
                hjil hjil0 = hjik.a(((ProtoLiteMessage)hjij.a).v_newBuilder());
                LatLng latLng0 = ((LightPlace)object0).a();
                ibuq.c(latLng0);
                hjil0.b(latLng0.a);
                LatLng latLng1 = ((LightPlace)object0).a();
                ibuq.c(latLng1);
                hjil0.c(latLng1.b);
                epni0.e(hjil0.a());
                epni0.h(((float)hydt.b()));
                epni0.b(s);
                ((Collection)object2).add(epni0.a());
            }
            return object2;
        }
        return ibps.a;
    }
}

