import java.math.BigInteger;

final class igqf {
    public static final BigInteger a;
    public static final BigInteger b;
    public static final igql[] c;
    public static final byte[][] d;
    public static final igql[] e;
    public static final byte[][] f;
    private static final BigInteger g;

    static {
        BigInteger bigInteger0 = igpo.c.negate();
        igqf.a = bigInteger0;
        igqf.b = igpo.d.negate();
        BigInteger bigInteger1 = igpo.e.negate();
        igqf.g = bigInteger1;
        igqf.c = new igql[]{null, new igql(igpo.c, igpo.b), null, new igql(bigInteger1, bigInteger0), null, new igql(bigInteger0, bigInteger0), null, new igql(igpo.c, bigInteger0), null};
        igqf.d = new byte[][]{0, new byte[]{1}, 0, new byte[]{-1, 0, 1}, 0, new byte[]{1, 0, 1}, 0, new byte[]{-1, 0, 0, 1}};
        igqf.e = new igql[]{null, new igql(igpo.c, igpo.b), null, new igql(bigInteger1, igpo.c), null, new igql(bigInteger0, igpo.c), null, new igql(igpo.c, igpo.c), null};
        igqf.f = new byte[][]{0, new byte[]{1}, 0, new byte[]{-1, 0, 1}, 0, new byte[]{1, 0, 1}, 0, new byte[]{-1, 0, 0, -1}};
    }

    public static byte a(int v) {
        return v == 0 ? -1 : 1;
    }

    public static BigInteger[] b(byte b, int v, boolean z) {
        BigInteger bigInteger1;
        BigInteger bigInteger0;
        if(b != -1 && b != 1) {
            throw new IllegalArgumentException("mu must be 1 or -1");
        }
        if(z) {
            bigInteger0 = igpo.d;
            bigInteger1 = BigInteger.valueOf(b);
        }
        else {
            bigInteger0 = igpo.b;
            bigInteger1 = igpo.c;
        }
        int v1 = 1;
        while(v1 < v) {
            ++v1;
            BigInteger bigInteger2 = bigInteger1;
            bigInteger1 = (b == 1 ? bigInteger1 : bigInteger1.negate()).subtract(bigInteger0.shiftLeft(1));
            bigInteger0 = bigInteger2;
        }
        return new BigInteger[]{bigInteger0, bigInteger1};
    }

    public static igqe c(BigInteger bigInteger0, BigInteger bigInteger1, BigInteger bigInteger2, byte b, int v) {
        int v1 = v + 5 >> 1;
        BigInteger bigInteger3 = bigInteger1.multiply(bigInteger0.shiftRight(v - (v1 + 10) - 2 + b));
        BigInteger bigInteger4 = bigInteger3.add(bigInteger2.multiply(bigInteger3.shiftRight(v)));
        BigInteger bigInteger5 = bigInteger4.shiftRight(v1);
        if(bigInteger4.testBit(v1 - 1)) {
            bigInteger5 = bigInteger5.add(igpo.c);
        }
        return new igqe(bigInteger5, 10);
    }
}

