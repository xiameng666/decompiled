public final class ghvf extends ProtoLiteBuilder implements MessageLiteOrBuilder {
    public ghvf() {
        super(((ProtoLiteMessage)ghvg.a));
    }

    public final void a(Iterable iterable0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        ghvg ghvg0 = (ghvg)this.b_message;
        hfuo hfuo0 = ghvg0.e;
        if(!hfuo0.c()) {
            ghvg0.e = ProtoLiteMessage.E(hfuo0);
        }
        hfrj.E(iterable0, ghvg0.e);
    }

    public final void k(Iterable iterable0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        ghvg ghvg0 = (ghvg)this.b_message;
        hfuo hfuo0 = ghvg0.c;
        if(!hfuo0.c()) {
            ghvg0.c = ProtoLiteMessage.E(hfuo0);
        }
        hfrj.E(iterable0, ghvg0.c);
    }
}

