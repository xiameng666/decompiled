public final class hlrs extends ProtoLiteBuilder implements MessageLiteOrBuilder {
    public hlrs() {
        super(((ProtoLiteMessage)hlrv.a));
    }

    public final void a(ProtoLiteBuilder hftp0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        hlrv hlrv0 = (hlrv)this.b_message;
        hlrr hlrr0 = (hlrr)hftp0.N_build();
        hlrr0.getClass();
        hfuo hfuo0 = hlrv0.g;
        if(!hfuo0.c()) {
            hlrv0.g = ProtoLiteMessage.E(hfuo0);
        }
        hlrv0.g.add(hlrr0);
    }
}

