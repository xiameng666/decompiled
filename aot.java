import android.hardware.camera2.TotalCaptureResult;
import java.util.HashSet;
import java.util.Set;

public final class aot implements Runnable {
    public final aou a;
    public final TotalCaptureResult b;

    public aot(aou aou0, TotalCaptureResult totalCaptureResult0) {
        this.a = aou0;
        this.b = totalCaptureResult0;
    }

    @Override
    public final void run() {
        HashSet hashSet0 = new HashSet();
        Set set0 = this.a.a;
        for(Object object0: set0) {
            aov aov0 = (aov)object0;
            if(aov0.a(this.b)) {
                hashSet0.add(aov0);
            }
        }
        if(!hashSet0.isEmpty()) {
            set0.removeAll(hashSet0);
        }
    }
}

