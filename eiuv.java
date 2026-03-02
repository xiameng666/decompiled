public final class eiuv implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((eivg)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((eivg)object0))));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        eivg eivg0 = (eivg)hftp0.b_message;
        eivg0.b &= -2;
        eivg0.c = 0L;
        return (eivg)hftp0.N_build();
    }
}

