import j..util.Objects;
import java.nio.ByteBuffer;

public final class bmbo {
    private static final bboh a;
    private final ByteString b;
    private final byte c;
    private final long d;
    private final hhrp e;
    private final bmbl f;

    static {
        bmbo.a = bnaa.a("AuthenticatorData");
    }

    public bmbo(byte[] arr_b, byte b, long v, bmbl bmbl0, hhrp hhrp0) {
        boolean z1;
        ByteString hfsf0 = ByteString.copyFrom(arr_b);
        super();
        boolean z = true;
        gftb.checkTrue(hfsf0.size() == 0x20);
        gftb.b(v < 0x100000000L && v >= 0L, "Signature counter is not within a legitimate range");
        if(bmbl0 == null && (b & 0x40) == 0) {
            z1 = true;
        }
        else if(bmbl0 == null || (b & 0x40) == 0) {
            z1 = false;
        }
        else {
            z1 = true;
        }
        gftb.b(z1, "Flag does not match with the attestationData");
        if((hhrp0 != null || (b & 0xFFFFFF80) != 0) && (hhrp0 == null || (b & 0xFFFFFF80) == 0)) {
            z = false;
        }
        gftb.b(z, "Flag does not match with the DPK extension");
        this.b = hfsf0;
        this.c = b;
        this.d = v;
        this.f = bmbl0;
        this.e = hhrp0;
    }

    public final ByteString a() {
        return ByteString.copyFrom(this.b());
    }

    public final byte[] b() {
        byte[] arr_b = glwl.d(new byte[][]{this.b.toByteArray(), ByteBuffer.allocate(1).put(this.c).array(), new byte[]{((byte)(((int)(this.d >>> 24)))), ((byte)(((int)(this.d >>> 16)))), ((byte)(((int)(this.d >>> 8)))), ((byte)(((int)this.d)))}});
        bmbl bmbl0 = this.f;
        if(bmbl0 != null) {
            int v = bmbl0.b.size();
            arr_b = glwl.d(new byte[][]{arr_b, glwl.d(new byte[][]{bmbl0.a.toByteArray(), new byte[]{((byte)(v >>> 8)), ((byte)v)}, bmbl0.b.toByteArray(), bmbl0.c.toByteArray()})});
        }
        hhrp hhrp0 = this.e;
        if(hhrp0 != null) {
            try {
                return glwl.d(new byte[][]{arr_b, hhrp0.s()});
            }
            catch(hhrm hhrm0) {
                a.ae(bmbo.a.j(), "An error occurred while encoding extensions", hhrm0);
            }
        }
        return arr_b;
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof bmbo) ? Objects.equals(this.b, ((bmbo)object0).b) && this.c == ((bmbo)object0).c && this.d == ((bmbo)object0).d && Objects.equals(this.f, ((bmbo)object0).f) : false;
    }

    @Override
    public final int hashCode() {
        return Objects.hash(new Object[]{this.b, ((byte)this.c), ((long)this.d), this.f});
    }
}

