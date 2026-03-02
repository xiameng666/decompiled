import android.hardware.camera2.TotalCaptureResult;
import java.util.ArrayList;

final class ard implements arg {
    final arf a;

    public ard(arf arf0) {
        this.a = arf0;
        super();
    }

    @Override  // arg
    public final gmcd a(TotalCaptureResult totalCaptureResult0) {
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: this.a.i) {
            arrayList0.add(((arg)object0).a(totalCaptureResult0));
        }
        return bpt.f(bpt.a(arrayList0), new arc(), bol.a());
    }

    @Override  // arg
    public final void b() {
        for(Object object0: this.a.i) {
            ((arg)object0).b();
        }
    }

    @Override  // arg
    public final boolean c() {
        for(Object object0: this.a.i) {
            if(((arg)object0).c()) {
                return true;
            }
        }
        return false;
    }
}

