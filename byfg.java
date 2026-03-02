import android.app.PendingIntent;
import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Binder;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.identitycredentials.ImportCredentialsRequest;
import com.google.android.gms.identitycredentials.PendingImportCredentialsHandle;

public final class byfg extends cjtm {
    private final bxyi a;
    private final bxyn b;
    private final ImportCredentialsRequest c;

    public byfg(bxyi bxyi0, bxyn bxyn0, ImportCredentialsRequest importCredentialsRequest0, azug azug0) {
        ibuq.f(bxyn0, "callbacks");
        ibuq.f(importCredentialsRequest0, "request");
        super(0x160, "ImportCredentials", azug0);
        this.a = bxyi0;
        this.b = bxyn0;
        this.c = importCredentialsRequest0;
    }

    @Override  // cjtm
    protected final void f(Context context0) {
        PendingIntent pendingIntent0;
        ibuq.f(context0, "context");
        Status status0 = Status.b;
        ibuq.f(this.c, "request");
        bxyi bxyi0 = this.a;
        try {
            Binder binder0 = new Binder();
            gged_interceptors gged0 = bbms.e(bxyi0.e, bxyi0.b);
            pendingIntent0 = bxvu.a(new bxvt(binder0, bxyi0.b, this.c, gged0), null, null, true);
        }
        catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
            ((ggtj)bxyj.a.j()).B("IDCredServiceImpl", "Unexpected: calling package " + bxyi0.b + " not found.\n" + packageManager$NameNotFoundException0);
            bxzl.f(bxyi0.d, bxyi0.c, bxzo.d);
            throw new cjuh(10, "Invalid package certificates", null, packageManager$NameNotFoundException0);
        }
        bxzl.f(bxyi0.d, bxyi0.c, bxzo.b);
        ibuq.c(pendingIntent0);
        PendingImportCredentialsHandle pendingImportCredentialsHandle0 = new PendingImportCredentialsHandle(pendingIntent0);
        ApiMetadata apiMetadata0 = cckf.d(bbdp.cm);
        this.b.j(status0, pendingImportCredentialsHandle0, apiMetadata0);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        ibuq.f(status0, "status");
        this.b.j(status0, null, ApiMetadata.b);
    }
}

