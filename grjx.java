public final class grjx extends ProtoLiteBuilder implements MessageLiteOrBuilder {
    public grjx() {
        super(((ProtoLiteMessage)grjy.a));
    }

    public final void a(Iterable iterable0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        grjy grjy0 = (grjy)this.b_message;
        grjy0.b();
        hfrj.E(iterable0, grjy0.b);
    }

    public final void k(int v) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        grjy grjy0 = (grjy)this.b_message;
        grjy0.b();
        grjy0.b.i(v);
    }
}

