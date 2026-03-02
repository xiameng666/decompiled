public final class hkxz extends ProtoLiteBuilder implements MessageLiteOrBuilder {
    public hkxz() {
        super(((ProtoLiteMessage)hkye.a));
    }

    public final void a(hkxx hkxx0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        hkye hkye0 = (hkye)this.b_message;
        hkxy hkxy0 = (hkxy)((ProtoLiteBuilder)hkxx0).N_build();
        hkxy0.getClass();
        hfuo hfuo0 = hkye0.m;
        if(!hfuo0.c()) {
            hkye0.m = ProtoLiteMessage.E(hfuo0);
        }
        hkye0.m.add(hkxy0);
    }
}

