import j..util.Objects;
import java.math.BigInteger;

public final class bmbx extends bmbv {
    public final BigInteger b;
    public final BigInteger c;
    public final bmbw d;

    public bmbx(bmhq bmhq0, bmbw bmbw0, BigInteger bigInteger0, BigInteger bigInteger1) {
        super(bmhq0);
        gftb.check(bigInteger0);
        this.b = bigInteger0;
        gftb.check(bigInteger1);
        this.c = bigInteger1;
        gftb.check(bmbw0);
        this.d = bmbw0;
    }

    @Override  // bmbv
    public final hhrp c() {
        try {
            return hhrs.o(new hhro[]{new hhro(new hhrn(1L), new hhrn(2L)), new hhro(new hhrn(3L), new hhrn(((long)this.a.a()))), new hhro(new hhrn(-1L), new hhrn(((long)this.d.d))), new hhro(new hhrn(-2L), hhrs.k(bmbr.a(this.b, this.d.e))), new hhro(new hhrn(-3L), hhrs.k(bmbr.a(this.c, this.d.e)))});
        }
        catch(hhrh hhrh0) {
            throw new IllegalStateException(hhrh0);
        }
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof bmbx) ? Objects.equals(this.a, ((bmbx)object0).a) && this.b.equals(((bmbx)object0).b) && this.c.equals(((bmbx)object0).c) && Objects.equals(this.d, ((bmbx)object0).d) : false;
    }

    @Override
    public final int hashCode() {
        return Objects.hash(new Object[]{this.a, this.b, this.c, this.d});
    }
}

