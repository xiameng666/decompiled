public final class cqug implements Runnable {
    public final cquj a;
    public final int b;

    public cqug(cquj cquj0, int v) {
        this.a = cquj0;
        this.b = v;
    }

    @Override
    public final void run() {
        cquj cquj0 = this.a;
        glai glai0 = cquj0.a();
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)glai0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)glai0));
        if(!((glah)hftp0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)(((glah)hftp0))).ensureMutable();
        }
        ((glai)((glah)hftp0).b_message).u = hfvv.a;
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)glbc.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        glbc glbc0 = (glbc)hftp1.b_message;
        glbc0.b |= 1;
        glbc0.c = this.b;
        ((glah)hftp0).m(((glbc)hftp1.N_build()));
        cquj0.b(((glai)((ProtoLiteBuilder)(((glah)hftp0))).N_build()), gkey.ay);
    }
}

