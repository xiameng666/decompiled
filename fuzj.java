public final class fuzj {
    private final fuzi a;

    public fuzj(fwyk fwyk0) {
        this.a = new fuzi(fwyk0.l(fuwu.n));
    }

    public final int a(fuzk fuzk0) {
        fuzk fuzk1 = new fuzk();
        String[] arr_s = fuzk.b;
        for(int v = 0; v < 37; ++v) {
            String s = arr_s[v];
            fuzk1.b(s, fuzk0.a(s));
        }
        fuzk1.c = fuzh.a.a(fuzk0.c);
        fuzk1.L = fuzh.f.a(fuzk0.L);
        for(int v1 = 0; v1 < 3; ++v1) {
            String s1 = "meanLightLevel" + fuzk.a[v1];
            float f = fuzk0.a(s1);
            fuzk1.b(s1, fuzh.b.a(f));
            String s2 = "accelGravityDir" + fuzk.a[v1];
            float f1 = fuzk0.a(s2);
            fuzk1.b(s2, fuzh.c.a(f1));
            String s3 = "soundMeanLogBark" + fuzk.a[v1];
            float f2 = fuzk0.a(s3);
            fuzk1.b(s3, fuzh.e.a(f2));
        }
        return Math.round(this.a.a.a(new float[]{fuzk1.c, fuzk1.d, fuzk1.e, fuzk1.g, fuzk1.h, fuzk1.i, fuzk1.I, fuzk1.J, fuzk1.K, fuzk1.L})[0] * 100.0f);
    }
}

