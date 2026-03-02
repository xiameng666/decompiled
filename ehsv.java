public final class ehsv {
    private float a;
    private float b;
    private float c;
    private float d;
    private float e;
    private float f;
    private float g;
    private byte h;

    public final ehsw a() {
        if(this.h != 0x7F) {
            StringBuilder stringBuilder0 = new StringBuilder();
            if((this.h & 1) == 0) {
                stringBuilder0.append(" rmsMean");
            }
            if((this.h & 2) == 0) {
                stringBuilder0.append(" rmsCv");
            }
            if((this.h & 4) == 0) {
                stringBuilder0.append(" arcDiffRatioMean");
            }
            if((this.h & 8) == 0) {
                stringBuilder0.append(" xyQ94Q44RatioMean");
            }
            if((this.h & 16) == 0) {
                stringBuilder0.append(" xyQ94Q44RatioCv");
            }
            if((this.h & 0x20) == 0) {
                stringBuilder0.append(" xyQ75Q44RatioMean");
            }
            if((this.h & 0x40) == 0) {
                stringBuilder0.append(" xyQ75Q44RatioCv");
            }
            throw new IllegalStateException("Missing required properties:" + stringBuilder0.toString());
        }
        return new ehsw(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
    }

    public final void b(float f) {
        this.c = f;
        this.h = (byte)(this.h | 4);
    }

    public final void c(float f) {
        this.b = f;
        this.h = (byte)(this.h | 2);
    }

    public final void d(float f) {
        this.a = f;
        this.h = (byte)(this.h | 1);
    }

    public final void e(float f) {
        this.g = f;
        this.h = (byte)(this.h | 0x40);
    }

    public final void f(float f) {
        this.f = f;
        this.h = (byte)(this.h | 0x20);
    }

    public final void g(float f) {
        this.e = f;
        this.h = (byte)(this.h | 16);
    }

    public final void h(float f) {
        this.d = f;
        this.h = (byte)(this.h | 8);
    }
}

