import android.app.PendingIntent;
import android.content.Context;
import com.google.android.gms.auth.proximity.Role;
import com.google.android.gms.auth.proximity.firstparty.FirstPartyDeviceRegistrationChimeraService;
import com.google.android.gms.common.api.Status;
import java.util.List;

public final class alfx extends cjtm {
    private final azxs a;
    private final PendingIntent b;
    private final Role c;
    private final List d;
    private final String e;

    static {
        alis.a("RegisterDevicesOperation");
    }

    public alfx(azxs azxs0, Role role0, List list0, PendingIntent pendingIntent0, String s, azug azug0) {
        super(0x90, "RegisterDevicesForRole", azug0);
        this.a = azxs0;
        this.c = role0;
        this.d = list0;
        this.e = s;
        this.b = pendingIntent0;
    }

    @Override  // cjtm
    public final void f(Context context0) {
        PendingIntent pendingIntent0 = this.b;
        String s = this.e;
        if(algb.a(pendingIntent0, s)) {
            List list0 = this.d;
            Role role0 = this.c;
            if(algb.b(list0, role0)) {
                FirstPartyDeviceRegistrationChimeraService.b(list0, role0, pendingIntent0, s, context0, true);
                this.a.a(Status.b);
                return;
            }
        }
        this.a.a(Status.d);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.a.a(status0);
    }
}

