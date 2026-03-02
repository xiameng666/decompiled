public final class atzh {
    private double a;
    private double b;
    private int c;
    private double d;
    private double e;

    public atzh() {
        this.c();
    }

    public final glaa a() {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)glaa.a).v_newBuilder();
        int v = this.c;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((glaa)hftv0).b |= 1;
        ((glaa)hftv0).c = v;
        double f = this.d;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((glaa)hftv1).b |= 2;
        ((glaa)hftv1).d = f;
        double f1 = this.e;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp0.b_message;
        ((glaa)hftv2).b |= 4;
        ((glaa)hftv2).e = f1;
        double f2 = this.a;
        if(!hftv2.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv3 = hftp0.b_message;
        ((glaa)hftv3).b |= 8;
        ((glaa)hftv3).f = f2;
        double f3 = this.b;
        if(!hftv3.isImmutable()) {
            hftp0.ensureMutable();
        }
        glaa glaa0 = (glaa)hftp0.b_message;
        glaa0.b |= 16;
        glaa0.g = f3;
        return (glaa)hftp0.N_build();
    }

    public final void b(double f) {
        this.a += f;
        this.b += f * f;
        ++this.c;
        this.d = Math.min(this.d, f);
        this.e = Math.max(this.e, f);
    }

    public final void c() {
        this.a = 0.0;
        this.b = 0.0;
        this.c = 0;
        this.d = Infinity;
        this.e = -Infinity;
    }
}

