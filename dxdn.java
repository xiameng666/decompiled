public final class dxdn {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    private final String h;
    private final gfsx i;

    public dxdn() {
        throw null;
    }

    public dxdn(String s, String s1, String s2, String s3, String s4, String s5, String s6, String s7, gfsx gfsx0) {
        this.a = s;
        this.b = s1;
        this.c = s2;
        this.d = s3;
        this.e = s4;
        this.f = s5;
        this.h = s6;
        this.g = s7;
        this.i = gfsx0;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof dxdn) && this.a.equals(((dxdn)object0).a) && this.b.equals(((dxdn)object0).b) && this.c.equals(((dxdn)object0).c) && this.d.equals(((dxdn)object0).d) && this.e.equals(((dxdn)object0).e) && this.f.equals(((dxdn)object0).f) && this.h.equals(((dxdn)object0).h) && this.g.equals(((dxdn)object0).g) && this.i.equals(((dxdn)object0).i);
    }

    @Override
    public final int hashCode() {
        return this.i.hashCode() ^ ((((((((this.a.hashCode() ^ 1000003) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c.hashCode()) * 1000003 ^ this.d.hashCode()) * 1000003 ^ this.e.hashCode()) * 1000003 ^ this.f.hashCode()) * 1000003 ^ this.h.hashCode()) * 1000003 ^ this.g.hashCode()) * 1000003;
    }

    @Override
    public final String toString() {
        return "FlightSegment{pnrCode=" + this.a + ", origin=" + this.b + ", destination=" + this.c + ", carrier=" + this.d + ", flightNumber=" + this.e + ", dateOfFlightJulian=" + this.f + ", compartmentCode=" + this.h + ", seatNumber=" + this.g + ", selecteeIndicator=" + this.i + "}";
    }
}

