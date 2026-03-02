import com.google.android.gms.nearby.presence.DiscoveryDevice;
import com.google.android.gms.nearby.presence.RangingData;

public final class ctui extends darq {
    @Override  // darq
    public final void a() {
    }

    @Override  // darq
    public final void b(DiscoveryDevice discoveryDevice0, RangingData rangingData0) {
        ibuq.f(discoveryDevice0, "device");
        ibuq.f(rangingData0, "rangingData");
    }

    @Override  // darq
    public final void c(DiscoveryDevice discoveryDevice0) {
        ibuq.f(discoveryDevice0, "device");
    }
}

