public final class ehrh {
    public final bboh a;
    public final String b;
    public final bboe c;

    public ehrh() {
        throw null;
    }

    public ehrh(bboh bboh0, String s, bboe bboe0) {
        if(bboh0 == null) {
            throw new NullPointerException("Null getLogger");
        }
        this.a = bboh0;
        this.b = s;
        this.c = bboe0;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof ehrh) && this.a.equals(((ehrh)object0).a) && this.b.equals(((ehrh)object0).b) && this.c.equals(((ehrh)object0).c);
    }

    @Override
    public final int hashCode() {
        return this.c.hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003 ^ this.b.hashCode()) * 1000003;
    }

    @Override
    public final String toString() {
        return "ViewPermissionUsageConfig{getLogger=" + this.a.toString() + ", getHelpContext=" + this.b + ", intentHelpUrlFunction=" + this.c.toString() + "}";
    }
}

