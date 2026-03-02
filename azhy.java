public final class azhy {
    private boolean a;
    private int b;
    private long c;
    private long d;
    private ggdy e;
    private gged_interceptors f;
    private byte g;

    public final azhz a() {
        ggdy ggdy0 = this.e;
        if(ggdy0 != null) {
            this.f = ggdy0.h();
        }
        else if(this.f == null) {
            this.f = ggna.a;
        }
        if(this.g != 15) {
            StringBuilder stringBuilder0 = new StringBuilder();
            if((this.g & 1) == 0) {
                stringBuilder0.append(" uploadSucceeded");
            }
            if((this.g & 2) == 0) {
                stringBuilder0.append(" lastServerResponseCode");
            }
            if((this.g & 4) == 0) {
                stringBuilder0.append(" lastServerSuccessResponseTimeMillis");
            }
            if((this.g & 8) == 0) {
                stringBuilder0.append(" lastServerErrorResponseTimeMillis");
            }
            throw new IllegalStateException("Missing required properties:" + stringBuilder0.toString());
        }
        return new azhz(this.a, this.b, this.c, this.d, this.f);
    }

    public final ggdy b() {
        if(this.e == null) {
            if(this.f == null) {
                this.e = new ggdy();
                return this.e;
            }
            ggdy ggdy0 = new ggdy();
            this.e = ggdy0;
            ggdy0.k(this.f);
            this.f = null;
        }
        return this.e;
    }

    public final void c(azhz azhz0) {
        this.g(azhz0.a);
        this.e(azhz0.b);
        this.b().k(azhz0.e);
        long v = azhz0.c;
        if(v != -1L) {
            this.f(v);
        }
        long v1 = azhz0.d;
        if(v1 != -1L) {
            this.d(v1);
        }
    }

    public final void d(long v) {
        this.d = v;
        this.g = (byte)(this.g | 8);
    }

    public final void e(int v) {
        this.b = v;
        this.g = (byte)(this.g | 2);
    }

    public final void f(long v) {
        this.c = v;
        this.g = (byte)(this.g | 4);
    }

    public final void g(boolean z) {
        this.a = z;
        this.g = (byte)(this.g | 1);
    }
}

