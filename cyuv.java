public final class cyuv implements gfsi {
    public final cyuy a;
    public final gzfs b;

    public cyuv(cyuy cyuy0, gzfs gzfs0) {
        this.a = cyuy0;
        this.b = gzfs0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        cxjt cxjt0 = (cxjt)object0;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)cxjt.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((cxjt)hftp0.b_message).c = this.b;
        ((cxjt)hftp0.b_message).b |= 1;
        long v = this.a.b.a();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        cxjt cxjt1 = (cxjt)hftp0.b_message;
        cxjt1.b |= 2;
        cxjt1.d = v;
        return (cxjt)hftp0.N_build();
    }
}

