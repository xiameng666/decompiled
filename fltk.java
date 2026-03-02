public final class fltk {
    public final fmev a;
    public final gfsx b;

    public fltk() {
        throw null;
    }

    public fltk(fmev fmev0, gfsx gfsx0) {
        this.a = fmev0;
        this.b = gfsx0;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof fltk) && this.a.equals(((fltk)object0).a) && this.b.equals(((fltk)object0).b);
    }

    @Override
    public final int hashCode() {
        return this.b.hashCode() ^ (this.a.hashCode() ^ 1000003) * 1000003;
    }

    @Override
    public final String toString() {
        return "CreateGroup{conversation=" + this.a + ", groupInfo=" + this.b + "}";
    }
}

