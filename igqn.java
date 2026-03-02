import java.math.BigInteger;

public final class igqn {
    protected final BigInteger a;
    public final BigInteger b;
    public final BigInteger c;
    public final BigInteger d;
    public final BigInteger e;
    public final BigInteger f;
    public final BigInteger g;
    public final int h;

    public igqn(BigInteger bigInteger0, BigInteger[] arr_bigInteger, BigInteger[] arr_bigInteger1, BigInteger bigInteger1, BigInteger bigInteger2, int v) {
        igqn.a(arr_bigInteger, "v1");
        igqn.a(arr_bigInteger1, "v2");
        this.a = bigInteger0;
        this.b = arr_bigInteger[0];
        this.c = arr_bigInteger[1];
        this.d = arr_bigInteger1[0];
        this.e = arr_bigInteger1[1];
        this.f = bigInteger1;
        this.g = bigInteger2;
        this.h = v;
    }

    private static void a(BigInteger[] arr_bigInteger, String s) {
        if(arr_bigInteger[0] != null && arr_bigInteger[1] != null) {
            return;
        }
        throw new IllegalArgumentException(a.a(s, "\'", "\' must consist of exactly 2 (non-null) values"));
    }
}

