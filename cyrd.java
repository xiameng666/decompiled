public final class cyrd implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        Object object1 = ((ProtoLiteMessage)cyjq.a).w(((ProtoLiteMessage)(((cyjq)object0))));
        if(!object1.b_message.isImmutable()) {
            ((ProtoLiteBuilder)object1).ensureMutable();
        }
        cyjq cyjq0 = (cyjq)object1.b_message;
        cyjq0.b |= 0x100;
        cyjq0.k = true;
        return object1;
    }
}

