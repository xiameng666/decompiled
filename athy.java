public final class athy {
    public final atke a;
    public final ByteString b;
    public final long c;

    public athy() {
        throw null;
    }

    public athy(atke atke0, ByteString hfsf0, long v) {
        this.a = atke0;
        this.b = hfsf0;
        this.c = v;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof athy) && this.a.equals(((athy)object0).a) && this.b.equals(((athy)object0).b) && this.c == ((athy)object0).c;
    }

    @Override
    public final int hashCode() {
        return ((int)(this.c ^ this.c >>> 0x20)) ^ ((this.a.hashCode() ^ 1000003) * 1000003 ^ this.b.hashCode()) * 1000003;
    }

    @Override
    public final String toString() {
        return "Result{chunkedBackupData=" + this.a.toString() + ", digest=" + this.b + ", size=" + this.c + "}";
    }
}

