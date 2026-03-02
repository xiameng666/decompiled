public final class iqm {
    public static final boolean a(float f, float f1, long v, float f2, float f3) {
        float f4 = Float.intBitsToFloat(((int)(v >> 0x20)));
        float f5 = Float.intBitsToFloat(((int)(v & 0xFFFFFFFFL)));
        float f6 = f1 - f3;
        float f7 = f - f2;
        return f7 * f7 / (f4 * f4) + f6 * f6 / (f5 * f5) <= 1.0f;
    }

    public static final boolean b(hks hks0, float f, float f1) {
        hka hka0 = new hka(f - 0.005f, -0.005f + f1, f + 0.005f, f1 + 0.005f);
        hks hks1 = new hks(null);
        hmj.b(hks1, hka0);
        hks hks2 = new hks(null);
        hks2.q(hks0, hks1, 1);
        hks2.k();
        hks1.k();
        return !hks2.a.isEmpty();
    }
}

