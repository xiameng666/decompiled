import java.util.Arrays;

public final class bmam extends blzv {
    public static final bboh a;
    public static final hhrn b;
    public static final hhrn c;
    public static final hhrn d;
    public static final hhrn e;
    public static final hhrn f;
    public static final ggfp g;
    public final bmbv h;
    public final byte[] i;
    public final Long j;
    public final Boolean k;
    private final Long l;

    static {
        bmam.a = bnaa.e("AuthenticatorClientPinResponseData");
        hhrn hhrn0 = new hhrn(1L);
        bmam.b = hhrn0;
        hhrn hhrn1 = new hhrn(2L);
        bmam.c = hhrn1;
        hhrn hhrn2 = new hhrn(3L);
        bmam.d = hhrn2;
        hhrn hhrn3 = new hhrn(4L);
        bmam.e = hhrn3;
        hhrn hhrn4 = new hhrn(5L);
        bmam.f = hhrn4;
        bmam.g = ggfp.N(hhrn0, hhrn1, hhrn2, hhrn3, hhrn4);
    }

    public bmam(bmbv bmbv0, byte[] arr_b, Long long0, Boolean boolean0, Long long1) {
        boolean z = true;
        if(long0 != null) {
            batl.b(((long)long0) >= 0L);
        }
        if(long1 != null) {
            if(((long)long1) < 0L) {
                z = false;
            }
            batl.b(z);
        }
        this.h = bmbv0;
        this.i = arr_b;
        this.j = long0;
        this.k = boolean0;
        this.l = long1;
    }

    @Override  // blzv
    public final hhrp a() {
        throw new UnsupportedOperationException("Not supported");
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof bmam) ? bata.b(this.h, ((bmam)object0).h) && Arrays.equals(this.i, ((bmam)object0).i) && bata.b(this.j, ((bmam)object0).j) && bata.b(this.k, ((bmam)object0).k) && bata.b(this.l, ((bmam)object0).l) : false;
    }

    @Override
    public final int hashCode() {
        Integer integer0 = Arrays.hashCode(this.i);
        return Arrays.hashCode(new Object[]{this.h, integer0, this.j, this.k, this.l});
    }

    @Override
    public final String toString() {
        String s = bbmu.c(this.i);
        return "AuthenticatorClientPinResponseData{\n authenticatorKeyAgreementPublicKey=" + this.h + ", \n pinToken=" + s + ", \n retries=" + this.j + ", \n powerCycleRequired=" + this.k + ", \n uvRetries=" + this.l + "}";
    }
}

