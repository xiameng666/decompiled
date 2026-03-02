import android.app.PendingIntent;
import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Binder;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
import com.google.android.gms.identitycredentials.PendingGetCredentialHandle;

public final class byfa extends cjtm {
    private final bxyi a;
    private final bxyn b;
    private final GetCredentialRequest c;
    private final String d;
    private final boolean e;

    public byfa(bxyi bxyi0, bxyn bxyn0, GetCredentialRequest getCredentialRequest0, azug azug0, String s, boolean z) {
        ibuq.f(bxyn0, "callbacks");
        ibuq.f(getCredentialRequest0, "request");
        super(0x160, "GetCredential", azug0);
        this.a = bxyi0;
        this.b = bxyn0;
        this.c = getCredentialRequest0;
        this.d = s;
        this.e = z;
    }

    @Override  // cjtm
    protected final void f(Context context0) {
        PendingIntent pendingIntent0;
        ibuq.f(context0, "context");
        GetCredentialRequest getCredentialRequest0 = this.c;
        Status status0 = Status.b;
        ibuq.f(getCredentialRequest0, "request");
        bxyi bxyi0 = this.a;
        try {
            Binder binder0 = new Binder();
            gged_interceptors gged0 = bbms.e(bxyi0.e, bxyi0.b);
            pendingIntent0 = bxvu.a(new bxvs(binder0, bxyi0.b, getCredentialRequest0, gged0), getCredentialRequest0.d, this.d, this.e);
        }
        catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
            ((ggtj)bxyj.a.j()).B("IDCredServiceImpl", "Unexpected: calling package " + bxyi0.b + " not found.\n" + packageManager$NameNotFoundException0);
            bxzl.e(bxyi0.d, bxyi0.c, bxzn.d, getCredentialRequest0);
            throw new cjuh(10, "Invalid package certificates", null, packageManager$NameNotFoundException0);
        }
        bxzl.e(bxyi0.d, bxyi0.c, bxzn.b, getCredentialRequest0);
        ibuq.c(pendingIntent0);
        PendingGetCredentialHandle pendingGetCredentialHandle0 = new PendingGetCredentialHandle(pendingIntent0);
        ApiMetadata apiMetadata0 = cckf.d(bbdp.cm);
        this.b.g(status0, pendingGetCredentialHandle0, apiMetadata0);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        ibuq.f(status0, "status");
        this.b.g(status0, null, ApiMetadata.b);
    }
}

