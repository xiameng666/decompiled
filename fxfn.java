public final class fxfn implements fxfo {
    public final fxfp a;
    public final gxpf b;
    public final long c;
    public final long d;

    public fxfn(fxfp fxfp0, gxpf gxpf0, long v, long v1) {
        this.a = fxfp0;
        this.b = gxpf0;
        this.c = v;
        this.d = v1;
    }

    @Override  // fxfo
    public final gxpg a() {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gxpg.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        long v = this.d;
        long v1 = this.c;
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((gxpg)hftv0).c = this.b;
        ((gxpg)hftv0).b |= 1;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gxpg)hftp0.b_message).d = (int)(v1 - v);
        long v2 = this.a.b() - v;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gxpg)hftp0.b_message).e = (int)v2;
        return (gxpg)hftp0.N_build();
    }
}

