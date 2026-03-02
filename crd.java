import androidx.compose.foundation.BorderModifierNodeElement;

public final class crd {
    public static final long a(long v, float f) {
        return ((long)Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat(((int)(v >> 0x20))) - f))) << 0x20 | ((long)Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat(((int)(v & 0xFFFFFFFFL))) - f))) & 0xFFFFFFFFL;
    }

    public static final hfc b(hfc hfc0, crk crk0, hmu hmu0) {
        return crd.d(hfc0, crk0.a, crk0.b, hmu0);
    }

    public static final hfc c(hfc hfc0, float f, long v, hmu hmu0) {
        return crd.d(hfc0, f, new hmy(v), hmu0);
    }

    public static final hfc d(hfc hfc0, float f, hlf hlf0, hmu hmu0) {
        return hfc0.a(new BorderModifierNodeElement(f, hlf0, hmu0));
    }
}

