import android.content.Context;
import com.google.android.gms.auth.folsom.RecoveryRequest;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;

public final class ajvu extends cjtm {
    private static final baun a;
    private final ajsw b;
    private final RecoveryRequest c;
    private final String d;

    static {
        ajvu.a = akea.a("GenerateOpenVaultRequestOperation");
    }

    public ajvu(ajsw ajsw0, RecoveryRequest recoveryRequest0, String s, azug azug0) {
        super(0xAC, "GenerateOpenVaultRequestOperation", azug0);
        this.b = ajsw0;
        this.c = recoveryRequest0;
        this.d = s;
    }

    @Override  // cjtm
    protected final void f(Context context0) {
        ajxq ajxq0;
        try {
            ajxq0 = ajxq.b(this.c);
        }
        catch(ajxr ajxr0) {
            ajvu.a.n("Can\'t parse recovery request", ajxr0, new Object[0]);
            this.j(Status.d);
            return;
        }
        try(ajxo ajxo0 = new ajxo(context0, ajxq0, this.d)) {
            byte[] arr_b = ajxo0.c(6).toBytesArray();
            ApiMetadata apiMetadata0 = cckf.d(bbdp.T);
            this.b.a(Status.b, arr_b, apiMetadata0);
        }
        catch(ajxr ajxr1) {
            ajvu.a.n("Exception during OpenVaultRequest creation", ajxr1, new Object[0]);
            this.j(Status.d);
        }
    }

    @Override  // cjtm
    public final void j(Status status0) {
        ApiMetadata apiMetadata0 = cckf.d(bbdp.T);
        this.b.a(status0, new byte[0], apiMetadata0);
    }
}

