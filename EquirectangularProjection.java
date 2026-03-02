import j..util.Objects;

public final class EquirectangularProjection {
    public final int refLatE7_;
    public final int refLngE7_;

    public EquirectangularProjection(int v, int v1) {
        this.refLatE7_ = v;
        this.refLngE7_ = v1;
    }

    public final double a(double f, double f1) {
        return Math.abs(f - Math.cos(GeoMath.e(this.metersYToLatE7(f1))) / Math.cos(GeoMath.e(this.refLatE7_)) * f);
    }

    public final double latE7ToMetersY(int v) {
        return GeoMath.e(v - this.refLatE7_) * 6367000.0;
    }

    public final double lngE7ToMetersX(int v) {
        return GeoMath.h(GeoMath.e(v - this.refLngE7_), GeoMath.e(this.refLatE7_));
    }

    public final int metersXToLngE7(double f) {
        return this.refLngE7_ + GeoMath.m(GeoMath.f(f, GeoMath.e(this.refLatE7_)));
    }

    public final int metersYToLatE7(double f) {
        return this.refLatE7_ + GeoMath.m(f / 6367000.0);
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof EquirectangularProjection) && this.refLatE7_ == ((EquirectangularProjection)object0).refLatE7_ && this.refLngE7_ == ((EquirectangularProjection)object0).refLngE7_;
    }

    public static EquirectangularProjection f(EquirectangularProjection gpuc0, double f, double f1) {
        return new EquirectangularProjection(gpuc0.metersYToLatE7(f1), gpuc0.metersXToLngE7(f));
    }

    @Override
    public final int hashCode() {
        return Objects.hash(new Object[]{((int)this.refLatE7_), ((int)this.refLngE7_)});
    }

    @Override
    public final String toString() {
        return "EquirectangularProjection latE7 = " + this.refLatE7_ + ", lngE7 = " + this.refLngE7_;
    }
}

