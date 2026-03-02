public final class fmkg implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        switch(((fmmj)object0).a().ordinal()) {
            case 0: {
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hnuw.a).v_newBuilder();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((hnuw)hftp0.b_message).d = 1;
                fmmi fmmi0 = ((fmmj)object0).b();
                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hnut.a).v_newBuilder();
                fmkj fmkj0 = new fmkj();
                gged_interceptors gged0 = flbp.c(fmmi0.a, fmkj0);
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                hnut hnut0 = (hnut)hftp1.b_message;
                hfuo hfuo0 = hnut0.b;
                if(!hfuo0.c()) {
                    hnut0.b = ProtoLiteMessage.E(hfuo0);
                }
                hfrj.E(gged0, hnut0.b);
                hnut hnut1 = (hnut)hftp1.N_build();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                hnuw hnuw0 = (hnuw)hftp0.b_message;
                hnut1.getClass();
                hnuw0.c = hnut1;
                hnuw0.b = 101;
                return (hnuw)hftp0.N_build();
            }
            case 1: {
                ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)hnuw.a).v_newBuilder();
                if(!hftp2.b_message.isImmutable()) {
                    hftp2.ensureMutable();
                }
                ((hnuw)hftp2.b_message).d = 2;
                hnux hnux0 = fmkl.a(((fmmj)object0).c());
                if(!hftp2.b_message.isImmutable()) {
                    hftp2.ensureMutable();
                }
                hnuw hnuw1 = (hnuw)hftp2.b_message;
                hnux0.getClass();
                hnuw1.c = hnux0;
                hnuw1.b = 102;
                return (hnuw)hftp2.N_build();
            }
            default: {
                throw new RuntimeException(null, null);
            }
        }
    }
}

