public final class ebfr extends ebhb {
    public static final ebfq a;
    public dtrz b;
    private final fsxn c;

    static {
        ebfr.a = new ebfq();
    }

    public ebfr(fsxn fsxn0) {
        this.c = fsxn0;
    }

    @Override  // ebhb
    public final ftcg a() {
        String s = this.c.b;
        ibuq.e(s, "getProvisioningId(...)");
        gftb.g(((boolean)(ibzk.D(s) ^ 1)), "provisioningId is required", new Object[0]);
        try {
            dtrz dtrz0 = this.b;
            if(dtrz0 == null) {
                ibuq.j("database");
                dtrz0 = null;
            }
            dtrz0.c(s);
            return ftch.a(((ProtoLiteMessage)ftcg.a).v_newBuilder()).a();
        }
        catch(dmhl dmhl0) {
            throw new ebha(dmhl0);
        }
    }
}

