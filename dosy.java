import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.pay.GetMdocCredentialRequest;

public final class dosy implements azys {
    public final GetMdocCredentialRequest a;
    public final azts b;

    public dosy(azts azts0, GetMdocCredentialRequest getMdocCredentialRequest0) {
        this.b = azts0;
        this.a = getMdocCredentialRequest0;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        dotb dotb0 = (dotb)object0;
        dons dons0 = (dons)dotb0.H();
        dosz dosz0 = new dosz(this.b, ((evqp)object1));
        ApiMetadata apiMetadata0 = cclr.a(dotb0.r);
        dons0.a(this.a, dosz0, apiMetadata0);
    }
}

