public final class ghik {
    public static final ghik a;
    public final String b;

    static {
        ghik.a = new ghik("");
        new ghik("<br>");
        new ghik("<!DOCTYPE html>");
    }

    public ghik(String s) {
        s.getClass();
        this.b = s;
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof ghik) ? this.b.equals(((ghik)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return this.b.hashCode() ^ 0x33B02FA9;
    }

    @Override
    public final String toString() {
        return "SafeHtml{" + this.b + "}";
    }
}

