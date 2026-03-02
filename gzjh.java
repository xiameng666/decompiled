public final class gzjh extends ProtoLiteBuilder implements MessageLiteOrBuilder {
    public gzjh() {
        super(((ProtoLiteMessage)gzji.a));
    }

    public final void a(Iterable iterable0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        gzji gzji0 = (gzji)this.b_message;
        hfuf hfuf0 = gzji0.b;
        if(!hfuf0.c()) {
            gzji0.b = ProtoLiteMessage.C(hfuf0);
        }
        hfrj.E(iterable0, gzji0.b);
    }
}

