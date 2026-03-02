import android.content.Context;
import com.google.android.gms.identitycredentials.CallingAppInfoParcelable;
import com.google.android.gms.identitycredentials.ImportCredentialsForDeviceSetupRequest;
import com.google.android.gms.identitycredentials.ImportCredentialsForDeviceSetupResponse;

public final class bydd implements gmbg {
    final Context a;
    final CallingAppInfoParcelable b;
    final ImportCredentialsForDeviceSetupRequest c;
    final gmcu d;

    public bydd(Context context0, CallingAppInfoParcelable callingAppInfoParcelable0, ImportCredentialsForDeviceSetupRequest importCredentialsForDeviceSetupRequest0, gmcu gmcu0) {
        this.a = context0;
        this.b = callingAppInfoParcelable0;
        this.c = importCredentialsForDeviceSetupRequest0;
        this.d = gmcu0;
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
        ibuq.f(throwable0, "t");
        this.a.revokeUriPermission(this.b.a, this.c.b, 2);
        this.d.r(new cjuh(8, throwable0.getMessage()));
    }

    @Override  // gmbg
    public final void b(Object object0) {
        ImportCredentialsForDeviceSetupResponse importCredentialsForDeviceSetupResponse0 = (ImportCredentialsForDeviceSetupResponse)object0;
        ibuq.f(importCredentialsForDeviceSetupResponse0, "result");
        try {
            this.a.revokeUriPermission(this.b.a, this.c.b, 2);
            importCredentialsForDeviceSetupResponse0.a.putParcelable("PROVIDER_APP_INFO", this.b);
            this.d.q(importCredentialsForDeviceSetupResponse0);
        }
        catch(ClassCastException classCastException0) {
            cjuh cjuh0 = new cjuh(8, "Unable to handle request", null, classCastException0);
            this.d.r(cjuh0);
        }
    }
}

