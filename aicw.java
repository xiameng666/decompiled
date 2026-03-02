public final class aicw implements ibts {
    public final ghwp a;

    public aicw(ghwp ghwp0) {
        this.a = ghwp0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ghom ghom0 = ghom.an;
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        ((ghon)((ProtoLiteBuilder)object0).b_message).e = ghom0.av;
        ((ghon)((ProtoLiteBuilder)object0).b_message).b |= 1;
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        ghon ghon0 = (ghon)((ProtoLiteBuilder)object0).b_message;
        this.a.getClass();
        ghon0.ak = this.a;
        ghon0.d |= 0x20;
        return ibom.a;
    }
}

