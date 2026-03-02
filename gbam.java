public final class gbam implements ibts {
    public final gbak a;

    public gbam(gbak gbak0) {
        this.a = gbak0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.f(((ProtoLiteBuilder)object0), "$this$newLogEventBuilder");
        gkwx gkwx0 = gkwx.o;
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        ((gkxt)((ProtoLiteBuilder)object0).b_message).g = gkwx0.G;
        ((gkxt)((ProtoLiteBuilder)object0).b_message).b |= 4;
        gkzw gkzw0 = gkzv.a(((ProtoLiteMessage)gkyr.a).v_newBuilder());
        gkzw0.b(this.a.a());
        gkyr gkyr0 = gkzw0.a();
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        gkxt gkxt0 = (gkxt)((ProtoLiteBuilder)object0).b_message;
        gkyr0.getClass();
        gkxt0.d = gkyr0;
        gkxt0.c = 20;
        return ibom.a;
    }
}

