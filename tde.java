public final class tde extends tdc {
    public static final tcz f;

    static {
        tde.f = new tcz("Amount, Authorized", "Authorized amount of the transaction (including Amount, Other and excluding adjustments).", tde.c, 6, 0x7FFFFFFF, 1, 2, 0, 1, 1, tde.d, 1);
    }

    public tde(byte[] arr_b) {
        super(arr_b, tde.f);
    }
}

