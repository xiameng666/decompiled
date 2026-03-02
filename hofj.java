public final class hofj extends ProtoLiteBuilder implements MessageLiteOrBuilder {
    public hofj() {
        super(((ProtoLiteMessage)hofk.a));
    }

    public final void a(Iterable iterable0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        hofk hofk0 = (hofk)this.b_message;
        hfuo hfuo0 = hofk0.e;
        if(!hfuo0.c()) {
            hofk0.e = ProtoLiteMessage.E(hfuo0);
        }
        hfrj.E(iterable0, hofk0.e);
    }

    public final void k(Iterable iterable0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        hofk hofk0 = (hofk)this.b_message;
        hfuo hfuo0 = hofk0.d;
        if(!hfuo0.c()) {
            hofk0.d = ProtoLiteMessage.E(hfuo0);
        }
        hfrj.E(iterable0, hofk0.d);
    }
}

