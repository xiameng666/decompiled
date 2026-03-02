public final class egpp extends ProtoLiteBuilder implements MessageLiteOrBuilder {
    public egpp() {
        super(((ProtoLiteMessage)egpr.a));
    }

    public final void a(Iterable iterable0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        egpr egpr0 = (egpr)this.b_message;
        egpr0.b();
        hfrj.E(iterable0, egpr0.e);
    }
}

