public final class hkgt extends ProtoLiteBuilder implements MessageLiteOrBuilder {
    public hkgt() {
        super(((ProtoLiteMessage)hkgu.a));
    }

    public final void a(Iterable iterable0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        hkgu hkgu0 = (hkgu)this.b_message;
        hfuf hfuf0 = hkgu0.c;
        if(!hfuf0.c()) {
            hkgu0.c = ProtoLiteMessage.C(hfuf0);
        }
        ggqk ggqk0 = ((gged_interceptors)iterable0).E();
        while(ggqk0.hasNext()) {
            Object object0 = ggqk0.next();
            hkgu0.c.i(((hkid)object0).a());
        }
    }
}

