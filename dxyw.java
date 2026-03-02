public final class dxyw implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((dygd)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((dygd)object0))));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((dygd)hftp0.b_message).d = null;
        ((dygd)hftp0.b_message).b &= -3;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((dygd)hftv0).f = 0L;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((dygd)hftv1).g = 0L;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((dygd)hftp0.b_message).h = false;
        return (dygd)hftp0.N_build();
    }
}

