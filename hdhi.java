public final class hdhi extends ProtoLiteBuilder implements MessageLiteOrBuilder {
    public hdhi() {
        super(((ProtoLiteMessage)hdhl.a));
    }

    public final void a(Iterable iterable0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        hdhl hdhl0 = (hdhl)this.b_message;
        hdhl0.b();
        hfrj.E(iterable0, hdhl0.c);
    }

    public final void k(hdrl hdrl0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        hdhl hdhl0 = (hdhl)this.b_message;
        hdrl0.getClass();
        hdhl0.b();
        hdhl0.c.add(hdrl0);
    }
}

