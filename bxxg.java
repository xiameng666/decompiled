import j..util.DesugarCollections;

public final class bxxg implements ibts {
    public final String a;
    public final String b;
    public final bxxw c;

    public bxxg(String s, String s1, bxxw bxxw0) {
        this.a = s;
        this.b = s1;
        this.c = bxxw0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        if(((byfr)object0) == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        String s = this.a;
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((byfr)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((byfr)object0))));
        byft byft0 = byfs.a(hftp0);
        byfo byfo0 = (byfo)DesugarCollections.unmodifiableMap(((byfr)object0).b).get(s);
        if(byfo0 == null) {
            byfx byfx0 = byfw.a(((ProtoLiteMessage)byfo.a).v_newBuilder());
            byfx0.c(this.b);
            byfo0 = byfx0.a();
        }
        byft0.b();
        ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)byfo0).jf(5, null);
        hftp1.X(((ProtoLiteMessage)byfo0));
        byfx byfx1 = byfw.a(hftp1);
        byfx1.d();
        String s1 = this.c.a;
        byfz byfz0 = byfy.a(((ProtoLiteMessage)byfq.a).v_newBuilder());
        byfz0.b(ByteString.copyFrom(this.c.d));
        byfz0.d(ByteString.copyFrom(this.c.e));
        byfz0.c(this.c.f);
        byfq byfq0 = byfz0.a();
        ibuq.f(s1, "key");
        ibuq.f(byfq0, "value");
        ProtoLiteBuilder hftp2 = byfx1.a;
        s1.getClass();
        byfq0.getClass();
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        ((byfo)hftp2.b_message).b().put(s1, byfq0);
        byft0.c(s, byfx1.a());
        return byft0.a();
    }
}

