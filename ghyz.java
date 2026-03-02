public final class ghyz extends ProtoLiteBuilder implements MessageLiteOrBuilder {
    public ghyz() {
        super(((ProtoLiteMessage)ghza.a));
    }

    public final void a(Iterable iterable0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        ghza ghza0 = (ghza)this.b_message;
        hfuo hfuo0 = ghza0.c;
        if(!hfuo0.c()) {
            ghza0.c = ProtoLiteMessage.E(hfuo0);
        }
        hfrj.E(iterable0, ghza0.c);
    }
}

