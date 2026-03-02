import android.content.Context;
import com.google.android.gms.chimera.modules.trustagent.AppContextProvider;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;

public final class ezat extends cjtm {
    private final ezdo a;
    private final String b;
    private final ezck c;

    public ezat(ezdo ezdo0, String s, azug azug0) {
        super(72, "TrustedDevices", azug0);
        this.a = ezdo0;
        this.b = s;
        this.c = new ezcg(ezcl.a(AppContextProvider.a()));
    }

    @Override  // cjtm
    public final void f(Context context0) {
        this.c.g("auth_trust_agent_pref_trusted_bluetooth_address" + this.b);
        this.c.g("auth_trust_agent_pref_trusted_bluetooth_title" + this.b);
        this.c.g("auth_trust_agent_pref_bluetooth_device_needs_security_approval_key_" + this.b);
        this.c.c();
        ApiMetadata apiMetadata0 = cckf.d(bbdp.fn);
        this.a.a(Status.b, true, apiMetadata0);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        ApiMetadata apiMetadata0 = cckf.d(bbdp.fn);
        this.a.a(status0, false, apiMetadata0);
    }
}

