import j..util.Objects;
import java.util.Map;

final class ggpw implements ggms {
    public final TimeRange a;
    final ggpx b;

    public ggpw(ggpx ggpx0, TimeRange ggmr0) {
        Objects.requireNonNull(ggpx0);
        this.b = ggpx0;
        super();
        this.a = ggmr0;
    }

    @Override  // ggms
    public final ggms a(TimeRange ggmr0) {
        TimeRange ggmr1 = this.a;
        if(!ggmr0.w(ggmr1)) {
            return ggpx.a;
        }
        TimeRange ggmr2 = ggmr0.k(ggmr1);
        return this.b.a(ggmr2);
    }

    @Override  // ggms
    public final Map b() {
        return new ggpv(this);
    }

    @Override  // ggms
    public final void c(TimeRange ggmr0, Object object0) {
        gftb.m(this.a.t(ggmr0), "Cannot put range %s into a subRangeMap(%s)", ggmr0, this.a);
        this.b.c(ggmr0, object0);
    }

    @Override  // ggms
    public final void d(TimeRange ggmr0, Object object0) {
        throw null;
    }

    @Override  // ggms
    public final void e(TimeRange ggmr0) {
        TimeRange ggmr1 = this.a;
        if(ggmr0.w(ggmr1)) {
            TimeRange ggmr2 = ggmr0.k(ggmr1);
            this.b.e(ggmr2);
        }
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof ggms) ? new ggpv(this).equals(((ggms)object0).b()) : false;
    }

    @Override
    public final int hashCode() {
        return new ggpv(this).hashCode();
    }

    @Override
    public final String toString() {
        return new ggpv(this).toString();
    }
}

