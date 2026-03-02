import java.util.Arrays;
import java.util.Random;

public final class bmbs {
    private static final bboh a;
    private static final hhrq b;
    private static final hhrq c;
    private static final hhrq d;
    private final int e;
    private final byte[] f;
    private final byte[] g;

    static {
        bmbs.a = bnaa.e("CableCredentialData");
        bmbs.b = new hhrq("version");
        bmbs.c = new hhrq("irk");
        bmbs.d = new hhrq("lk");
    }

    public bmbs(byte[] arr_b, byte[] arr_b1) {
        this.e = 1;
        batl.s(arr_b);
        this.f = arr_b;
        batl.s(arr_b1);
        this.g = arr_b1;
    }

    public static bmbs a(hhrs hhrs0) {
        if(hhrs0 == null) {
            return null;
        }
        try {
            ggfz ggfz0 = hhrs0.m().a;
            if(ggfz0.containsKey(bmbs.b) && ((hhrs)ggfz0.get(bmbs.b)).l().a == 1L) {
                hhrq hhrq0 = bmbs.c;
                if(ggfz0.containsKey(hhrq0)) {
                    hhrq hhrq1 = bmbs.d;
                    if(ggfz0.containsKey(hhrq1)) {
                        return new bmbs(((hhrs)ggfz0.get(hhrq0)).j().a.toByteArray(), ((hhrs)ggfz0.get(hhrq1)).j().a.toByteArray());
                    }
                }
                ((ggtj)bmbs.a.i()).x("Missing key material in CableCredentialData decoding");
                return null;
            }
            ((ggtj)bmbs.a.i()).x("Missing or unknown version CableCredentialData decoding");
        }
        catch(hhrr hhrr0) {
            a.ae(bmbs.a.i(), "Unable to deserialize object.", hhrr0);
        }
        return null;
    }

    public static bmbs b(Random random0) {
        byte[] arr_b = new byte[0x20];
        byte[] arr_b1 = new byte[0x20];
        random0.nextBytes(arr_b);
        random0.nextBytes(arr_b1);
        return new bmbs(arr_b, arr_b1);
    }

    public final hhrs c() {
        try {
            hhro[] arr_hhro = new hhro[3];
            hhrn hhrn0 = new hhrn(1L);
            arr_hhro[0] = new hhro(bmbs.b, hhrn0);
            hhrk hhrk0 = hhrs.k(this.f);
            arr_hhro[1] = new hhro(bmbs.c, hhrk0);
            hhrk hhrk1 = hhrs.k(this.g);
            arr_hhro[2] = new hhro(bmbs.d, hhrk1);
            return hhrs.o(arr_hhro);
        }
        catch(hhrh hhrh0) {
            a.ae(bmbs.a.i(), "Unable to serialize object", hhrh0);
            return null;
        }
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof bmbs) && Arrays.equals(this.g, ((bmbs)object0).g) && Arrays.equals(this.f, ((bmbs)object0).f);
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{((int)1), this.f, this.g});
    }
}

