import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.auth.cryptauth.ClientPublicKey;
import com.google.android.gms.auth.cryptauth.ExportedSymmetricKey;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;

public final class ajjz extends cjtm {
    private final ajha a;
    private final String b;
    private final Account c;
    private final ClientPublicKey d;
    private final baun e;

    public ajjz(ajha ajha0, String s, Account account0, ClientPublicKey clientPublicKey0, azug azug0) {
        super(0x81, "PerformProximityKeyAgreementOperation", azug0);
        this.e = new baun(new String[]{"PerformProximityKeyAgreementOperation"}, null);
        this.a = ajha0;
        this.b = s;
        this.c = account0;
        this.d = clientPublicKey0;
    }

    @Override  // cjtm
    protected final void f(Context context0) {
        ajip ajip0 = new ajip(context0);
        ajip0.a = 5;
        ajiy ajiy0 = ajix.a(context0, ajip0);
        try {
            ExportedSymmetricKey exportedSymmetricKey0 = new ExportedSymmetricKey(ajiy0.i(this.b, this.c, this.d).getEncoded(), System.currentTimeMillis());
            ajip0.b = 1;
            ajip0.a();
            ApiMetadata apiMetadata0 = cckf.d(bbdp.R);
            this.a.c(exportedSymmetricKey0, apiMetadata0);
        }
        catch(ajgp ajgp0) {
            this.e.n("Proximity key generation failed", ajgp0, new Object[0]);
            ajip0.a();
            this.j(new Status(25507));
        }
        catch(ajiv unused_ex) {
            ajip0.a();
            this.j(new Status(25508));
        }
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.a.a(status0, ApiMetadata.b);
    }
}

