import android.view.FrameMetrics;
import android.view.Window.OnFrameMetricsAvailableListener;
import android.view.Window;
import j..util.Objects;

final class gayp implements Window.OnFrameMetricsAvailableListener {
    final gayq a;

    public gayp(gayq gayq0) {
        Objects.requireNonNull(gayq0);
        this.a = gayq0;
        super();
    }

    @Override  // android.view.Window$OnFrameMetricsAvailableListener
    public final void onFrameMetricsAvailable(Window window0, FrameMetrics frameMetrics0, int v) {
        synchronized(this) {
            for(Object object0: this.a.a) {
                gayo gayo0 = (gayo)object0;
                if(gayo0.e) {
                    synchronized(gayo0) {
                        if(gayo0.f) {
                            if(gayo0.d < 0 || gayo0.d > gayo0.c.size()) {
                                FrameMetrics frameMetrics1 = new FrameMetrics(frameMetrics0);
                                gayo0.c.add(frameMetrics1);
                            }
                            if(gayo0.d >= 0 && gayo0.d <= gayo0.c.size()) {
                                gayo0.d();
                            }
                        }
                    }
                }
            }
        }
    }
}

