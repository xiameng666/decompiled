public final class ebfh extends ebhb {
    public static final ebfg a;
    public dtrz b;
    private final fswt c;

    static {
        ebfh.a = new ebfg();
    }

    public ebfh(fswt fswt0) {
        this.c = fswt0;
    }

    @Override  // ebhb
    public final ftcg a() {
        fswt fswt0 = this.c;
        gftb.g(1 == (fswt0.b & 1), "transactionData field is required", new Object[0]);
        try {
            dtrz dtrz0 = this.b;
            if(dtrz0 == null) {
                ibuq.j("database");
                dtrz0 = null;
            }
            dtrz0.b((fswt0.c == null ? gtxo.a : fswt0.c));
            return ftch.a(((ProtoLiteMessage)ftcg.a).v_newBuilder()).a();
        }
        catch(dmhl dmhl0) {
            throw new ebha(dmhl0);
        }
    }
}

