import java.math.BigInteger;

public final class igow extends igne implements igpb {
    public final igps a;
    public final igoy b;
    public final BigInteger c;
    public final BigInteger d;
    public final byte[] e;
    private static final BigInteger y;
    private igpa z;

    static {
        igow.y = BigInteger.valueOf(1L);
    }

    public igow(igps igps0, igoy igoy0, BigInteger bigInteger0, BigInteger bigInteger1, byte[] arr_b) {
        this.a = igps0;
        this.b = igoy0;
        this.c = bigInteger0;
        this.d = bigInteger1;
        this.e = arr_b;
        if(igpn.b(igps0)) {
            this.z = new igpa(igps0.d.b());
            return;
        }
        if(!igpn.a(igps0)) {
            throw new IllegalArgumentException("\'curve\' is of an unsupported type");
        }
        int[] arr_v = igqw.e(((igqr)igps0.d).b.a);
        if(arr_v.length == 3) {
            this.z = new igpa(arr_v[2], arr_v[1], 0, 0);
            return;
        }
        if(arr_v.length != 5) {
            throw new IllegalArgumentException("Only trinomial and pentomial curves are supported");
        }
        this.z = new igpa(arr_v[4], arr_v[1], arr_v[2], arr_v[3]);
    }

    @Override  // igne
    public final ignj a() {
        ignc ignc0 = new ignc();
        ignc0.a(new ignd(igow.y));
        ignc0.a(this.z);
        ignc0.a(new igov(this.a, this.e));
        ignc0.a(this.b);
        ignc0.a(new ignd(this.c));
        BigInteger bigInteger0 = this.d;
        if(bigInteger0 != null) {
            ignc0.a(new ignd(bigInteger0));
        }
        return new ignk(ignc0);
    }
}

