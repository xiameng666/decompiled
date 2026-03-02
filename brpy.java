public final class brpy implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        int v;
        if(((ProtoLiteMessage)(((hler)object0))).isImmutable()) {
            v = ((ProtoLiteMessage)(((hler)object0))).t(null);
            if(v < 0) {
                throw new IllegalStateException("serialized size must be non-negative, was " + v);
            }
        }
        else {
            v = ((hler)object0).memoizedSerializedSize & 0x7FFFFFFF;
            if(v == 0x7FFFFFFF) {
                v = ((ProtoLiteMessage)(((hler)object0))).t(null);
                if(v < 0) {
                    throw new IllegalStateException("serialized size must be non-negative, was " + v);
                }
                ((hler)object0).memoizedSerializedSize = ((hler)object0).memoizedSerializedSize & 0x80000000 | v;
                return v;
            }
        }
        return v;
    }
}

