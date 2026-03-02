import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

public abstract class anm implements ServiceConnection {
    public Context a;

    public abstract void a(anj arg1);

    @Override  // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName0, IBinder iBinder0) {
        bt bt0;
        if(this.a == null) {
            throw new IllegalStateException("Custom Tabs Service connected before an applicationcontext has been provided.");
        }
        if(iBinder0 == null) {
            bt0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("android.support.customtabs.ICustomTabsService");
            bt0 = iInterface0 == null || !(iInterface0 instanceof bt) ? new bt(iBinder0) : ((bt)iInterface0);
        }
        this.a(new anj(bt0, componentName0));
    }
}

