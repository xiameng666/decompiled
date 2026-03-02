public final class dyqo implements ibts {
    @Override  // ibts
    public final Object a(Object object0) {
        dyiu dyiu0 = (dyiu)object0;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)dyiu.a).v_newBuilder();
        ibuq.f(hftp0, "builder");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((dyiu)hftp0.b_message).b = true;
        ProtoLiteMessage hftv0 = hftp0.N_build();
        ibuq.e(hftv0, "build(...)");
        return (dyiu)hftv0;
    }
}

