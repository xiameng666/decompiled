public final class flxl implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        switch(((fmhc)object0).a().ordinal()) {
            case 1: {
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hnvf.a).v_newBuilder();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((hnvf)hftp0.b_message).d = 1;
                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hnvd.a).v_newBuilder();
                int v = ((fmhc)object0).b();
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ((hnvd)hftp1.b_message).b = v;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                hnvf hnvf0 = (hnvf)hftp0.b_message;
                hnvd hnvd0 = (hnvd)hftp1.N_build();
                hnvd0.getClass();
                hnvf0.c = hnvd0;
                hnvf0.b = 2;
                return (hnvf)hftp0.N_build();
            }
            case 2: {
                ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)hnvf.a).v_newBuilder();
                if(!hftp2.b_message.isImmutable()) {
                    hftp2.ensureMutable();
                }
                ((hnvf)hftp2.b_message).d = 2;
                hnuz hnuz0 = hnuz.a;
                if(!hftp2.b_message.isImmutable()) {
                    hftp2.ensureMutable();
                }
                hnvf hnvf1 = (hnvf)hftp2.b_message;
                hnuz0.getClass();
                hnvf1.c = hnuz0;
                hnvf1.b = 3;
                return (hnvf)hftp2.N_build();
            }
            default: {
                flbj.f("RichTextProtoConvUtils", "Unable to convert rich text line style to proto: " + ((fmhc)object0).a());
                return hnvf.a;
            }
        }
    }
}

