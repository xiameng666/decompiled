import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.auth.cryptauth.HashResult;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;

public final class ajjw extends cjtm {
    private final ajhj a;
    private final Account b;
    private final String c;
    private final String d;
    private final byte[] e;
    private static final baun f;

    static {
        ajjw.f = new baun(new String[]{"HmacOperation"}, null);
    }

    public ajjw(ajhj ajhj0, Account account0, String s, String s1, byte[] arr_b, azug azug0) {
        super(0x81, "HmacOperation", azug0);
        this.a = ajhj0;
        this.b = account0;
        this.c = s;
        this.d = s1;
        this.e = arr_b;
    }

    @Override  // cjtm
    protected final void f(Context context0) {
        ajjw.f.d("HMAC operation is called", new Object[0]);
        ajip ajip0 = new ajip(context0);
        ajip0.a = 9;
        ajiy ajiy0 = ajix.a(context0, ajip0);
        try {
            Account account0 = this.b;
            String s = this.c;
            String s1 = this.d;
            byte[] arr_b = this.e;
            if(arr_b == null) {
                throw new NullPointerException("Null data");
            }
            HashResult hashResult0 = new HashResult(1, yha.d(ajiy0.a.h(s, account0).b.a, arr_b, s1));
            ajip0.b = 1;
            ajip0.a();
            ApiMetadata apiMetadata0 = cckf.d(bbdp.R);
            this.a.b(hashResult0, apiMetadata0);
        }
        catch(ajiv ajiv0) {
            ajjw.f.n("HMAC operation failed: ", ajiv0, new Object[0]);
            ajip0.a();
            this.j(new Status(25508));
        }
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.a.a(status0, ApiMetadata.b);
    }
}

