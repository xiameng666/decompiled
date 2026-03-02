import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.common.analytics.CoreAnalyticsIntentOperation;

public final class azsq {
    private static volatile azsq a;

    static {
        bboh.b("CoreAnalyticsIntents", bbcu.dH);
        azsq.a = null;
    }

    public static final void a(Context context0, int v, int v1, long v2) {
        Intent intent0 = new Intent("com.google.android.gms.common.operation.LOG_CORE_ANALYTICS").setPackage("com.google.android.gms").putExtra("type", "system_health").putExtra("event_code", v - 1);
        if(v1 >= 0) {
            intent0.putExtra("post_install_checkin_stage", v1);
        }
        PendingIntent pendingIntent0 = IntentOperation.getPendingIntent(context0, CoreAnalyticsIntentOperation.class, intent0, v, 0xA000000);
        gfuy.e(pendingIntent0);
        bbib bbib0 = new bbib(context0);
        bbib0.a(pendingIntent0);
        bbib0.d("CoreAnalyticsIntents", 3, SystemClock.elapsedRealtime() + v2, pendingIntent0, "com.google.android.gms");
    }

    public static final void b(Context context0, int v, long v1) {
        azsq.a(context0, v, -1, v1);
    }

    public static void c() {
        if(azsq.a == null) {
            azsq.a = new azsq();
        }
    }
}

