final class fopc implements fope {
    private final iddc a;
    private final Comparable b;

    public fopc(iddc iddc0, Comparable comparable0) {
        this.a = iddc0;
        this.b = comparable0;
    }

    @Override  // fope
    public final long a() {
        iddc iddc0 = this.a;
        if(((ProtoLiteMessage)iddc0).isImmutable()) {
            int v = ((ProtoLiteMessage)iddc0).t(null);
            if(v < 0) {
                throw new IllegalStateException("serialized size must be non-negative, was " + v);
            }
            return (long)v;
        }
        int v1 = iddc0.memoizedSerializedSize & 0x7FFFFFFF;
        if(v1 != 0x7FFFFFFF) {
            return (long)v1;
        }
        v1 = ((ProtoLiteMessage)iddc0).t(null);
        if(v1 < 0) {
            throw new IllegalStateException("serialized size must be non-negative, was " + v1);
        }
        iddc0.memoizedSerializedSize = iddc0.memoizedSerializedSize & 0x80000000 | v1;
        return (long)v1;
    }

    @Override  // fope
    public final Object c() {
        return this.a;
    }

    @Override
    public final int compareTo(Object object0) {
        return this.b.compareTo(((fopc)object0).b);
    }
}

