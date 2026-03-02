public final class fkyg implements ibts {
    @Override  // ibts
    public final Object a(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((gdni)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((gdni)object0))));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gdni)hftp0.b_message).g = null;
        ((gdni)hftp0.b_message).b &= -33;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((gdni)hftv0).b &= -17;
        ((gdni)hftv0).f = 0L;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        gdni gdni0 = (gdni)hftp0.b_message;
        gdni0.b &= -65;
        gdni0.h = gdni.a.h;
        return (gdni)hftp0.N_build();
    }
}

