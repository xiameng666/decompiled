public final class cqqw implements gfsi {
    public final ProtoLiteBuilder a;

    public cqqw(ProtoLiteBuilder hftp0) {
        this.a = hftp0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        Object object1 = this.a;
        if(!object1.b_message.isImmutable()) {
            ((ProtoLiteBuilder)object1).ensureMutable();
        }
        hgzi hgzi0 = (hgzi)object1.b_message;
        hgzi0.g = ((hgzf)object0).e;
        hgzi0.b |= 0x80;
        return object1;
    }
}

