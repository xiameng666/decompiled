public final class flah extends ProtoLiteBuilder implements MessageLiteOrBuilder {
    public flah() {
        super(((ProtoLiteMessage)flak.a));
    }

    public final flai a(int v) {
        return (flai)((flak)this.b_message).c.get(v);
    }

    public final flaj k(int v) {
        return (flaj)((flak)this.b_message).f.get(v);
    }

    public final void l(flai flai0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        flak flak0 = (flak)this.b_message;
        flai0.getClass();
        flak0.b();
        flak0.c.add(flai0);
    }

    public final void m(flaj flaj0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        flak flak0 = (flak)this.b_message;
        flaj0.getClass();
        flak0.c();
        flak0.f.add(flaj0);
    }

    public final void n(int v, flai flai0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        flak flak0 = (flak)this.b_message;
        flai0.getClass();
        flak0.b();
        flak0.c.set(v, flai0);
    }

    public final void o(int v, flaj flaj0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        flak flak0 = (flak)this.b_message;
        flaj0.getClass();
        flak0.c();
        flak0.f.set(v, flaj0);
    }
}

