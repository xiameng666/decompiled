import android.app.PendingIntent;
import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Binder;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.identitycredentials.CreateCredentialHandle;
import com.google.android.gms.identitycredentials.CreateCredentialRequest;

public final class byev extends cjtm {
    private final bxyi a;
    private final bxyn b;
    private final CreateCredentialRequest c;
    private final String d;
    private final boolean e;

    public byev(bxyi bxyi0, bxyn bxyn0, CreateCredentialRequest createCredentialRequest0, String s, boolean z, azug azug0) {
        ibuq.f(bxyn0, "callbacks");
        ibuq.f(createCredentialRequest0, "request");
        super(0x160, "CreateCredential", azug0);
        this.a = bxyi0;
        this.b = bxyn0;
        this.c = createCredentialRequest0;
        this.d = s;
        this.e = z;
    }

    @Override  // cjtm
    protected final void f(Context context0) {
        PendingIntent pendingIntent0;
        ibuq.f(context0, "context");
        CreateCredentialRequest createCredentialRequest0 = this.c;
        Status status0 = Status.b;
        ibuq.f(createCredentialRequest0, "request");
        bxyi bxyi0 = this.a;
        try {
            Binder binder0 = new Binder();
            gged_interceptors gged0 = bbms.e(bxyi0.e, bxyi0.b);
            pendingIntent0 = bxvu.a(new bxvr(binder0, bxyi0.b, createCredentialRequest0, gged0), createCredentialRequest0.f, this.d, this.e);
        }
        catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
            ((ggtj)bxyj.a.j()).B("IDCredServiceImpl", "Unexpected: calling package " + bxyi0.b + " not found." + packageManager$NameNotFoundException0);
            bxzl.j(bxyi0.d, bxyi0.c, bxzh.e, createCredentialRequest0);
            throw new cjuh(10, "Invalid package certificates", null, packageManager$NameNotFoundException0);
        }
        bxzl.j(bxyi0.d, bxyi0.c, bxzh.b, createCredentialRequest0);
        CreateCredentialHandle createCredentialHandle0 = new CreateCredentialHandle(pendingIntent0, null);
        ApiMetadata apiMetadata0 = cckf.d(bbdp.cm);
        this.b.e(status0, createCredentialHandle0, apiMetadata0);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        ibuq.f(status0, "status");
        this.b.e(status0, null, ApiMetadata.b);
    }
}

