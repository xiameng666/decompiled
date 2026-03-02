import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import j..util.Objects;

final class bwjk implements ServiceConnection {
    final bwjl a;

    public bwjk(bwjl bwjl0) {
        Objects.requireNonNull(bwjl0);
        this.a = bwjl0;
        super();
    }

    @Override  // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName0, IBinder iBinder0) {
        bwjp bwjp0;
        if(iBinder0 == null) {
            bwjp0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.http.IGoogleHttpService");
            bwjp0 = (iInterface0 instanceof bwjp) ? ((bwjp)iInterface0) : new bwjn(iBinder0);
        }
        this.a.a = bwjp0;
        this.a.b.countDown();
    }

    @Override  // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName0) {
    }
}

