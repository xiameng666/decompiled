import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

public final class fnee implements ServiceConnection {
    final icbi a;
    final fnem b;

    public fnee(fnem fnem0, icbi icbi0) {
        this.b = fnem0;
        this.a = icbi0;
        super();
    }

    @Override  // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName0) {
        this.b.a();
    }

    @Override  // android.content.ServiceConnection
    public final void onNullBinding(ComponentName componentName0) {
        this.b.a();
    }

    @Override  // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName0, IBinder iBinder0) {
        Object object0;
        ibuq.f(iBinder0, "service");
        fnem fnem0 = this.b;
        fnem0.c.set(true);
        sct.d("AobPlayController", "bound successfully");
        if(iBinder0 == null) {
            object0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.android.vending.setup.IPlaySetupServiceV2");
            object0 = (iInterface0 instanceof sow) ? ((sow)iInterface0) : new sow(iBinder0);
        }
        fnem0.b.set(object0);
        try {
            this.a.w(Boolean.valueOf(true));
        }
        catch(IllegalStateException unused_ex) {
            sct.e("AobPlayController", "Already resumed");
        }
    }

    @Override  // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName0) {
        this.b.a();
    }
}

