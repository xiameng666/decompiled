import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import j..util.Objects;

final class fliq extends BroadcastReceiver {
    final flit a;

    public fliq(flit flit0) {
        Objects.requireNonNull(flit0);
        this.a = flit0;
        super();
    }

    @Override  // android.content.BroadcastReceiver
    public final void onReceive(Context context0, Intent intent0) {
        flit flit0 = this.a;
        boolean z = flct.a(flit0.a);
        if(z) {
            flit0.y();
        }
        fljy fljy0 = flit0.j;
        int v = z ? 2 : 3;
        if(fljy0.d == v) {
            return;
        }
        fljy0.d = v;
        fljy0.a();
    }
}

