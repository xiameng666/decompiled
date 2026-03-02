public final class hljg extends ProtoLiteBuilder implements hlji {
    public hljg() {
        super(((ProtoLiteMessage)hljh.a));
    }

    @Override  // hlji
    public final hldp a() {
        hldp hldp0 = ((hljh)this.b_message).c;
        return hldp0 == null ? hldp.a : hldp0;
    }

    @Override  // hlji
    public final boolean k() {
        return (((hljh)this.b_message).b & 1) != 0;
    }

    public final void l(Iterable iterable0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        hljh hljh0 = (hljh)this.b_message;
        hljh0.b();
        hfrj.E(iterable0, hljh0.d);
    }

    public final void m(hljf hljf0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        hljh hljh0 = (hljh)this.b_message;
        hljf0.getClass();
        hljh0.b();
        hljh0.d.add(hljf0);
    }
}

