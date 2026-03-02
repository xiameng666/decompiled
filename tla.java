public final class tla extends tak {
    public static final byte[] c = null;
    public static final tdb d = null;
    public static final tcz e = null;
    private static final long serialVersionUID = 1L;

    static {
        tla.c = new byte[]{0};
        tla.d = tdb.b;
        tla.e = new tcz("Card Transaction Qualifiers", "Card Transaction Qualifiers", null, 1, 0x7FFFFFFF, 3, 1, 3, 3, 5, tdb.b, 4);
    }

    public tla() {
        super(tla.c, tla.e);
    }

    public tla(byte[] arr_b) {
        super(arr_b, tla.e);
    }

    public final void h(tkz tkz0) {
        byte[] arr_b = this.b;
        byte b = (byte)(arr_b[0] & -16);
        arr_b[0] = b;
        arr_b[0] = (byte)(tkz0.e | b);
    }

    public final void i(boolean z) {
        byte[] arr_b = this.b;
        if(z) {
            arr_b[0] = (byte)(arr_b[0] | 0x80);
            return;
        }
        arr_b[0] = (byte)(arr_b[0] & 0xFFFFFF7F);
    }
}

