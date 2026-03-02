public final class atjy implements atld, Comparable {
    public final athu a;
    public final atjz b;
    public static final int c;
    private static final ggmo d;

    static {
        atjy.d = new gfze(new atjx(), ggmi.a);
    }

    public atjy() {
        throw null;
    }

    public atjy(athu athu0, atjz atjz0) {
        if(athu0 == null) {
            throw new NullPointerException("Null hash");
        }
        this.a = athu0;
        if(atjz0 == null) {
            throw new NullPointerException("Null content");
        }
        this.b = atjz0;
    }

    @Override  // atld
    public final int a() {
        int v = this.b.a();
        return this.a.a.length + 0x20 + v + 16;
    }

    public static atjy b(atjv atjv0, atgd atgd0) {
        return new atjy(atgd0.a(atjv0.a), atjv0);
    }

    public final boolean c() {
        return this.b instanceof atlc;
    }

    @Override
    public final int compareTo(Object object0) {
        return atjy.d.compare(this, ((atjy)object0));
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof atjy) && this.a.equals(((atjy)object0).a) && this.b.equals(((atjy)object0).b);
    }

    @Override
    public final int hashCode() {
        return this.b.hashCode() ^ (this.a.hashCode() ^ 1000003) * 1000003;
    }

    @Override
    public final String toString() {
        return "Chunk{hash=" + this.a.toString() + ", content=" + this.b.toString() + "}";
    }
}

