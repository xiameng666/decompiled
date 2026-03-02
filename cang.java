public final class cang {
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;

    public cang() {
        this.a = -1;
        this.b = 0x80000000;
        this.c = 0x80000000;
        this.d = 0x80000000;
        this.e = 0x80000000;
    }

    public final gita a() {
        gita gita1;
        synchronized(this) {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gita.a).v_newBuilder();
            int v1 = this.a;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            ((gita)hftv0).b |= 1;
            ((gita)hftv0).c = v1;
            int v2 = this.b;
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv1 = hftp0.b_message;
            ((gita)hftv1).b |= 2;
            ((gita)hftv1).d = v2;
            int v3 = this.c;
            if(!hftv1.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv2 = hftp0.b_message;
            ((gita)hftv2).b |= 4;
            ((gita)hftv2).e = v3;
            int v4 = this.d;
            if(!hftv2.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv3 = hftp0.b_message;
            ((gita)hftv3).b |= 8;
            ((gita)hftv3).f = v4;
            int v5 = this.e;
            if(!hftv3.isImmutable()) {
                hftp0.ensureMutable();
            }
            gita gita0 = (gita)hftp0.b_message;
            gita0.b |= 16;
            gita0.g = v5;
            gita1 = (gita)hftp0.N_build();
        }
        return gita1;
    }

    public final void b(int v) {
        synchronized(this) {
            this.a = v;
        }
    }

    public final void c(int v) {
        synchronized(this) {
            this.c = v;
        }
    }

    public final void d(int v) {
        synchronized(this) {
            this.d = v;
        }
    }

    public final void e() {
        synchronized(this) {
            this.e = 0x80000000;
        }
    }

    public final void f(int v) {
        synchronized(this) {
            this.b = v;
        }
    }
}

