public final class fxnp implements ibts {
    @Override  // ibts
    public final Object a(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((fwqy)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((fwqy)object0))));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        fwqy fwqy0 = (fwqy)hftp0.b_message;
        fwqy0.b |= 4;
        fwqy0.e = true;
        return (fwqy)hftp0.N_build();
    }
}

