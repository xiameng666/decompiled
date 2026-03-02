import com.google.android.gms.nearby.internal.connection.OnBandwidthChangedParams;
import j..util.Objects;

final class czab extends czar {
    final OnBandwidthChangedParams a;
    final OnBandwidthChangedParams b;

    public czab(czae czae0, OnBandwidthChangedParams onBandwidthChangedParams0, OnBandwidthChangedParams onBandwidthChangedParams1) {
        this.a = onBandwidthChangedParams0;
        this.b = onBandwidthChangedParams1;
        Objects.requireNonNull(czae0);
        super();
    }

    @Override  // azye
    public final void a(Object object0) {
        ((cvxn)object0).a(czdz.b(this.a), new cuuz(this.a.b, this.a.l, this.a.c, this.a.h, this.a.i, this.a.j, this.a.k, this.b.m));
    }
}

