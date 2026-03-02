public final class etnd extends ProtoLiteBuilder implements MessageLiteOrBuilder {
    public etnd() {
        super(((ProtoLiteMessage)etne.a));
    }

    public final gfmo a(int v) {
        return (gfmo)((etne)this.b_message).d.get(v);
    }

    public final void k(Iterable iterable0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        etne etne0 = (etne)this.b_message;
        hfuo hfuo0 = etne0.d;
        if(!hfuo0.c()) {
            etne0.d = ProtoLiteMessage.E(hfuo0);
        }
        hfrj.E(iterable0, etne0.d);
    }
}

