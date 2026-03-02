public final class aicu implements ibts {
    public final ghwo a;
    public final String b;

    public aicu(ghwo ghwo0, String s) {
        this.a = ghwo0;
        this.b = s;
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
        ghwp ghwp0 = (ghwp)((ProtoLiteBuilder)object0).b_message;
        this.b.getClass();
        ghwp0.b |= 2;
        ghwp0.d = this.b;
        return ibom.a;
    }
}

