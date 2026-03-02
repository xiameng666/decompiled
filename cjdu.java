public final class cjdu extends cjdy {
    public final float[] a;
    public int b;
    public int c;
    private double d;
    private int e;

    public cjdu(int v) {
        this.d = 0.0;
        this.b = 0;
        this.c = 0;
        this.e = 0;
        this.a = new float[v];
    }

    @Override  // cjdy
    public final float a() {
        return (float)this.d;
    }

    @Override  // cjdy
    public final int b() {
        return this.c;
    }

    @Override  // cjdy
    public final void c(float f) {
        int v = this.e + 1;
        this.e = v;
        if(v == 0x7FFFFFFF) {
            this.e = 0;
            this.d = 0.0;
            float[] arr_f = this.a;
            for(int v1 = 0; v1 < arr_f.length; ++v1) {
                this.d += (double)arr_f[v1];
            }
        }
        int v2 = this.c;
        float[] arr_f1 = this.a;
        if(v2 < arr_f1.length) {
            this.c = v2 + 1;
        }
        else {
            this.d -= (double)arr_f1[this.b];
        }
        int v3 = this.b;
        arr_f1[v3] = f;
        this.d += (double)f;
        this.b = v3 + 1;
        if(v3 + 1 >= arr_f1.length) {
            this.b = 0;
        }
    }
}

