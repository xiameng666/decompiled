public final class fxbo extends ProtoLiteBuilder implements MessageLiteOrBuilder {
    public fxbo() {
        super(((ProtoLiteMessage)fxbp.a));
    }

    public final void a(fxbu fxbu0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        fxbp fxbp0 = (fxbp)this.b_message;
        fxbu0.getClass();
        hfuo hfuo0 = fxbp0.c;
        if(!hfuo0.c()) {
            fxbp0.c = ProtoLiteMessage.E(hfuo0);
        }
        fxbp0.c.add(fxbu0);
    }
}

