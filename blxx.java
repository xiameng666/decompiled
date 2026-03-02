import com.google.android.gms.fido.u2f.api.common.KeyHandle;
import j..util.Objects;

public final class blxx {
    public final KeyHandle a;
    public final ByteString b;
    public final ByteString c;
    public final gfsx d;

    public blxx(KeyHandle keyHandle0, ByteString hfsf0, ByteString hfsf1, gfsx gfsx0) {
        this.a = keyHandle0;
        this.b = hfsf0;
        boolean z = true;
        gftb.checkTrue(hfsf0.size() == 0x20);
        gftb.check(hfsf1);
        this.c = hfsf1;
        if(hfsf1.size() != 0x20) {
            z = false;
        }
        gftb.checkTrue(z);
        this.d = gfsx0;
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof blxx) ? Objects.equals(this.a, ((blxx)object0).a) && Objects.equals(this.b, ((blxx)object0).b) && Objects.equals(this.c, ((blxx)object0).c) : false;
    }

    @Override
    public final int hashCode() {
        return Objects.hash(new Object[]{this.a, this.b, this.c});
    }

    @Override
    public final String toString() {
        ToStringHelper gfsv0 = MoreObjects.toStringHelper(this);
        gfsv0.add("keyHandle", this.a);
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

