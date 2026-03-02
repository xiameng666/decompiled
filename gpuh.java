import com.google.location.bluemoon.inertialanchor.DeepBlueResults;
import j..util.Objects;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class gpuh implements ISensorFusionProcessor {
    static final long a;
    private final double b;
    private long c;
    private gptu_Position d;
    private long e;
    private gptu_Position f;

    static {
        gpuh.a = TimeUnit.SECONDS.toNanos(10L);
    }

    public gpuh() {
        this.b = Math.sqrt(5.0);
        this.v();
    }

    @Override  // ISensorFusionProcessor
    public final int L(long v) {
        return 38;
    }

    @Override  // ISensorFusionProcessor
    public final void b() {
    }

    @Override  // ISensorFusionProcessor
    public final void c() {
    }

    @Override  // ISensorFusionProcessor
    public final void d(long v, gptu_Position gptu0) {
        if(gptu0.l()) {
            if(gptu0.t()) {
                this.d = gptu0;
                this.c = v;
                return;
            }
            if(gptu0.u()) {
                this.f = gptu0;
                this.e = v;
            }
        }
    }

    @Override  // ISensorFusionProcessor
    public final void e(long v, List list0) {
    }

    @Override  // ISensorFusionProcessor
    public final void f(long v, fuxg fuxg0) {
    }

    @Override  // ISensorFusionProcessor
    public final void g(long v, float f, float f1) {
    }

    @Override  // ISensorFusionProcessor
    public final void h(long v, gpvs gpvs0) {
    }

    @Override  // ISensorFusionProcessor
    public final void i(long v, float f) {
    }

    @Override  // ISensorFusionProcessor
    public final void j_processDeepBlueResults(long v, DeepBlueResults deepBlueResults0) {
    }

    @Override  // ISensorFusionProcessor
    public final void k(long v) {
    }

    @Override  // ISensorFusionProcessor
    public final void l(long v, cjhf cjhf0) {
    }

    @Override  // ISensorFusionProcessor
    public final void m(long v, float f) {
    }

    @Override  // ISensorFusionProcessor
    public final void n(long v, long v1) {
    }

    @Override  // ISensorFusionProcessor
    public final void o_handleStepEvent(long v) {
    }

    @Override  // ISensorFusionProcessor
    public final void p(long v, Collection collection0, long v1) {
    }

    @Override  // ISensorFusionProcessor
    public final void q(long v, fwed fwed0) {
    }

    @Override  // ISensorFusionProcessor
    public final long r() {
        return Math.max(this.c, this.e);
    }

    @Override  // ISensorFusionProcessor
    public final gptu_Position s() {
        PositionBuilder gptr1;
        long v4;
        if(this.u()) {
            if((((float)((gptu_Position)Objects.requireNonNull(this.f)).accuracyMm) / ((float)((gptu_Position)Objects.requireNonNull(this.d)).accuracyMm) > 2.0f)) {
                PositionBuilder gptr0 = this.d.g();
                gptr0.flpSensorFusion = gpts_PositionProvider.GPS_WIFI_GPS;
                return new gptu_Position(gptr0);
            }
            gptu_Position gptu0 = this.d;
            gptu_Position gptu1 = this.f;
            double f = this.b;
            double f1 = (double)gptu0.accuracyMm;
            double f2 = (double)gptu1.accuracyMm;
            if(gptu0 != null) {
                if(gptu1 == null) {
                    return null;
                }
                double f3 = f * f1;
                double f4 = 1.0 / (f2 * f2 / f3 / f3 + 1.0);
                int v = (int)Math.round(Math.sqrt(f4 * f2 * f2 + (1.0 - f4) * f1 * f1));
                gptt_LocationType gptt0 = f4 > 0.5 ? gptt_LocationType.WIFI : gptt_LocationType.GPS;
                int v1 = gptu0.lngE7;
                double f5 = GeoMath.d(gptu0.latE7, v1, gptu1.latE7, gptu1.lngE7);
                double f6 = GeoMath.b(gptu0.latE7, v1, gptu1.latE7, gptu1.lngE7);
                int v2 = Math.max(-900000000, Math.min(900000000, gptu0.latE7));
                if(v1 < -1800000000) {
                    v1 += 0xD693A400;
                }
                else if(v1 >= 1800000000) {
                    v1 += 0x296C5C00;
                }
                long v3 = fhtc.d(v2, v1);
                double f7 = f5 * f4;
                double f8 = GeoMath.e(fhtc.c(v3));
                double f9 = GeoMath.e(((int)v3));
                double f10 = Math.sin(f6);
                double f11 = Math.cos(f6);
                if(Double.compare(f7, (1.570796 - Math.abs(f8)) * 140.0) < 0) {
                    double f12 = f11 * (f7 / 6367000.0) + f8;
                    v4 = fhtc.e(f12, f9 + f10 * (f7 / 6367000.0) / Math.cos((f8 + f12) / 2.0));
                }
                else {
                    double f13 = Math.sin(f8);
                    double f14 = Math.cos(f7 / 6367000.0);
                    double f15 = Math.cos(f8) * Math.sin(f7 / 6367000.0);
                    double f16 = Math.asin(f13 * f14 + f11 * f15);
                    v4 = fhtc.e(f16, f9 + Math.atan2(f15 * f10, f14 - f13 * Math.sin(f16)));
                }
                if(gptt0.equals(gptt_LocationType.WIFI)) {
                    gptr1 = gptu1.g();
                    gptr1.h(fhtc.a(v4), fhtc.b(v4), v);
                    if(gptu0.i()) {
                        gptr1.e(gptu0.bearingDegrees);
                    }
                    if(gptu0.n()) {
                        gptr1.k(gptu0.speedMps);
                    }
                }
                else {
                    gptr1 = gptu0.g();
                    gptr1.h(fhtc.a(v4), fhtc.b(v4), v);
                    if(gptu1.h() && gptu1.p()) {
                        gptr1.c(gptu1.altitudeMeters);
                        gptr1.l(gptu1.verticalAccuracyMeters);
                    }
                }
                gptr1.flpSensorFusion = gpts_PositionProvider.GPS_WIFI;
                return new gptu_Position(gptr1);
            }
        }
        return null;
    }

    @Override  // ISensorFusionProcessor
    public final void t(long v, PrintWriter printWriter0) {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append("GpsWifiFusion:");
        if(Long.compare(this.c, 0x8000000000000000L) != 0 && this.d != null) {
            stringBuilder0.append(" GpsAccuray{time(ns)=");
            stringBuilder0.append(this.c);
            stringBuilder0.append(", accuracy(mm)=");
            stringBuilder0.append(((gptu_Position)Objects.requireNonNull(this.d)).accuracyMm);
            stringBuilder0.append("}");
        }
        if(this.e != 0x8000000000000000L && this.f != null) {
            stringBuilder0.append(" WifiAccuracy{time(ns)=");
            stringBuilder0.append(this.e);
            stringBuilder0.append(", accuracy(mm)=");
            stringBuilder0.append(((gptu_Position)Objects.requireNonNull(this.f)).accuracyMm);
            stringBuilder0.append("}");
        }
        stringBuilder0.append(" Fusion active=");
        stringBuilder0.append(this.u());
        printWriter0.println(stringBuilder0);
    }

    private final boolean u() {
        return this.c != 0x8000000000000000L && (this.e != 0x8000000000000000L && this.d != null && this.f != null && Math.abs(this.c - this.e) < gpuh.a && this.d.a(this.f) < 1000.0 && ((float)this.f.accuracyMm) != 0.0f && ((float)this.d.accuracyMm) != 0.0f);
    }

    @Override  // ISensorFusionProcessor
    public final void v() {
        this.c = 0x8000000000000000L;
        this.d = null;
        this.e = 0x8000000000000000L;
        this.f = null;
    }

    @Override  // ISensorFusionProcessor
    public final void w() {
        this.v();
    }
}

