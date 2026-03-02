final class eiua {
    private final long a;
    private final ByteString b;
    private final goas c;

    public eiua() {
        throw null;
    }

    public eiua(long v, ByteString hfsf0, goas goas0) {
        this.a = v;
        if(hfsf0 == null) {
            throw new NullPointerException("Null partitionTag");
        }
        this.b = hfsf0;
        if(goas0 == null) {
            throw new NullPointerException("Null paramPartition");
        }
        this.c = goas0;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof eiua) && this.a == ((eiua)object0).a && this.b.equals(((eiua)object0).b) && ((ProtoLiteMessage)this.c).equals(((eiua)object0).c);
    }

    @Override
    public final int hashCode() {
        int v = (((int)(this.a ^ this.a >>> 0x20)) ^ 1000003) * 1000003 ^ this.b.hashCode();
        goas goas0 = this.c;
        if(((ProtoLiteMessage)goas0).isImmutable()) {
            return ((ProtoLiteMessage)goas0).s() ^ v * 1000003;
        }
        int v1 = goas0.memoizedHashCode;
        if(v1 == 0) {
            v1 = ((ProtoLiteMessage)goas0).s();
            goas0.memoizedHashCode = v1;
        }
        return v1 ^ v * 1000003;
    }

    @Override
    public final String toString() {
        return "ParamPartitionCacheKey{staticConfigPackageId=" + this.a + ", partitionTag=" + this.b.toString() + ", paramPartition=" + this.c.toString() + "}";
    }
}

