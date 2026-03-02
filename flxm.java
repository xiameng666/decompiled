public final class flxm implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hnvb.a).v_newBuilder();
        int v = ((fmgz)object0).b();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hnvb)hftp0.b_message).b = v;
        int v1 = ((fmgz)object0).a();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hnvb)hftp0.b_message).c = v1;
        gged_interceptors gged0 = flbp.c(((fmgz)object0).c(), new flxr());
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hnvb hnvb0 = (hnvb)hftp0.b_message;
        hfuo hfuo0 = hnvb0.d;
        if(!hfuo0.c()) {
            hnvb0.d = ProtoLiteMessage.E(hfuo0);
        }
        hfrj.E(gged0, hnvb0.d);
        return (hnvb)hftp0.N_build();
    }
}

