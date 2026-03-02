public final class tqn extends tgg {
    public static final int f = 0;
    private static final String g = "tqn";
    private static final long serialVersionUID = 1L;

    static {
    }

    public final tqy d() {
        byte[] arr_b = this.e;
        if(arr_b != null) {
            return new tqy(tfc.b(arr_b).d());
        }
        tjk.f("riscManagementTLV not found, initializing values.", new Object[0]);
        return new tqy();
    }
}

