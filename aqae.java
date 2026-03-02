public final class aqae {
    public final gfsx a;
    public final gfsx b;
    public final gfsx c;
    public final gfsx d;
    public final gfsx e;
    public final gfsx f;
    public final gfsx g;

    public aqae() {
        throw null;
    }

    public aqae(gfsx gfsx0, gfsx gfsx1, gfsx gfsx2, gfsx gfsx3, gfsx gfsx4, gfsx gfsx5, gfsx gfsx6) {
        this.a = gfsx0;
        this.b = gfsx1;
        this.c = gfsx2;
        this.d = gfsx3;
        this.e = gfsx4;
        this.f = gfsx5;
        this.g = gfsx6;
    }

    public static apzy a() {
        apzy apzy0 = new apzy(null);
        apzy0.f(null);
        apzy0.g(null);
        apzy0.e(null);
        apzy0.a = gfqx.a;
        apzy0.c(null);
        apzy0.d(null);
        apzy0.b(null);
        return apzy0;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof aqae) && this.a.equals(((aqae)object0).a) && this.b.equals(((aqae)object0).b) && this.c.equals(((aqae)object0).c) && this.d.equals(((aqae)object0).d) && this.e.equals(((aqae)object0).e) && this.f.equals(((aqae)object0).f) && this.g.equals(((aqae)object0).g);
    }

    @Override
    public final int hashCode() {
        return this.g.hashCode() ^ ((((((this.a.hashCode() ^ 1000003) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c.hashCode()) * 1000003 ^ 2040732332) * 1000003 ^ this.e.hashCode()) * 1000003 ^ this.f.hashCode()) * 1000003;
    }

    @Override
    public final String toString() {
        return "ListItem{title=" + this.a + ", titleHint=" + this.b + ", subtitle=" + this.c + ", itemTag=" + this.d + ", onClickAction=" + this.e + ", startAccessory=" + this.f + ", endAccessory=" + this.g + "}";
    }
}

