public final class fnao extends ProtoLiteBuilder implements MessageLiteOrBuilder {
    public fnao() {
        super(((ProtoLiteMessage)fnap.a));
    }

    public final void a(Iterable iterable0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        fnap fnap0 = (fnap)this.b_message;
        fnap0.b();
        hfrj.E(iterable0, fnap0.b);
    }

    public final void k(fnan fnan0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        fnap fnap0 = (fnap)this.b_message;
        fnan0.getClass();
        fnap0.b();
        fnap0.b.add(fnan0);
    }
}

