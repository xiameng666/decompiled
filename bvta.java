public final class bvta implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((gqqe)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((gqqe)object0))));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gqqe)hftp0.b_message).c = null;
        ((gqqe)hftp0.b_message).b &= -2;
        return (gqqe)hftp0.N_build();
    }
}

