import android.location.LocationRequest.Builder;
import android.location.LocationRequest;

public final class jyn {
    public static LocationRequest a(jyp jyp0) {
        return new LocationRequest.Builder(jyp0.b).setQuality(jyp0.a).setMinUpdateIntervalMillis(jyp0.a()).setDurationMillis(jyp0.d).setMaxUpdates(jyp0.e).setMinUpdateDistanceMeters(0.0f).setMaxUpdateDelayMillis(jyp0.g).build();
    }
}

