import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.identitycredentials.ExportCredentialsToDeviceSetupResponse;

public final class byey implements gmbg {
    final byez a;

    public byey(byez byez0) {
        this.a = byez0;
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
        ibuq.f(throwable0, "t");
        this.a.a.f(new Status(8, throwable0.getMessage()), null, ApiMetadata.b);
    }

    @Override  // gmbg
    public final void b(Object object0) {
        ExportCredentialsToDeviceSetupResponse exportCredentialsToDeviceSetupResponse0 = (ExportCredentialsToDeviceSetupResponse)object0;
        ibuq.f(exportCredentialsToDeviceSetupResponse0, "result");
        ApiMetadata apiMetadata0 = cckf.d(bbdp.cm);
        this.a.a.f(Status.b, exportCredentialsToDeviceSetupResponse0, apiMetadata0);
    }
}

