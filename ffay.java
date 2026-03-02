public final class ffay extends ProtoLiteBuilder implements MessageLiteOrBuilder {
    public ffay() {
        super(((ProtoLiteMessage)ffaz.a));
    }

    public final void a(Iterable iterable0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        ffaz ffaz0 = (ffaz)this.b_message;
        ffaz0.b();
        hfrj.E(iterable0, ffaz0.b);
    }

    public final void k(ProtoLiteBuilder hftp0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        ffaz ffaz0 = (ffaz)this.b_message;
        ffbk ffbk0 = (ffbk)hftp0.N_build();
        ffbk0.getClass();
        ffaz0.b();
        ffaz0.b.add(ffbk0);
    }
}

