import android.content.Context;
import android.content.Intent;

public final class eiwt {
    static {
        bboh.b("IntegrityApiServiceStarter", bbcu.gf);
    }

    public static void a(Context context0) {
        context0.startService(new Intent().setClassName(context0, "com.google.android.gms.play.integrity.api.service.IntegrityApiPersistentService"));
    }
}

