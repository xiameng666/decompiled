import java.math.BigInteger;
import java.util.Map;
import java.util.WeakHashMap;

public final class iftr {
    private final Map a;
    private final BigInteger[] b;
    private int c;

    public iftr() {
        this.a = new WeakHashMap();
        this.b = new BigInteger[8];
        this.c = 0;
    }

    public final void a(BigInteger bigInteger0) {
        synchronized(this) {
            this.a.put(bigInteger0, Boolean.TRUE);
            int v1 = this.c;
            this.b[v1] = bigInteger0;
            this.c = (v1 + 1) % 8;
        }
    }

    public final boolean b(BigInteger bigInteger0) {
        boolean z;
        synchronized(this) {
            z = this.a.containsKey(bigInteger0);
        }
        return z;
    }
}

