import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.ComplianceOptions;
import com.google.android.gms.pay.GetIntegrityTokenForPixRequest;

public final class dooz implements azys {
    public final GetIntegrityTokenForPixRequest a;
    public final azts b;

    public dooz(azts azts0, GetIntegrityTokenForPixRequest getIntegrityTokenForPixRequest0) {
        this.b = azts0;
        this.a = getIntegrityTokenForPixRequest0;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        donm donm0 = (donm)((dota)object0).H();
        dosl dosl0 = new dosl(this.b, ((evqp)object1));
        ApiMetadata apiMetadata0 = ApiMetadata.a(new ComplianceOptions(-1, -1, 0, true));
        donm0.B(this.a, dosl0, apiMetadata0);
    }
}

