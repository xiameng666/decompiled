public final class gban implements ibts {
    public final gbak a;

    public gban(gbak gbak0) {
        this.a = gbak0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.f(((ProtoLiteBuilder)object0), "$this$newLogEventBuilder");
        gkwx gkwx0 = gkwx.n;
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        gbak gbak0 = this.a;
        ((gkxt)((ProtoLiteBuilder)object0).b_message).g = gkwx0.G;
        ((gkxt)((ProtoLiteBuilder)object0).b_message).b |= 4;
        gkzw gkzw0 = gkzv.a(((ProtoLiteMessage)gkyr.a).v_newBuilder());
        gkzw0.b(gbak0.a());
        gkyr gkyr0 = gkzw0.a();
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        gkxt gkxt0 = (gkxt)((ProtoLiteBuilder)object0).b_message;
        gkyr0.getClass();
        gkxt0.d = gkyr0;
        gkxt0.c = 20;
        fbbj fbbj0 = gbak0.a;
        int v = (fbbj0.b == 1 ? ((fbbk)fbbj0.c) : fbbk.a).d;
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        ProtoLiteMessage hftv0 = ((ProtoLiteBuilder)object0).b_message;
        ((gkxt)hftv0).b |= 16;
        ((gkxt)hftv0).i = v;
        long v1 = (fbbj0.b == 1 ? ((fbbk)fbbj0.c) : fbbk.a).e;
        if(!hftv0.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        gkxt gkxt1 = (gkxt)((ProtoLiteBuilder)object0).b_message;
        gkxt1.b |= 8;
        gkxt1.h = v1;
        return ibom.a;
    }
}

