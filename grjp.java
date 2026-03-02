public final class grjp extends ProtoLiteBuilder implements MessageLiteOrBuilder {
    public grjp() {
        super(((ProtoLiteMessage)grjr.a));
    }

    public final void a(ProtoLiteBuilder hftp0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        grjr grjr0 = (grjr)this.b_message;
        grjq grjq0 = (grjq)hftp0.N_build();
        grjq0.getClass();
        hfuo hfuo0 = grjr0.b;
        if(!hfuo0.c()) {
            grjr0.b = ProtoLiteMessage.E(hfuo0);
        }
        grjr0.b.add(grjq0);
    }
}

