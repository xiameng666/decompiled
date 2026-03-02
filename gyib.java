public final class gyib extends ProtoLiteBuilder implements MessageLiteOrBuilder {
    public gyib() {
        super(((ProtoLiteMessage)gyic.a));
    }

    public final void a(gyhy gyhy0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        gyic gyic0 = (gyic)this.b_message;
        gyhy0.getClass();
        hfuo hfuo0 = gyic0.d;
        if(!hfuo0.c()) {
            gyic0.d = ProtoLiteMessage.E(hfuo0);
        }
        gyic0.d.add(gyhy0);
    }
}

