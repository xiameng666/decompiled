public final class azir extends ProtoLiteBuilder implements MessageLiteOrBuilder {
    public azir() {
        super(((ProtoLiteMessage)azis.a));
    }

    public final void a(Iterable iterable0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        azis azis0 = (azis)this.b_message;
        hfuo hfuo0 = azis0.d;
        if(!hfuo0.c()) {
            azis0.d = ProtoLiteMessage.E(hfuo0);
        }
        hfrj.E(iterable0, azis0.d);
    }
}

