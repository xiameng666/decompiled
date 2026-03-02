public final class flxe implements kar {
    public final ProtoLiteBuilder a;

    public flxe(ProtoLiteBuilder hftp0) {
        this.a = hftp0;
    }

    @Override  // kar
    public final void accept(Object object0) {
        hnrx hnrx0 = flwz.b(((fmfh)object0));
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hnuq hnuq0 = (hnuq)hftp0.b_message;
        hnrx0.getClass();
        hnuq0.j = hnrx0;
        hnuq0.b |= 0x20;
    }
}

