import android.accounts.Account;

public final class bpko {
    public final ByteString a;
    public final boolean b;
    public final gfsx c;
    public final fqus d;
    public final gfsx e;
    public final long f;
    public final long g;
    public final haea h;
    public final double i;
    public final boolean j;
    public final boolean k;

    public bpko() {
        throw null;
    }

    public bpko(ByteString hfsf0, boolean z, gfsx gfsx0, fqus fqus0, gfsx gfsx1, long v, long v1, haea haea0, double f, boolean z1, boolean z2) {
        this.a = hfsf0;
        this.b = z;
        this.c = gfsx0;
        this.d = fqus0;
        this.e = gfsx1;
        this.f = v;
        this.g = v1;
        this.h = haea0;
        this.i = f;
        this.j = z1;
        this.k = z2;
    }

    public static bpkn a() {
        bpkn bpkn0 = new bpkn(null);
        bpkn0.j(false);
        bpkn0.f(false);
        return bpkn0;
    }

    public static bpko b(gsyz gsyz0, gfsx gfsx0, fqus fqus0, Account account0, long v, long v1, double f, haea haea0) {
        bpkn bpkn0 = bpko.a();
        bpkn0.c(((ByteString)gfsx0.f(ByteString.b)));
        bpkn0.b(fqus0);
        bpkn0.e(false);
        bpkn0.a = gfsx.m(gsyz0);
        bpkn0.b = gfsx.m(account0);
        bpkn0.g(v);
        bpkn0.h(v1);
        bpkn0.d(f);
        bpkn0.i(haea0);
        return bpkn0.a();
    }

    public final String c() {
        if(!this.b) {
            return this.c.i() ? ((gsyz)this.c.d()).b : frai.h(this.a);
        }
        return "Self sighting";
    }

    public final boolean d() {
        return this.i > 0.0;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof bpko) && this.a.equals(((bpko)object0).a) && this.b == ((bpko)object0).b && this.c.equals(((bpko)object0).c) && this.d.equals(((bpko)object0).d) && this.e.equals(((bpko)object0).e) && this.f == ((bpko)object0).f && this.g == ((bpko)object0).g && this.h.equals(((bpko)object0).h) && Double.doubleToLongBits(this.i) == Double.doubleToLongBits(((bpko)object0).i) && this.j == ((bpko)object0).j && this.k == ((bpko)object0).k;
    }

    @Override
    public final int hashCode() {
        int v = 0x4D5;
        int v1 = (((((((((this.a.hashCode() ^ 1000003) * 1000003 ^ (this.b ? 0x4CF : 0x4D5)) * 1000003 ^ this.c.hashCode()) * 1000003 ^ this.d.hashCode()) * 1000003 ^ this.e.hashCode()) * 1000003 ^ ((int)(this.f ^ this.f >>> 0x20))) * 1000003 ^ ((int)(this.g ^ this.g >>> 0x20))) * 1000003 ^ this.h.hashCode()) * 1000003 ^ ((int)(Double.doubleToLongBits(this.i) ^ Double.doubleToLongBits(this.i) >>> 0x20))) * 1000003;
        int v2 = this.j ? 0x4CF : 0x4D5;
        if(this.k) {
            v = 0x4CF;
        }
        return (v1 ^ v2) * 1000003 ^ v;
    }

    @Override
    public final String toString() {
        return "SightingToLocate{eid=" + this.a + ", selfSighting=" + this.b + ", canonicDeviceId=" + this.c + ", componentSetOrComponentless=" + this.d + ", account=" + this.e + ", sightingTimeSecsForComparison=" + this.f + ", sightingTimeSecsForReporting=" + this.g + ", source=" + this.h + ", lastAggregatedLocationAccuracy=" + this.i + ", unwantedTrackingPreventionModeActive=" + this.j + ", sightingOfALostDevice=" + this.k + "}";
    }
}

