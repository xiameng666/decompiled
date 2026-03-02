import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.auth.cryptauth.KeyInvalidationResult;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import java.util.Arrays;
import java.util.List;

public final class ajjy extends cjtm {
    private final ajhv a;
    private final int b;
    private final String c;
    private final Account d;
    private final List e;
    private static final baun f;

    static {
        ajjy.f = new baun(new String[]{"InvalidateCustomKeyOperation"}, null);
    }

    public ajjy(ajhv ajhv0, int v, String s, Account account0, List list0, azug azug0) {
        super(0x81, "InvalidateCustomKeyOperation", azug0);
        this.a = ajhv0;
        this.b = v;
        this.c = s;
        this.d = account0;
        this.e = list0;
    }

    @Override  // cjtm
    protected final void f(Context context0) {
        ygm ygm0;
        ajjy.f.d("Invalidate custom key operation is called", new Object[0]);
        batl.c(this.c.equals("fido:hardware_protected_uv"), "The key name must be fido hardware uv protected key");
        List list0 = Arrays.asList(new String[]{this.c});
        ajjd ajjd0 = new ajjd(context0, this.b, list0, null, this.d, null, null, null, null, this.e);
        try {
            ygm0 = ajjd0.b();
        }
        catch(ygj ygj0) {
            ajjy.f.n("Failed to perform custom key invalidation. StatusCode=" + ygj0.a, ygj0, new Object[0]);
            Status status0 = ajjp.a(ygj0.a);
            this.a.a(status0, ApiMetadata.b);
            return;
        }
        KeyInvalidationResult keyInvalidationResult0 = new KeyInvalidationResult(1, ajjp.a(ygm0.a));
        ApiMetadata apiMetadata0 = cckf.d(bbdp.R);
        this.a.b(keyInvalidationResult0, apiMetadata0);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.a.a(status0, ApiMetadata.b);
    }
}

