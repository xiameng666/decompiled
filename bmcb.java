import j..util.Objects;
import java.math.BigInteger;
import java.util.Arrays;

public final class bmcb extends bmbv {
    private final BigInteger b;
    private final Long c;

    public bmcb(bmiu bmiu0, BigInteger bigInteger0, Long long0) {
        super(bmiu0);
        gftb.check(bigInteger0);
        this.b = bigInteger0;
        this.c = long0;
    }

    @Override  // bmbv
    public final hhrp c() {
        try {
            hhro[] arr_hhro = new hhro[4];
            int v = 0;
            arr_hhro[0] = new hhro(new hhrn(1L), new hhrn(3L));
            boolean z = true;
            arr_hhro[1] = new hhro(new hhrn(3L), new hhrn(((long)this.a.a())));
            hhrn hhrn0 = new hhrn(-1L);
            gftb.checkTrue(this.b.signum() >= 0);
            byte[] arr_b = this.b.toByteArray();
            int v1;
            for(v1 = 0; v1 < arr_b.length && arr_b[v1] == 0; ++v1) {
            }
            arr_hhro[2] = new hhro(hhrn0, hhrs.k(Arrays.copyOfRange(arr_b, v1, arr_b.length)));
            hhrn hhrn1 = new hhrn(-2L);
            long v2 = (long)this.c;
            if(v2 < 0L) {
                z = false;
            }
            gftb.checkTrue(z);
            byte[] arr_b1 = glxd.h(v2);
            while(v < 8 && arr_b1[v] == 0) {
                ++v;
            }
            arr_hhro[3] = new hhro(hhrn1, hhrs.k(Arrays.copyOfRange(arr_b1, v, 8)));
            return hhrs.o(arr_hhro);
        }
        catch(hhrh hhrh0) {
            throw new IllegalStateException(hhrh0);
        }
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof bmcb) ? Objects.equals(this.a, ((bmcb)object0).a) && this.b.equals(((bmcb)object0).b) && this.c.equals(((bmcb)object0).c) : false;
    }

    @Override
    public final int hashCode() {
        return Objects.hash(new Object[]{this.a, this.b, this.c});
    }
}

