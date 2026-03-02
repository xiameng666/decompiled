import java.util.EnumMap;

public final class fvej {
    public final EnumMap a;
    public static final int b;

    static {
        fvei fvei0 = new fvei();
        fveh[] arr_fveh = fveh.values();
        for(int v = 0; v < arr_fveh.length; ++v) {
            fvei0.a(arr_fveh[v], 0.0f);
        }
    }

    public fvej(fvei fvei0) {
        this.a = fvei0.a;
    }
}

