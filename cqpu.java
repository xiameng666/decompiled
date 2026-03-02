public final class cqpu implements ccrt {
    private final cqpx a;

    public cqpu(cqpx cqpx0) {
        this.a = cqpx0;
    }

    @Override  // ccrt
    public final Object c(ibrl ibrl0) {
        ccob ccob0 = ccoa.a(((ProtoLiteMessage)ccnw.a).v_newBuilder());
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ccns.a).v_newBuilder();
        ibuq.f(hftp0, "builder");
        boolean z = this.a.a();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((ccns)hftp0.b_message).b = z;
        ProtoLiteMessage hftv0 = hftp0.N_build();
        ibuq.e(hftv0, "build(...)");
        ibuq.f(((ccns)hftv0), "value");
        ProtoLiteBuilder hftp1 = ccob0.a;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ccnw ccnw0 = (ccnw)hftp1.b_message;
        ((ccns)hftv0).getClass();
        ccnw0.c = (ccns)hftv0;
        ccnw0.b = 3;
        return ccob0.a();
    }

    @Override  // ccrt
    public final Object d(ibrl ibrl0) {
        cqpx cqpx0 = this.a;
        if(!cqpx0.b()) {
            return ccni.e;
        }
        return cqpx0.c() ? ccni.c : ccni.d;
    }
}

