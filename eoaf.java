public final class eoaf implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        int v;
        if(((ProtoLiteMessage)(((emla)object0))).isImmutable()) {
            v = ((ProtoLiteMessage)(((emla)object0))).t(null);
            if(v < 0) {
                throw new IllegalStateException("serialized size must be non-negative, was " + v);
            }
        }
        else {
            v = ((emla)object0).memoizedSerializedSize & 0x7FFFFFFF;
            if(v == 0x7FFFFFFF) {
                v = ((ProtoLiteMessage)(((emla)object0))).t(null);
                if(v < 0) {
                    throw new IllegalStateException("serialized size must be non-negative, was " + v);
                }
                ((emla)object0).memoizedSerializedSize = ((emla)object0).memoizedSerializedSize & 0x80000000 | v;
                return (long)v;
            }
        }
        return (long)v;
    }
}

