public final class aadw implements aady {
    public final grxw a;
    public final grul b;
    public final aadv c;
    private static final baun d;

    static {
        aadw.d = new baun("AccountSettings", new String[]{"ExternalLauncher"});
    }

    public aadw(grxw grxw0, grul grul0, du du0, aatb aatb0, boolean z, fhrt fhrt0, ibnf ibnf0, aavf aavf0, aahq aahq0, aaej aaej0) {
        aadv aadv0 = new aadv(du0, aatb0, z, aadw.d, fhrt0, ibnf0, aavf0, aahq0, aaej0);
        super();
        this.a = grxw0;
        this.b = grul0;
        this.c = aadv0;
    }

    @Override  // aady
    public final void a() {
        throw null;
    }

    public static boolean b(grul grul0) {
        return (grul0.b & 16) != 0 || (grul0.b & 4) != 0 || (grul0.b & 2) != 0 || (grul0.b & 0x100) != 0;
    }
}

