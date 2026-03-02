public final class dumt implements ibth {
    public final duoa a;

    public dumt(duoa duoa0) {
        this.a = duoa0;
    }

    @Override  // ibth
    public final Object a() {
        duoa duoa0 = this.a;
        String s = duoa0.ah;
        if(s == null) {
            ibuq.j("provisioningId");
            s = null;
        }
        duoa0.startActivity(dlnf.U(s).addFlags(0x10008000));
        duoa0.ar();
        return ibom.a;
    }
}

