public final class eyfg implements ibts {
    public final gzxv a;

    public eyfg(gzxv gzxv0) {
        this.a = gzxv0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.f(((gzxd)object0), "$this$logEvent");
        ((gzxd)object0).b(gzxz.h);
        gzxf gzxf0 = gzxe.a(((ProtoLiteMessage)gzxw.a).v_newBuilder());
        gzxf0.b(this.a);
        gzxw gzxw0 = gzxf0.a();
        ibuq.f(gzxw0, "value");
        ProtoLiteBuilder hftp0 = ((gzxd)object0).a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gzzc gzzc0 = (gzzc)hftp0.b_message;
        gzxw0.getClass();
        gzzc0.d = gzxw0;
        gzzc0.c = 8;
        return ibom.a;
    }
}

