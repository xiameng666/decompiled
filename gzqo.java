public final class gzqo extends ProtoLiteBuilder implements MessageLiteOrBuilder {
    public gzqo() {
        super(((ProtoLiteMessage)gzqp.a));
    }

    public final void a(Iterable iterable0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        gzqp gzqp0 = (gzqp)this.b_message;
        hfui hfui0 = gzqp0.c;
        if(!hfui0.c()) {
            gzqp0.c = ProtoLiteMessage.D(hfui0);
        }
        hfrj.E(iterable0, gzqp0.c);
    }
}

