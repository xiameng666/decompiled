import android.location.Location;
import java.util.concurrent.TimeUnit;

public final class ehuo {
    public static float a(ehup ehup0, ehup ehup1) {
        return ehuo.b(ehup0).distanceTo(ehuo.b(ehup1));
    }

    public static Location b(ehup ehup0) {
        Location location0 = new Location(ehup0.e);
        location0.setLatitude(ehup0.f);
        location0.setLongitude(ehup0.g);
        location0.setAccuracy(ehup0.h);
        location0.setTime(ehup0.a);
        location0.setElapsedRealtimeNanos(TimeUnit.MILLISECONDS.toNanos(ehup0.d));
        Double double0 = ehup0.i;
        if(double0 != null) {
            location0.setAltitude(double0.doubleValue());
        }
        Float float0 = ehup0.j;
        if(float0 != null) {
            location0.setVerticalAccuracyMeters(float0.floatValue());
        }
        return location0;
    }

    public static ehup c(Location location0, long v, long v1) {
        long v2 = location0.getTime();
        long v3 = TimeUnit.NANOSECONDS.toMillis(location0.getElapsedRealtimeNanos());
        String s = location0.getProvider();
        double f = location0.getLongitude();
        double f1 = location0.getLatitude();
        float f2 = location0.getAccuracy();
        Float float0 = null;
        Double double0 = location0.hasAltitude() ? location0.getAltitude() : null;
        if(location0.hasVerticalAccuracy()) {
            float0 = location0.getVerticalAccuracyMeters();
        }
        return new ehup(v2, v1, v, v3, s, f1, f, f2, double0, float0);
    }
}

