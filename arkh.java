import android.content.ComponentName;
import android.os.IBinder;
import android.os.IInterface;
import j..util.Objects;

final class arkh extends clil {
    final arkk a;

    public arkh(arkk arkk0) {
        Objects.requireNonNull(arkk0);
        this.a = arkk0;
        super("backup");
    }

    @Override  // clil
    public final void a(ComponentName componentName0, IBinder iBinder0) {
        sov sov0;
        if(iBinder0 == null) {
            sov0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.android.vending.setup.IPlayP2pRestoreService");
            sov0 = (iInterface0 instanceof sov) ? ((sov)iInterface0) : new sov(iBinder0);
        }
        this.a.g = sov0;
        this.a.a.d("PlayP2pRestoreService connected", new Object[0]);
        this.a.c();
    }

    @Override  // clil
    public final void b(ComponentName componentName0) {
        this.a.g = null;
        this.a.a.d("PlayP2pRestoreService disconnected", new Object[0]);
    }
}

