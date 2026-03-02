import java.util.List;

public final class ckdh {
    public static final ckdh a;
    public final String b;
    public final long c;
    public final long d;
    public final boolean e;
    public final gged_interceptors f;

    static {
        ckdh.a = ckdh.c("", 0L, false);
    }

    public ckdh() {
        throw null;
    }

    public ckdh(String s, long v, long v1, boolean z, gged_interceptors gged0) {
        if(s == null) {
            throw new NullPointerException("Null url");
        }
        this.b = s;
        this.c = v;
        this.d = v1;
        this.e = z;
        if(gged0 == null) {
            throw new NullPointerException("Null uploadData");
        }
        this.f = gged0;
    }

    public static ckdh a(String s, long v, long v1) {
        return new ckdh(s, v, v1, false, ggna.a);
    }

    public static ckdh b(String s, long v, long v1, boolean z, List list0) {
        return new ckdh(s, v, v1, z, gged_interceptors.i(list0));
    }

    public static ckdh c(String s, long v, boolean z) {
        return new ckdh(s, v, 0L, z, ggna.a);
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof ckdh) && this.b.equals(((ckdh)object0).b) && this.c == ((ckdh)object0).c && this.d == ((ckdh)object0).d && this.e == ((ckdh)object0).e && ggia.i(this.f, ((ckdh)object0).f);
    }

    @Override
    public final int hashCode() {
        int v = this.b.hashCode() ^ 1000003;
        return this.e ? this.f.hashCode() ^ (((v * 1000003 ^ ((int)(this.c ^ this.c >>> 0x20))) * 1000003 ^ ((int)(this.d >>> 0x20 ^ this.d))) * 1000003 ^ 0x4CF) * 1000003 : this.f.hashCode() ^ (((v * 1000003 ^ ((int)(this.c ^ this.c >>> 0x20))) * 1000003 ^ ((int)(this.d >>> 0x20 ^ this.d))) * 1000003 ^ 0x4D5) * 1000003;
    }

    @Override
    public final String toString() {
        return "DataUploadDescription{url=" + this.b + ", uncompressedBytesCollected=" + this.c + ", bytesUploaded=" + this.d + ", isInferred=" + this.e + ", uploadData=" + this.f.toString() + "}";
    }
}

