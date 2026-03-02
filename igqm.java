import java.math.BigInteger;

public final class igqm {
    public final igqn a;
    public final igqd b;

    public igqm(igps igps0, igqn igqn0) {
        this.a = igqn0;
        this.b = new igqd(igps0.f(igqn0.a));
    }

    public static final BigInteger a(BigInteger bigInteger0, BigInteger bigInteger1, int v) {
        int v1 = bigInteger1.signum();
        BigInteger bigInteger2 = bigInteger0.multiply(bigInteger1.abs());
        boolean z = bigInteger2.testBit(v - 1);
        BigInteger bigInteger3 = bigInteger2.shiftRight(v);
        if(z) {
            bigInteger3 = bigInteger3.add(igpo.c);
        }
        return v1 >= 0 ? bigInteger3 : bigInteger3.negate();
    }
}

