public final class ehsm {
    public String a;
    public int b;
    private long c;
    private int d;
    private float e;
    private float f;
    private ehtb g;
    private ehtb h;
    private byte i;

    public final ehso a() {
        if(this.i == 15) {
            int v = this.b;
            if(v != 0) {
                String s = this.a;
                if(s != null) {
                    ehtb ehtb0 = this.g;
                    if(ehtb0 != null) {
                        ehtb ehtb1 = this.h;
                        if(ehtb1 != null) {
                            return new ehso(this.c, this.d, this.e, this.f, v, s, ehtb0, ehtb1);
                        }
                    }
                }
            }
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        if((this.i & 1) == 0) {
            stringBuilder0.append(" eventTimeElapsedMillis");
        }
        if((this.i & 2) == 0) {
            stringBuilder0.append(" modelNumber");
        }
        if((this.i & 4) == 0) {
            stringBuilder0.append(" confidence");
        }
        if((this.i & 8) == 0) {
            stringBuilder0.append(" peakMagnitude");
        }
        if(this.b == 0) {
            stringBuilder0.append(" classificationResult");
        }
        if(this.a == null) {
            stringBuilder0.append(" additionalInfo");
        }
        if(this.g == null) {
            stringBuilder0.append(" prePeakFeatures");
        }
        if(this.h == null) {
            stringBuilder0.append(" postPeakFeatures");
        }
        throw new IllegalStateException("Missing required properties:" + stringBuilder0.toString());
    }

    public final void b(float f) {
        this.e = f;
        this.i = (byte)(this.i | 4);
    }

    public final void c(long v) {
        this.c = v;
        this.i = (byte)(this.i | 1);
    }

    public final void d(int v) {
        this.d = v;
        this.i = (byte)(this.i | 2);
    }

    public final void e(float f) {
        this.f = f;
        this.i = (byte)(this.i | 8);
    }

    public final void f(ehtb ehtb0) {
        if(ehtb0 == null) {
            throw new NullPointerException("Null postPeakFeatures");
        }
        this.h = ehtb0;
    }

    public final void g(ehtb ehtb0) {
        if(ehtb0 == null) {
            throw new NullPointerException("Null prePeakFeatures");
        }
        this.g = ehtb0;
    }
}

