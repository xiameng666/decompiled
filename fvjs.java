import android.location.Location;

public final class fvjs {
    public static fvbv a(Location location0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)fvbv.a).v_newBuilder();
        double f = location0.getLatitude();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        fvbv fvbv0 = (fvbv)hftp0.b_message;
        fvbv0.b |= 1;
        fvbv0.c = f;
        double f1 = location0.getLongitude();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        fvbv fvbv1 = (fvbv)hftp0.b_message;
        fvbv1.b |= 2;
        fvbv1.d = f1;
        float f2 = location0.getAccuracy();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        fvbv fvbv2 = (fvbv)hftp0.b_message;
        fvbv2.b |= 4;
        fvbv2.e = f2;
        double f3 = location0.getAltitude();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        fvbv fvbv3 = (fvbv)hftp0.b_message;
        fvbv3.b |= 8;
        fvbv3.f = f3;
        float f4 = location0.getBearingAccuracyDegrees();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        fvbv fvbv4 = (fvbv)hftp0.b_message;
        fvbv4.b |= 0x20;
        fvbv4.h = f4;
        float f5 = location0.getBearing();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        fvbv fvbv5 = (fvbv)hftp0.b_message;
        fvbv5.b |= 16;
        fvbv5.g = f5;
        long v = location0.getElapsedRealtimeNanos();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        fvbv fvbv6 = (fvbv)hftp0.b_message;
        fvbv6.b |= 0x40;
        fvbv6.i = v;
        String s = location0.getProvider();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        fvbv fvbv7 = (fvbv)hftp0.b_message;
        s.getClass();
        fvbv7.b |= 0x1000;
        fvbv7.n = s;
        float f6 = location0.getSpeedAccuracyMetersPerSecond();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        fvbv fvbv8 = (fvbv)hftp0.b_message;
        fvbv8.b |= 0x200;
        fvbv8.k = f6;
        float f7 = location0.getSpeed();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        fvbv fvbv9 = (fvbv)hftp0.b_message;
        fvbv9.b |= 0x100;
        fvbv9.j = f7;
        long v1 = location0.getTime();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        fvbv fvbv10 = (fvbv)hftp0.b_message;
        fvbv10.b |= 0x400;
        fvbv10.l = v1;
        float f8 = location0.getVerticalAccuracyMeters();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        fvbv fvbv11 = (fvbv)hftp0.b_message;
        fvbv11.b |= 0x800;
        fvbv11.m = f8;
        return (fvbv)hftp0.N_build();
    }
}

