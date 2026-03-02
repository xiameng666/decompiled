public final class dpec extends ProtoLiteBuilder implements MessageLiteOrBuilder {
    public dpec() {
        super(((ProtoLiteMessage)dpef.a));
    }

    public final void a(long v, dped dped0) {
        dped0.getClass();
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        ((dpef)this.b_message).b().put(Long.valueOf(v), dped0);
    }
}

