public final class dycm implements gfsi {
    public final gjwt a;

    public dycm(gjwt gjwt0) {
        this.a = gjwt0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((eudq)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((eudq)object0))));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        eudq eudq0 = (eudq)hftp0.b_message;
        this.a.getClass();
        eudq0.k = this.a;
        eudq0.b |= 0x200;
        return (eudq)hftp0.N_build();
    }
}

