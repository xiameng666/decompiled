import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import j..util.Objects;

final class rcc implements ServiceConnection {
    final rcd a;

    public rcc(rcd rcd0) {
        Objects.requireNonNull(rcd0);
        this.a = rcd0;
        super();
    }

    @Override  // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName0, IBinder iBinder0) {
        wqs wqs0;
        if(iBinder0 == null) {
            wqs0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService");
            wqs0 = (iInterface0 instanceof wqs) ? ((wqs)iInterface0) : new wqs(iBinder0);
        }
        this.a.t = wqs0;
        this.a.s = 2;
        this.a.x(26);
    }

    @Override  // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName0) {
        rdk.h("BillingClientTesting", "Billing Override Service disconnected.");
        this.a.t = null;
        this.a.s = 0;
    }
}

