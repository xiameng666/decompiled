public final class eiuw implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        int v = ((eivg)object0).e;
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((eivg)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((eivg)object0))));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        eivg eivg0 = (eivg)hftp0.b_message;
        eivg0.b |= 4;
        eivg0.e = v + 1;
        return (eivg)hftp0.N_build();
    }
}

