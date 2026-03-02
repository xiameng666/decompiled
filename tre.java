public final class tre extends tgc {
    public static final byte[] a;
    public static final byte[] d;
    public static final tik e;

    static {
        tre.a = new byte[]{0, 0};
        byte[] arr_b = {-97, 0x71};
        tre.d = arr_b;
        tre.e = new tik("Mobile Status Indicator", "The Mobile Status Indicator (MSI) is set internally by the MDA during contactless and contact\n(Management) transactions. This value can be read by the handset application using the\nGET DATA command by passing the MSI tag 9F 71 in the P1and P2 parameter fields of the\ncommand", arr_b, 2, 0x80000000, 0x7FFFFFFF, 3, 1, 2, 6, 2, 3, 5);
    }

    public tre(byte[] arr_b) {
        super(arr_b, tre.e);
    }

    public final void n() {
        this.e(1, 3, true);
    }

    public final void o() {
        this.e(1, 1, true);
    }

    public final void p(boolean z) {
        this.e(0, 1, z);
    }

    public final boolean q() {
        return this.j(0, 3);
    }

    public final boolean r() {
        return this.j(0, 1);
    }
}

