public final class fltq {
    public final String a;
    public final gfsx b;
    public final gfsx c;
    public final gfsx d;
    public final gfsx e;
    public final ggeo f;
    public final gged_interceptors g;
    public final gged_interceptors h;
    public final gfsx i;
    public final gfsx j;
    public final gfsx k;
    private final String l;

    public fltq() {
        throw null;
    }

    public fltq(String s, gfsx gfsx0, gfsx gfsx1, gfsx gfsx2, String s1, gfsx gfsx3, ggeo ggeo0, gged_interceptors gged0, gged_interceptors gged1, gfsx gfsx4, gfsx gfsx5, gfsx gfsx6) {
        this.a = s;
        this.b = gfsx0;
        this.c = gfsx1;
        this.d = gfsx2;
        this.l = s1;
        this.e = gfsx3;
        this.f = ggeo0;
        this.g = gged0;
        this.h = gged1;
        this.i = gfsx4;
        this.j = gfsx5;
        this.k = gfsx6;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof fltq) && this.a.equals(((fltq)object0).a) && this.b.equals(((fltq)object0).b) && this.c.equals(((fltq)object0).c) && this.d.equals(((fltq)object0).d) && this.l.equals(((fltq)object0).l) && this.e.equals(((fltq)object0).e) && this.f.equals(((fltq)object0).f) && ggia.i(this.g, ((fltq)object0).g) && ggia.i(this.h, ((fltq)object0).h) && this.i.equals(((fltq)object0).i) && this.j.equals(((fltq)object0).j) && this.k.equals(((fltq)object0).k);
    }

    @Override
    public final int hashCode() {
        return this.k.hashCode() ^ (((((((((((this.a.hashCode() ^ 1000003) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c.hashCode()) * 1000003 ^ this.d.hashCode()) * 1000003 ^ this.l.hashCode()) * 1000003 ^ this.e.hashCode()) * 1000003 ^ this.f.hashCode()) * 1000003 ^ this.g.hashCode()) * 1000003 ^ this.h.hashCode()) * 1000003 ^ this.i.hashCode()) * 1000003 ^ this.j.hashCode()) * 1000003;
    }

    @Override
    public final String toString() {
        return "ProfileInfo{name=" + this.a + ", a11yName=" + this.b + ", imageUrl=" + this.c + ", thumbnailData=" + this.d + ", contentType=" + this.l + ", groupInfo=" + this.e + ", metadata=" + this.f + ", menuItems=" + this.g + ", toolbarButtons=" + this.h + ", lighterUiConfigurations=" + this.i + ", customViewContentModel=" + this.j + ", serverTimestampUs=" + this.k + "}";
    }
}

