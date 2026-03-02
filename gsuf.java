public final class gsuf extends ProtoLiteBuilder implements MessageLiteOrBuilder {
    public gsuf() {
        super(((ProtoLiteMessage)gsug.a));
    }

    public final void a(Iterable iterable0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        gsug gsug0 = (gsug)this.b_message;
        gsug0.b();
        hfrj.E(iterable0, gsug0.c);
    }
}

