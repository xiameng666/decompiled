public final class gzjn extends ProtoLiteBuilder implements MessageLiteOrBuilder {
    public gzjn() {
        super(((ProtoLiteMessage)gzjp.a));
    }

    public final void a(ProtoLiteBuilder hftp0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        gzjp gzjp0 = (gzjp)this.b_message;
        gzjo gzjo0 = (gzjo)hftp0.N_build();
        gzjo0.getClass();
        hfuo hfuo0 = gzjp0.i;
        if(!hfuo0.c()) {
            gzjp0.i = ProtoLiteMessage.E(hfuo0);
        }
        gzjp0.i.add(gzjo0);
    }
}

