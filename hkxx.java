public final class hkxx extends ProtoLiteBuilder implements MessageLiteOrBuilder {
    public hkxx() {
        super(((ProtoLiteMessage)hkxy.a));
    }

    public final void a(ProtoLiteBuilder hftp0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        hkxy hkxy0 = (hkxy)this.b_message;
        hkxw hkxw0 = (hkxw)hftp0.N_build();
        hkxw0.getClass();
        hfuo hfuo0 = hkxy0.f;
        if(!hfuo0.c()) {
            hkxy0.f = ProtoLiteMessage.E(hfuo0);
        }
        hkxy0.f.add(hkxw0);
    }
}

