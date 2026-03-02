import android.content.Context;
import android.provider.Settings.Secure;
import com.google.android.gms.chimera.modules.pay.AppContextProvider;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.pay.SetLoggingSessionIdRequest;

public final class ebbs extends ebav {
    domv a;
    private final SetLoggingSessionIdRequest b;
    private final donp c;

    public ebbs(SetLoggingSessionIdRequest setLoggingSessionIdRequest0, String s, donp donp0, azug azug0) {
        super("SetLoggingSessionId", s, azug0);
        this.b = setLoggingSessionIdRequest0;
        this.c = donp0;
    }

    @Override  // ebaw
    protected final void b(Context context0) {
        if(this.a == null) {
            this.a = domu.a(AppContextProvider.a());
        }
        Settings.Secure.putString(this.a.b().a, "pay_session_id", this.b.a);
        this.c.x(Status.b);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.c.x(status0);
    }
}

