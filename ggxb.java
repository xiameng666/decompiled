import j..util.Objects;
import java.math.BigDecimal;

final class ggxb implements Comparable {
    final BigDecimal a;
    final BigDecimal b;
    final BigDecimal c;

    public ggxb(ghae ghae0) {
        this(new BigDecimal(ghae0.h), new BigDecimal(ghae0.i), new BigDecimal(ghae0.j));
    }

    public ggxb(BigDecimal bigDecimal0, BigDecimal bigDecimal1, BigDecimal bigDecimal2) {
        this.a = bigDecimal0;
        this.b = bigDecimal1;
        this.c = bigDecimal2;
    }

    final ggxb a(ggxb ggxb0) {
        return new ggxb(this.b.multiply(ggxb0.c).subtract(this.c.multiply(ggxb0.b)), this.c.multiply(ggxb0.a).subtract(this.a.multiply(ggxb0.c)), this.a.multiply(ggxb0.b).subtract(this.b.multiply(ggxb0.a)));
    }

    @Override
    public final int compareTo(Object object0) {
        int v = this.a.compareTo(((ggxb)object0).a);
        if(v != 0) {
            return v;
        }
        int v1 = this.b.compareTo(((ggxb)object0).b);
        return v1 == 0 ? this.c.compareTo(((ggxb)object0).c) : v1;
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof ggxb) ? this.a.equals(((ggxb)object0).a) && this.b.equals(((ggxb)object0).b) && this.c.equals(((ggxb)object0).c) : false;
    }

    @Override
    public final int hashCode() {
        return Objects.hash(new Object[]{this.a, this.b, this.c});
    }
}

