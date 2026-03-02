import com.google.android.gms.fido.common.Transport;

public final class bmmo {
    public final Transport a;
    public final int b;
    public final ggfp c;
    public final ByteString d;
    public final long e;
    public final gfsx f;

    public bmmo() {
        throw null;
    }

    public bmmo(Transport transport0, int v, ggfp ggfp0, ByteString hfsf0, long v1, gfsx gfsx0) {
        if(transport0 == null) {
            throw new NullPointerException("Null transport");
        }
        this.a = transport0;
        this.b = v;
        if(ggfp0 == null) {
            throw new NullPointerException("Null permissions");
        }
        this.c = ggfp0;
        this.d = hfsf0;
        this.e = v1;
        this.f = gfsx0;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof bmmo) && this.a.equals(((bmmo)object0).a) && this.b == ((bmmo)object0).b && this.c.equals(((bmmo)object0).c) && this.d.equals(((bmmo)object0).d) && this.e == ((bmmo)object0).e && this.f.equals(((bmmo)object0).f);
    }

    @Override
    public final int hashCode() {
        return this.f.hashCode() ^ (((((this.a.hashCode() ^ 1000003) * 1000003 ^ this.b) * 1000003 ^ this.c.hashCode()) * 1000003 ^ this.d.hashCode()) * 1000003 ^ ((int)(this.e ^ this.e >>> 0x20))) * 1000003;
    }

    @Override
    public final String toString() {
        return "PinUvAuthToken{transport=" + this.a.h + ", protocolVersion=" + this.b + ", permissions=" + this.c.toString() + ", token=" + this.d.toString() + ", expirationTime=" + this.e + ", rpId=" + this.f.toString() + "}";
    }
}

