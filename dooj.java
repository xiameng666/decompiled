import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.pay.GetSeFeatureReadinessStatusRequest;

public final class dooj implements azys {
    public final GetSeFeatureReadinessStatusRequest a;
    public final azts b;

    public dooj(azts azts0, GetSeFeatureReadinessStatusRequest getSeFeatureReadinessStatusRequest0) {
        this.b = azts0;
        this.a = getSeFeatureReadinessStatusRequest0;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        dota dota0 = (dota)object0;
        donm donm0 = (donm)dota0.H();
        dosh dosh0 = new dosh(this.b, ((evqp)object1));
        ApiMetadata apiMetadata0 = cclr.a(dota0.r);
        donm0.O(this.a, dosh0, apiMetadata0);
    }
}

