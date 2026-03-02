import java.util.Arrays;
import java.util.BitSet;

public final class fvcc {
    public static final byte a;
    public final BitSet b;
    public final BitSet c;
    public final byte[] d;

    static {
        fvcc.a = glxj.a(0xFFL);
    }

    public fvcc(int v) {
        this.b = new BitSet();
        this.c = new BitSet();
        byte[] arr_b = new byte[v];
        this.d = arr_b;
        Arrays.fill(arr_b, fvcc.a);
    }

    public final fvce a() {
        BitSet bitSet0 = this.b;
        int v = bitSet0.cardinality();
        byte[] arr_b = new byte[v];
        BitSet bitSet1 = new BitSet(v);
        BitSet bitSet2 = new BitSet();
        int v2 = 0;
        int v3 = 0;
        for(int v1 = 0; true; ++v1) {
            byte[] arr_b1 = this.d;
            if(v1 >= arr_b1.length) {
                break;
            }
            BitSet bitSet3 = this.c;
            boolean z = bitSet3.get(v1) || bitSet0.get(v1);
            bitSet1.set(v1, z);
            if(z) {
                bitSet2.set(v2, bitSet3.get(v1));
                ++v2;
            }
            if(arr_b1[v1] != fvcc.a && bitSet0.get(v1)) {
                arr_b[v3] = arr_b1[v1];
                ++v3;
            }
        }
        return new fvce(bitSet1, bitSet2, arr_b);
    }
}

