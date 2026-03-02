public final class fmap {
    public final gfsx a;
    public final gfsx b;
    public final gfsx c;

    public fmap() {
        throw null;
    }

    public fmap(gfsx gfsx0, gfsx gfsx1, gfsx gfsx2) {
        this.a = gfsx0;
        this.b = gfsx1;
        this.c = gfsx2;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof fmap) && this.a.equals(((fmap)object0).a) && this.b.equals(((fmap)object0).b) && this.c.equals(((fmap)object0).c);
    }

    @Override
    public final int hashCode() {
        return this.c.hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003 ^ this.b.hashCode()) * 1000003;
    }

    @Override
    public final String toString() {
        return "LighterMessageTypeDetail{intendedRenderingType=" + this.a + ", actualRenderingType=" + this.b + ", contentType=" + this.c + "}";
    }
}

