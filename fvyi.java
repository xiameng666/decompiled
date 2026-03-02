import android.location.Location;
import com.google.android.gms.tensorgps.TensorGpsMetrics;
import j..time.Duration;

final class fvyi {
    public final int a;
    public final Duration b;
    public final Duration c;
    public final Location d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final Location l;
    public final TensorGpsMetrics m;

    public fvyi() {
        throw null;
    }

    public fvyi(int v, Duration duration0, Duration duration1, Location location0, int v1, int v2, int v3, int v4, int v5, int v6, int v7, Location location1, TensorGpsMetrics tensorGpsMetrics0) {
        this.a = v;
        this.b = duration0;
        this.c = duration1;
        this.d = location0;
        this.e = v1;
        this.f = v2;
        this.g = v3;
        this.h = v4;
        this.i = v5;
        this.j = v6;
        this.k = v7;
        this.l = location1;
        this.m = tensorGpsMetrics0;
    }

    static fvyh a() {
        fvyh fvyh0 = new fvyh();
        fvyh0.l(0);
        fvyh0.e(Duration.ZERO);
        fvyh0.d(Duration.ZERO);
        fvyh0.d = null;
        fvyh0.c(0);
        fvyh0.k(0);
        fvyh0.i(0);
        fvyh0.f(0);
        fvyh0.j(0);
        fvyh0.h(0);
        fvyh0.g(0);
        fvyh0.l = null;
        fvyh0.m = null;
        return fvyh0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if((object0 instanceof fvyi) && this.a == ((fvyi)object0).a && this.b.equals(((fvyi)object0).b) && this.c.equals(((fvyi)object0).c)) {
            Location location0 = this.d;
            if(location0 != null) {
                if(location0.equals(((fvyi)object0).d)) {
                label_8:
                    if(this.e == ((fvyi)object0).e && this.f == ((fvyi)object0).f && this.g == ((fvyi)object0).g && this.h == ((fvyi)object0).h && this.i == ((fvyi)object0).i && this.j == ((fvyi)object0).j && this.k == ((fvyi)object0).k) {
                        Location location1 = this.l;
                        if(location1 == null) {
                            if(((fvyi)object0).l == null) {
                                return this.m == null ? ((fvyi)object0).m == null : this.m.equals(((fvyi)object0).m);
                            }
                        }
                        else if(location1.equals(((fvyi)object0).l)) {
                            return this.m == null ? ((fvyi)object0).m == null : this.m.equals(((fvyi)object0).m);
                        }
                    }
                }
            }
            else if(((fvyi)object0).d == null) {
                goto label_8;
            }
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = (((((((((((this.a ^ 1000003) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c.hashCode()) * 1000003 ^ (this.d == null ? 0 : this.d.hashCode())) * 1000003 ^ this.e) * 1000003 ^ this.f) * 1000003 ^ this.g) * 1000003 ^ this.h) * 1000003 ^ this.i) * 1000003 ^ this.j) * 1000003 ^ this.k) * 1000003;
        int v2 = this.l == null ? 0 : this.l.hashCode();
        TensorGpsMetrics tensorGpsMetrics0 = this.m;
        if(tensorGpsMetrics0 != null) {
            v = tensorGpsMetrics0.hashCode();
        }
        return (v1 ^ v2) * 1000003 ^ v;
    }

    @Override
    public final String toString() {
        return "GnssMetricsData{networkState=" + this.a + ", gnssTimeToFirstFix=" + this.b + ", gnssTimeSinceLastFix=" + this.c + ", gnssLocation=" + this.d + ", gnssSvsUsedInFixCount=" + this.e + ", meanCnoGnssSvsUsedInFix=" + this.f + ", maxCnoGnssSvsUsedInFix=" + this.g + ", gpsSvsUsedInFixCount=" + this.h + ", meanCn0GpsSvsUsedInFix=" + this.i + ", maxCn0GpsSvsUsedInFix=" + this.j + ", maxCn0GpsSvsElevationDegrees=" + this.k + ", tensorGpsLocation=" + this.l + ", tensorGpsMetrics=" + this.m + "}";
    }
}

