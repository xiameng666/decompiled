import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.auth.cryptauth.KeyHandleResult;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;

public final class ajjq extends cjtm {
    private final ajhp a;
    private final String b;
    private final Account c;
    private static final baun d;

    static {
        ajjq.d = new baun(new String[]{"GetKeyHandleOperation"}, null);
    }

    public ajjq(ajhp ajhp0, String s, Account account0, azug azug0) {
        super(0x81, "GetKeyHandleOperation", azug0);
        this.a = ajhp0;
        this.b = s;
        this.c = account0;
    }

    @Override  // cjtm
    protected final void f(Context context0) {
        ajjq.d.h("Get key handle operation is called.", new Object[0]);
        try {
            KeyHandleResult keyHandleResult0 = new KeyHandleResult(1, new ajfn(context0).f(this.b, this.c).b);
            ApiMetadata apiMetadata0 = cckf.d(bbdp.R);
            this.a.b(keyHandleResult0, apiMetadata0);
        }
        catch(ajiv unused_ex) {
            this.j(new Status(25508));
        }
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.a.a(status0, ApiMetadata.b);
    }
}

