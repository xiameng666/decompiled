import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.auth.cryptauth.Payload;
import com.google.android.gms.auth.cryptauth.SignCryptedBlob;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;

public final class ajki extends cjtm {
    private final ajih a;
    private final String b;
    private final String c;
    private final Account d;
    private final Payload e;
    private static final baun f;

    static {
        ajki.f = new baun(new String[]{"VerifyDecryptOperation"}, null);
    }

    public ajki(ajih ajih0, String s, String s1, Account account0, Payload payload0, azug azug0) {
        super(0x81, "SignCryptOperation", azug0);
        this.a = ajih0;
        this.b = s;
        this.c = s1;
        this.d = account0;
        this.e = payload0;
    }

    @Override  // cjtm
    protected final void f(Context context0) {
        ajip ajip0 = new ajip(context0);
        ajip0.a = 2;
        ajiy ajiy0 = ajix.a(context0, ajip0);
        try {
            SignCryptedBlob signCryptedBlob0 = ajiy0.e(this.b, this.c, this.d, this.e);
            ajip0.b = 1;
            ajip0.a();
            ApiMetadata apiMetadata0 = cckf.d(bbdp.R);
            this.a.b(signCryptedBlob0, apiMetadata0);
        }
        catch(ajgp ajgp0) {
            ajki.f.g("Failed to sign payload", ajgp0, new Object[0]);
            ajip0.a();
            this.j(new Status(25507));
        }
        catch(ajiv ajiv0) {
            ajki.f.l(ajiv0);
            ajip0.a();
            this.j(new Status(25508));
        }
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.a.a(status0, ApiMetadata.b);
    }
}

