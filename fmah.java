public final class fmah {
    public static final String a = "fmah";
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final gfsx h;
    public final gfsx i;

    static {
    }

    public fmah() {
        throw null;
    }

    public fmah(String s, String s1, String s2, String s3, String s4, String s5, gfsx gfsx0, gfsx gfsx1) {
        this.b = s;
        this.c = s1;
        this.d = s2;
        this.e = s3;
        this.f = s4;
        this.g = s5;
        this.h = gfsx0;
        this.i = gfsx1;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof fmah) && this.b.equals(((fmah)object0).b) && this.c.equals(((fmah)object0).c) && this.d.equals(((fmah)object0).d) && this.e.equals(((fmah)object0).e) && this.f.equals(((fmah)object0).f) && this.g.equals(((fmah)object0).g) && this.h.equals(((fmah)object0).h) && this.i.equals(((fmah)object0).i);
    }

    @Override
    public final int hashCode() {
        return this.i.hashCode() ^ (((((((this.b.hashCode() ^ 1000003) * 1000003 ^ this.c.hashCode()) * 1000003 ^ this.d.hashCode()) * 1000003 ^ this.e.hashCode()) * 1000003 ^ this.f.hashCode()) * 1000003 ^ this.g.hashCode()) * 1000003 ^ this.h.hashCode()) * 1000003;
    }

    @Override
    public final String toString() {
        return "LinkPreview{messageText=" + this.b + ", title=" + this.c + ", description=" + this.d + ", imageUrl=" + this.e + ", domain=" + this.f + ", canonicalUrl=" + this.g + ", image=" + this.h + ", expirationTimeMs=" + this.i + "}";
    }
}

