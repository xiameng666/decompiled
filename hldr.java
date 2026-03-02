public final class hldr extends ProtoLiteBuilder implements MessageLiteOrBuilder {
    public hldr() {
        super(((ProtoLiteMessage)hlds.a));
    }

    public final void a(Iterable iterable0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        hlds hlds0 = (hlds)this.b_message;
        hlds0.b();
        hfrj.E(iterable0, hlds0.d);
    }
}

