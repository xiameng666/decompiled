import j..util.DesugarCollections;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.Set;

public enum fvns {
    WIFI(1, "WiFi", false, 0, 0),
    CELL(2, "cell", false, 0, 0),
    ORIENTATION(4, "orientation", true, 3, 1),
    ACCELEROMETER(8, "accelerometer", true, 3, 1),
    GYROSCOPE(16, "gyroscope", true, 3, 1),
    MAGNETIC_FIELD(0x20, "magnetic field", true, 3, 1),
    GPS(0x40, "gps", false, 0, 0),
    GPS_SATELLITE(0x80, "gps satellite", false, 0, 0),
    BAROMETER(0x100, "barometer", true, 1, 1),
    UNCAL_MAGNETIC_FIELD(0x200, "uncal magnetic field", true, 6, 1),
    LIGHT(0x400, "light", true, 1, 2),
    PROXIMITY(0x800, "proximity", true, 1, 2),
    SOUND(0x1000, "sound", true, 0x71, 0),
    HEART_RATE(0x2000, "heart rate", true, 1, 2),
    STEP_COUNTER(0x4000, "step counter", true, 1, 2),
    DEVICE_STATE(0x8000, "device state", false, 0, 0),
    GNSS_MEASUREMENTS(0x10000, "gnss measurements", false, 0, 0),
    GNSS_NAVIGATION_MESSAGE(0x20000, "gnss navigation message", false, 0, 0),
    BLUETOOTH_DEVICE(0x40000, "bluetooth device", false, 0, 0),
    WIFI_RTT(0x80000, "wifi rtt ranging", false, 0, 0),
    HEART_PPG(0x100000, "heart ppg", true, 4, 1),
    FUSED_LOCATION_PROVIDER(0x400000, "fused location provider", false, 0, 0),
    RAW_AUDIO(0x200000, "raw audio", true, 0, 0),
    UNKNOWN(0x80000000, "unknown", false, 0, 0);

    public final boolean A;
    public final String B;
    public final int C;
    public final int D;
    public static final Set y;
    public final int z;

    static {
        fvns.y = DesugarCollections.unmodifiableSet(EnumSet.of(fvns.a, new fvns[]{fvns.b, fvns.c, fvns.d, fvns.e, fvns.f, fvns.g, fvns.h, fvns.i, fvns.j, fvns.k, fvns.l, fvns.m, fvns.n, fvns.o, fvns.p, fvns.q, fvns.r, fvns.s, fvns.t, fvns.u, fvns.v, fvns.w}));
        DesugarCollections.unmodifiableSet(EnumSet.of(fvns.c, new fvns[]{fvns.d, fvns.e, fvns.f, fvns.i, fvns.j, fvns.k, fvns.l, fvns.n, fvns.o, fvns.u}));
    }

    private fvns(int v1, String s1, boolean z, int v2, int v3) {
        this.z = v1;
        this.B = s1;
        this.A = z;
        this.D = v2;
        this.C = v3;
    }

    public static Set a(fvns[] arr_fvns) {
        return EnumSet.copyOf(Arrays.asList(arr_fvns));
    }

    @Override
    public final String toString() {
        return String.valueOf(this.z);
    }
}

