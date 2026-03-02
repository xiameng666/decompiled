public final class bwew implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((gqqc)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((gqqc)object0))));
        int v = ((gqqc)object0).c + 1;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gqqc gqqc0 = (gqqc)hftp0.b_message;
        gqqc0.b |= 1;
        gqqc0.c = v;
        return (gqqc)hftp0.N_build();
    }
}

