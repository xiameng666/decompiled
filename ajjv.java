import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.auth.cryptauth.KeyDerivationResult;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;

public final class ajjv extends cjtm {
    private final ajhg a;
    private final Account b;
    private final String c;
    private final String d;
    private final byte[] e;
    private final byte[] f;
    private static final baun g;

    static {
        ajjv.g = new baun(new String[]{"HkdfOperation"}, null);
    }

    public ajjv(ajhg ajhg0, Account account0, String s, String s1, byte[] arr_b, byte[] arr_b1, azug azug0) {
        super(0x81, "HkdfOperation", azug0);
        this.a = ajhg0;
        this.b = account0;
        this.c = s;
        this.d = s1;
        this.e = arr_b;
        this.f = arr_b1;
    }

    @Override  // cjtm
    protected final void f(Context context0) {
        ajjv.g.d("HKDF operation is called", new Object[0]);
        ajip ajip0 = new ajip(context0);
        ajip0.a = 10;
        ajiy ajiy0 = ajix.a(context0, ajip0);
        try {
            KeyDerivationResult keyDerivationResult0 = ajiy0.a(this.b, this.c, this.d, this.e, this.f);
            ajip0.b = 1;
            ajip0.a();
            ApiMetadata apiMetadata0 = cckf.d(bbdp.R);
            this.a.b(keyDerivationResult0, apiMetadata0);
        }
        catch(ajiv ajiv0) {
            ajjv.g.g("Failed HKDF", ajiv0, new Object[0]);
            ajip0.a();
            this.j(new Status(25508));
        }
        catch(ajgp ajgp0) {
            ajjv.g.g("Failed HKDF", ajgp0, new Object[0]);
            ajip0.a();
            this.j(new Status(25507));
        }
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.a.a(status0, ApiMetadata.b);
    }
}

