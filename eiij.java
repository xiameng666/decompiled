public final class eiij implements gfsi {
    public final ProtoLiteBuilder a;

    public eiij(ProtoLiteBuilder hftp0) {
        this.a = hftp0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        String s = frai.h(((ByteString)object0));
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gwhg gwhg0 = (gwhg)hftp0.b_message;
        s.getClass();
        gwhg0.b |= 0x80;
        gwhg0.k = s;
        return (gwhg)hftp0.N_build();
    }
}

