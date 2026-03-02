import java.math.BigInteger;

final class igqe {
    public final int a;
    private final BigInteger b;

    public igqe(BigInteger bigInteger0, int v) {
        this.b = bigInteger0;
        this.a = v;
    }

    public final int a(BigInteger bigInteger0) {
        BigInteger bigInteger1 = bigInteger0.shiftLeft(this.a);
        return this.b.compareTo(bigInteger1);
    }

    public final BigInteger b() {
        return this.b.shiftRight(this.a);
    }

    public final BigInteger c() {
        igqe igqe0 = new igqe(igpo.c, 1);
        int v = igqe0.a;
        int v1 = this.a;
        if(v1 != v) {
            igqe0 = new igqe(igqe0.b.shiftLeft(v1 - v), v1);
        }
        return this.d(igqe0).b();
    }

    public final igqe d(igqe igqe0) {
        int v = this.a;
        if(v == igqe0.a) {
            return new igqe(this.b.add(igqe0.b), v);
        }
        throw new IllegalArgumentException("Only SimpleBigDecimal of same scale allowed in arithmetic operations");
    }

    public final igqe e(BigInteger bigInteger0) {
        BigInteger bigInteger1 = bigInteger0.shiftLeft(this.a);
        return new igqe(this.b.subtract(bigInteger1), this.a);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof igqe) ? this.b.equals(((igqe)object0).b) && this.a == ((igqe)object0).a : false;
    }

    public final igqe f(igqe igqe0) {
        return this.d(new igqe(igqe0.b.negate(), igqe0.a));
    }

    @Override
    public final int hashCode() {
        return this.a ^ this.b.hashCode();
    }

    @Override
    public final String toString() {
        BigInteger bigInteger0 = this.b();
        int v = this.a;
        BigInteger bigInteger1 = bigInteger0.shiftLeft(v);
        BigInteger bigInteger2 = this.b.subtract(bigInteger1);
        if(this.b.signum() == -1) {
            bigInteger2 = igpo.c.shiftLeft(v).subtract(bigInteger2);
        }
        if(bigInteger0.signum() == -1 && !bigInteger2.equals(igpo.b)) {
            bigInteger0 = bigInteger0.add(igpo.c);
        }
        String s = bigInteger0.toString();
        char[] arr_c = new char[v];
        String s1 = bigInteger2.toString(2);
        int v1 = s1.length();
        int v2 = v - v1;
        for(int v4 = 0; v4 < v2; ++v4) {
            arr_c[v4] = '0';
        }
        for(int v3 = 0; v3 < v1; ++v3) {
            arr_c[v2 + v3] = s1.charAt(v3);
        }
        return s + "." + new String(arr_c);
    }
}

