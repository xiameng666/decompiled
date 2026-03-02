public final class grch {
    public static final byte[] a;
    public final ByteString b;

    static {
        grch.a = new byte[]{-109, -102, 86, 2, 13, -80, 87, -22, 102, -1, -52, -109, 21, 77, -50, 91, 33, 92, 21, 37, 44, 35, 52, -26, -82, 0x7A, 107, 0x60, (byte)0x91, 102, 53, 29};
    }

    public grch(ByteString hfsf0) {
        this.b = hfsf0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof grch) ? ibuq.m(this.b, ((grch)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override
    public final String toString() {
        return "UsernamePasswordHashCacheKey(cacheKeyBytes=" + this.b + ")";
    }
}

