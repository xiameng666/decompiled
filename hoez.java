public final class hoez extends ProtoLiteBuilder implements MessageLiteOrBuilder {
    public hoez() {
        super(((ProtoLiteMessage)hofa.a));
    }

    public final void a(Iterable iterable0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        hofa hofa0 = (hofa)this.b_message;
        hfuo hfuo0 = hofa0.e;
        if(!hfuo0.c()) {
            hofa0.e = ProtoLiteMessage.E(hfuo0);
        }
        hfrj.E(iterable0, hofa0.e);
    }
}

