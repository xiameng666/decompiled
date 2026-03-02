public final class eidn implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((eiec)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((eiec)object0))));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        eiec eiec0 = (eiec)hftp0.b_message;
        eiec0.b |= 4;
        eiec0.f = true;
        return (eiec)hftp0.N_build();
    }
}

