import android.content.Context;
import android.util.Log;

public final class ffff {
    public static void a(Context context0, boolean z) {
        if(!ffgp.n(context0)) {
            if(fffd.a == null) {
                fffd.a = new fffd(context0);
            }
            fffd fffd0 = fffd.a;
            if(z && !Boolean.TRUE.equals(fffd0.b()) || !z && !Boolean.FALSE.equals(fffd0.b())) {
                ffgp.i().execute(new fffe(fffd0, z, context0));
                return;
            }
            if(Log.isLoggable("WearReadyBroadcaster", 2)) {
                Log.v("WearReadyBroadcaster", String.format("Broadcast (WearableApiReady = %s) was previously sent. Not sending another.", Boolean.valueOf(z)));
            }
        }
    }
}

