import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.identitycredentials.ImportCredentialsForDeviceSetupResponse;

public final class byfe implements gmbg {
    final byff a;

    public byfe(byff byff0) {
        this.a = byff0;
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
        ibuq.f(throwable0, "t");
        this.a.a.k(new Status(8, throwable0.getMessage()), null, ApiMetadata.b);
    }

    @Override  // gmbg
    public final void b(Object object0) {
        ImportCredentialsForDeviceSetupResponse importCredentialsForDeviceSetupResponse0 = (ImportCredentialsForDeviceSetupResponse)object0;
        ibuq.f(importCredentialsForDeviceSetupResponse0, "result");
        ApiMetadata apiMetadata0 = cckf.d(bbdp.cm);
        this.a.a.k(Status.b, importCredentialsForDeviceSetupResponse0, apiMetadata0);
    }
}

