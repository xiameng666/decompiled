import java.nio.ByteBuffer;
import java.util.Arrays;

public final class czwh {
    public final byte[] a;
    private final byte[] b;

    public czwh(byte[] arr_b, byte[] arr_b1) {
        this.a = arr_b;
        this.b = arr_b1;
    }

    public static czwh a() {
        return new czwh(new byte[0], czwi.b);
    }

    public static czwh b() {
        return czwh.c(new byte[0]);
    }

    public static czwh c(byte[] arr_b) {
        return new czwh(arr_b, czwi.a);
    }

    public final boolean d() {
        return !Arrays.equals(czwi.a, this.b);
    }

    public final byte[] e() {
        ByteBuffer byteBuffer0 = ByteBuffer.allocate(this.a.length + 2);
        byteBuffer0.put(this.a);
        byteBuffer0.put(this.b);
        return byteBuffer0.array();
    }
}

