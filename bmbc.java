import j..util.Objects;
import java.io.ByteArrayInputStream;
import java.io.IOException;

public final class bmbc {
    public final short a;
    private final ByteString b;

    private bmbc(short v, ByteString hfsf0) {
        this.a = v;
        this.b = hfsf0;
    }

    public static bmbc a(byte[] arr_b) {
        if(arr_b.length < 2) {
            throw new IOException("Invalid response length");
        }
        gftb.D(arr_b.length - 2, arr_b.length);
        return new bmbc(new ghjg(new ByteArrayInputStream(arr_b, arr_b.length - 2, arr_b.length - (arr_b.length - 2))).readShort(), ByteString.z(arr_b, 0, arr_b.length - 2));
    }

    public final byte[] b() {
        return this.b.toByteArray();
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof bmbc) ? this.a == ((bmbc)object0).a && Objects.equals(this.b, ((bmbc)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return Objects.hash(new Object[]{((short)this.a), this.b});
    }
}

