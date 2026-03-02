public final class ftjn extends ProtoLiteBuilder implements MessageLiteOrBuilder {
    public ftjn() {
        super(((ProtoLiteMessage)ftjo.a));
    }

    public final void a(Iterable iterable0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        ftjo ftjo0 = (ftjo)this.b_message;
        hfuo hfuo0 = ftjo0.b;
        if(!hfuo0.c()) {
            ftjo0.b = ProtoLiteMessage.E(hfuo0);
        }
        hfrj.E(iterable0, ftjo0.b);
    }
}

