public final class dycq implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((eudq)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((eudq)object0))));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((eudq)hftp0.b_message).k = null;
        ((eudq)hftp0.b_message).b &= 0xFFFFFDFF;
        return (eudq)hftp0.N_build();
    }
}

