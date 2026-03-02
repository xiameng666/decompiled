import com.google.android.gms.identitycredentials.CallingAppInfoParcelable;
import com.google.android.gms.identitycredentials.CredentialTransferCapabilities;

public final class bydc implements gmbg {
    final CallingAppInfoParcelable a;
    final gmcu b;

    public bydc(CallingAppInfoParcelable callingAppInfoParcelable0, gmcu gmcu0) {
        this.a = callingAppInfoParcelable0;
        this.b = gmcu0;
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
        ibuq.f(throwable0, "t");
        this.b.r(new cjuh(8, throwable0.getMessage()));
    }

    @Override  // gmbg
    public final void b(Object object0) {
        CredentialTransferCapabilities credentialTransferCapabilities0 = (CredentialTransferCapabilities)object0;
        ibuq.f(credentialTransferCapabilities0, "result");
        try {
            credentialTransferCapabilities0.a.putParcelable("PROVIDER_APP_INFO", this.a);
            this.b.q(credentialTransferCapabilities0);
        }
        catch(ClassCastException classCastException0) {
            cjuh cjuh0 = new cjuh(8, "Unable to handle request", null, classCastException0);
            this.b.r(cjuh0);
        }
    }
}

