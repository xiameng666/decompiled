public final class gzqs extends ProtoLiteBuilder implements MessageLiteOrBuilder {
    public gzqs() {
        super(((ProtoLiteMessage)gzqt.a));
    }

    public final void a(Iterable iterable0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        gzqt gzqt0 = (gzqt)this.b_message;
        hfui hfui0 = gzqt0.b;
        if(!hfui0.c()) {
            gzqt0.b = ProtoLiteMessage.D(hfui0);
        }
        hfrj.E(iterable0, gzqt0.b);
    }
}

