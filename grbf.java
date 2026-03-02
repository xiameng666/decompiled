public final class grbf extends ProtoLiteBuilder implements MessageLiteOrBuilder {
    public grbf() {
        super(((ProtoLiteMessage)grbg.a));
    }

    public final void a(grbe grbe0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        grbg grbg0 = (grbg)this.b_message;
        grbe0.getClass();
        grbg0.b();
        grbg0.e.add(grbe0);
    }

    public final void k(int v, grbe grbe0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        grbg grbg0 = (grbg)this.b_message;
        grbg0.b();
        grbg0.e.set(v, grbe0);
    }
}

