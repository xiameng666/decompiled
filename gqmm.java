public final class gqmm implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        if((((hhyf)object0).b & 2) == 0) {
            ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((hhyf)object0))).jf(5, null);
            hftp0.X(((ProtoLiteMessage)(((hhyf)object0))));
            hhyd hhyd0 = gqlz.b(gqlo.c(((hhyf)object0)));
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hhyf hhyf0 = (hhyf)hftp0.b_message;
            hhyd0.getClass();
            hhyf0.d = hhyd0;
            hhyf0.b |= 2;
            return (hhyf)hftp0.N_build();
        }
        return (hhyf)object0;
    }
}

