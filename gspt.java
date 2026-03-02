public final class gspt extends ProtoLiteBuilder implements MessageLiteOrBuilder {
    public gspt() {
        super(((ProtoLiteMessage)gspu.a));
    }

    public final void a(gsoj gsoj0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        gspu gspu0 = (gspu)this.b_message;
        gsoj0.getClass();
        hfuf hfuf0 = gspu0.g;
        if(!hfuf0.c()) {
            gspu0.g = ProtoLiteMessage.C(hfuf0);
        }
        gspu0.g.i(gsoj0.a());
    }
}

