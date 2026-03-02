import com.google.android.gms.fido.u2f.api.common.ProtocolVersion;
import j..util.Objects;

public final class blxw {
    public final ProtocolVersion a;
    public final ByteString b;
    public final ByteString c;
    public final gfsx d;

    public blxw(ProtocolVersion protocolVersion0, ByteString hfsf0, ByteString hfsf1, gfsx gfsx0) {
        gftb.check(protocolVersion0);
        this.a = protocolVersion0;
        this.b = hfsf0;
        boolean z = false;
        gftb.checkTrue(hfsf0.size() == 0x20);
        this.c = hfsf1;
        switch(protocolVersion0.ordinal()) {
            case 1: {
                if(hfsf1.size() == 65) {
                    z = true;
                }
                gftb.checkTrue(z);
                break;
            }
            case 2: {
                if(hfsf1.size() == 0x20) {
                    z = true;
                }
                gftb.checkTrue(z);
                break;
            }
            default: {
                throw new IllegalArgumentException("Unsupported version: " + protocolVersion0);
            }
        }
        this.d = gfsx0;
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof blxw) ? Objects.equals(this.a, ((blxw)object0).a) && Objects.equals(this.b, ((blxw)object0).b) && Objects.equals(this.c, ((blxw)object0).c) && Objects.equals(this.d, ((blxw)object0).d) : false;
    }

    @Override
    public final int hashCode() {
        return Objects.hash(new Object[]{this.a, this.b, this.c, this.d});
    }

    @Override
    public final String toString() {
        ToStringHelper gfsv0 = MoreObjects.toStringHelper(this);
        gfsv0.add("protocolVersion", this.a);
        byte[] arr_b = this.b.toByteArray();
        gfsv0.add("application", ghjc.f.o(arr_b));
        byte[] arr_b1 = this.c.toByteArray();
        gfsv0.add("challenge", ghjc.f.o(arr_b1));
        gfsx gfsx0 = this.d;
        if(gfsx0.i()) {
            gfsv0.add("clientData", gfsx0.d());
        }
        return gfsv0.toString();
    }
}

