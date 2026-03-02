import android.content.Context;
import com.google.android.gms.auth.cryptauth.SignedBlob;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;

public final class ajkj extends cjtm {
    private final ajik a;
    private final byte[] b;
    private final String c;
    private final byte[] d;
    private static final baun e;

    static {
        ajkj.e = new baun(new String[]{"SignForKeyHandleOperation"}, null);
    }

    public ajkj(ajik ajik0, byte[] arr_b, String s, byte[] arr_b1, azug azug0) {
        super(0x81, "SignForKeyHandleOperation", azug0);
        this.a = ajik0;
        this.b = arr_b;
        this.c = s;
        this.d = arr_b1;
    }

    @Override  // cjtm
    protected final void f(Context context0) {
        ajkj.e.d("SignForKeyHandle operation is called", new Object[0]);
        ajip ajip0 = new ajip(context0);
        ajip0.a = 8;
        ajiy ajiy0 = ajix.a(context0, ajip0);
        try {
            SignedBlob signedBlob0 = ajiy0.h(this.b, this.c, this.d);
            ajip0.b = 1;
            ajip0.a();
            ApiMetadata apiMetadata0 = cckf.d(bbdp.R);
            this.a.c(signedBlob0, apiMetadata0);
        }
        catch(ajgp ajgp0) {
            ajkj.e.g("Failed to sign payload", ajgp0, new Object[0]);
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

