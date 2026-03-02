public final class ghnv extends ProtoLiteBuilder implements MessageLiteOrBuilder {
    public ghnv() {
        super(((ProtoLiteMessage)ghnx.a));
    }

    public final void a(Iterable iterable0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        ghnx ghnx0 = (ghnx)this.b_message;
        hfuo hfuo0 = ghnx0.h;
        if(!hfuo0.c()) {
            ghnx0.h = ProtoLiteMessage.E(hfuo0);
        }
        hfrj.E(iterable0, ghnx0.h);
    }
}

