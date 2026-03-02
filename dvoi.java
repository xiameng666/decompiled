import j..util.Objects;
import java.util.Arrays;
import java.util.Set;

public final class dvoi {
    public final byte[] a;
    public final byte[] b;
    public final ggfp c;

    public dvoi(byte[] arr_b, byte[] arr_b1, Set set0) {
        this.a = arr_b;
        this.b = arr_b1;
        this.c = ggfp.G(set0);
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof dvoi) && Arrays.equals(this.a, ((dvoi)object0).a) && Arrays.equals(this.b, ((dvoi)object0).b) && Objects.equals(this.c, ((dvoi)object0).c);
    }

    @Override
    public final int hashCode() {
        return Objects.hash(new Object[]{Arrays.hashCode(this.a), Arrays.hashCode(this.b), this.c});
    }

    @Override
    public final String toString() {
        ToStringHelper gfsv0 = MoreObjects.toStringHelper(this);
        ByteString hfsf0 = null;
        gfsv0.add("tapId", (this.a == null ? null : ByteString.copyFrom(this.a)));
        byte[] arr_b = this.b;
        if(arr_b != null) {
            hfsf0 = ByteString.copyFrom(arr_b);
        }
        gfsv0.add("customerId", hfsf0);
        gfsv0.add("transmittedValuables", this.c);
        return gfsv0.toString();
    }
}

