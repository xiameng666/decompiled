import java.util.Arrays;
import java.util.BitSet;

public final class fvck {
    final fvcm a;
    public final boolean b;
    final double c;
    final double d;
    public final int e;
    public final int f;
    final double g;
    public BitSet h;
    public BitSet i;
    public short[] j;
    public fvcp k;
    public fvcp l;
    public fvcc m;

    public fvck(fvcm fvcm0, double f, double f1, int v, int v1, double f2, boolean z) {
        this.a = fvcm0;
        this.c = f;
        this.d = f1;
        this.e = v;
        this.f = v1;
        this.g = f2;
        this.b = z;
        this.l = new fvcp();
        int v2 = v * v1;
        this.h = new BitSet(v2);
        this.i = new BitSet(v2);
        if(z) {
            this.k = new fvcp();
        }
        short[] arr_v = new short[v2];
        this.j = arr_v;
        Arrays.fill(arr_v, (short)0xA3E9);
    }
}

