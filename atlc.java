import j..util.Optional;

public final class atlc extends atjz {
    public final long a;
    public final int b;
    public final Optional c;

    public atlc() {
        throw null;
    }

    public atlc(long v, int v1, Optional optional0) {
        this.a = v;
        this.b = v1;
        if(optional0 == null) {
            throw new NullPointerException("Null crc32c");
        }
        this.c = optional0;
    }

    @Override  // atld
    public final int a() {
        return 28;
    }

    @Override  // atjz
    public final int b() {
        return this.b;
    }

    public static atlc c(long v, int v1) {
        return new atlc(v, v1, Optional.empty());
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof atlc) && this.a == ((atlc)object0).a && this.b == ((atlc)object0).b && this.c.equals(((atlc)object0).c);
    }

    @Override
    public final int hashCode() {
        return (this.b ^ (((int)(this.a ^ this.a >>> 0x20)) ^ 1000003) * 1000003) * 1000003 ^ this.c.hashCode();
    }

    @Override
    public final String toString() {
        return "ReferenceChunkContent{startOffset=" + this.a + ", length=" + this.b + ", crc32c=" + this.c.toString() + "}";
    }
}

