public final class firz {
    public static final void a(long v, float f) {
        int v1 = 1;
        int v2 = Double.compare(f, 0.0001) >= 0 ? 0 : 1;
        if(((double)f) <= 99.9999) {
            v1 = 0;
        }
        if((v2 | v1) != 0) {
            float f1 = (f + 16.0f) / 116.0f;
            double f2 = (double)((f1 * f1 * f1 > 0.008856f ? f1 * f1 * f1 : (f1 * 116.0f - 16.0f) / 903.296326f) * 100.0f / 100.0f);
            ibvr.b((f2 <= 0.003131 ? f2 * 12.92 : Math.pow(f2, 0.416667) * 1.055 - 0.055) * 255.0);
            return;
        }
        long v3 = hll.e(v, hnt.t);
        hll.e(hln.i(f, hll.c(v3), hll.b(v3), 0.0f, hnt.t, 8), hnt.e);
    }
}

