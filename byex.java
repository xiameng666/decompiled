import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.identitycredentials.CredentialInformationRequest;

public final class byex extends cjtm {
    public final bxyn a;
    private final CredentialInformationRequest b;

    public byex(bxyn bxyn0, CredentialInformationRequest credentialInformationRequest0, azug azug0) {
        ibuq.f(bxyn0, "callbacks");
        ibuq.f(credentialInformationRequest0, "request");
        super(0x160, "CredentialInformation", azug0);
        this.a = bxyn0;
        this.b = credentialInformationRequest0;
    }

    @Override  // cjtm
    protected final void f(Context context0) {
        ibuq.f(context0, "context");
        PackageManager packageManager0 = context0.getPackageManager();
        ibuq.e(packageManager0, "getPackageManager(...)");
        bxxc bxxc0 = new bxxc(context0, packageManager0);
        byew byew0 = new byew(this);
        ibuq.f(this.b, "request");
        bxwz bxwz0 = new bxwz(this.b, byew0, bxxc0, null);
        icbb.b(bxxc0.a, null, null, bxwz0, 3);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        ibuq.f(status0, "status");
        this.a.h(status0, null);
    }
}

