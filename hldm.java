public final class hldm extends ProtoLiteBuilder implements hldq {
    public hldm() {
        super(((ProtoLiteMessage)hldp.a));
    }

    @Override  // hldq
    public final hldk a() {
        hldk hldk0 = ((hldp)this.b_message).i;
        return hldk0 == null ? hldk.a : hldk0;
    }

    @Override  // hldq
    public final hldo k() {
        hldo hldo0 = hldo.b(((hldp)this.b_message).f);
        return hldo0 == null ? hldo.a : hldo0;
    }

    @Override  // hldq
    public final hlds l() {
        hlds hlds0 = ((hldp)this.b_message).g;
        return hlds0 == null ? hlds.a : hlds0;
    }

    @Override  // hldq
    public final hlea m() {
        hlea hlea0 = ((hldp)this.b_message).h;
        return hlea0 == null ? hlea.a : hlea0;
    }

    @Override  // hldq
    public final String n() {
        return ((hldp)this.b_message).e;
    }

    @Override  // hldq
    public final boolean o() {
        return (((hldp)this.b_message).b & 4) != 0;
    }

    @Override  // hldq
    public final boolean p() {
        return (((hldp)this.b_message).b & 0x20) != 0;
    }
}

