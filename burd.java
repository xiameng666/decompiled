public final class burd implements iakw {
    public static final iaoa a;

    static {
        burd.a = new iant("Accept-Language", iaof_metadata.c);
    }

    @Override  // iakw
    public final iakv a(gRPCMethodDescriptor iaoj0, iakq iakq0, iakr iakr0) {
        ibuq.f(iaoj0, "method");
        ibuq.f(iakq0, "callOptions");
        ibuq.f(iakr0, "next");
        return new burc(iakr0.a(iaoj0, iakq0));
    }
}

