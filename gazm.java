public final class gazm implements ibts {
    public final gazl a;

    public gazm(gazl gazl0) {
        this.a = gazl0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.f(((ProtoLiteBuilder)object0), "$this$newLogEventBuilder");
        gkwx gkwx0 = gkwx.g;
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        ((gkxt)((ProtoLiteBuilder)object0).b_message).g = gkwx0.G;
        ((gkxt)((ProtoLiteBuilder)object0).b_message).b |= 4;
        gkyf gkyf0 = gkyf.a;
        gkzo gkzo0 = gkzn.a(((ProtoLiteMessage)gkyf0).v_newBuilder());
        gkzo0.c();
        fbbj fbbj0 = this.a.a;
        gkyf gkyf1 = (fbbj0.b == 2 ? ((fbbi)fbbj0.c) : fbbi.a).c;
        if(gkyf1 != null) {
            gkyf0 = gkyf1;
        }
        hfuo hfuo0 = gkyf0.b;
        ibuq.e(hfuo0, "getAndroidLatencyInfoList(...)");
        gkzo0.b(hfuo0);
        gkyf gkyf2 = gkzo0.a();
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        gkxt gkxt0 = (gkxt)((ProtoLiteBuilder)object0).b_message;
        gkyf2.getClass();
        gkxt0.d = gkyf2;
        gkxt0.c = 13;
        return ibom.a;
    }
}

