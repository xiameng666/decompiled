import android.content.ComponentName;
import java.lang.ref.WeakReference;

public final class ifwa extends anm {
    private final WeakReference b;

    public ifwa(ifwb ifwb0) {
        this.b = new WeakReference(ifwb0);
    }

    @Override  // anm
    public final void a(anj anj0) {
        ifwb ifwb0 = (ifwb)this.b.get();
        if(ifwb0 != null) {
            ifwb0.a(anj0);
        }
    }

    @Override  // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName0) {
        ifwb ifwb0 = (ifwb)this.b.get();
        if(ifwb0 != null) {
            ifwb0.b();
        }
    }
}

