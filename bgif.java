public final class bgif {
    public static final byte[] a;
    public final ByteString b;

    static {
        bgif.a = new byte[]{103, 65, -61, 68, -110, -97, -42, 86, (byte)0x8B, 56, 0x6F, (byte)0x8E, (byte)0xD1, -13, -39, (byte)0xE0, -75, 10, -3, 56, -13, -52, 44, 0x77, -43, 78, 81, 0x1F, -11, 94, 90, -61};
    }

    public bgif(ByteString hfsf0) {
        this.b = hfsf0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof bgif) ? ibuq.m(this.b, ((bgif)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override
    public final String toString() {
        return "PasswordHashCacheKey(cacheKeyBytes=" + this.b + ")";
    }
}

