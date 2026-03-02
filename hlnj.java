public final class hlnj extends ProtoLiteBuilder implements MessageLiteOrBuilder {
    public hlnj() {
        super(((ProtoLiteMessage)hlnk.a));
    }

    public final void a(Iterable iterable0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        hlnk hlnk0 = (hlnk)this.b_message;
        hfuo hfuo0 = hlnk0.c;
        if(!hfuo0.c()) {
            hlnk0.c = ProtoLiteMessage.E(hfuo0);
        }
        hfrj.E(iterable0, hlnk0.c);
    }

    public final void k(Iterable iterable0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        hlnk hlnk0 = (hlnk)this.b_message;
        hfuo hfuo0 = hlnk0.b;
        if(!hfuo0.c()) {
            hlnk0.b = ProtoLiteMessage.E(hfuo0);
        }
        hfrj.E(iterable0, hlnk0.b);
    }
}

