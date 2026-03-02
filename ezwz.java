import android.content.Context;
import android.content.Intent;
import com.google.android.gms.update.control.ActiveStateTrackingBroadcastReceiver;
import j..util.Objects;

public final class ezwz extends bbln {
    final Context a;
    final Intent b;
    final ActiveStateTrackingBroadcastReceiver c;

    public ezwz(ActiveStateTrackingBroadcastReceiver activeStateTrackingBroadcastReceiver0, Context context0, Intent intent0) {
        this.a = context0;
        this.b = intent0;
        Objects.requireNonNull(activeStateTrackingBroadcastReceiver0);
        this.c = activeStateTrackingBroadcastReceiver0;
        super(9);
    }

    @Override
    public final void run() {
        ActiveStateTrackingBroadcastReceiver activeStateTrackingBroadcastReceiver0 = this.c;
        synchronized(activeStateTrackingBroadcastReceiver0.a) {
            if(activeStateTrackingBroadcastReceiver0.b) {
                activeStateTrackingBroadcastReceiver0.b(this.a, this.b);
            }
        }
    }
}

