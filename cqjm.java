import android.app.PendingIntent;
import android.content.Context;
import com.google.android.gms.mdm.receivers.RetryAfterAlarmChimeraReceiver;

public final class cqjm {
    public static PendingIntent a(Context context0) {
        return PendingIntent.getBroadcast(context0, 0, elhb.b(context0, RetryAfterAlarmChimeraReceiver.class), 0x2000000);
    }

    public static void b(Context context0, bbib bbib0) {
        bbib0.a(cqjm.a(context0));
    }

    public static void c(Context context0, long v) {
        cqix.l.d(Long.valueOf(v));
        new bbib(context0).d("RetryAfterAlarmReceiver", 1, v, cqjm.a(context0), "com.google.android.gms");
    }
}

