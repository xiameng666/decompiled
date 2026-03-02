import java.util.Arrays;

public final class ssr extends stc {
    public static final ssy a;
    public static final ssy b;
    public static final ssy c;
    public static final ssy d;
    public final ssq e;
    public final ssp f;

    static {
        ssr.a = new ssy(6);
        ssr.b = new ssy(13);
        ssr.c = new ssy(0xD6);
        ssr.d = new ssy(209);
    }

    private ssr(ssp ssp0, byte[] arr_b) {
        super(ssp0.d, arr_b, true, ssa.a);
        this.e = ssq.a;
        this.f = ssp0;
    }

    public ssr(ssq ssq0, byte[] arr_b) {
        this(ssq0, arr_b, ssp.a);
    }

    public ssr(ssq ssq0, byte[] arr_b, ssp ssp0) {
        super(ssq0.c, arr_b, true, ssa.a);
        this.e = ssq0;
        this.f = ssp0;
    }

    public ssr(byte[] arr_b) {
        this(ssq.a, arr_b);
        stp.c(arr_b, 30, "derEncodedValue");
    }

    public static ssr b(ssr ssr0) {
        ssq ssq0 = ssr0.e;
        if(ssq0 == ssq.b) {
            return new ssr(ssq0, Arrays.copyOf(ssr0.a(), ssr0.a().length));
        }
        byte[] arr_b = ssr0.a();
        return new ssr(ssr0.f, arr_b);
    }

    public final boolean c() {
        return this.f == ssp.a || this.f == ssp.b;
    }
}

