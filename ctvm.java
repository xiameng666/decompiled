import android.content.Context;
import com.google.android.gms.chimera.modules.multidevice.sync.AppContextProvider;
import com.google.android.gms.multidevice.sync.notification.service.NotificationListenerChimeraService;

public final class ctvm {
    public final ibrt a;
    public final bboh b;
    public icck c;
    public final Context d;
    public final ctvs e;
    public NotificationListenerChimeraService f;

    public ctvm(ibrt ibrt0, ctvs ctvs0) {
        this.a = ibrt0;
        this.e = ctvs0;
        this.b = ctnb.a("NotificationSync", new ibuk(this.getClass()));
        Context context0 = AppContextProvider.b();
        ibuq.e(context0, "getApplicationContext(...)");
        this.d = context0;
    }
}

