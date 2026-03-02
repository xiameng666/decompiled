public final class aivs {
    public aiwl a;
    private ggdy b;
    private gged_interceptors c;
    private int d;
    private int e;
    private aiwg f;
    private aiwn g;
    private byte h;

    public final aivt a() {
        ggdy ggdy0 = this.b;
        if(ggdy0 != null) {
            this.c = ggdy0.h();
        }
        else if(this.c == null) {
            this.c = ggna.a;
        }
        if(this.h == 3) {
            aiwg aiwg0 = this.f;
            if(aiwg0 != null) {
                aiwn aiwn0 = this.g;
                if(aiwn0 != null) {
                    return new aivt(this.c, this.d, this.e, aiwg0, this.a, aiwn0);
                }
            }
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        if((this.h & 1) == 0) {
            stringBuilder0.append(" downloadedNumBytes");
        }
        if((this.h & 2) == 0) {
            stringBuilder0.append(" numSourceDevices");
        }
        if(this.f == null) {
            stringBuilder0.append(" resultType");
        }
        if(this.g == null) {
            stringBuilder0.append(" encryption");
        }
        throw new IllegalStateException("Missing required properties:" + stringBuilder0.toString());
    }

    public final void b(byte[] arr_b) {
        if(this.b == null) {
            this.b = new ggdy();
        }
        this.b.i(arr_b);
    }

    public final void c(int v) {
        this.d = v;
        this.h = (byte)(this.h | 1);
    }

    public final void d(aiwn aiwn0) {
        if(aiwn0 == null) {
            throw new NullPointerException("Null encryption");
        }
        this.g = aiwn0;
    }

    public final void e(int v) {
        this.e = v;
        this.h = (byte)(this.h | 2);
    }

    public final void f(aiwg aiwg0) {
        if(aiwg0 == null) {
            throw new NullPointerException("Null resultType");
        }
        this.f = aiwg0;
    }
}

