import android.location.Location;
import android.os.Build.VERSION;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

public final class cjhp {
    public static final Location a(cjhl cjhl0) {
        ibuq.f(cjhl0, "<this>");
        Location location0 = new Location(cjhl0.a);
        jyg.j(location0, cjhl0.b);
        location0.setTime(cjhl0.c);
        location0.setElapsedRealtimeNanos(ibzw.i(cjhl0.d));
        Double double0 = cjhl0.e;
        if(double0 != null) {
            location0.setElapsedRealtimeUncertaintyNanos(double0.doubleValue());
        }
        else if(Build.VERSION.SDK_INT >= 33) {
            location0.removeElapsedRealtimeUncertaintyNanos();
        }
        else if(location0.hasElapsedRealtimeUncertaintyNanos()) {
            location0.setElapsedRealtimeUncertaintyNanos(0.0);
        }
        location0.setLatitude(cjhl0.f);
        location0.setLongitude(cjhl0.g);
        Float float0 = cjhl0.h;
        if(float0 == null) {
            location0.removeAccuracy();
        }
        else {
            location0.setAccuracy(float0.floatValue());
        }
        Double double1 = cjhl0.i;
        if(double1 == null) {
            location0.removeAltitude();
        }
        else {
            location0.setAltitude(double1.doubleValue());
        }
        Float float1 = cjhl0.j;
        if(float1 == null) {
            jyg.i(location0);
        }
        else {
            location0.setVerticalAccuracyMeters(float1.floatValue());
        }
        Float float2 = cjhl0.k;
        if(float2 == null) {
            location0.removeSpeed();
        }
        else {
            location0.setSpeed(float2.floatValue());
        }
        Float float3 = cjhl0.l;
        if(float3 == null) {
            jyg.h(location0);
        }
        else {
            location0.setSpeedAccuracyMetersPerSecond(float3.floatValue());
        }
        Float float4 = cjhl0.m;
        if(float4 == null) {
            location0.removeBearing();
        }
        else {
            location0.setBearing(float4.floatValue());
        }
        Float float5 = cjhl0.n;
        if(float5 == null) {
            jyg.e(location0);
        }
        else {
            location0.setBearingAccuracyDegrees(float5.floatValue());
        }
        Double double2 = cjhl0.o;
        if(double2 == null) {
            jyg.f(location0);
        }
        else {
            double f = (double)double2;
            if(Build.VERSION.SDK_INT >= 34) {
                location0.setMslAltitudeMeters(f);
            }
            else {
                jyg.d(location0).putDouble("androidx.core.location.extra.MSL_ALTITUDE", f);
            }
        }
        Float float6 = cjhl0.p;
        if(float6 == null) {
            jyg.g(location0);
        }
        else {
            jyg.k(location0, float6.floatValue());
        }
        String s = cjhl0.q;
        if(s == null) {
            Bundle bundle1 = location0.getExtras();
            if(bundle1 != null) {
                bundle1.remove("levelId");
            }
        }
        else {
            Bundle bundle0 = location0.getExtras();
            if(bundle0 == null) {
                location0.setExtras(new Bundle());
                bundle0 = location0.getExtras();
                ibuq.c(bundle0);
            }
            bundle0.putString("levelId", s);
        }
        Integer integer0 = cjhl0.r;
        if(integer0 == null) {
            Bundle bundle3 = location0.getExtras();
            if(bundle3 != null) {
                bundle3.remove("levelNumberE3");
            }
        }
        else {
            Bundle bundle2 = location0.getExtras();
            if(bundle2 == null) {
                location0.setExtras(new Bundle());
                bundle2 = location0.getExtras();
                ibuq.c(bundle2);
            }
            bundle2.putInt("levelNumberE3", integer0.intValue());
        }
        String s1 = cjhl0.s;
        if(s1 == null) {
            Bundle bundle5 = location0.getExtras();
            if(bundle5 != null) {
                bundle5.remove("floorLabel");
            }
        }
        else {
            Bundle bundle4 = location0.getExtras();
            if(bundle4 == null) {
                location0.setExtras(new Bundle());
                bundle4 = location0.getExtras();
                ibuq.c(bundle4);
            }
            bundle4.putString("floorLabel", s1);
        }
        Float float7 = cjhl0.t;
        if(float7 == null) {
            Bundle bundle7 = location0.getExtras();
            if(bundle7 != null) {
                bundle7.remove("indoorProbability");
            }
        }
        else {
            Bundle bundle6 = location0.getExtras();
            if(bundle6 == null) {
                location0.setExtras(new Bundle());
                bundle6 = location0.getExtras();
                ibuq.c(bundle6);
            }
            bundle6.putFloat("indoorProbability", float7.floatValue());
        }
        Float float8 = cjhl0.u;
        if(float8 == null) {
            Bundle bundle9 = location0.getExtras();
            if(bundle9 != null) {
                bundle9.remove("outlierProbability");
            }
        }
        else {
            Bundle bundle8 = location0.getExtras();
            if(bundle8 == null) {
                location0.setExtras(new Bundle());
                bundle8 = location0.getExtras();
                ibuq.c(bundle8);
            }
            bundle8.putFloat("outlierProbability", float8.floatValue());
        }
        cjhq cjhq0 = cjhl0.v;
        ibuq.f(cjhq0, "value");
        if(cjhq0 == cjhq.a) {
            Bundle bundle11 = location0.getExtras();
            if(bundle11 != null) {
                bundle11.remove("locationType");
            }
        }
        else {
            Bundle bundle10 = location0.getExtras();
            if(bundle10 == null) {
                location0.setExtras(new Bundle());
                bundle10 = location0.getExtras();
                ibuq.c(bundle10);
            }
            bundle10.putInt("locationType", cjhq0.e);
        }
        Bundle bundle12 = location0.getExtras();
        if(bundle12 != null && bundle12.isEmpty()) {
            location0.setExtras(null);
        }
        return location0;
    }

    public static final cjhl b(Location location0) {
        cjhq cjhq0;
        Float float9;
        Float float8;
        Float float7;
        Integer integer1;
        Integer integer0;
        String s2;
        ibuq.f(location0, "<this>");
        String s = location0.getProvider();
        boolean z = location0.isFromMockProvider();
        long v = location0.getTime();
        long v1 = ibzy.i(location0.getElapsedRealtimeNanos(), ibzz.a);
        Double double0 = location0.hasElapsedRealtimeUncertaintyNanos() ? location0.getElapsedRealtimeUncertaintyNanos() : null;
        double f = location0.getLatitude();
        double f1 = location0.getLongitude();
        Float float0 = location0.hasAccuracy() ? location0.getAccuracy() : null;
        Double double1 = location0.hasAltitude() ? location0.getAltitude() : null;
        Float float1 = location0.hasVerticalAccuracy() ? location0.getVerticalAccuracyMeters() : null;
        Float float2 = location0.hasSpeed() ? location0.getSpeed() : null;
        Float float3 = location0.hasSpeedAccuracy() ? location0.getSpeedAccuracyMetersPerSecond() : null;
        Float float4 = location0.hasBearing() ? location0.getBearing() : null;
        Float float5 = location0.hasBearingAccuracy() ? location0.getBearingAccuracyDegrees() : null;
        Double double2 = jyg.l(location0) ? jyg.a(location0) : null;
        Float float6 = jyg.m(location0) ? jyg.b(location0) : null;
        ibuq.f(location0, "<this>");
        Bundle bundle0 = location0.getExtras();
        String s1 = bundle0 == null ? null : bundle0.getString("levelId");
        ibuq.f(location0, "<this>");
        Bundle bundle1 = location0.getExtras();
        if(bundle1 == null) {
            s2 = s;
            integer0 = null;
        }
        else {
            s2 = s;
            integer0 = bundle1.getInt("levelNumberE3", -1);
        }
        if(integer0 != null && ((int)integer0) == -1) {
            integer0 = null;
        }
        ibuq.f(location0, "<this>");
        Bundle bundle2 = location0.getExtras();
        String s3 = bundle2 == null ? null : bundle2.getString("floorLabel");
        ibuq.f(location0, "<this>");
        Bundle bundle3 = location0.getExtras();
        if(bundle3 == null) {
            integer1 = integer0;
            float7 = null;
        }
        else {
            integer1 = integer0;
            float7 = bundle3.getFloat("indoorProbability", -1.0f);
        }
        if(ibuq.k(float7, -1.0f)) {
            float7 = null;
        }
        ibuq.f(location0, "<this>");
        Bundle bundle4 = location0.getExtras();
        if(bundle4 == null) {
            float8 = float7;
            float9 = null;
        }
        else {
            float8 = float7;
            float9 = bundle4.getFloat("outlierProbability", -1.0f);
        }
        if(ibuq.k(float9, -1.0f)) {
            float9 = null;
        }
        ibuq.f(location0, "<this>");
        Bundle bundle5 = location0.getExtras();
        if(bundle5 == null) {
            cjhq0 = cjhq.a;
        }
        else {
            cjhq0 = cjhq.a;
            switch(bundle5.getInt("locationType", cjhq0.e)) {
                case 0: {
                    break;
                }
                case 1: {
                    cjhq0 = cjhq.b;
                    break;
                }
                case 2: {
                    cjhq0 = cjhq.c;
                    break;
                }
                case 3: {
                    cjhq0 = cjhq.d;
                    break;
                }
                default: {
                    throw new IllegalArgumentException();
                }
            }
            if(cjhq0 == null) {
                cjhq0 = cjhq.a;
            }
        }
        super(s2, z, v, v1, double0, f, f1, float0, double1, float1, float2, float3, float4, float5, double2, float6, s1, integer1, s3, float8, float9, cjhq0);
        return null;
    }

    public static final List c(List list0) {
        ibuq.f(list0, "<this>");
        List list1 = new ArrayList(ibpo.q(list0, 10));
        for(Object object0: list0) {
            list1.add(cjhp.a(((cjhl)object0)));
        }
        return list1;
    }

    public static final List d(List list0) {
        ibuq.f(list0, "<this>");
        List list1 = new ArrayList(ibpo.q(list0, 10));
        for(Object object0: list0) {
            list1.add(cjhp.b(((Location)object0)));
        }
        return list1;
    }
}

