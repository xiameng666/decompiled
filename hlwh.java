public final class hlwh extends ProtoLiteBuilder implements MessageLiteOrBuilder {
    public hlwh() {
        super(((ProtoLiteMessage)hlwm.a));
    }

    public final void a(Iterable iterable0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        hlwm hlwm0 = (hlwm)this.b_message;
        hlwm0.b();
        hfrj.E(iterable0, hlwm0.k);
    }

    public final void k(hlwj hlwj0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        hlwm hlwm0 = (hlwm)this.b_message;
        hlwj0.getClass();
        hlwm0.b();
        hlwm0.k.add(hlwj0);
    }
}

