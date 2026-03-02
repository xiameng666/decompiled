public final class ehwv {
    public final ehwt a;
    public final gfsx b;
    public final gfsx c;
    public final gfsx d;
    public final gfsx e;
    public final gfsx f;

    public ehwv() {
        throw null;
    }

    public ehwv(ehwt ehwt0, gfsx gfsx0, gfsx gfsx1, gfsx gfsx2, gfsx gfsx3, gfsx gfsx4) {
        this.a = ehwt0;
        this.b = gfsx0;
        this.c = gfsx1;
        this.d = gfsx2;
        this.e = gfsx3;
        this.f = gfsx4;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof ehwv) && this.a.equals(((ehwv)object0).a) && this.b.equals(((ehwv)object0).b) && this.c.equals(((ehwv)object0).c) && this.d.equals(((ehwv)object0).d) && this.e.equals(((ehwv)object0).e) && this.f.equals(((ehwv)object0).f);
    }

    @Override
    public final int hashCode() {
        return (this.e.hashCode() ^ ((((this.a.hashCode() ^ 1000003) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c.hashCode()) * 1000003 ^ 2040732332) * 1000003) * 1000003 ^ 2040732332;
    }

    @Override
    public final String toString() {
        return "ProximityUiState{connectionState=" + this.a + ", signalStrength=" + this.b + ", rssi=" + this.c + ", rangeMeters=" + this.d + ", proximityStatus=" + this.e + ", bearingRads=" + this.f + "}";
    }
}

