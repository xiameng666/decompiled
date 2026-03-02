import android.content.Context;
import com.google.android.gms.auth.proximity.Role;
import com.google.android.gms.auth.proximity.firstparty.FirstPartyDeviceRegistrationChimeraService;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.ExecutionException;

public final class alge extends cjtm {
    private final azxs a;
    private final String b;
    private final Role c;
    private final byte[] d;

    static {
        alis.a("SendMessage");
    }

    public alge(azxs azxs0, String s, Role role0, byte[] arr_b, azug azug0) {
        super(0x90, "SendMessage", azug0);
        this.a = azxs0;
        this.b = s;
        this.c = role0;
        this.d = arr_b;
    }

    @Override  // cjtm
    public final void f(Context context0) {
        String s = this.b;
        if(s != null && !s.isEmpty()) {
            byte[] arr_b = this.d;
            if(arr_b != null && arr_b.length != 0) {
                Role role0 = this.c;
                if(algb.c(role0)) {
                    azox azox0 = new azox();
                    alfd alfd0 = FirstPartyDeviceRegistrationChimeraService.a(azox0, context0);
                    if(alfd0 != null) {
                        try {
                            FirstPartyDeviceRegistrationChimeraService.a.d("Sending a message to %s for %s", new Object[]{s, role0.b});
                            Status status0 = (Status)alfd0.a.b.f.e(new alfg(alfd0.a.b, s, role0, arr_b)).get();
                            this.a.a(status0);
                        }
                        catch(InterruptedException | ExecutionException unused_ex) {
                            this.a.a(Status.d);
                        }
                        bbic.a().b(context0, azox0);
                        return;
                    }
                    this.a.a(Status.d);
                    return;
                }
            }
        }
        this.a.a(Status.d);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.a.a(status0);
    }
}

