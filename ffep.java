import android.content.Intent;
import android.util.Log;
import com.google.android.gms.wearable.internal.ChannelEventParcelable;
import com.google.android.gms.wearable.internal.ChannelImpl;

public final class ffep {
    private final fffi a;

    public ffep(fffi fffi0) {
        this.a = fffi0;
    }

    public final void a(fdpl fdpl0, fdrq fdrq0, String s, String s1, int v, int v1, int v2, ffeo ffeo0) {
        ChannelEventParcelable channelEventParcelable0 = new ChannelEventParcelable(new ChannelImpl(fdrq0.b(), s1, s), v2, v, v1);
        Intent intent0 = new Intent("com.google.android.gms.wearable.CHANNEL_EVENT", fdzj.b("", s)).setPackage(fdpl0.b);
        ffen ffen0 = new ffen(this, ffeo0.e, intent0, channelEventParcelable0, fdrq0, s, s1, v, v1);
        this.a.a.j(fdpl0, ffen0);
    }

    public final void b(fdpl fdpl0, fdrq fdrq0, String s, String s1, int v, int v1) {
        if(Log.isLoggable("WearableService", 2)) {
            Log.v("WearableService", String.format("onChannelClosed(%s, %s, %s, %s, %s, %s)", fdpl0, fdrq0, s, s1, v, v1));
        }
        this.a(fdpl0, fdrq0, s, s1, v, v1, 2, ffeo.b);
    }
}

