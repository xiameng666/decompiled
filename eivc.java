public final class eivc implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((eivg)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((eivg)object0))));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        eivg eivg0 = (eivg)hftp0.b_message;
        eivg0.b &= -5;
        eivg0.e = 0;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        eivg eivg1 = (eivg)hftp0.b_message;
        eivg1.b &= -3;
        eivg1.d = 0L;
        return (eivg)hftp0.N_build();
    }
}

