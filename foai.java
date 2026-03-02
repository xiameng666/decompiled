public final class foai {
    public final String a;
    public final gfsx b;
    private final gfsx c;
    private final gfsx d;

    public foai() {
        throw null;
    }

    public foai(String s, gfsx gfsx0, gfsx gfsx1, gfsx gfsx2) {
        this.a = s;
        this.b = gfsx0;
        this.c = gfsx1;
        this.d = gfsx2;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof foai) && this.a.equals(((foai)object0).a) && this.b.equals(((foai)object0).b) && this.c.equals(((foai)object0).c) && this.d.equals(((foai)object0).d);
    }

    @Override
    public final int hashCode() {
        return ((this.b.hashCode() ^ (this.a.hashCode() ^ 1000003) * 1000003) * 1000003 ^ 2040732332) * 1000003 ^ 2040732332;
    }

    @Override
    public final String toString() {
        return "CustomHeaderContentFeature{title=" + this.a + ", subtitle=" + this.b + ", titleTypeface=" + this.c + ", subtitleTypeface=" + this.d + "}";
    }
}

