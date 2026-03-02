public final class cyri implements gfsi {
    public final boolean a;

    public cyri(boolean z) {
        this.a = z;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        Object object1 = ((ProtoLiteMessage)cyjq.a).w(((ProtoLiteMessage)(((cyjq)object0))));
        if(!object1.b_message.isImmutable()) {
            ((ProtoLiteBuilder)object1).ensureMutable();
        }
        cyjq cyjq0 = (cyjq)object1.b_message;
        cyjq0.b |= 2;
        cyjq0.d = this.a;
        return object1;
    }
}

