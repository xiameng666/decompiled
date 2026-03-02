public final class grih extends ProtoLiteBuilder implements MessageLiteOrBuilder {
    public grih() {
        super(((ProtoLiteMessage)grii.a));
    }

    public final void a(Iterable iterable0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        grii grii0 = (grii)this.b_message;
        hfuo hfuo0 = grii0.d;
        if(!hfuo0.c()) {
            grii0.d = ProtoLiteMessage.E(hfuo0);
        }
        hfrj.E(iterable0, grii0.d);
    }
}

