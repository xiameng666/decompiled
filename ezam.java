import android.content.Context;
import com.google.android.gms.chimera.modules.trustagent.AppContextProvider;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;

public final class ezam extends cjtm {
    private final ezcw a;
    private final String b;
    private final ezck c;

    public ezam(ezcw ezcw0, String s, azug azug0) {
        super(307, "Authenticators", azug0);
        this.a = ezcw0;
        this.b = s;
        this.c = new ezcg(ezcl.a(AppContextProvider.a()));
    }

    @Override  // cjtm
    public final void f(Context context0) {
        String s = "auth_trust_agent_pref_trusted_bluetooth_address" + this.b;
        boolean z = this.c.j(s) && this.c.m(s);
        ApiMetadata apiMetadata0 = cckf.d(bbdp.fn);
        this.a.a(Status.b, z, apiMetadata0);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        ApiMetadata apiMetadata0 = cckf.d(bbdp.fn);
        this.a.a(status0, false, apiMetadata0);
    }
}

