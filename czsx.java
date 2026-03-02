import java.nio.ByteBuffer;
import java.util.Arrays;

final class czsx {
    static final byte[] a;
    public final byte[] b;
    public final byte[] c;
    public static final int d;

    static {
        czsx.a = new byte[]{0, 0, 0};
    }

    public czsx(byte[] arr_b, byte[] arr_b1) {
        this.b = arr_b;
        this.c = arr_b1;
    }

    public final int a() {
        return this.c.length + 3;
    }

    final boolean b() {
        return Arrays.equals(this.b, czsx.a);
    }

    public static byte[] c(byte[] arr_b, byte[] arr_b1) {
        if(arr_b.length != 3) {
            czkq.a.b().i("Cannot serialize BlePacket: expected a serviceIdHash of %d bytes but got %d", Integer.valueOf(3), Integer.valueOf(arr_b.length));
            return null;
        }
        if(arr_b1.length > 0x7FFFFFFC) {
            czkq.a.b().i("Cannot serialize BlePacket: expected data of at most %d bytes but got %d", Integer.valueOf(0x7FFFFFFC), Integer.valueOf(arr_b1.length));
            return null;
        }
        ByteBuffer byteBuffer0 = ByteBuffer.allocate(arr_b1.length + 3);
        byteBuffer0.put(arr_b);
        byteBuffer0.put(arr_b1);
        return byteBuffer0.array();
    }
}

