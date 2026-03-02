import com.google.android.location.quake.SeismicMonitor;
import j..util.Optional;
import java.util.function.Supplier;

public final class fxgk implements Supplier {
    public final fxek a;

    public fxgk(fxek fxek0) {
        this.a = fxek0;
    }

    @Override
    public final Object get() {
        SeismicMonitor seismicMonitor0 = this.a.a;
        return seismicMonitor0 == null ? Optional.empty() : seismicMonitor0.c;
    }
}

