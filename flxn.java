public final class flxn implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hnva.a).v_newBuilder();
        String s = ((fmgx)object0).e();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hnva)hftp0.b_message).c = s;
        flbl.b(((fmgx)object0).d(), new flxj(hftp0, ((fmgx)object0)));
        flbl.b(((fmgx)object0).c(), new flxk(hftp0));
        gfsx gfsx0 = ((fmgx)object0).b();
        gged_interceptors gged0 = ggna.a;
        gged_interceptors gged1 = (gged_interceptors)gfsx0.f(gged0);
        if(!gged1.isEmpty()) {
            gged_interceptors gged2 = flbp.c(gged1, new flxl());
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hnva hnva0 = (hnva)hftp0.b_message;
            hfuo hfuo0 = hnva0.e;
            if(!hfuo0.c()) {
                hnva0.e = ProtoLiteMessage.E(hfuo0);
            }
            hfrj.E(gged2, hnva0.e);
        }
        gged_interceptors gged3 = (gged_interceptors)((fmgx)object0).a().f(gged0);
        if(!gged3.isEmpty()) {
            gged_interceptors gged4 = flbp.c(gged3, new flxm());
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hnva hnva1 = (hnva)hftp0.b_message;
            hfuo hfuo1 = hnva1.f;
            if(!hfuo1.c()) {
                hnva1.f = ProtoLiteMessage.E(hfuo1);
            }
            hfrj.E(gged4, hnva1.f);
        }
        return (hnva)hftp0.N_build();
    }
}

