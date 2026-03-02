public final class aict implements ibts {
    public final ghwo a;
    public final String b;
    public final ghwm c;

    public aict(ghwo ghwo0, String s, ghwm ghwm0) {
        this.a = ghwo0;
        this.b = s;
        this.c = ghwm0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.f(((ProtoLiteBuilder)object0), "$this$missedCallRetrieverEvent");
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        ((ghwp)((ProtoLiteBuilder)object0).b_message).c = this.a.n;
        ((ghwp)((ProtoLiteBuilder)object0).b_message).b |= 1;
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        ProtoLiteMessage hftv0 = ((ProtoLiteBuilder)object0).b_message;
        this.b.getClass();
        ((ghwp)hftv0).b |= 2;
        ((ghwp)hftv0).d = this.b;
        if(!hftv0.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        ((ghwp)((ProtoLiteBuilder)object0).b_message).f = this.c.q;
        ((ghwp)((ProtoLiteBuilder)object0).b_message).b |= 8;
        return ibom.a;
    }
}

