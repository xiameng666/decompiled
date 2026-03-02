import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import j..util.Objects;

final class iasb extends BroadcastReceiver {
    final iasc a;

    public iasb(iasc iasc0) {
        Objects.requireNonNull(iasc0);
        this.a = iasc0;
        super();
    }

    @Override  // android.content.BroadcastReceiver
    public final void onReceive(Context context0, Intent intent0) {
        Objects.requireNonNull(this.a);
        iarz iarz0 = new iarz(this.a);
        this.a.f.c(iarz0);
        Objects.requireNonNull(this.a.f);
        iasa iasa0 = new iasa(this.a.f);
        this.a.e.execute(iasa0);
    }
}

