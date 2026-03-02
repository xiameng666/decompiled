public final class graw extends ProtoLiteBuilder implements MessageLiteOrBuilder {
    public graw() {
        super(((ProtoLiteMessage)grbi.a));
    }

    public final void a(Iterable iterable0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        grbi grbi0 = (grbi)this.b_message;
        grbi0.b();
        hfrj.E(iterable0, grbi0.d);
    }

    public final void k(grbg grbg0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        grbi grbi0 = (grbi)this.b_message;
        grbg0.getClass();
        grbi0.b();
        grbi0.d.add(grbg0);
    }

    public final void l(int v, grbg grbg0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        grbi grbi0 = (grbi)this.b_message;
        grbi0.b();
        grbi0.d.set(v, grbg0);
    }
}

