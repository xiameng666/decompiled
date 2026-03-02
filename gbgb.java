public final class gbgb implements ibts {
    public final hcnu a;

    public gbgb(hcnu hcnu0) {
        this.a = hcnu0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.f(((ProtoLiteBuilder)object0), "$this$wtf");
        long v = (this.a.c == null ? hcos.a : this.a.c).c;
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        gkxt gkxt0 = (gkxt)((ProtoLiteBuilder)object0).b_message;
        gkxt0.b |= 0x20;
        gkxt0.l = v;
        return ibom.a;
    }
}

