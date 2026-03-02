public final class aiwk {
    public int a;
    public int b;
    private int c;
    private ggdy d;
    private gged_interceptors e;
    private ggdy f;
    private gged_interceptors g;
    private int h;
    private byte i;

    public final aiwl a() {
        ggdy ggdy0 = this.d;
        if(ggdy0 != null) {
            this.e = ggdy0.h();
        }
        else if(this.e == null) {
            this.e = ggna.a;
        }
        ggdy ggdy1 = this.f;
        if(ggdy1 != null) {
            this.g = ggdy1.h();
        }
        else if(this.g == null) {
            this.g = ggna.a;
        }
        if(this.i == 3) {
            int v = this.a;
            if(v != 0) {
                int v1 = this.b;
                if(v1 != 0) {
                    return new aiwl(v, v1, this.c, this.e, this.g, this.h);
                }
            }
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        if(this.a == 0) {
            stringBuilder0.append(" requestType");
        }
        if(this.b == 0) {
            stringBuilder0.append(" resultType");
        }
        if((this.i & 1) == 0) {
            stringBuilder0.append(" statusCode");
        }
        if((this.i & 2) == 0) {
            stringBuilder0.append(" numSourceDevices");
        }
        throw new IllegalStateException("Missing required properties:" + stringBuilder0.toString());
    }

    protected final void b(aiwm aiwm0) {
        if(this.f == null) {
            this.f = new ggdy();
        }
        this.f.i(aiwm0);
    }

    protected final void c(int v) {
        if(this.d == null) {
            this.d = new ggdy();
        }
        this.d.i(Integer.valueOf(v));
    }

    public final void d(int v) {
        this.h = v;
        this.i = (byte)(this.i | 2);
    }

    public final void e(int v) {
        this.c = v;
        this.i = (byte)(this.i | 1);
    }
}

