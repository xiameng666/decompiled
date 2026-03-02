import com.google.android.gms.smartdevice.d2d.metrics.SourceLogManager;
import java.util.concurrent.TimeUnit;

public final class erkh implements Runnable {
    public final SourceLogManager a;
    public final long b;

    public erkh(SourceLogManager sourceLogManager0, long v) {
        this.a = sourceLogManager0;
        this.b = v;
    }

    @Override
    public final void run() {
        ayud ayud0 = this.a.f;
        if(ayud0 != null) {
            ayud0.e(this.b, TimeUnit.MILLISECONDS);
        }
    }
}

