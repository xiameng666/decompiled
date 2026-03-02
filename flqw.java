public final class flqw {
    public final flra a;
    private final String b;

    public flqw() {
        throw null;
    }

    public flqw(String s, flra flra0) {
        this.b = s;
        this.a = flra0;
    }

    public static flqv a() {
        flqv flqv0 = new flqv();
        flqv0.a = "unknown";
        flqv0.b(flra.b);
        return flqv0;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof flqw) && this.b.equals(((flqw)object0).b) && this.a.equals(((flqw)object0).a);
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode() ^ (this.b.hashCode() ^ 1000003) * 1000003;
    }

    @Override
    public final String toString() {
        return "LighterJobParameters{tag=" + this.b + ", lighterRetryPolicy=" + this.a + "}";
    }
}

