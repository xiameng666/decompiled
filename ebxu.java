public final class ebxu implements ibts {
    @Override  // ibts
    public final Object a(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((dyim)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((dyim)object0))));
        dyil dyil0 = dyil.f;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        dyim dyim0 = (dyim)hftp0.b_message;
        dyim0.c = dyil0.a();
        dyim0.b |= 1;
        return (dyim)hftp0.N_build();
    }
}

