import android.os.Handler;
import android.os.HandlerThread;
import android.view.Window.OnFrameMetricsAvailableListener;
import android.view.Window;
import java.util.HashSet;
import java.util.Set;

public final class gayq extends gaxs {
    final Set a;
    final Set b;
    final boolean c;
    public Window.OnFrameMetricsAvailableListener d;
    final gatj e;
    private final HandlerThread f;
    private Handler g;

    public gayq(gatj gatj0) {
        this.f = new HandlerThread("frame-metrics");
        this.g = null;
        this.a = new HashSet(3);
        this.b = new HashSet(3);
        this.e = gatj0;
        boolean z = gayr.a();
        this.c = z;
        if(z) {
            this.d = new gayp(this);
        }
    }

    public final void a(Window window0) {
        if(this.c) {
            synchronized(this) {
                Set set0 = this.b;
                if(set0.contains(window0)) {
                    window0.removeOnFrameMetricsAvailableListener(this.d);
                    set0.remove(window0);
                }
            }
        }
    }

    public final void b(Window window0) {
        if(this.c) {
            synchronized(this) {
                Set set0 = this.b;
                if(!set0.contains(window0)) {
                    if(this.g == null) {
                        this.f.start();
                        this.g = new clht(this.f.getLooper());
                    }
                    window0.addOnFrameMetricsAvailableListener(this.d, this.g);
                    set0.add(window0);
                }
            }
        }
    }

    @Override  // gaxs
    protected final void lv() {
        Window window0 = this.e.b.getWindow();
        if(window0 != null) {
            this.a(window0);
        }
    }

    @Override  // gaxs
    protected final void lw() {
        Window window0 = this.e.b.getWindow();
        if(window0 != null) {
            this.b(window0);
        }
    }
}

