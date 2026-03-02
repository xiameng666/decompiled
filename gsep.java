public final class gsep extends ProtoLiteBuilder implements MessageLiteOrBuilder {
    public gsep() {
        super(((ProtoLiteMessage)gseq.a));
    }

    public final void a(gseu gseu0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        gseq gseq0 = (gseq)this.b_message;
        gseu0.getClass();
        hfuo hfuo0 = gseq0.b;
        if(!hfuo0.c()) {
            gseq0.b = ProtoLiteMessage.E(hfuo0);
        }
        gseq0.b.add(gseu0);
    }
}

