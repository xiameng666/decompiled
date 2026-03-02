public final class awd implements beo {
    public float a;
    public final float b;
    public final float c;
    public float d;

    public awd(float f, float f1) {
        this.b = f;
        this.c = f1;
    }

    final void a() {
        float f = this.b;
        float f1 = 1.0f;
        int v = Float.compare(f, 1.0f);
        if(v >= 0) {
            float f2 = this.c;
            if((f2 <= 1.0f)) {
                this.a = 1.0f;
                if(Float.compare(f, f2) == 0) {
                    f1 = 0.0f;
                }
                else if(v != 0) {
                    f1 = f2 == 1.0f ? 0.0f : (1.0f - 1.0f / f2) / (1.0f / f - 1.0f / f2);
                }
                this.d = f1;
                return;
            }
        }
        throw new IllegalArgumentException("Requested zoomRatio 1.0 is not within valid range [" + this.c + " , " + f + "]");
    }
}

