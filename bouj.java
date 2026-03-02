import android.content.Intent;
import java.util.concurrent.atomic.AtomicReference;

public final class bouj implements gfsi {
    public final boul a;
    public final AtomicReference b;

    public bouj(boul boul0, AtomicReference atomicReference0) {
        this.a = boul0;
        this.b = atomicReference0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        Void void0 = (Void)object0;
        AtomicReference atomicReference0 = this.b;
        if(((fqxd)atomicReference0.get()).b()) {
            Intent intent0 = new Intent("com.google.android.gms.findmydevice.spot.OPT_IN_STATE_CHANGES").setPackage("com.google.android.apps.adm");
            baif.a(this.a.i.a, intent0);
        }
        return (fqxd)atomicReference0.get();
    }
}

