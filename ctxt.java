public final class ctxt implements ibts {
    public final ctxy a;

    public ctxt(ctxy ctxy0) {
        this.a = ctxy0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        icjm icjm0;
        ibuq.f(((byte[])object0), "bytes");
        ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)ctzr.a), ((byte[])object0), 0, ((byte[])object0).length, hftc.a);
        ProtoLiteMessage.P_makeImmutable(hftv0);
        ibuq.e(((ctzr)hftv0), "parseFrom(...)");
        ibuq.f(((ctzr)hftv0), "request");
        ctxy ctxy0 = this.a;
        synchronized(ctxy0) {
            ctqq ctqq0 = ctxy0.a;
            if(ctqq0 == null) {
                icjm0 = icif.a;
            }
            else {
                ibuq.f(((ctzr)hftv0), "request");
                ctqq0.a.i.b(Boolean.valueOf(true));
                ctqp ctqp0 = new ctqp(ctqq0.a, null);
                icjm0 = new icjm(ctqq0.a.j, ctqp0);
            }
        }
        return new ctxx(icjm0);
    }
}

