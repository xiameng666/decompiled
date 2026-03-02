import android.app.KeyguardManager;
import android.content.Context;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;

public final class bllu extends cjtm {
    private final bmfy a;

    public bllu(bmfy bmfy0, azug azug0) {
        super(0x94, "NativeAppIsUserVerifyingPlatformAuthenticatorAvailable", azug0);
        this.a = bmfy0;
    }

    @Override  // cjtm
    protected final void f(Context context0) {
        KeyguardManager keyguardManager0 = (KeyguardManager)context0.getSystemService("keyguard");
        boolean z = keyguardManager0 != null && keyguardManager0.isDeviceSecure();
        ApiMetadata apiMetadata0 = cckf.d(bbdp.bv);
        this.a.a(z, apiMetadata0);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.a.c(status0, ApiMetadata.b);
    }
}

