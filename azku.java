public final class azku {
    public final long a;
    public final genu b;

    public azku() {
        throw null;
    }

    public azku(long v, genu genu0) {
        this.a = v;
        if(genu0 == null) {
            throw new NullPointerException("Null systemProfile");
        }
        this.b = genu0;
    }

    public static long a(genu genu0) {
        byte[] arr_b = genu0.toBytesArray();
        return ghfs.a.a(arr_b).c();
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof azku) && this.a == ((azku)object0).a && ((ProtoLiteMessage)this.b).equals(((azku)object0).b);
    }

    @Override
    public final int hashCode() {
        genu genu0 = this.b;
        if(((ProtoLiteMessage)genu0).isImmutable()) {
            int v = ((ProtoLiteMessage)genu0).s();
            return (((int)(this.a ^ this.a >>> 0x20)) ^ 1000003) * 1000003 ^ v;
        }
        int v1 = genu0.memoizedHashCode;
        if(v1 == 0) {
            v1 = ((ProtoLiteMessage)genu0).s();
            genu0.memoizedHashCode = v1;
        }
        return (((int)(this.a ^ this.a >>> 0x20)) ^ 1000003) * 1000003 ^ v1;
    }

    @Override
    public final String toString() {
        return "SystemProfileEntity{systemProfileHash=" + this.a + ", systemProfile=" + this.b.toString() + "}";
    }
}

