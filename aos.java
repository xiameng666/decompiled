import android.util.ArrayMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

final class aos extends bhl {
    final Set a;
    final Map b;

    public aos() {
        this.a = new HashSet();
        this.b = new ArrayMap();
    }

    @Override  // bhl
    public final void a(int v) {
        for(Object object0: this.a) {
            bhl bhl0 = (bhl)object0;
            try {
                ((Executor)this.b.get(bhl0)).execute(new aor(bhl0, v));
            }
            catch(RejectedExecutionException rejectedExecutionException0) {
                bcs.b("Camera2CameraControlImp", "Executor rejected to invoke onCaptureCancelled.", rejectedExecutionException0);
            }
        }
    }

    @Override  // bhl
    public final void b(int v, bhv bhv0) {
        for(Object object0: this.a) {
            bhl bhl0 = (bhl)object0;
            try {
                ((Executor)this.b.get(bhl0)).execute(new aoq(bhl0, v, bhv0));
            }
            catch(RejectedExecutionException rejectedExecutionException0) {
                bcs.b("Camera2CameraControlImp", "Executor rejected to invoke onCaptureCompleted.", rejectedExecutionException0);
            }
        }
    }

    @Override  // bhl
    public final void c(int v, bhp bhp0) {
        for(Object object0: this.a) {
            bhl bhl0 = (bhl)object0;
            try {
                ((Executor)this.b.get(bhl0)).execute(new aop(bhl0, v, bhp0));
            }
            catch(RejectedExecutionException rejectedExecutionException0) {
                bcs.b("Camera2CameraControlImp", "Executor rejected to invoke onCaptureFailed.", rejectedExecutionException0);
            }
        }
    }
}

