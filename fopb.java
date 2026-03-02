import j..time.Instant;
import java.util.HashSet;

final class fopb implements fope {
    private final idbj a;
    private final boolean b;
    private final Instant c;

    private fopb(idbj idbj0, boolean z, Instant instant0) {
        this.a = idbj0;
        this.b = z;
        this.c = instant0;
    }

    @Override  // fope
    public final long a() {
        idbj idbj0 = this.a;
        if(((ProtoLiteMessage)idbj0).isImmutable()) {
            int v = ((ProtoLiteMessage)idbj0).t(null);
            if(v < 0) {
                throw new IllegalStateException("serialized size must be non-negative, was " + v);
            }
            return (long)v;
        }
        int v1 = idbj0.memoizedSerializedSize & 0x7FFFFFFF;
        if(v1 != 0x7FFFFFFF) {
            return (long)v1;
        }
        v1 = ((ProtoLiteMessage)idbj0).t(null);
        if(v1 < 0) {
            throw new IllegalStateException("serialized size must be non-negative, was " + v1);
        }
        idbj0.memoizedSerializedSize = idbj0.memoizedSerializedSize & 0x80000000 | v1;
        return (long)v1;
    }

    // This method was un-flattened
    public static fopb b(idbj idbj0) {
        int v1;
        Instant instant0 = Instant.EPOCH;
        Instant instant1 = hfyg.d((idbj0.g == null ? hfwn.a : idbj0.g));
        HashSet hashSet0 = new HashSet();
        for(Object object0: idbj0.k) {
            idbp idbp0 = (idbp)object0;
            Instant instant2 = instant1.plus(hfyg.c((idbp0.f == null ? hfst.a : idbp0.f)));
            if(instant2.isAfter(instant0)) {
                instant0 = instant2;
            }
            int v = idbp0.c;
            if(v == 0) {
                v1 = 4;
            }
            else {
                v1 = 4;
                switch(v) {
                    case 3: {
                        break;
                    }
                    case 4: {
                        v1 = 2;
                        break;
                    }
                    default: {
                        if(v != 5) {
                            throw null;
                        }
                        v1 = 3;
                    }
                }
            }
            switch(v1 - 1) {
                case 0: {
                    hashSet0.add(Long.valueOf(idbp0.e));
                    break;
                }
                case 1: {
                    hashSet0.remove(Long.valueOf(idbp0.e));
                }
            }
        }
        return new fopb(idbj0, ((boolean)(hashSet0.isEmpty() ^ 1)), instant0);
    }

    @Override  // fope
    public final Object c() {
        return this.a;
    }

    @Override
    public final int compareTo(Object object0) {
        boolean z = this.b;
        if(z != ((fopb)object0).b) {
            return z ? -1 : 1;
        }
        return ((fopb)object0).c.compareTo(this.c);
    }
}

