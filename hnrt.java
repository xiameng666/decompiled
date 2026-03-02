public final class hnrt extends ProtoLiteBuilder implements MessageLiteOrBuilder {
    public hnrt() {
        super(((ProtoLiteMessage)hnru.a));
    }

    public final void a(Iterable iterable0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        hnru hnru0 = (hnru)this.b_message;
        hfui hfui0 = hnru0.b;
        if(!hfui0.c()) {
            hnru0.b = ProtoLiteMessage.D(hfui0);
        }
        hfrj.E(iterable0, hnru0.b);
    }
}

