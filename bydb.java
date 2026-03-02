import android.content.Context;
import com.google.android.gms.identitycredentials.CallingAppInfoParcelable;
import com.google.android.gms.identitycredentials.ExportCredentialsToDeviceSetupRequest;
import com.google.android.gms.identitycredentials.ExportCredentialsToDeviceSetupResponse;

public final class bydb implements gmbg {
    final Context a;
    final CallingAppInfoParcelable b;
    final ExportCredentialsToDeviceSetupRequest c;
    final gmcu d;

    public bydb(Context context0, CallingAppInfoParcelable callingAppInfoParcelable0, ExportCredentialsToDeviceSetupRequest exportCredentialsToDeviceSetupRequest0, gmcu gmcu0) {
        this.a = context0;
        this.b = callingAppInfoParcelable0;
        this.c = exportCredentialsToDeviceSetupRequest0;
        this.d = gmcu0;
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
        ibuq.f(throwable0, "t");
        this.a.revokeUriPermission(this.b.a, this.c.a, 2);
        this.d.r(new cjuh(8, throwable0.getMessage()));
    }

    @Override  // gmbg
    public final void b(Object object0) {
        ExportCredentialsToDeviceSetupResponse exportCredentialsToDeviceSetupResponse0 = (ExportCredentialsToDeviceSetupResponse)object0;
        ibuq.f(exportCredentialsToDeviceSetupResponse0, "result");
        try {
            this.a.revokeUriPermission(this.b.a, this.c.a, 2);
            exportCredentialsToDeviceSetupResponse0.a.putParcelable("PROVIDER_APP_INFO", this.b);
            this.d.q(exportCredentialsToDeviceSetupResponse0);
        }
        catch(ClassCastException classCastException0) {
            cjuh cjuh0 = new cjuh(8, "Unable to handle request", null, classCastException0);
            this.d.r(cjuh0);
        }
    }
}

