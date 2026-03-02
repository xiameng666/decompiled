import com.google.location.nearby.direct.service.NearbyDirectChimeraService;
import j..util.Objects;

public final class gyln extends gxum {
    final NearbyDirectChimeraService a;

    public gyln(NearbyDirectChimeraService nearbyDirectChimeraService0) {
        Objects.requireNonNull(nearbyDirectChimeraService0);
        this.a = nearbyDirectChimeraService0;
        super("StopBackgroundThread");
    }

    @Override
    public final void run() {
        this.a.a.getLooper().quit();
    }
}

