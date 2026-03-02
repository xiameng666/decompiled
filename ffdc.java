public final class ffdc extends ProtoLiteBuilder implements MessageLiteOrBuilder {
    public ffdc() {
        super(((ProtoLiteMessage)ffdg.a));
    }

    public final void a(ffdd ffdd0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        ffdg ffdg0 = (ffdg)this.b_message;
        ffdd0.getClass();
        hfuo hfuo0 = ffdg0.b;
        if(!hfuo0.c()) {
            ffdg0.b = ProtoLiteMessage.E(hfuo0);
        }
        ffdg0.b.add(ffdd0);
    }
}

