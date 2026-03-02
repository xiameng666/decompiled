public final class hkdm extends ProtoLiteBuilder implements MessageLiteOrBuilder {
    public hkdm() {
        super(((ProtoLiteMessage)hkdn.a));
    }

    public final void a(ByteString hfsf0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        hkdn hkdn0 = (hkdn)this.b_message;
        hkdn0.b();
        hkdn0.b.add(hfsf0);
    }
}

