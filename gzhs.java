public final class gzhs extends ProtoLiteBuilder implements MessageLiteOrBuilder {
    public gzhs() {
        super(((ProtoLiteMessage)gzht.a));
    }

    public final void a(gzhr gzhr0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        gzht gzht0 = (gzht)this.b_message;
        gzhr0.getClass();
        hfuo hfuo0 = gzht0.b;
        if(!hfuo0.c()) {
            gzht0.b = ProtoLiteMessage.E(hfuo0);
        }
        gzht0.b.add(gzhr0);
    }
}

