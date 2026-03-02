public final class tqy extends tgl {
    public static final byte[] b;

    static {
        tqy.b = new byte[]{(byte)0xE0};
    }

    public tqy() {
        this.c(new trm(trm.d));
        this.c(new trl(trl.d));
    }

    public tqy(byte[] arr_b) {
        super(arr_b);
    }

    public final trl A() {
        return this.a(trl.a) ? new trl(this.b(trl.a)) : null;
    }

    public final trm B() {
        return this.a(trm.a) ? new trm(this.b(trm.a)) : null;
    }

    public final tfe C() {
        byte[] arr_b = this.a.a();
        return tfc.a(tqy.b, arr_b);
    }
}

