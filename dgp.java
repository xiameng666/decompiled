import android.os.Parcel;

public final class dgp {
    public static final long a(Parcel parcel0) {
        long v = parcel0.readLong();
        return (0x3FL & v) >= 16L ? v & 0xFFFFFFFFFFFFFFC0L | (0x3FL & v) + 1L : v;
    }

    public static final long b(Parcel parcel0) {
        int v = parcel0.readByte();
        if(v == 1) {
            return jlq.f(0x100000000L, parcel0.readFloat());
        }
        long v1 = v == 2 ? 0x200000000L : 0L;
        return jlr.b(v1, 0L) ? jlp.a : jlq.f(v1, parcel0.readFloat());
    }
}

