import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;

public final class stl {
    public final srp a;
    public final srp b;
    public final byte[] c;
    public final byte[] d;
    public int e;
    private final ieni f;
    private final srk g;
    private srq h;
    private final byte[] i;

    public stl(srk srk0, srp srp0, srp srp1, srp srp2, srp srp3, byte[] arr_b) {
        this.f = new ienk();
        this.e = 1;
        this.a = srp0;
        this.b = srp1;
        this.c = stm.a(new byte[srk0.d]);
        this.g = srk0;
        this.i = stm.a(arr_b);
        this.d = stm.a(arr_b);
        if(srp2 != null && srp3 != null) {
            this.h = new srq(srp2, srp3);
        }
    }

    public final sro a() {
        srq srq0 = this.h;
        srp srp0 = null;
        srp srp1 = srq0 == null ? null : srq0.a;
        if(srq0 != null) {
            srp0 = srq0.b;
        }
        srn srn0 = new srn(this.a, this.b, srp1, srp0);
        return new sro(this.g, srn0, this.i);
    }

    public static void b(int v, byte[] arr_b) {
        int v1 = arr_b.length - 8;
        long v2 = ByteBuffer.wrap(Arrays.copyOfRange(arr_b, v1, arr_b.length)).getLong() + ((long)v);
        byte[] arr_b1 = ByteBuffer.allocate(8).putLong(v2).array();
        System.arraycopy(arr_b1, 0, arr_b, v1, arr_b1.length);
    }

    public final byte[] c(byte[] arr_b) {
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
        byteArrayOutputStream0.write(arr_b, 0, arr_b.length);
        int v = this.g.d;
        int v1 = arr_b.length % v;
        if(v1 != 0) {
            v -= v1;
        }
        byte[] arr_b1 = new byte[v];
        this.f.c(arr_b1, 0);
        byteArrayOutputStream0.write(arr_b1, 0, v);
        return byteArrayOutputStream0.toByteArray();
    }

    public final int d(int v) {
        int v1 = this.e;
        if(v1 == 1) {
            return v == 3 ? 2 : 1;
        }
        return v1 == v ? 2 : 1;
    }
}

