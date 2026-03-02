public final class gpox extends ProtoLiteBuilder implements MessageLiteOrBuilder {
    public gpox() {
        super(((ProtoLiteMessage)gpoy.a));
    }

    public final void a(Iterable iterable0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        gpoy gpoy0 = (gpoy)this.b_message;
        hfuo hfuo0 = gpoy0.c;
        if(!hfuo0.c()) {
            gpoy0.c = ProtoLiteMessage.E(hfuo0);
        }
        hfrj.E(iterable0, gpoy0.c);
    }
}

