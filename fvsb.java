import android.location.Location;

public final class fvsb {
    public static boolean a(Location location0) {
        return "gps".equals(location0.getProvider()) && location0.getExtras() != null && location0.getExtras().getInt("SourceType") == 0x80;
    }

    public static boolean b(double f, double f1) {
        if(Double.compare(f, 0.0) == 0) {
            return f1 == 0.0 ? false : f >= -90.0 && f <= 90.0 && f1 >= -180.0 && f1 <= 180.0;
        }
        return f >= -90.0 && f <= 90.0 && f1 >= -180.0 && f1 <= 180.0;
    }

    public static gwtr c(Location location0, int v, long v1) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gwtr.a).v_newBuilder();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gwtn.a).v_newBuilder();
        int v2 = GeoMath.l(location0.getLatitude());
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gwtn gwtn0 = (gwtn)hftp1.b_message;
        gwtn0.b |= 1;
        gwtn0.c = v2;
        int v3 = GeoMath.l(location0.getLongitude());
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gwtn gwtn1 = (gwtn)hftp1.b_message;
        gwtn1.b |= 2;
        gwtn1.d = v3;
        gwtn gwtn2 = (gwtn)hftp1.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        gwtn2.getClass();
        ((gwtr)hftv0).c = gwtn2;
        ((gwtr)hftv0).b |= 1;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((gwtr)hftv1).f = v - 1;
        ((gwtr)hftv1).b |= 0x40;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        gwtr gwtr0 = (gwtr)hftp0.b_message;
        gwtr0.b |= 16;
        gwtr0.e = v1;
        if(location0.hasAccuracy()) {
            int v4 = (int)location0.getAccuracy();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gwtr gwtr1 = (gwtr)hftp0.b_message;
            gwtr1.b |= 4;
            gwtr1.d = v4;
        }
        if(location0.hasAltitude()) {
            int v5 = (int)location0.getAltitude();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gwtr gwtr2 = (gwtr)hftp0.b_message;
            gwtr2.b |= 0x100;
            gwtr2.g = v5;
            float f = (float)location0.getAltitude();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gwtr gwtr3 = (gwtr)hftp0.b_message;
            gwtr3.b |= 0x100000;
            gwtr3.l = f;
        }
        if(location0.hasBearing()) {
            int v6 = (int)location0.getBearing();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gwtr gwtr4 = (gwtr)hftp0.b_message;
            gwtr4.b |= 0x800;
            gwtr4.i = v6;
        }
        if(location0.hasSpeed()) {
            float f1 = location0.getSpeed();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gwtr gwtr5 = (gwtr)hftp0.b_message;
            gwtr5.b |= 0x4000;
            gwtr5.j = f1;
        }
        if(v == 6 && location0.hasVerticalAccuracy()) {
            int v7 = (int)location0.getVerticalAccuracyMeters();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gwtr gwtr6 = (gwtr)hftp0.b_message;
            gwtr6.b |= 0x200;
            gwtr6.h = v7;
        }
        Float float0 = cmol.g(location0);
        if(float0 != null) {
            float f2 = (float)float0;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gwtr gwtr7 = (gwtr)hftp0.b_message;
            gwtr7.b |= 0x200000;
            gwtr7.m = f2;
        }
        Float float1 = cmol.f(location0);
        if(float1 != null) {
            float f3 = (float)float1;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gwtr gwtr8 = (gwtr)hftp0.b_message;
            gwtr8.b |= 0x400000;
            gwtr8.n = f3;
        }
        return (gwtr)hftp0.N_build();
    }
}

