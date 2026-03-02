public final class aqqw implements ibts {
    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.c(((aqqq)object0));
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((aqqq)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((aqqq)object0))));
        aqqs aqqs0 = aqqr.a(hftp0);
        ProtoLiteBuilder hftp1 = aqqs0.a;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((aqqq)hftp1.b_message).c = null;
        ((aqqq)hftp1.b_message).b &= -2;
        return aqqs0.a();
    }
}

