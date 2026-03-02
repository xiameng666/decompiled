import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.BitSet;

public final class gxub {
    public static final Charset a;
    private final BitSet b;
    private final int c;
    private final gxua d;

    static {
        gxub.a = StandardCharsets.UTF_8;
    }

    public gxub(byte[] arr_b, gxua gxua0) {
        this.b = BitSet.valueOf(arr_b);
        this.c = arr_b.length * 8;
        this.d = gxua0;
    }

    public final void a(String s) {
        int[] arr_v = this.d.a(s.getBytes(gxub.a));
        for(int v = 0; v < arr_v.length; ++v) {
            int v1 = glxk.b(arr_v[v], this.c);
            this.b.set(v1);
        }
    }

    public final boolean b(byte[] arr_b) {
        int[] arr_v = this.d.a(arr_b);
        for(int v = 0; v < arr_v.length; ++v) {
            int v1 = glxk.b(arr_v[v], this.c);
            if(!this.b.get(v1)) {
                return false;
            }
        }
        return true;
    }

    public final byte[] c() {
        byte[] arr_b = this.b.toByteArray();
        int v = this.c / 8;
        return arr_b.length == v ? arr_b : Arrays.copyOf(arr_b, v);
    }
}

