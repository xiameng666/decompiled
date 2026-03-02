public final class hesz extends ProtoLiteBuilder implements MessageLiteOrBuilder {
    public hesz() {
        super(((ProtoLiteMessage)hetc.b));
    }

    public final void a(Iterable iterable0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        hetc hetc0 = (hetc)this.b_message;
        hetc0.b();
        hfrj.E(iterable0, hetc0.e);
    }

    public final void k(hetc hetc0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        hetc hetc1 = (hetc)this.b_message;
        hetc1.b();
        hetc1.e.add(hetc0);
    }
}

