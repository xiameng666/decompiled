import android.location.Location;

public final class gzwx {
    public static fxbv a(Location location0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)fxbv.a).v_newBuilder();
        double f = location0.getLatitude();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((fxbv)hftp0.b_message).b = f;
        double f1 = location0.getLongitude();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((fxbv)hftp0.b_message).c = f1;
        long v = location0.getTime();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((fxbv)hftp0.b_message).k = v;
        long v1 = location0.getElapsedRealtimeNanos();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((fxbv)hftp0.b_message).l = v1;
        if(location0.hasAccuracy()) {
            double f2 = location0.getAltitude();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((fxbv)hftp0.b_message).d = f2;
        }
        if(location0.hasSpeed()) {
            float f3 = location0.getSpeed();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((fxbv)hftp0.b_message).e = f3;
        }
        if(location0.hasBearing()) {
            float f4 = location0.getBearing();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((fxbv)hftp0.b_message).f = f4;
        }
        if(location0.hasAccuracy()) {
            float f5 = location0.getAccuracy();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((fxbv)hftp0.b_message).g = f5;
        }
        if(location0.hasVerticalAccuracy()) {
            float f6 = location0.getVerticalAccuracyMeters();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((fxbv)hftp0.b_message).h = f6;
        }
        if(location0.hasSpeedAccuracy()) {
            float f7 = location0.getSpeedAccuracyMetersPerSecond();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((fxbv)hftp0.b_message).i = f7;
        }
        if(location0.hasBearingAccuracy()) {
            float f8 = location0.getBearingAccuracyDegrees();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((fxbv)hftp0.b_message).j = f8;
        }
        if(location0.hasElapsedRealtimeUncertaintyNanos()) {
            double f9 = location0.getElapsedRealtimeUncertaintyNanos();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((fxbv)hftp0.b_message).m = f9;
        }
        return (fxbv)hftp0.N_build();
    }
}

