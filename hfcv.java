public final class hfcv extends ProtoLiteBuilder implements MessageLiteOrBuilder {
    public hfcv() {
        super(((ProtoLiteMessage)hfcw.a));
    }

    public final void a(Iterable iterable0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        hfcw hfcw0 = (hfcw)this.b_message;
        hfcw0.b();
        hfrj.E(iterable0, hfcw0.b);
    }
}

