import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import j..util.Objects;
import java.util.Set;

final class yvs extends BroadcastReceiver {
    @Override  // android.content.BroadcastReceiver
    public final void onReceive(Context context0, Intent intent0) {
        Set set0 = yvv.b;
        synchronized(set0) {
            for(Object object0: set0) {
                Objects.requireNonNull(((yvv)object0));
                yvr yvr0 = new yvr(((yvv)object0));
                ((yvv)object0).c.execute(yvr0);
            }
        }
    }
}

