import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.auth.cryptauth.CryptauthPublicKey;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;

public final class ajkg extends cjtm {
    private final ajie a;
    private final String b;
    private final Account c;
    private static final baun d;

    static {
        ajkg.d = new baun(new String[]{"RetrievePublicKey"}, null);
    }

    public ajkg(ajie ajie0, String s, Account account0, azug azug0) {
        super(0x81, "RetrievePublicKeyOperation", azug0);
        this.a = ajie0;
        this.b = s;
        this.c = account0;
    }

    @Override  // cjtm
    protected final void f(Context context0) {
        ajip ajip0 = new ajip(context0);
        ajip0.a = 7;
        ajfn ajfn0 = new ajfn(context0);
        try {
            CryptauthPublicKey cryptauthPublicKey0 = new CryptauthPublicKey(1, ajfn0.f(this.b, this.c).c);
            ajip0.b = 1;
            ajip0.a();
            ApiMetadata apiMetadata0 = cckf.d(bbdp.R);
            this.a.b(cryptauthPublicKey0, apiMetadata0);
        }
        catch(ajiv ajiv0) {
            ajkg.d.n("Failed to retrieve public key", ajiv0, new Object[0]);
            ajip0.b = 11;
            ajip0.a();
            this.j(new Status(25505));
        }
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.a.a(status0, ApiMetadata.b);
    }
}

