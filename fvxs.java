import android.location.Location;
import android.util.Log;

public final class fvxs {
    public static gptu_Position a(Location location0) {
        if(location0 == null) {
            return null;
        }
        gptt_LocationType gptt0 = gptt_LocationType.UNKNOWN;
        String s = location0.getProvider();
        if("gps".equals(s)) {
            gptt0 = gptt_LocationType.GPS;
        }
        else if("network".equals(s)) {
            String s1 = hedj.c(location0);
            if("cell".equals(s1)) {
                gptt0 = gptt_LocationType.CELL;
            }
            else if("wifi".equals(s1)) {
                gptt0 = gptt_LocationType.WIFI;
            }
            else {
                Log.w("GCoreFlp", "Network provider location has an unexpected type " + s1);
            }
        }
        else if("gps_injected".equals(s)) {
            gptt0 = gptt_LocationType.GPS_INJECTED;
        }
        PositionBuilder gptr0 = new PositionBuilder();
        gptr0.h(location0.getLatitude(), location0.getLongitude(), Math.round(location0.getAccuracy() * 1000.0f));
        gptr0.provider = gptt0;
        if(location0.hasBearing()) {
            gptr0.e(((float)(((int)location0.getBearing()))));
        }
        if(location0.hasBearingAccuracy()) {
            gptr0.d(location0.getBearingAccuracyDegrees());
        }
        if(location0.hasSpeedAccuracy()) {
            gptr0.j(location0.getSpeedAccuracyMetersPerSecond());
        }
        if(location0.hasAltitude()) {
            gptr0.c(location0.getAltitude());
        }
        if(location0.hasSpeed()) {
            gptr0.k(location0.getSpeed());
        }
        if(location0.hasVerticalAccuracy()) {
            gptr0.l(((double)location0.getVerticalAccuracyMeters()));
        }
        else if(location0.hasAltitude() && gptt0 == gptt_LocationType.GPS) {
            float f = location0.getAccuracy();
            gptr0.l(((double)(f + f)));
        }
        String s2 = cmol.j(location0);
        if(s2 != null) {
            gptr0.f(s2);
        }
        gptr0.levelId = cmol.k(location0);
        Float float0 = cmol.d(location0);
        if(float0 != null) {
            gptr0.g(float0.floatValue());
        }
        Float float1 = cmol.e(location0);
        if(float1 != null) {
            float f1 = (float)float1;
            if(f1 < 0.0f || f1 > 1.0f) {
                throw new IllegalArgumentException();
            }
            gptr0.outlierProbability = f1;
            gptr0.mask |= 0x400;
        }
        Float float2 = cmol.g(location0);
        if(float2 != null) {
            gptr0.n(float2.floatValue());
        }
        Float float3 = cmol.f(location0);
        if(float3 != null) {
            gptr0.m(float3.floatValue());
        }
        return new gptu_Position(gptr0);
    }
}

