import j..util.Objects;
import java.util.BitSet;

public final class fvcb {
    int a;
    int b;
    int c;
    final fvcj d;
    final fvce e;

    public fvcb(fvce fvce0, fvcj fvcj0) {
        this.d = fvcj0;
        Objects.requireNonNull(fvce0);
        this.e = fvce0;
        super();
        this.a = 0;
        this.b = -1;
        this.c = 0;
    }

    public final boolean a(fvcd fvcd0) {
        float f;
        int v5;
        fvcj fvcj0 = this.d;
        if(!fvcj0.hasNext()) {
            return false;
        }
        int v = this.b;
        int v1 = this.a;
        int v2 = fvcj0.a();
        this.b = v2;
        fvce fvce0 = this.e;
        int v3 = this.a + fvcb.b(fvce0.a, v, v2);
        this.a = v3;
        BitSet bitSet0 = fvce0.b;
        this.c += v3 - v1 - fvcb.b(bitSet0, v1, v3);
        int v4 = 3;
        if(fvce0.a.get(this.b)) {
            v5 = bitSet0.get(this.a) ? 4 : 3;
        }
        else {
            v5 = 2;
        }
        if(v5 == 3) {
            f = (float)(fvce0.c[this.c] & 0xFF);
        }
        else {
            v4 = v5;
            f = 0.0f;
        }
        fvcd0.a = f;
        fvcd0.c = v4;
        fvcd0.b = this.b;
        return true;
    }

    private static final int b(BitSet bitSet0, int v, int v1) {
        int v2 = 0;
        for(int v3 = bitSet0.nextSetBit(Math.max(0, v)); v3 >= 0 && v3 < v1; v3 = bitSet0.nextSetBit(v3 + 1)) {
            ++v2;
        }
        return v2;
    }
}

