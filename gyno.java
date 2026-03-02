public final class gyno extends ProtoLiteBuilder implements MessageLiteOrBuilder {
    public gyno() {
        super(((ProtoLiteMessage)gynp.a));
    }

    public final void a(Iterable iterable0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        gynp gynp0 = (gynp)this.b_message;
        hfuo hfuo0 = gynp0.h;
        if(!hfuo0.c()) {
            gynp0.h = ProtoLiteMessage.E(hfuo0);
        }
        hfrj.E(iterable0, gynp0.h);
    }
}

