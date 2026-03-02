public final class giri extends ProtoLiteBuilder implements MessageLiteOrBuilder {
    public giri() {
        super(((ProtoLiteMessage)giry.a));
    }

    public final void a(Iterable iterable0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        giry giry0 = (giry)this.b_message;
        hfuo hfuo0 = giry0.c;
        if(!hfuo0.c()) {
            giry0.c = ProtoLiteMessage.E(hfuo0);
        }
        hfrj.E(iterable0, giry0.c);
    }
}

