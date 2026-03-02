import java.math.BigInteger;

public final class hmfu extends hmfv {
    public final hmgd a;
    public byte[] b;
    public byte[] c;

    public hmfu(hmgd hmgd0) {
        super(hmgd0);
        this.b = null;
        this.c = null;
        this.a = hmgd0;
    }

    @Override  // hmfv
    public final int a() {
        try {
            hmgd hmgd0 = this.a;
            byte[] arr_b = hmgd0.a.e;
            if(arr_b == null || arr_b.length == 0) {
                return 3;
            }
            hmep hmep0 = hmgd0.e.h();
            long v = hmgv.a(hmgd0.p.c.k.a);
            this.d.e();
            return ((long)(((Long)hmep0.a))) != v ? 2 : 1;
        }
        catch(hmdp unused_ex) {
            return 3;
        }
        return 2;
    }

    @Override  // hmfv
    public final int b() {
        return 1;
    }

    public final boolean c() {
        return new BigInteger(hmgz.e(this.b).j(), 2).longValue() == 0x3FFFFL;
    }
}

