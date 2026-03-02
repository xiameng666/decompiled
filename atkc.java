final class atkc implements Comparable {
    public final athu a;
    public final gfsx b;
    public static final int c;
    private static final ggmo d;
    private static final ggmo e;
    private static final ggmo f;

    static {
        gfze gfze0 = new gfze(new atka(), ggmi.a);
        atkc.d = gfze0;
        ggmo ggmo0 = ggmi.a.d();
        gfze gfze1 = new gfze(new atkb(), ggmo0);
        atkc.e = gfze1;
        atkc.f = gfze0.f(gfze1);
    }

    public atkc() {
        throw null;
    }

    public atkc(athu athu0, gfsx gfsx0) {
        this.a = athu0;
        this.b = gfsx0;
    }

    @Override
    public final int compareTo(Object object0) {
        return atkc.f.compare(this, ((atkc)object0));
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof atkc) && this.a.equals(((atkc)object0).a) && this.b.equals(((atkc)object0).b);
    }

    @Override
    public final int hashCode() {
        return this.b.hashCode() ^ (this.a.hashCode() ^ 1000003) * 1000003;
    }

    @Override
    public final String toString() {
        return "ChunkMetadata{hash=" + this.a.toString() + ", contentStartOffset=" + this.b.toString() + "}";
    }
}

