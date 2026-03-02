import java.nio.ByteBuffer;
import java.util.Arrays;

final class azrb {
    final short[] a;
    private final int b;
    private final long[] c;

    public azrb(long[] arr_v) {
        int v = arr_v.length;
        batl.b((v & 3) == 0);
        this.c = arr_v;
        int v1 = Math.max(4, 29 - Integer.numberOfLeadingZeros(v));
        this.b = v1;
        short[] arr_v1 = new short[1 << v1];
        this.a = arr_v1;
        Arrays.fill(arr_v1, 0x7FFF);
        while(true) {
            v += -4;
            if(v < 0) {
                break;
            }
            batl.c(v == 0 || arr_v[v] > arr_v[v - 4], "Must be sorted");
            this.a[azrb.b(arr_v[v], this.b)] = (short)v;
        }
    }

    public final int a(byte[] arr_b) {
        batl.s(arr_b);
        batl.b(arr_b.length == 0x20);
        ByteBuffer byteBuffer0 = ByteBuffer.wrap(arr_b);
        long v = byteBuffer0.getLong(0);
        for(int v1 = this.a[azrb.b(v, this.b)]; true; v1 += 4) {
            long[] arr_v = this.c;
            if(v1 >= arr_v.length) {
                break;
            }
            int v2 = Long.compare(arr_v[v1], v);
            if(v2 > 0) {
                break;
            }
            if(v2 == 0 && arr_v[v1 + 1] == byteBuffer0.getLong(8) && arr_v[v1 + 2] == byteBuffer0.getLong(16) && arr_v[v1 + 3] == byteBuffer0.getLong(24)) {
                return v1 / 4;
            }
        }
        return -1;
    }

    private static int b(long v, int v1) {
        return (int)(v >>> 0x40 - v1);
    }
}

