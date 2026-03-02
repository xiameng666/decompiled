public final class iaqd implements iakw {
    public static final iaoa a;
    public final String b;

    static {
        iaqd.a = new iant("X-Goog-Spatula", iaof_metadata.c);
    }

    public iaqd(String s) {
        this.b = s;
    }

    @Override  // iakw
    public final iakv a(gRPCMethodDescriptor iaoj0, iakq iakq0, iakr iakr0) {
        return new iaqc(this, iakr0.a(iaoj0, iakq0));
    }
}

