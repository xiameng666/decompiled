public final class ghye extends ProtoLiteBuilder implements MessageLiteOrBuilder {
    public ghye() {
        super(((ProtoLiteMessage)ghyf.a));
    }

    public final void a(Iterable iterable0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        ghyf ghyf0 = (ghyf)this.b_message;
        hfuo hfuo0 = ghyf0.f;
        if(!hfuo0.c()) {
            ghyf0.f = ProtoLiteMessage.E(hfuo0);
        }
        hfrj.E(iterable0, ghyf0.f);
    }
}

