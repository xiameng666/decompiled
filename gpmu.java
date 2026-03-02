public final class gpmu implements gpmy {
    public static final iakp a;

    static {
        gpmu.a = new iakp("com.google.net.loadshedding.QoS.RequestQoS.Criticality", hebp.b);
    }

    @Override  // gpmy
    public final hfta a() {
        return gpgu.d;
    }

    @Override  // gpmy
    public final MessageLite b(gRPCMethodDescriptor iaoj0, iakq iakq0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gpgu.a).v_newBuilder();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hebq.a).v_newBuilder();
        hebp hebp0 = (hebp)iakq0.j(gpmu.a);
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((hebq)hftp1.b_message).c = hebp0.e;
        ((hebq)hftp1.b_message).b |= 1;
        hebq hebq0 = (hebq)hftp1.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gpgu gpgu0 = (gpgu)hftp0.b_message;
        hebq0.getClass();
        gpgu0.c = hebq0;
        gpgu0.b |= 1;
        return (gpgu)hftp0.N_build();
    }

    @Override  // gpmy
    public final void c(MessageLite hfvm0) {
        gpgu gpgu0 = (gpgu)hfvm0;
    }

    public static iakw d() {
        return new gpmx(new gpmu());
    }
}

