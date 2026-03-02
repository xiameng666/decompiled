public final class hewo extends ProtoLiteBuilder implements MessageLiteOrBuilder {
    public hewo() {
        super(((ProtoLiteMessage)hewp.a));
    }

    public final void a(Iterable iterable0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        hewp hewp0 = (hewp)this.b_message;
        hfuo hfuo0 = hewp0.c;
        if(!hfuo0.c()) {
            hewp0.c = ProtoLiteMessage.E(hfuo0);
        }
        hfrj.E(iterable0, hewp0.c);
    }
}

