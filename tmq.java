import java.util.Arrays;

public final class tmq extends tcb {
    public static final tcj a;
    public final int e;
    private static final tch f;

    static {
        tmq.a = new tcj((byte)0x82, 7);
        tmq.f = new tch(2);
    }

    public tmq(tcj tcj0, byte[] arr_b) {
        super(tcj0, arr_b, tmq.f);
        teb.e(arr_b.length >= 5 && arr_b.length <= 14, "data with length from %s to %s bytes is expected", new Object[]{((int)5), ((int)14)});
        this.e = this.d.length - 4;
    }

    public tmq(byte[] arr_b) {
        this(tmq.a, arr_b);
    }

    public final byte[] a(int v, int v1) {
        int v2 = v1 + v;
        return v2 > this.d.length ? null : Arrays.copyOfRange(this.d, v, v2);
    }
}

