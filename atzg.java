public final class atzg {
    public long a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;
    private final long f;

    public atzg(atzf atzf0) {
        this.b = atzf0.a;
        this.c = atzf0.b;
        this.d = atzf0.c;
        this.e = atzf0.d;
        this.f = System.currentTimeMillis();
    }

    public final glcd a() {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)glcd.a).v_newBuilder();
        long v = this.f - this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((glcd)hftv0).b |= 1;
        ((glcd)hftv0).c = (long)(((int)v));
        int v1 = this.b;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((glcd)hftv1).b |= 2;
        ((glcd)hftv1).d = (long)v1;
        int v2 = this.c;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp0.b_message;
        ((glcd)hftv2).b |= 4;
        ((glcd)hftv2).e = (long)v2;
        int v3 = this.d;
        if(!hftv2.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv3 = hftp0.b_message;
        ((glcd)hftv3).b |= 8;
        ((glcd)hftv3).f = (long)v3;
        int v4 = this.e;
        if(!hftv3.isImmutable()) {
            hftp0.ensureMutable();
        }
        glcd glcd0 = (glcd)hftp0.b_message;
        glcd0.b |= 16;
        glcd0.g = (long)v4;
        return (glcd)hftp0.N_build();
    }
}

