public final class comj implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((cogm)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((cogm)object0))));
        if(!((cogh)hftp0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)(((cogh)hftp0))).ensureMutable();
        }
        cogm cogm0 = (cogm)((cogh)hftp0).b_message;
        cogm0.b |= 0x800;
        cogm0.p = 0;
        if(!((cogh)hftp0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)(((cogh)hftp0))).ensureMutable();
        }
        cogm cogm1 = (cogm)((cogh)hftp0).b_message;
        cogm1.b |= 0x400;
        cogm1.o = 0L;
        if(!((cogh)hftp0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)(((cogh)hftp0))).ensureMutable();
        }
        cogm cogm2 = (cogm)((cogh)hftp0).b_message;
        cogm2.b |= 0x200;
        cogm2.n = 0L;
        if(!((cogh)hftp0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)(((cogh)hftp0))).ensureMutable();
        }
        cogm cogm3 = (cogm)((cogh)hftp0).b_message;
        cogm3.b |= 0x100;
        cogm3.m = 0L;
        if(!((cogh)hftp0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)(((cogh)hftp0))).ensureMutable();
        }
        cogm cogm4 = (cogm)((cogh)hftp0).b_message;
        cogm4.b &= 0xFFFFEFFF;
        cogm4.q = 0;
        return (cogm)((ProtoLiteBuilder)(((cogh)hftp0))).N_build();
    }
}

