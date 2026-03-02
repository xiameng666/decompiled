import j..time.Instant;

final class fopd implements fope {
    private final iddk a;
    private final boolean b;
    private final Instant c;

    private fopd(iddk iddk0, boolean z, Instant instant0) {
        this.a = iddk0;
        this.b = z;
        this.c = instant0;
    }

    @Override  // fope
    public final long a() {
        iddk iddk0 = this.a;
        if(((ProtoLiteMessage)iddk0).isImmutable()) {
            int v = ((ProtoLiteMessage)iddk0).t(null);
            if(v < 0) {
                throw new IllegalStateException("serialized size must be non-negative, was " + v);
            }
            return (long)v;
        }
        int v1 = iddk0.memoizedSerializedSize & 0x7FFFFFFF;
        if(v1 != 0x7FFFFFFF) {
            return (long)v1;
        }
        v1 = ((ProtoLiteMessage)iddk0).t(null);
        if(v1 < 0) {
            throw new IllegalStateException("serialized size must be non-negative, was " + v1);
        }
        iddk0.memoizedSerializedSize = iddk0.memoizedSerializedSize & 0x80000000 | v1;
        return (long)v1;
    }

    public static fopd b(iddk iddk0) {
        Instant instant0 = Instant.EPOCH;
        Instant instant1 = hfyg.d((iddk0.e == null ? hfwn.a : iddk0.e));
        int v = 0;
        for(Object object0: iddk0.d) {
            hfst hfst0 = ((iddi)object0).f;
            if(hfst0 == null) {
                hfst0 = hfst.a;
            }
            Instant instant2 = instant1.plus(hfyg.c(hfst0));
            hfst hfst1 = ((iddi)object0).g;
            if(hfst1 == null) {
                hfst1 = hfst.a;
            }
            Instant instant3 = instant2.plus(hfyg.c(hfst1));
            if(instant3.isAfter(instant0)) {
                instant0 = instant3;
            }
            v |= ((((iddi)object0).b & 16) == 0 ? 0 : 1) ^ 1;
        }
        return new fopd(iddk0, ((boolean)v), instant0);
    }

    @Override  // fope
    public final Object c() {
        return this.a;
    }

    @Override
    public final int compareTo(Object object0) {
        boolean z = this.b;
        if(z != ((fopd)object0).b) {
            return z ? -1 : 1;
        }
        return ((fopd)object0).c.compareTo(this.c);
    }
}

