import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.auth.cryptauth.Payload;
import com.google.android.gms.auth.cryptauth.SignedBlob;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;

public final class ajkk extends cjtm {
    private final ajik a;
    private final String b;
    private final Account c;
    private final Payload d;
    private static final baun e;

    static {
        ajkk.e = new baun(new String[]{"SignForOperation"}, null);
    }

    public ajkk(ajik ajik0, String s, Account account0, Payload payload0, azug azug0) {
        super(0x81, "SignForOperation", azug0);
        this.a = ajik0;
        this.b = s;
        this.c = account0;
        this.d = payload0;
    }

    @Override  // cjtm
    protected final void f(Context context0) {
        ajip ajip0 = new ajip(context0);
        ajip0.a = 1;
        ajiy ajiy0 = ajix.a(context0, ajip0);
        try {
            SignedBlob signedBlob0 = ajiy0.g(this.b, this.c, this.d);
            ajip0.b = 1;
            ajip0.a();
            ApiMetadata apiMetadata0 = cckf.d(bbdp.R);
            this.a.c(signedBlob0, apiMetadata0);
        }
        catch(ajgp ajgp0) {
            ajkk.e.g("Failed to sign payload", ajgp0, new Object[0]);
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

