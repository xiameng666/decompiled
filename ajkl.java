import android.content.Context;
import com.google.android.gms.auth.cryptauth.Payload;
import com.google.android.gms.auth.cryptauth.PlainText;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;

public final class ajkl extends cjtm {
    private final ajin a;
    private final String b;
    private final byte[] c;
    private final Payload d;
    private static final baun e;

    static {
        ajkl.e = new baun(new String[]{"VerifyDecryptOperation"}, null);
    }

    public ajkl(ajin ajin0, String s, byte[] arr_b, Payload payload0, azug azug0) {
        super(0x81, "VerifyDecryptAuthzenPayloadOperation", azug0);
        this.a = ajin0;
        this.b = s;
        this.c = arr_b;
        this.d = payload0;
    }

    @Override  // cjtm
    protected final void f(Context context0) {
        ajip ajip0 = new ajip(context0);
        ajip0.a = 4;
        ajiy ajiy0 = ajix.a(context0, ajip0);
        try {
            PlainText plainText0 = ajiy0.c(this.b, this.c, this.d);
            ajip0.b = 1;
            ajip0.a();
            ApiMetadata apiMetadata0 = cckf.d(bbdp.R);
            this.a.b(plainText0, apiMetadata0);
        }
        catch(ajgp ajgp0) {
            ajkl.e.g("Failed to verifyDecrypt payload", ajgp0, new Object[0]);
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

