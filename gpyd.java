import j..util.DesugarArrays;
import j..util.Objects;
import j..util.stream.Collector;
import j..util.stream.Stream;
import java.util.List;

public final class gpyd {
    public static final ggeo a;
    public static final ggdp b;
    public static final ggdp c;
    public static final ggdp d;
    public static final ggdp e;

    static {
        ggek ggek0 = new ggek();
        ggek0.i(gptt_LocationType.GPS, gvxv.ah);
        ggek0.i(gptt_LocationType.GPS_INJECTED, gvxv.ak);
        ggek0.i(gptt_LocationType.WIFI, gvxv.ai);
        ggek0.i(gptt_LocationType.CELL, gvxv.aj);
        ggek0.i(gptt_LocationType.CELL_WITH_NEIGHBORS, gvxv.aj);
        gpyd.a = ggek0.b();
        ggdn ggdn0 = new ggdn();
        ggdn0.d(gptt_LocationType.UNKNOWN, gvxt.a);
        ggdn0.d(gptt_LocationType.GPS, gvxt.b);
        ggdn0.d(gptt_LocationType.WIFI, gvxt.c);
        ggdn0.d(gptt_LocationType.CELL, gvxt.d);
        ggdn0.d(gptt_LocationType.GPS_INJECTED, gvxt.e);
        ggdn0.d(gptt_LocationType.CELL_WITH_NEIGHBORS, gvxt.f);
        gpyd.b = ggdn0.a();
        ggdn ggdn1 = new ggdn();
        ggdn1.d(gpts_PositionProvider.UNKNOWN, gvxr.a);
        ggdn1.d(gpts_PositionProvider.ECHO_GPS, gvxr.b);
        ggdn1.d(gpts_PositionProvider.ECHO_CELL, gvxr.d);
        ggdn1.d(gpts_PositionProvider.ECHO_WIFI, gvxr.c);
        ggdn1.d(gpts_PositionProvider.GPS_WIFI, gvxr.e);
        ggdn1.d(gpts_PositionProvider.GPS_WIFI_GPS, gvxr.f);
        ggdn1.d(gpts_PositionProvider.PARTICLE_FILTER, gvxr.g);
        ggdn1.d(gpts_PositionProvider.INJECTION_FUSION, gvxr.h);
        gpyd.c = ggdn1.a();
        ggdn ggdn2 = new ggdn();
        ggdn2.d(motionState.UNKNOWN, gvtp.l);
        ggdn2.d(motionState.STILL, gvtp.k);
        ggdn2.d(motionState.ON_FOOT, gvtp.o);
        ggdn2.d(motionState.ON_BICYCLE, gvtp.e);
        ggdn2.d(motionState.IN_VEHICLE, gvtp.a);
        ggdn2.a();
        ggdn ggdn3 = new ggdn();
        ggdn3.d(fuxh.e, gvtp.l);
        ggdn3.d(fuxh.d, gvtp.k);
        ggdn3.d(fuxh.c, gvtp.o);
        ggdn3.d(fuxh.b, gvtp.e);
        ggdn3.d(fuxh.a, gvtp.a);
        ggdn3.d(fuxh.h, gvtp.i);
        ggdn3.d(fuxh.i, gvtp.j);
        ggdn3.d(fuxh.q, gvtp.m);
        ggdn3.d(fuxh.r, gvtp.n);
        ggdn3.d(fuxh.f, gvtp.p);
        ggdn3.d(fuxh.j, gvtp.q);
        ggdn3.d(fuxh.p, gvtp.r);
        ggdn3.d(fuxh.s, gvtp.s);
        ggdn3.d(fuxh.t, gvtp.t);
        ggdn3.d(fuxh.u, gvtp.u);
        ggdn3.d(fuxh.v, gvtp.v);
        ggdn3.d(fuxh.w, gvtp.w);
        ggdn3.d(fuxh.g, gvtp.d);
        gpyd.d = ggdn3.a();
        ggag.a("GNSS-WiFi-Fusion", gvvz.b);
        ggag.a("GnssWifi-Cell-Fusion", gvvz.c);
        gpyd.e = new ggmz(new Object[]{"GNSS-WiFi-Fusion", gvvz.b, "GnssWifi-Cell-Fusion", gvvz.c}, 2);
    }

    public static gged_interceptors a(Long long0, Long long1, boolean z, boolean z1, boolean z2, boolean z3) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gvyu.a).v_newBuilder();
        if(long0 == null) {
            long0 = null;
        }
        else {
            long v = (long)long0;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gvyu gvyu0 = (gvyu)hftp0.b_message;
            gvyu0.b |= 2;
            gvyu0.d = v;
        }
        if(long1 == null) {
            long1 = long0;
        }
        else {
            long v1 = (long)long1;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gvyu gvyu1 = (gvyu)hftp0.b_message;
            gvyu1.b |= 4;
            gvyu1.e = v1;
        }
        if(long1 != null) {
            long v2 = (long)long1;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gvyu gvyu2 = (gvyu)hftp0.b_message;
            gvyu2.b |= 1;
            gvyu2.c = v2;
        }
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((gvyu)hftv0).f = 18;
        ((gvyu)hftv0).b |= 8;
        int v3 = gpyd.p(z);
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gvyu)hftp0.b_message).g = v3 - 1;
        ((gvyu)hftp0.b_message).b |= 16;
        gvyu gvyu3 = (gvyu)hftp0.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((gvyu)hftv1).f = 19;
        ((gvyu)hftv1).b |= 8;
        int v4 = gpyd.p(z1);
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gvyu)hftp0.b_message).g = v4 - 1;
        ((gvyu)hftp0.b_message).b |= 16;
        gvyu gvyu4 = (gvyu)hftp0.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp0.b_message;
        ((gvyu)hftv2).f = 22;
        ((gvyu)hftv2).b |= 8;
        int v5 = gpyd.p(z2);
        if(!hftv2.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gvyu)hftp0.b_message).g = v5 - 1;
        ((gvyu)hftp0.b_message).b |= 16;
        gvyu gvyu5 = (gvyu)hftp0.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv3 = hftp0.b_message;
        ((gvyu)hftv3).f = 20;
        ((gvyu)hftv3).b |= 8;
        int v6 = gpyd.p(z3);
        if(!hftv3.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gvyu)hftp0.b_message).g = v6 - 1;
        ((gvyu)hftp0.b_message).b |= 16;
        return gged_interceptors.o(gvyu3, gvyu4, gvyu5, ((gvyu)hftp0.N_build()));
    }

    public static gvxw b(Long long0, Long long1, float f) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gvxw.a).v_newBuilder();
        gvxv gvxv0 = gvxv.am;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((gvxw)hftv0).f = gvxv0.aX;
        ((gvxw)hftv0).b |= 8;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        gvxw gvxw0 = (gvxw)hftp0.b_message;
        gvxw0.b |= 0x80;
        gvxw0.j = f;
        if(long0 == null) {
            long0 = null;
        }
        else {
            long v = (long)long0;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gvxw gvxw1 = (gvxw)hftp0.b_message;
            gvxw1.b |= 2;
            gvxw1.d = v;
        }
        if(long1 == null) {
            long1 = long0;
        }
        else {
            long v1 = (long)long1;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gvxw gvxw2 = (gvxw)hftp0.b_message;
            gvxw2.b |= 4;
            gvxw2.e = v1;
        }
        if(long1 != null) {
            long v2 = (long)long1;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gvxw gvxw3 = (gvxw)hftp0.b_message;
            gvxw3.b |= 1;
            gvxw3.c = v2;
        }
        return (gvxw)hftp0.N_build();
    }

    public static gvxw c(Long long0, Long long1, Long long2, gvxv gvxv0, gptu_Position gptu0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gvxw.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gvxw)hftp0.b_message).f = gvxv0.aX;
        ((gvxw)hftp0.b_message).b |= 8;
        if(long0 != null) {
            long v = (long)long0;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gvxw gvxw0 = (gvxw)hftp0.b_message;
            gvxw0.b |= 1;
            gvxw0.c = v;
        }
        if(long1 != null) {
            long v1 = (long)long1;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gvxw gvxw1 = (gvxw)hftp0.b_message;
            gvxw1.b |= 2;
            gvxw1.d = v1;
        }
        if(long2 != null) {
            long v2 = (long)long2;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gvxw gvxw2 = (gvxw)hftp0.b_message;
            gvxw2.b |= 4;
            gvxw2.e = v2;
        }
        if(gptu0 != null) {
            ggdp ggdp0 = gpyd.b;
            gptt_LocationType gptt0 = gptu0.provider;
            if(ggdp0.containsKey(gptt0)) {
                gvxt gvxt0 = (gvxt)ggdp0.get(gptt0);
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((gvxw)hftp0.b_message).u = gvxt0.g;
                ((gvxw)hftp0.b_message).b |= 0x40000;
            }
            gpts_PositionProvider gpts0 = gptu0.flpSensorFusion;
            ggdp ggdp1 = gpyd.c;
            if(ggdp1.containsKey(gpts0)) {
                gvxr gvxr0 = (gvxr)ggdp1.get(gpts0);
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((gvxw)hftp0.b_message).v = gvxr0.i;
                ((gvxw)hftp0.b_message).b |= 0x80000;
            }
            if(gptu0.l()) {
                int v3 = gptu0.latE7;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv0 = hftp0.b_message;
                ((gvxw)hftv0).b |= 16;
                ((gvxw)hftv0).g = v3;
                int v4 = gptu0.lngE7;
                if(!hftv0.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv1 = hftp0.b_message;
                ((gvxw)hftv1).b |= 0x20;
                ((gvxw)hftv1).h = v4;
                int v5 = gptu0.accuracyMm;
                if(!hftv1.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gvxw gvxw3 = (gvxw)hftp0.b_message;
                gvxw3.b |= 0x40;
                gvxw3.i = v5;
            }
            if(gptu0.n()) {
                float f = gptu0.speedMps;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gvxw gvxw4 = (gvxw)hftp0.b_message;
                gvxw4.b |= 0x80;
                gvxw4.j = f;
            }
            if(gptu0.o()) {
                float f1 = gptu0.speedAccuracyMps;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gvxw gvxw5 = (gvxw)hftp0.b_message;
                gvxw5.b |= 0x2000;
                gvxw5.p = f1;
            }
            if(gptu0.i()) {
                float f2 = gptu0.bearingDegrees;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gvxw gvxw6 = (gvxw)hftp0.b_message;
                gvxw6.b |= 0x400;
                gvxw6.m = f2;
            }
            if(gptu0.j()) {
                float f3 = gptu0.bearingAccuracyDegrees;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gvxw gvxw7 = (gvxw)hftp0.b_message;
                gvxw7.b |= 0x4000;
                gvxw7.q = f3;
            }
            if(gptu0.h()) {
                double f4 = gptu0.altitudeMeters;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gvxw gvxw8 = (gvxw)hftp0.b_message;
                gvxw8.b |= 0x100;
                gvxw8.k = (float)f4;
            }
            if(gptu0.p()) {
                double f5 = gptu0.verticalAccuracyMeters;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gvxw gvxw9 = (gvxw)hftp0.b_message;
                gvxw9.b |= 0x800;
                gvxw9.n = (int)(f5 * 1000.0);
            }
            int v6 = gptu0.bitmask;
            if((v6 & 0x800) != 0) {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gvxw gvxw10 = (gvxw)hftp0.b_message;
                gvxw10.b |= 0x200;
                gvxw10.l = 0.0;
            }
            if((v6 & 0x1000) != 0) {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gvxw gvxw11 = (gvxw)hftp0.b_message;
                gvxw11.b |= 0x1000;
                gvxw11.o = 0.0f;
            }
            if(gptu0.k()) {
                float f6 = gptu0.indoorProbability;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gvxw gvxw12 = (gvxw)hftp0.b_message;
                gvxw12.b |= 0x8000;
                gvxw12.r = f6;
            }
            String s = gptu0.floorLabel;
            if(s != null) {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gvxw gvxw13 = (gvxw)hftp0.b_message;
                gvxw13.b |= 0x10000;
                gvxw13.s = s;
            }
            String s1 = gptu0.levelId;
            if(s1 != null) {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gvxw gvxw14 = (gvxw)hftp0.b_message;
                gvxw14.b |= 0x20000;
                gvxw14.t = s1;
            }
            if(gptu0.r()) {
                float f7 = gptu0.weatherAltitudeMeters;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gvxw gvxw15 = (gvxw)hftp0.b_message;
                gvxw15.b |= 0x100000;
                gvxw15.w = f7;
            }
            if(gptu0.q()) {
                float f8 = gptu0.weatherAltitudeAccuracyMeters;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gvxw gvxw16 = (gvxw)hftp0.b_message;
                gvxw16.b |= 0x200000;
                gvxw16.x = f8;
            }
        }
        return (gvxw)hftp0.N_build();
    }

    public static gvyx d(Long long0, Long long1, int v) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gvyx.a).v_newBuilder();
        gvyw gvyw0 = (gvyw)Objects.requireNonNull(gvyw.b(v));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gvyx)hftp0.b_message).f = gvyw0.n;
        ((gvyx)hftp0.b_message).b |= 8;
        if(long0 == null) {
            long0 = null;
        }
        else {
            long v1 = (long)long0;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gvyx gvyx0 = (gvyx)hftp0.b_message;
            gvyx0.b |= 2;
            gvyx0.d = v1;
        }
        if(long1 == null) {
            long1 = long0;
        }
        else {
            long v2 = (long)long1;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gvyx gvyx1 = (gvyx)hftp0.b_message;
            gvyx1.b |= 4;
            gvyx1.e = v2;
        }
        if(long1 != null) {
            long v3 = (long)long1;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gvyx gvyx2 = (gvyx)hftp0.b_message;
            gvyx2.b |= 1;
            gvyx2.c = v3;
        }
        return (gvyx)hftp0.N_build();
    }

    public static gwbu e(long v, Long long0, long v1, float f, float f1, long v2) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gwbu.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((gwbu)hftv0).e = 1;
        ((gwbu)hftv0).b |= 8;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((gwbu)hftv1).b |= 0x100;
        ((gwbu)hftv1).j = v;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp0.b_message;
        ((gwbu)hftv2).b |= 0x40;
        ((gwbu)hftv2).h = v1;
        if(!hftv2.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv3 = hftp0.b_message;
        ((gwbu)hftv3).b |= 16;
        ((gwbu)hftv3).f = f;
        if(!hftv3.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv4 = hftp0.b_message;
        ((gwbu)hftv4).b |= 0x20;
        ((gwbu)hftv4).g = f1;
        if(!hftv4.isImmutable()) {
            hftp0.ensureMutable();
        }
        gwbu gwbu0 = (gwbu)hftp0.b_message;
        gwbu0.b |= 0x80;
        gwbu0.i = v2;
        if(long0 != null) {
            long v3 = (long)long0;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gwbu gwbu1 = (gwbu)hftp0.b_message;
            gwbu1.b |= 1;
            gwbu1.c = v3;
            long v4 = (long)long0;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gwbu gwbu2 = (gwbu)hftp0.b_message;
            gwbu2.b |= 4;
            gwbu2.d = v4;
        }
        return (gwbu)hftp0.N_build();
    }

    public static gged_interceptors f(Long long0, Long long1, boolean z, boolean z1, boolean z2, boolean z3) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gvyu.a).v_newBuilder();
        if(long0 == null) {
            long0 = null;
        }
        else {
            long v = (long)long0;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gvyu gvyu0 = (gvyu)hftp0.b_message;
            gvyu0.b |= 2;
            gvyu0.d = v;
        }
        if(long1 == null) {
            long1 = long0;
        }
        else {
            long v1 = (long)long1;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gvyu gvyu1 = (gvyu)hftp0.b_message;
            gvyu1.b |= 4;
            gvyu1.e = v1;
        }
        if(long1 != null) {
            long v2 = (long)long1;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gvyu gvyu2 = (gvyu)hftp0.b_message;
            gvyu2.b |= 1;
            gvyu2.c = v2;
        }
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((gvyu)hftv0).f = 7;
        ((gvyu)hftv0).b |= 8;
        int v3 = gpyd.p(z);
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gvyu)hftp0.b_message).g = v3 - 1;
        ((gvyu)hftp0.b_message).b |= 16;
        gvyu gvyu3 = (gvyu)hftp0.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((gvyu)hftv1).f = 8;
        ((gvyu)hftv1).b |= 8;
        int v4 = gpyd.p(z1);
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gvyu)hftp0.b_message).g = v4 - 1;
        ((gvyu)hftp0.b_message).b |= 16;
        gvyu gvyu4 = (gvyu)hftp0.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp0.b_message;
        ((gvyu)hftv2).f = 9;
        ((gvyu)hftv2).b |= 8;
        if(!hftv2.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gvyu)hftp0.b_message).g = 2;
        ((gvyu)hftp0.b_message).b |= 16;
        gvyu gvyu5 = (gvyu)hftp0.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv3 = hftp0.b_message;
        ((gvyu)hftv3).f = 10;
        ((gvyu)hftv3).b |= 8;
        int v5 = gpyd.p(z2);
        if(!hftv3.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gvyu)hftp0.b_message).g = v5 - 1;
        ((gvyu)hftp0.b_message).b |= 16;
        gvyu gvyu6 = (gvyu)hftp0.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv4 = hftp0.b_message;
        ((gvyu)hftv4).f = 11;
        ((gvyu)hftv4).b |= 8;
        int v6 = gpyd.p(z3);
        if(!hftv4.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gvyu)hftp0.b_message).g = v6 - 1;
        ((gvyu)hftp0.b_message).b |= 16;
        return gged_interceptors.p(gvyu3, gvyu4, gvyu5, gvyu6, ((gvyu)hftp0.N_build()));
    }

    public static gvtm g(Long long0, Long long1, Long long2, int v, List list0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gvtm.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gvtm)hftp0.b_message).f = v - 1;
        ((gvtm)hftp0.b_message).b |= 8;
        if(long0 != null) {
            long v1 = (long)long0;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gvtm gvtm0 = (gvtm)hftp0.b_message;
            gvtm0.b |= 1;
            gvtm0.c = v1;
        }
        if(long1 != null) {
            long v2 = (long)long1;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gvtm gvtm1 = (gvtm)hftp0.b_message;
            gvtm1.b |= 2;
            gvtm1.d = v2;
        }
        if(long2 != null) {
            long v3 = (long)long2;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gvtm gvtm2 = (gvtm)hftp0.b_message;
            gvtm2.b |= 4;
            gvtm2.e = v3;
        }
        for(Object object0: list0) {
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gvtk.a).v_newBuilder();
            long v4 = ((cjgh)object0).a;
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp1.b_message;
            ((gvtk)hftv0).b |= 1;
            ((gvtk)hftv0).c = v4;
            int v5 = ((cjgh)object0).b;
            if(!hftv0.isImmutable()) {
                hftp1.ensureMutable();
            }
            ProtoLiteMessage hftv1 = hftp1.b_message;
            ((gvtk)hftv1).b |= 2;
            ((gvtk)hftv1).d = v5;
            int v6 = ((cjgh)object0).c;
            if(!hftv1.isImmutable()) {
                hftp1.ensureMutable();
            }
            ProtoLiteMessage hftv2 = hftp1.b_message;
            ((gvtk)hftv2).b |= 4;
            ((gvtk)hftv2).e = v6;
            float f = ((cjgh)object0).d;
            if(!hftv2.isImmutable()) {
                hftp1.ensureMutable();
            }
            ProtoLiteMessage hftv3 = hftp1.b_message;
            ((gvtk)hftv3).b |= 16;
            ((gvtk)hftv3).g = f;
            float f1 = ((cjgh)object0).e;
            if(!hftv3.isImmutable()) {
                hftp1.ensureMutable();
            }
            ProtoLiteMessage hftv4 = hftp1.b_message;
            ((gvtk)hftv4).b |= 8;
            ((gvtk)hftv4).f = f1;
            float f2 = ((cjgh)object0).f;
            if(!hftv4.isImmutable()) {
                hftp1.ensureMutable();
            }
            ProtoLiteMessage hftv5 = hftp1.b_message;
            ((gvtk)hftv5).b |= 0x20;
            ((gvtk)hftv5).h = f2;
            float f3 = ((cjgh)object0).g;
            if(f3 != -Infinityf) {
                if(!hftv5.isImmutable()) {
                    hftp1.ensureMutable();
                }
                gvtk gvtk0 = (gvtk)hftp1.b_message;
                gvtk0.b |= 0x40;
                gvtk0.i = f3;
            }
            String s = ((cjgh)object0).h;
            if(s != null) {
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                gvtk gvtk1 = (gvtk)hftp1.b_message;
                gvtk1.b |= 0x80;
                gvtk1.j = s;
            }
            int v7 = ((cjgh)object0).i;
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gvtk gvtk2 = (gvtk)hftp1.b_message;
            gvtk2.b |= 0x100;
            gvtk2.k = v7;
            gvtk gvtk3 = (gvtk)hftp1.N_build();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gvtm gvtm3 = (gvtm)hftp0.b_message;
            gvtk3.getClass();
            hfuo hfuo0 = gvtm3.g;
            if(!hfuo0.c()) {
                gvtm3.g = ProtoLiteMessage.E(hfuo0);
            }
            gvtm3.g.add(gvtk3);
        }
        return (gvtm)hftp0.N_build();
    }

    public static gvts h(Long long0, Long long1, int v, fuxg fuxg0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gvts.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gvts)hftp0.b_message).f = v - 1;
        ((gvts)hftp0.b_message).b |= 8;
        if(long0 == null) {
            long0 = null;
        }
        else {
            long v1 = (long)long0;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gvts gvts0 = (gvts)hftp0.b_message;
            gvts0.b |= 2;
            gvts0.d = v1;
        }
        if(long1 == null) {
            long1 = long0;
        }
        else {
            long v2 = (long)long1;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gvts gvts1 = (gvts)hftp0.b_message;
            gvts1.b |= 4;
            gvts1.e = v2;
        }
        if(long1 != null) {
            long v3 = (long)long1;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gvts gvts2 = (gvts)hftp0.b_message;
            gvts2.b |= 1;
            gvts2.c = v3;
        }
        for(Object object0: fuxg0.a) {
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gvtq.a).v_newBuilder();
            gvtp gvtp0 = (gvtp)gpyd.d.getOrDefault(((fuxi)object0).a, gvtp.l);
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp1.b_message;
            ((gvtq)hftv0).c = gvtp0.x;
            ((gvtq)hftv0).b |= 1;
            int v4 = ((fuxi)object0).b;
            if(!hftv0.isImmutable()) {
                hftp1.ensureMutable();
            }
            gvtq gvtq0 = (gvtq)hftp1.b_message;
            gvtq0.b |= 2;
            gvtq0.d = v4;
            gvtq gvtq1 = (gvtq)hftp1.N_build();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gvts gvts3 = (gvts)hftp0.b_message;
            gvtq1.getClass();
            hfuo hfuo0 = gvts3.g;
            if(!hfuo0.c()) {
                gvts3.g = ProtoLiteMessage.E(hfuo0);
            }
            gvts3.g.add(gvtq1);
        }
        return (gvts)hftp0.N_build();
    }

    public static gvuj i(Long long0, Long long1, List list0, List list1, double f, double f1) {
        ggdy ggdy0 = new ggdy();
        for(int v = 0; v < ((ggna)list0).c; ++v) {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gvuh.a).v_newBuilder();
            double f2 = (double)(((Double)list0.get(v)));
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gvuh gvuh0 = (gvuh)hftp0.b_message;
            gvuh0.b |= 1;
            gvuh0.c = f2;
            double f3 = (double)(((Double)list1.get(v)));
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gvuh gvuh1 = (gvuh)hftp0.b_message;
            gvuh1.b |= 2;
            gvuh1.d = f3;
            ggdy0.i(((gvuh)hftp0.N_build()));
        }
        gvug gvug0 = (gvug)((ProtoLiteMessage)gvuj.a).v_newBuilder();
        if(!gvug0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gvug0).ensureMutable();
        }
        ((gvuj)gvug0.b_message).f = 3;
        ((gvuj)gvug0.b_message).b |= 8;
        if(!gvug0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gvug0).ensureMutable();
        }
        gvuj gvuj0 = (gvuj)gvug0.b_message;
        gvuj0.b |= 16;
        gvuj0.h = f;
        if(!gvug0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gvug0).ensureMutable();
        }
        gvuj gvuj1 = (gvuj)gvug0.b_message;
        gvuj1.b |= 0x20;
        gvuj1.i = f1;
        gvug0.a(ggdy0.h());
        if(long0 == null) {
            long0 = null;
        }
        else {
            long v1 = (long)long0;
            if(!gvug0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)gvug0).ensureMutable();
            }
            gvuj gvuj2 = (gvuj)gvug0.b_message;
            gvuj2.b |= 2;
            gvuj2.d = v1;
        }
        if(long1 == null) {
            long1 = long0;
        }
        else {
            long v2 = (long)long1;
            if(!gvug0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)gvug0).ensureMutable();
            }
            gvuj gvuj3 = (gvuj)gvug0.b_message;
            gvuj3.b |= 4;
            gvuj3.e = v2;
        }
        if(long1 != null) {
            long v3 = (long)long1;
            if(!gvug0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)gvug0).ensureMutable();
            }
            gvuj gvuj4 = (gvuj)gvug0.b_message;
            gvuj4.b |= 1;
            gvuj4.c = v3;
        }
        return (gvuj)((ProtoLiteBuilder)gvug0).N_build();
    }

    public static gvut j(Long long0, Long long1, gpvs gpvs0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gvut.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gvut)hftp0.b_message).f = 1;
        ((gvut)hftp0.b_message).b |= 8;
        Stream stream0 = DesugarArrays.stream(gpvs0.b).boxed();
        Collector collector0 = ggaf.a;
        Iterable iterable0 = (Iterable)stream0.collect(collector0);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gvut gvut0 = (gvut)hftp0.b_message;
        hfuf hfuf0 = gvut0.g;
        if(!hfuf0.c()) {
            gvut0.g = ProtoLiteMessage.C(hfuf0);
        }
        hfrj.E(iterable0, gvut0.g);
        Iterable iterable1 = (Iterable)DesugarArrays.stream(gpvs0.c).boxed().collect(collector0);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gvut gvut1 = (gvut)hftp0.b_message;
        hfua hfua0 = gvut1.h;
        if(!hfua0.c()) {
            gvut1.h = ProtoLiteMessage.A(hfua0);
        }
        hfrj.E(iterable1, gvut1.h);
        gpvr gpvr0 = gpvs0.e;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((gvut)hftv0).b |= 0x20;
        ((gvut)hftv0).j = gpvr0.b;
        double f = gpvr0.c;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((gvut)hftv1).b |= 0x40;
        ((gvut)hftv1).k = f;
        int v = gpvr0.d;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp0.b_message;
        ((gvut)hftv2).b |= 0x80;
        ((gvut)hftv2).l = v;
        int v1 = gpvr0.e;
        if(!hftv2.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv3 = hftp0.b_message;
        ((gvut)hftv3).b |= 0x100;
        ((gvut)hftv3).m = v1;
        double f1 = gpvr0.f;
        if(!hftv3.isImmutable()) {
            hftp0.ensureMutable();
        }
        gvut gvut2 = (gvut)hftp0.b_message;
        gvut2.b |= 0x200;
        gvut2.n = f1;
        if(long0 == null) {
            long0 = null;
        }
        else {
            long v2 = (long)long0;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gvut gvut3 = (gvut)hftp0.b_message;
            gvut3.b |= 2;
            gvut3.d = v2;
        }
        if(long1 == null) {
            long1 = long0;
        }
        else {
            long v3 = (long)long1;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gvut gvut4 = (gvut)hftp0.b_message;
            gvut4.b |= 4;
            gvut4.e = v3;
        }
        if(long1 != null) {
            long v4 = (long)long1;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gvut gvut5 = (gvut)hftp0.b_message;
            gvut5.b |= 1;
            gvut5.c = v4;
        }
        byte[] arr_b = gpvs0.d;
        if(!gpvs.a(arr_b)) {
            ByteString hfsf0 = ByteString.copyFrom(arr_b);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gvut gvut6 = (gvut)hftp0.b_message;
            gvut6.b |= 16;
            gvut6.i = hfsf0;
        }
        fvcm fvcm0 = gpvr0.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv4 = hftp0.b_message;
        ((gvut)hftv4).b |= 0x400;
        ((gvut)hftv4).o = ((fvcu)fvcm0).f;
        fvct fvct0 = ((fvcu)fvcm0).g;
        if(!hftv4.isImmutable()) {
            hftp0.ensureMutable();
        }
        gvut gvut7 = (gvut)hftp0.b_message;
        fvct0.c.getClass();
        gvut7.b |= 0x800;
        gvut7.p = fvct0.c;
        return (gvut)hftp0.N_build();
    }

    public static gvws k(Long long0, Long long1, cjhf cjhf0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gvws.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gvws)hftp0.b_message).f = 3;
        ((gvws)hftp0.b_message).b |= 8;
        if(long0 == null) {
            long0 = null;
        }
        else {
            long v = (long)long0;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gvws gvws0 = (gvws)hftp0.b_message;
            gvws0.b |= 2;
            gvws0.d = v;
        }
        if(long1 == null) {
            long1 = long0;
        }
        else {
            long v1 = (long)long1;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gvws gvws1 = (gvws)hftp0.b_message;
            gvws1.b |= 4;
            gvws1.e = v1;
        }
        if(long1 != null) {
            long v2 = (long)long1;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gvws gvws2 = (gvws)hftp0.b_message;
            gvws2.b |= 1;
            gvws2.c = v2;
        }
        for(Object object0: cjhf0.a) {
            cjha cjha0 = (cjha)object0;
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gvwq.a).v_newBuilder();
            int v3 = cjha0.e().ordinal();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gvwq gvwq0 = (gvwq)hftp1.b_message;
            gvwq0.b |= 1;
            gvwq0.c = v3;
            int v4 = cjha0.d();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gvwq gvwq1 = (gvwq)hftp1.b_message;
            gvwq1.b |= 2;
            gvwq1.d = v4;
            float f = cjha0.a();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gvwq gvwq2 = (gvwq)hftp1.b_message;
            gvwq2.b |= 4;
            gvwq2.e = f;
            float f1 = cjha0.c();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gvwq gvwq3 = (gvwq)hftp1.b_message;
            gvwq3.b |= 8;
            gvwq3.f = f1;
            float f2 = cjha0.b();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gvwq gvwq4 = (gvwq)hftp1.b_message;
            gvwq4.b |= 16;
            gvwq4.g = f2;
            boolean z = cjha0.j();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gvwq gvwq5 = (gvwq)hftp1.b_message;
            gvwq5.b |= 0x40;
            gvwq5.i = z;
            boolean z1 = cjha0.h();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gvwq gvwq6 = (gvwq)hftp1.b_message;
            gvwq6.b |= 0x80;
            gvwq6.j = z1;
            boolean z2 = cjha0.i();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gvwq gvwq7 = (gvwq)hftp1.b_message;
            gvwq7.b |= 0x100;
            gvwq7.k = z2;
            if(cjha0.g() != null) {
                float f3 = (float)cjha0.g();
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                gvwq gvwq8 = (gvwq)hftp1.b_message;
                gvwq8.b |= 0x200;
                gvwq8.l = f3;
            }
            if(cjha0.f() != null) {
                float f4 = (float)cjha0.f();
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                gvwq gvwq9 = (gvwq)hftp1.b_message;
                gvwq9.b |= 0x20;
                gvwq9.h = f4;
            }
            gvwq gvwq10 = (gvwq)hftp1.N_build();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gvws gvws3 = (gvws)hftp0.b_message;
            gvwq10.getClass();
            hfuo hfuo0 = gvws3.g;
            if(!hfuo0.c()) {
                gvws3.g = ProtoLiteMessage.E(hfuo0);
            }
            gvws3.g.add(gvwq10);
        }
        return (gvws)hftp0.N_build();
    }

    public static gvzo l(Long long0, Long long1, float f) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gvzo.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((gvzo)hftv0).f = 7;
        ((gvzo)hftv0).b |= 8;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        gvzo gvzo0 = (gvzo)hftp0.b_message;
        gvzo0.b |= 16;
        gvzo0.g = f;
        if(long0 == null) {
            long0 = null;
        }
        else {
            long v = (long)long0;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gvzo gvzo1 = (gvzo)hftp0.b_message;
            gvzo1.b |= 2;
            gvzo1.d = v;
        }
        if(long1 == null) {
            long1 = long0;
        }
        else {
            long v1 = (long)long1;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gvzo gvzo2 = (gvzo)hftp0.b_message;
            gvzo2.b |= 4;
            gvzo2.e = v1;
        }
        if(long1 != null) {
            long v2 = (long)long1;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gvzo gvzo3 = (gvzo)hftp0.b_message;
            gvzo3.b |= 1;
            gvzo3.c = v2;
        }
        return (gvzo)hftp0.N_build();
    }

    public static gvzx m(Long long0, Long long1, int v) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gvzx.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gvzx)hftp0.b_message).f = 1;
        ((gvzx)hftp0.b_message).b |= 8;
        if(long0 == null) {
            long0 = null;
        }
        else {
            long v1 = (long)long0;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gvzx gvzx0 = (gvzx)hftp0.b_message;
            gvzx0.b |= 2;
            gvzx0.d = v1;
        }
        if(long1 == null) {
            long1 = long0;
        }
        else {
            long v2 = (long)long1;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gvzx gvzx1 = (gvzx)hftp0.b_message;
            gvzx1.b |= 4;
            gvzx1.e = v2;
        }
        if(long1 != null) {
            long v3 = (long)long1;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gvzx gvzx2 = (gvzx)hftp0.b_message;
            gvzx2.b |= 1;
            gvzx2.c = v3;
        }
        int v4 = 0;
        while(v4 < 11) {
            int v5 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11}[v4];
            int v6 = v5 - 1;
            if(v5 == 0) {
                throw null;
            }
            if((1 << v5 - 2 & v) != 0) {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gvzx gvzx3 = (gvzx)hftp0.b_message;
                hfuf hfuf0 = gvzx3.g;
                if(!hfuf0.c()) {
                    gvzx3.g = ProtoLiteMessage.C(hfuf0);
                }
                gvzx3.g.i(v6);
            }
            ++v4;
            continue;
        }
        return (gvzx)hftp0.N_build();
    }

    public static gwat n(Long long0, Long long1) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gwat.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gwat)hftp0.b_message).f = 17;
        ((gwat)hftp0.b_message).b |= 8;
        if(long0 == null) {
            long0 = null;
        }
        else {
            long v = (long)long0;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gwat gwat0 = (gwat)hftp0.b_message;
            gwat0.b |= 2;
            gwat0.d = v;
        }
        if(long1 == null) {
            long1 = long0;
        }
        else {
            long v1 = (long)long1;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gwat gwat1 = (gwat)hftp0.b_message;
            gwat1.b |= 4;
            gwat1.e = v1;
        }
        if(long1 != null) {
            long v2 = (long)long1;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gwat gwat2 = (gwat)hftp0.b_message;
            gwat2.b |= 1;
            gwat2.c = v2;
        }
        return (gwat)hftp0.N_build();
    }

    public static gwce o(Long long0, Long long1, fwed fwed0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gwce.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gwce)hftp0.b_message).f = 2;
        ((gwce)hftp0.b_message).b |= 8;
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gwcc.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((gwcc)hftp1.b_message).f = 2;
        ((gwcc)hftp1.b_message).b |= 8;
        if(long0 == null) {
            long0 = null;
        }
        else {
            long v = (long)long0;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gwce gwce0 = (gwce)hftp0.b_message;
            gwce0.b |= 2;
            gwce0.d = v;
            long v1 = (long)long0;
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gwcc gwcc0 = (gwcc)hftp1.b_message;
            gwcc0.b |= 2;
            gwcc0.d = v1;
        }
        if(long1 == null) {
            long1 = long0;
        }
        else {
            long v2 = (long)long1;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gwce gwce1 = (gwce)hftp0.b_message;
            gwce1.b |= 4;
            gwce1.e = v2;
            long v3 = (long)long1;
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gwcc gwcc1 = (gwcc)hftp1.b_message;
            gwcc1.b |= 4;
            gwcc1.e = v3;
        }
        if(long1 != null) {
            long v5 = (long)long1;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gwce gwce2 = (gwce)hftp0.b_message;
            gwce2.b |= 1;
            gwce2.c = v5;
            long v6 = (long)long1;
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gwcc gwcc2 = (gwcc)hftp1.b_message;
            gwcc2.b |= 1;
            gwcc2.c = v6;
        }
        for(int v4 = 0; v4 < fwed0.d(); ++v4) {
            ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gwca.a).v_newBuilder();
            long v7 = fwed0.l(v4);
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            gwca gwca0 = (gwca)hftp2.b_message;
            gwca0.b |= 1;
            gwca0.c = v7;
            long v8 = (long)fwed0.e(v4);
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            gwca gwca1 = (gwca)hftp2.b_message;
            gwca1.b |= 2;
            gwca1.d = (int)(v8 * 10L);
            long v9 = (long)fwed0.f(v4);
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            gwca gwca2 = (gwca)hftp2.b_message;
            gwca2.b |= 4;
            gwca2.e = (int)(v9 * 10L);
            int v10 = fwed0.b(v4);
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            gwca gwca3 = (gwca)hftp2.b_message;
            gwca3.b |= 8;
            gwca3.f = v10;
            int v11 = fwed0.i(v4);
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            gwca gwca4 = (gwca)hftp2.b_message;
            gwca4.b |= 0x20;
            gwca4.h = v11;
            int v12 = fwed0.h(v4);
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            gwca gwca5 = (gwca)hftp2.b_message;
            gwca5.b |= 16;
            gwca5.g = v12;
            long v13 = fwed0.n(v4) * 1000000L;
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp2.b_message;
            ((gwca)hftv0).b |= 0x40;
            ((gwca)hftv0).i = v13;
            if(!hftv0.isImmutable()) {
                hftp2.ensureMutable();
            }
            ((gwca)hftp2.b_message).j = 2;
            ((gwca)hftp2.b_message).b |= 0x80;
            int v14 = fwed0.g(v4);
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            gwca gwca6 = (gwca)hftp2.b_message;
            gwca6.b |= 0x100;
            gwca6.k = v14;
            gwca gwca7 = (gwca)hftp2.N_build();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gwcc gwcc3 = (gwcc)hftp1.b_message;
            gwca7.getClass();
            hfuo hfuo0 = gwcc3.g;
            if(!hfuo0.c()) {
                gwcc3.g = ProtoLiteMessage.E(hfuo0);
            }
            gwcc3.g.add(gwca7);
            ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)gvyc.a).v_newBuilder();
            long v15 = fwed0.l(v4);
            if(!hftp3.b_message.isImmutable()) {
                hftp3.ensureMutable();
            }
            gvyc gvyc0 = (gvyc)hftp3.b_message;
            gvyc0.b |= 1;
            gvyc0.c = v15;
            gwsu gwsu0 = (gwsu)Objects.requireNonNull(fwed0.x(v4));
            if(!hftp3.b_message.isImmutable()) {
                hftp3.ensureMutable();
            }
            gvyc gvyc1 = (gvyc)hftp3.b_message;
            gwsu0.getClass();
            gvyc1.d = gwsu0;
            gvyc1.b |= 2;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gwce gwce3 = (gwce)hftp0.b_message;
            gvyc gvyc2 = (gvyc)hftp3.N_build();
            gvyc2.getClass();
            hfuo hfuo1 = gwce3.h;
            if(!hfuo1.c()) {
                gwce3.h = ProtoLiteMessage.E(hfuo1);
            }
            gwce3.h.add(gvyc2);
        }
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gwce gwce4 = (gwce)hftp0.b_message;
        gwcc gwcc4 = (gwcc)hftp1.N_build();
        gwcc4.getClass();
        gwce4.g = gwcc4;
        gwce4.b |= 16;
        return (gwce)hftp0.N_build();
    }

    // String Decryptor: 1 succeeded, 0 failed
    private static int p(boolean z) {
        return z ? 3 : 2;
    }
}

