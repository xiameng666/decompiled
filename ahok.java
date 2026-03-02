import com.google.android.gms.auth.api.fido.GetGooglePasskeyForExportRequest;
import com.google.android.gms.common.api.ApiMetadata;

public final class ahok implements azys {
    public final ahow a;
    public final GetGooglePasskeyForExportRequest b;

    public ahok(ahow ahow0, GetGooglePasskeyForExportRequest getGooglePasskeyForExportRequest0) {
        this.a = ahow0;
        this.b = getGooglePasskeyForExportRequest0;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        ahnf ahnf0 = (ahnf)object0;
        ahnp ahnp0 = new ahnp(this.a, ((evqp)object1));
        ahnk ahnk0 = (ahnk)ahnf0.H();
        ApiMetadata apiMetadata0 = cclr.a(ahnf0.r);
        ahnk0.d(ahnp0, this.b, apiMetadata0);
    }
}

