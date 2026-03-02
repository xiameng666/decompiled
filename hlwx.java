public final class hlwx extends ProtoLiteBuilder implements MessageLiteOrBuilder {
    public hlwx() {
        super(((ProtoLiteMessage)hlwy.a));
    }

    public final void a(ByteString hfsf0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        hlwy hlwy0 = (hlwy)this.b_message;
        hfuo hfuo0 = hlwy0.c;
        if(!hfuo0.c()) {
            hlwy0.c = ProtoLiteMessage.E(hfuo0);
        }
        hlwy0.c.add(hfsf0);
    }
}

