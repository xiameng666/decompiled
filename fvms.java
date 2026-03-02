final class fvms {
    public int a;
    private final fvmq b;
    private int c;
    private long d;
    private long e;

    public fvms(fvmq fvmq0) {
        this.c = -1;
        this.d = 0x7FFFFFFFFFFFFFFFL;
        this.e = 0x7FFFFFFFFFFFFFFFL;
        this.a = 0;
        this.b = fvmq0;
    }

    public final void a(gwuu gwuu0, int v, long v1, long v2, fvmr fvmr0) {
        int v9;
        int v8;
        long v3 = this.d;
        fvmq fvmq0 = this.b;
        fvmq0.e(v2);
        fvmq0.d(v1, v2);
        long v4 = this.e;
        if(v4 == 0x7FFFFFFFFFFFFFFFL) {
            v4 = fvmq0.b(v1, v2);
            this.e = v4;
        }
        if((((gwuv)gwuu0.b_message).b & 1) == 0) {
            long v5 = fvmq0.a(v1, v4);
            if(!gwuu0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)gwuu0).ensureMutable();
            }
            gwuv gwuv0 = (gwuv)gwuu0.b_message;
            gwuv0.b |= 1;
            gwuv0.c = v5;
        }
        if(v3 == 0x7FFFFFFFFFFFFFFFL) {
            fvmr0.a(4, v1);
            fvmr0.a(5, v2 * 1000000L);
        }
        if(v3 == 0x7FFFFFFFFFFFFFFFL) {
            long v6 = ((gwuv)gwuu0.b_message).c;
            long v7 = fvmq0.a(v1, this.e);
            v8 = fvms.e(v6, v7);
            v9 = fvms.f(v6, v7);
        }
        else {
            v8 = fvms.e(this.d, v1);
            v9 = fvms.f(this.d, v1);
        }
        if(v8 != 0) {
            fvmr0.a(2, ((long)v8));
        }
        if(v9 != 0) {
            fvmr0.a(3, ((long)v9));
        }
        this.d = v1;
        if(v3 != 0x7FFFFFFFFFFFFFFFL && this.c == v) {
            return;
        }
        fvmr0.a(1, ((long)v));
        this.c = v;
    }

    public final void b() {
        ++this.a;
    }

    public final void c() {
        this.d = 0x7FFFFFFFFFFFFFFFL;
    }

    public final void d() {
        this.a = 0;
    }

    private static final int e(long v, long v1) {
        return (int)((v1 - v) / 1000L);
    }

    private static final int f(long v, long v1) {
        return (int)((v1 - v) % 1000L);
    }
}

