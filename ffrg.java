public final class ffrg extends ProtoLiteBuilder implements MessageLiteOrBuilder {
    public ffrg() {
        super(((ProtoLiteMessage)ffrh.a));
    }

    public final void a(Iterable iterable0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        ffrh ffrh0 = (ffrh)this.b_message;
        ffrh0.b();
        hfrj.E(iterable0, ffrh0.f);
    }
}

