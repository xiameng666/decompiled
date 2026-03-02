public final class gsrx extends ProtoLiteBuilder implements MessageLiteOrBuilder {
    public gsrx() {
        super(((ProtoLiteMessage)gsry.a));
    }

    public final void a() {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        gsry gsry0 = (gsry)this.b_message;
        hfuf hfuf0 = gsry0.b;
        if(!hfuf0.c()) {
            gsry0.b = ProtoLiteMessage.C(hfuf0);
        }
        gsry0.b.i(1);
    }
}

