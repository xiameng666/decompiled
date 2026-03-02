import android.content.Context;
import com.google.android.gms.auth.proximity.firstparty.FirstPartyDeviceRegistrationChimeraService;
import com.google.android.gms.common.api.Status;

public final class alga extends cjtm {
    private final azxs a;
    private final alij b;

    static {
        alis.a("RemoveChannelCallback");
    }

    public alga(azxs azxs0, alij alij0, azug azug0) {
        super(0x90, "RemoveChannelCallback", azug0);
        batl.s(azxs0);
        this.a = azxs0;
        this.b = alij0;
    }

    @Override  // cjtm
    public final void f(Context context0) {
        alij alij0 = this.b;
        if(alij0 == null) {
            this.a.a(Status.d);
            return;
        }
        azox azox0 = new azox();
        alfd alfd0 = FirstPartyDeviceRegistrationChimeraService.a(azox0, context0);
        if(alfd0 == null) {
            this.a.a(Status.d);
            return;
        }
        synchronized(alfd0.a.d) {
            alfd0.a.e.c(alij0);
        }
        this.a.a(Status.b);
        bbic.a().b(context0, azox0);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.a.a(status0);
    }
}

