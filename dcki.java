import com.google.android.gms.nearby.sharing.RangingData;

public final class dcki {
    public static final void a(int v, RangingData rangingData0) {
        batl.c(v >= -180 && v <= 180, "AzimuthAngle must be within -180 and 180");
        rangingData0.b = v;
    }

    public static final void b(int v, RangingData rangingData0) {
        batl.c(v >= 0, "RangingDistance must be non-negative");
        rangingData0.a = v;
    }

    public static final void c(int v, RangingData rangingData0) {
        batl.c(v >= -180 && v <= 180, "PolarAngle must be within -180 and 180");
        rangingData0.c = v;
    }
}

