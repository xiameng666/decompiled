public final class bvvp implements ibts {
    public final bwcj a;

    public bvvp(bwcj bwcj0) {
        this.a = bwcj0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.f(((giuw)object0), "$this$bindViewWithVeId");
        gjzo gjzo0 = ((giut)((giuw)object0).a.b_message).c;
        if(gjzo0 == null) {
            gjzo0 = gjzo.a;
        }
        ibuq.e(gjzo0, "getUiFlowElementMetadata(...)");
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)gjzo0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)gjzo0));
        gjzq gjzq0 = gjzp.a(hftp0);
        String s = this.a.name();
        ibuq.f(s, "value");
        ProtoLiteBuilder hftp1 = gjzq0.a;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gjzo gjzo1 = (gjzo)hftp1.b_message;
        s.getClass();
        gjzo1.b |= 16;
        gjzo1.h = s;
        ((giuw)object0).b(gjzq0.a());
        return ibom.a;
    }
}

